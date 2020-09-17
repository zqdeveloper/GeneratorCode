package generator;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import com.squareup.javapoet.*;
import com.squareup.javapoet.TypeSpec.Builder;

import com.zjrc.iot.broker.common.util.BaseObject;
import constant.Path;
import controller.entry.Entry;
import controller.entry.M;
import controller.entry.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.io.FileUtils;
import utils.StringSourceJavaObject;

class EntryGenerator extends Generator {

    public EntryGenerator(Map<String, Entry> map) {
        super(map);
    }

    protected void generator(Map<String, Entry> maps) throws Exception {
        for (Map.Entry<String, Entry> map : maps.entrySet()) {
            Entry entry = map.getValue();
            Builder builder = TypeSpec.classBuilder(entry.getClassName()).addModifiers(Modifier.PUBLIC);
            builder.addJavadoc(entry.getComment());
            builder.addAnnotation(AnnotationSpec.builder(ApiModel.class).addMember("value", "$S",entry.getClassName()).addMember("description", "$S",entry.getComment()).build());
            builder.superclass(BaseObject.class);
            for (Property property : entry.getProperties()) {
                System.out.println(property);
                com.squareup.javapoet.FieldSpec.Builder fieldSpecBuilder = FieldSpec.builder(property.getTypeName(), property.getName(), Modifier.PRIVATE);
                fieldSpecBuilder.addJavadoc(property.getComment());
                boolean required = property.isRequired();
                fieldSpecBuilder.addAnnotation(AnnotationSpec.builder(ApiModelProperty.class).addMember("value", "$S",property.getComment()).addMember("required","$N",String.valueOf(required)).build());
                builder.addField(fieldSpecBuilder.build());
            }
            for (M m : entry.getMs()) {
                MethodSpec.Builder methodBuilder = null;
                if (m.getM() == M.METHOD.GET) {
                    methodBuilder = MethodSpec.methodBuilder(m.getName());
                    methodBuilder.addModifiers(Modifier.PUBLIC);
                    methodBuilder.returns(m.getC());
                    methodBuilder.addStatement("return " + m.getParam());
                }
                if (m.getM() == M.METHOD.SET) {
                    methodBuilder = MethodSpec.methodBuilder(m.getName());
                    methodBuilder.addModifiers(Modifier.PUBLIC);
                    methodBuilder.returns(void.class);
                    methodBuilder.addParameter(m.getC(), m.getParam());
                    methodBuilder.addStatement("this." + m.getProperty().getName() + " = " + m.getParam());
                }
                if (methodBuilder != null) {
                    builder.addMethod(methodBuilder.build());
                }

            }
            JavaFile javaFile = JavaFile.builder(entry.getPackageName(), builder.build()).build();
            javaFile.writeTo(new File(Path.ROOTPATH));

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardJavaFileManager = compiler.getStandardFileManager(null, null, null);
            StringSourceJavaObject sourceObject = new StringSourceJavaObject(entry.getPackageName() + "." + entry.getClassName(), javaFile.toString());
            Iterable<JavaFileObject> fileObjects = Arrays.asList(sourceObject);
            JavaCompiler.CompilationTask compilationTask = compiler.getTask(null, standardJavaFileManager, null, null, null, fileObjects);
            boolean result = compilationTask.call();
            if (result) {
                System.out.println("编译成功。");
                File srcFile = new File(entry.getClassName() + ".class");
                File cache = new File("target/classes/com/zjrc/iot/broker/model/biz");
                File src = new File(cache, srcFile.getName());
                if (src.exists()) {
                    src.delete();
                    System.out.println("目标文件已经存在，并且删除。");
                } else {
                    System.out.println("目标文件不存在");
                }
                System.out.println("移动成功！！！！！！！！！！！！！！！！！！");
                FileUtils.moveFileToDirectory(srcFile, cache, true);
                System.out.println("实体类生成成功");
            }
        }
    }
}
