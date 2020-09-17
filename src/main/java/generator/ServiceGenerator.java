package generator;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import constant.Path;
import controller.entry.Entry;
import utils.FieldUtil;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.util.Map;

/**
 * @author :Created by zhangqing on 2020/05/13 08:41
 * @description :
 * @email :1423118197@qq.com
 * @classpath : generator.ServiceGenerator
 */
public class ServiceGenerator extends Generator {
    ServiceGenerator(Map<String, Entry> map) throws Exception {
        super(map);
        for (Entry entry : map.values()) {
            String className = entry.getClassName();
            String name = className + "Service";
            TypeSpec.Builder builder = TypeSpec.interfaceBuilder(name);
            builder.addModifiers(Modifier.PUBLIC);

            builder.addMethod(MethodSpec.methodBuilder("insert" + className).returns(Result.class).addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT).addParameter(Class.forName(entry.getPackageName() + "." + className), FieldUtil.getPropertyName(entry.getTableName())).build());
            builder.addMethod(MethodSpec.methodBuilder("update" + className).returns(Result.class).addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT).addParameter(Class.forName(entry.getPackageName() + "." + className), FieldUtil.getPropertyName(entry.getTableName())).build());
            builder.addMethod(MethodSpec.methodBuilder("list").returns(PageResult.class).addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT).addParameter(Class.forName(entry.getPackageName() + "." + className), FieldUtil.getPropertyName(entry.getTableName())).build());
            builder.addMethod(MethodSpec.methodBuilder("deleteByIds").returns(Result.class).addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT).addParameter(String.class, "ids").build());


            JavaFile javaFile = JavaFile.builder(Path.SERVICEPATH, builder.build()).build();
            javaFile.writeTo(new File(Path.ROOTPATH));
        }
    }
}
