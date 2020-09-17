package generator;

import com.squareup.javapoet.*;
import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import constant.Path;
import controller.entry.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utils.FieldUtil;
import utils.StringSourceJavaObject;

import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.util.Arrays;
import java.util.Map;

/**
 * @author :Created by zhangqing on 2020/05/12 14:12
 * @description :
 * @email :1423118197@qq.com
 * @classpath : generator.Controller
 */
class ControllerGenerator extends Generator {
    public ControllerGenerator(Map<String, Entry> map) {
        super(map);
    }

    @Override
    protected void generator(Map<String, Entry> map) throws Exception {
        super.generator(map);
        for (Map.Entry<String, Entry> entryEntry : map.entrySet()) {
            Entry entry = entryEntry.getValue();
            String name = entry.getClassName() + "Controller";
            TypeSpec.Builder classBuilder = TypeSpec.classBuilder(name).addModifiers(Modifier.PUBLIC);
            classBuilder.addAnnotation(AnnotationSpec.builder(RequestMapping.class).addMember("method", "$T.$N", RequestMethod.class, "POST").build());
            classBuilder.addAnnotation(RestController.class);
            classBuilder.addAnnotation(CrossOrigin.class);
            String ServiceName = FieldUtil.getPropertyName(entry.getTableName()) + "Service";
            classBuilder.addField(FieldSpec.builder(Class.forName(Path.SERVICEPATH + "." + entry.getClassName() + "Service"), ServiceName).addAnnotation(Autowired.class).addModifiers(Modifier.PRIVATE).build());

            ParameterSpec Parameter = ParameterSpec.builder(Class.forName(entry.getPackageName() + "." + entry.getClassName()), FieldUtil.getPropertyName(entry.getTableName())).addAnnotation(RequestBody.class).build();
            MethodSpec.Builder insertBuilder = MethodSpec.methodBuilder("insert");
            insertBuilder.addAnnotation(ResponseBody.class);
            insertBuilder.addAnnotation(AnnotationSpec.builder(RequestMapping.class)
                    .addMember("value", "$S", "/insert").build());
            insertBuilder.addModifiers(Modifier.PUBLIC);
            insertBuilder.addParameter(Parameter);
            insertBuilder.beginControlFlow("try");
            insertBuilder.addStatement("return " + ServiceName + ".insert" + entry.getClassName() + "(" + FieldUtil.getPropertyName(entry.getTableName() + ")"));
            insertBuilder.nextControlFlow("catch ($T e)", Exception.class);
            insertBuilder.addStatement("e.printStackTrace();\n" +
                    "      return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null)");
            insertBuilder.endControlFlow();
            insertBuilder.returns(Result.class);
            classBuilder.addMethod(insertBuilder.build());

            MethodSpec.Builder updateBuilder = MethodSpec.methodBuilder("update").addAnnotation(ResponseBody.class);
            updateBuilder.addAnnotation(AnnotationSpec.builder(RequestMapping.class).addMember("value", "$S", "/update").build());
            updateBuilder.addModifiers(Modifier.PUBLIC);
            updateBuilder.addParameter(Parameter);
            updateBuilder.beginControlFlow("try");
            updateBuilder.addStatement("return " + ServiceName + ".update" + entry.getClassName() + "(" + FieldUtil.getPropertyName(entry.getTableName() + ")"));
            updateBuilder.nextControlFlow("catch ($T e)", Exception.class);
            updateBuilder.addStatement("e.printStackTrace();\n" +
                    "      return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null)");
            updateBuilder.endControlFlow();
            updateBuilder.returns(Result.class);
            classBuilder.addMethod(updateBuilder.build());

            MethodSpec.Builder deleteBuilder = MethodSpec.methodBuilder("deleteByIds")
                    .addAnnotation(ResponseBody.class)
                    .addAnnotation(AnnotationSpec.builder(RequestMapping.class)
                            .addMember("value", "$S", "/delete").build())
                    .addModifiers(Modifier.PUBLIC);
            deleteBuilder.addParameter(ParameterSpec.builder(String.class, "ids")
                    .addAnnotation(RequestBody.class)
                    .build());
            deleteBuilder.beginControlFlow("try");
            deleteBuilder.addStatement("return " + ServiceName + ".deleteByIds" + "(ids)");
            deleteBuilder.nextControlFlow("catch ($T e)", Exception.class);
            deleteBuilder.addStatement("e.printStackTrace();\n" +
                    "      return new Result(Constant.FAIL_, Constant.ADD_MESSAGE_FAIL, null)");
            deleteBuilder.endControlFlow();
            deleteBuilder.returns(Result.class);
            classBuilder.addMethod(deleteBuilder.build());


            MethodSpec.Builder listBuilder = MethodSpec.methodBuilder("list");
            listBuilder.addAnnotation(ResponseBody.class);
            listBuilder.addAnnotation(AnnotationSpec.builder(RequestMapping.class)
                    .addMember("value", "$S", "/list").build());
            listBuilder.addModifiers(Modifier.PUBLIC);
            listBuilder.addParameter(Parameter);
            listBuilder.beginControlFlow("try");
            listBuilder.addStatement("return " + ServiceName + ".list" + "(" + FieldUtil.getPropertyName(entry.getTableName() + ")"));
            listBuilder.nextControlFlow("catch ($T e)", Exception.class);
            listBuilder.addStatement(" PageResult pageRes = new PageResult();\n" +
                    "            e.printStackTrace();\n" +
                    "            pageRes.setCode($T.FAIL_);\n" +
                    "            pageRes.setMsg($T.SEARCH_MESSAGE_FAIL);\n" +
                    "            return pageRes", Constant.class, Constant.class);
            listBuilder.endControlFlow();
            listBuilder.returns(PageResult.class);
            classBuilder.addMethod(listBuilder.build());


            JavaFile javaFile = JavaFile.builder(Path.CONTROLLERPATH, classBuilder.build()).build();
            javaFile.writeTo(new File(Path.ROOTPATH));


        }
        System.out.println("Controller生成成功");

    }
}
