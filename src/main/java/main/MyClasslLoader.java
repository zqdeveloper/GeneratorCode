package main;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/**
 * @author :Created by zhangqing on 2020/05/16 16:42
 * @description :
 * @email :1423118197@qq.com
 * @classpath : main.MyClasslLoader
 */
public class MyClasslLoader extends ClassLoader {
    private String classpath;

    public MyClasslLoader(String classpath) {
        super(ClassLoader.getSystemClassLoader());
        this.classpath = classpath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

    public byte[] loadClassData(String name) {
        try {
            name = name.replace(".", "//");
            FileInputStream inputStream = new FileInputStream(classpath + name + ".class");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int b = 0;
            while ((b = inputStream.read()) != -1) {
                bos.write(b);
            }
            inputStream.close();
            return bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
