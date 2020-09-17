package generator;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import com.google.gson.reflect.TypeToken;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;

import com.zjrc.iot.broker.common.util.Result;
import constant.Path;
import controller.entry.Entry;
import org.apache.commons.io.FileUtils;
import utils.FieldUtil;
import utils.StringSourceJavaObject;

class MapperGenerator extends Generator {
    MapperGenerator(Map<String, Entry> map) {
        super(map);
    }

    @Override
    protected void generator(Map<String, Entry> map) throws Exception {
        super.generator(map);
        for (Map.Entry<String, Entry> entryEntry : map.entrySet()) {
            Entry entry = entryEntry.getValue();

            Builder builder = TypeSpec.interfaceBuilder(entry.getClassName() + "Mapper").addModifiers(Modifier.PUBLIC);
            builder.addJavadoc(entry.getComment());

            MethodSpec.Builder insert = MethodSpec.methodBuilder("insert");
            insert.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
            insert.addParameter(Class.forName(entry.getPackageName() + "." + entry.getClassName()), FieldUtil.getPropertyName(entry.getTableName()));
            insert.returns(Integer.class);
            builder.addMethod(insert.build());

            MethodSpec.Builder update = MethodSpec.methodBuilder("update");
            update.returns(Integer.class);
            update.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
            update.addParameter(Class.forName(entry.getPackageName() + "." + entry.getClassName()), FieldUtil.getPropertyName(entry.getTableName()));
            builder.addMethod(update.build());

            MethodSpec.Builder page = MethodSpec.methodBuilder("page");
            page.returns(new TypeToken<List<Map<String, Object>>>() {
            }.getType());
            page.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
            page.addParameter(Class.forName(entry.getPackageName() + "." + entry.getClassName()), FieldUtil.getPropertyName(entry.getTableName()));
            builder.addMethod(page.build());

            MethodSpec.Builder delete = MethodSpec.methodBuilder("delete");
            delete.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
            delete.returns(Integer.class);
            delete.addParameter(String.class, "ids");
            builder.addMethod(delete.build());

            JavaFile javaFile = JavaFile.builder(Path.DAOPATH, builder.build()).build();
            javaFile.writeTo(new File(Path.ROOTPATH));


            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardJavaFileManager = compiler.getStandardFileManager(null, null, null);
            StringSourceJavaObject sourceObject = new StringSourceJavaObject(Path.DAOPATH + "." + entry.getClassName() + "Mapper", javaFile.toString());
            Iterable<JavaFileObject> fileObjects = Arrays.asList(sourceObject);
            JavaCompiler.CompilationTask compilationTask = compiler.getTask(null, standardJavaFileManager, null, null, null, fileObjects);
            boolean result = compilationTask.call();
            if (result) {
                System.out.println("编译成功。");
                File srcFile = new File(entry.getClassName() + "Mapper" + ".class");
                File cache = new File("target/classes/com/zjrc/iot/broker/dao/biz");
                File src = new File(cache, srcFile.getName());
                if (src.exists()) {
                    src.delete();
                    System.out.println("目标文件已经存在，并且删除。");
                } else {
                    System.out.println("目标文件不存在");
                }
                System.out.println("移动成功！！！！！！！！！！！！！！！！！！");
                FileUtils.moveFileToDirectory(srcFile, cache, true);
                System.out.println("mapper生成成功");
            }
        }
    }
}
