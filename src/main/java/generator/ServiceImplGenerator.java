package generator;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.zjrc.iot.broker.common.util.Constant;
import com.zjrc.iot.broker.common.util.Page;
import com.zjrc.iot.broker.common.util.PageResult;
import com.zjrc.iot.broker.common.util.Result;
import constant.Path;
import controller.entry.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.FieldUtil;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @author :Created by zhangqing on 2020/05/13 10:30
 * @description :
 * @email :1423118197@qq.com
 * @classpath : generator.ServiceImpl
 */
public class ServiceImplGenerator extends Generator {
    public ServiceImplGenerator(Map<String, Entry> map) {
        super(map);
    }

    @Override
    protected void generator(Map<String, Entry> map) throws Exception {
        super.generator(map);
        for (Entry entry : map.values()) {
            String className = entry.getClassName();
            String name = className + "ServiceImpl";
            String propertyName = FieldUtil.getPropertyName(entry.getTableName());
            String mapperName = FieldUtil.getPropertyName(entry.getTableName()) + "mapper";

            TypeSpec.Builder builder = TypeSpec.classBuilder(name);
            builder.addModifiers(Modifier.PUBLIC);
            builder.addAnnotation(Service.class);
            builder.addAnnotation(Transactional.class);


            builder.addField(FieldSpec.builder(Class.forName(Path.DAOPATH + "." + entry.getClassName() + "Mapper"), mapperName, Modifier.PRIVATE).addAnnotation(Autowired.class).build());

            builder.addSuperinterface(Class.forName(Path.SERVICEPATH + "." + className + "Service"));

            builder.addMethod(MethodSpec.methodBuilder("insert" + className).addStatement("return null").returns(Result.class).addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).addParameter(Class.forName(entry.getPackageName() + "." + className), propertyName).build());
            builder.addMethod(MethodSpec.methodBuilder("update" + className).addStatement("return null").returns(Result.class).addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).addParameter(Class.forName(entry.getPackageName() + "." + className), propertyName).build());
            MethodSpec.Builder listBuilder = MethodSpec.methodBuilder("list").addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).addParameter(Class.forName(entry.getPackageName() + "." + className), propertyName);
            listBuilder.returns(PageResult.class);
            listBuilder.addStatement("/*\n" +
                    "\t\t * 设置对象分页参数\n" +
                    "\t\t */\n" +
                    "\t\t$T page ="+propertyName+".getPage();\n" +
                    "\t\t$T pageRes = new PageResult();\n" +
                    "\t\t"+propertyName+".setPage(page);\n" +
                    "\t\t// 分页查询\n" +
                    "\t\t$T<$T<String, Object>> list = " + mapperName + ".page(" + propertyName + ");\n" +
                    "\t\t/*\n" +
                    "\t\t * 组装响应结果\n" +
                    "\t\t */\n" +
                    "\t\tpageRes.setAaData(list);\n" +
                    "\t\tif (page.getCurrentPage() != null && page.getPageSize() != null) {\n" +
                    "\t\t\tpageRes.setItotalRecords(" + propertyName + ".getPage().getTotalCount());\n" +
                    "\t\t}\n" +
                    "\t\tpageRes.setCode($T.SUCCESS_);\n" +
                    "\t\treturn pageRes", Page.class,PageResult.class, List.class,Map.class, Constant.class);
            builder.addMethod(listBuilder.build());
            builder.addMethod(MethodSpec.methodBuilder("deleteByIds").returns(Result.class).addStatement("return null").addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).addParameter(String.class, "ids").build());


            JavaFile javaFile = JavaFile.builder(Path.SERVICEIMPLPATH, builder.build()).build();
            javaFile.writeTo(new File(Path.ROOTPATH));
        }
    }
}
