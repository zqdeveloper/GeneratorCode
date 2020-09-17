package generator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;


import constant.Path;
import controller.entry.Entry;
import controller.entry.Property;

public class XmlGenerate extends Generator {

    XmlGenerate(Map<String, Entry> map) {
        super(map);
    }

    @Override
    protected void generator(Map<String, Entry> maps) throws Exception {
        super.generator(maps);
        for (Map.Entry<String, Entry> map : maps.entrySet()) {
            Entry entry = map.getValue();
            StringBuilder builder = new StringBuilder();
            header(entry, builder);
            resultMap(entry, builder);
            sql(entry, builder);
            page(entry, builder);
            insert(entry, builder);
            update(entry, builder);
            delete(entry, builder);
            extern(entry, builder);
            end(entry, builder);
            File file = new File(Path.ROOTPATH);
            File parent = new File(file, "mysql");
            if (!parent.exists()) parent.mkdirs();
            File cache = new File(parent, "xml");
            if (!cache.exists()) cache.mkdirs();
            File xml = new File(cache, entry.getClassName() + "Mapper.xml");
            FileOutputStream fileOutputStream = new FileOutputStream(xml);
            fileOutputStream.write(builder.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        }
        System.out.println("xml生成成功");
    }

    public final void header(Entry entry, StringBuilder stringBuilder) {
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
        stringBuilder.append("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n");
        stringBuilder.append("<mapper namespace=\"" + Path.DAOPATH + "." + entry.getClassName() + "Mapper" + "\">\n");
    }

    public final void resultMap(Entry entry, StringBuilder stringBuilder) {
        stringBuilder.append("<resultMap id=\"baseDataResultMap\" type=" + "\"" + entry.getPackageName() + "." + entry.getClassName() + "\">\n");
        for (Property property : entry.getProperties()) {
            if (property.getCloumnName().equals(entry.getPrimaryKey())) {
                stringBuilder.append(" <id column=\"" + property.getCloumnName() + "\" property=\"" + property.getName() + "\" jdbcType=\"" + property.getJdbcType() + "\"/>");
            } else {
                stringBuilder.append(" <result column=\"" + property.getCloumnName() + "\" property=\"" + property.getName() + "\" jdbcType=\"" + property.getJdbcType() + "\"/>");
            }
            stringBuilder.append(" <!--" + property.getComment() + "-->\n");

        }
        stringBuilder.append("</resultMap>\n");
    }

    public final void sql(Entry entry, StringBuilder builder) {
        builder.append(" <sql id=\"filed\">\n");
        for (Property property : entry.getProperties()) {
            builder.append(" <if test=\"" + property.getName() + " != null and " + property.getName() + " !='' \">\n");
            builder.append(property.getCloumnName() + ",\n");
            builder.append(" </if>\n");
        }
        builder.append("</sql>\n");

        builder.append(" <sql id=\"values\">\n");
        for (Property property : entry.getProperties()) {
            builder.append(" <if test=\"" + property.getName() + " != null and " + property.getName() + " !='' " + "\">\n");
            builder.append("#{" + property.getName() + ",jdbcType=" + property.getJdbcType() + "},\n");
            builder.append(" </if>\n");
        }
        builder.append("</sql>\n");

        builder.append(" <sql id=\"select\">\n");
        for (Property property : entry.getProperties()) {
            builder.append(" <if test=\"" + property.getName() + " != null and " + property.getName() + " !='' \">\n");
            builder.append("and " + property.getCloumnName() + " = #{" + property.getName() + ",jdbcType=" + property.getJdbcType() + "}\n");
            builder.append(" </if>\n");
        }
        builder.append("</sql>\n");

        builder.append(" <sql id=\"update\">\n");
        for (Property property : entry.getProperties()) {
            builder.append(" <if test=\"" + property.getName() + " != null and " + property.getName() + " !='' \">\n");
            builder.append(property.getCloumnName() + " = #{" + property.getName() + ",jdbcType=" + property.getJdbcType() + "},\n");
            builder.append(" </if>\n");
        }
        builder.append("</sql>\n");
    }

    public final void insert(Entry entry, StringBuilder builder) {
        builder.append("<insert id=\"insert\" parameterType=\"" + entry.getPackageName() + "." + entry.getClassName() + "\" useGeneratedKeys=\"true\" keyProperty=\"" + getKey(entry) + "\">\n");
        builder.append(" insert into " + entry.getTableName() + "\n");
        builder.append("  <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n" +
                "            <include refid=\"filed\"/>\n" +
                "		        </trim>\n");
        builder.append(" values\n");
        builder.append("  <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n" +
                "		            <include refid=\"values\"/>\n" +
                "		        </trim>\n");
        builder.append(" </insert>\n");
    }

    public final void update(Entry entry, StringBuilder builder) {
        builder.append("<update id=\"update\" parameterType=\"" + entry.getPackageName() + "." + entry.getClassName() + "\">\n");
        builder.append(" update " + entry.getTableName() + "\n");
        builder.append("<set>\n");
        builder.append("<include refid=\"update\"/>\n");
        builder.append("</set>\n");
        builder.append("where " + entry.getPrimaryKey() + " = #{" + getKey(entry) + ",jdbcType=INTEGER} AND STATUS_ =1\n");
        builder.append("</update>\n");
    }

    public final void delete(Entry entry, StringBuilder builder) {
        builder.append(" <delete id=\"delete\" parameterType=\"" + entry.getPackageName() + "." + entry.getClassName() + "\">\n");
        builder.append("  <if test=\"" + getKey(entry) + " != null and " + getKey(entry) + " != ''\">\n");
        builder.append("delete from " + entry.getTableName() + " where " + entry.getPrimaryKey() + " = #{" + getKey(entry) + "}\n");
        builder.append(" </if>\n");
        builder.append(" </delete>\n");
    }

    public final void page(Entry entry, StringBuilder builder) {
        builder.append("<select id=\"page\" resultMap=\"baseDataResultMap\" parameterType=\"" + entry.getPackageName() + "." + entry.getClassName() + "\">\n");
        builder.append("select * from " + entry.getTableName() + "\n");
        builder.append(" where\n");
        builder.append(" STATUS_ =1\n");
        builder.append("  <include refid=\"select\"/>\n");
        builder.append("   order by " + entry.getPrimaryKey() + "");
        builder.append(" </select>\n");
    }

    public final void end(Entry entry, StringBuilder builder) {
        builder.append("</mapper>");
    }

    /**
     * 留作扩展使用
     *
     * @param entry
     * @param builder
     */
    protected void extern(Entry entry, StringBuilder builder) {

    }

}
