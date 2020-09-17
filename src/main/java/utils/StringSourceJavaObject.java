package utils;

import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author :Created by zhangqing on 2020/05/16 17:05
 * @description :
 * @email :1423118197@qq.com
 * @classpath : utils.StringSourceJavaObject
 */
public class StringSourceJavaObject extends SimpleJavaFileObject {
    /**
     * Construct a SimpleJavaFileObject of the given kind and with the
     * given URI.
     *
     * @param uri  the URI for this file object
     * @param kind the kind of this file object
     */
    private String content = null;

    public StringSourceJavaObject(String name, String content) throws URISyntaxException {
        super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
        this.content = content;
    }

    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        return content;
    }
}
