package generator;

import controller.entry.Entry;
import controller.entry.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author :Created by zhangqing on 2020/05/13 08:41
 * @description :
 * @email :1423118197@qq.com
 * @classpath : generator.Generator
 */
public class Generator {
    protected Map<String, Entry> maps;
    private List<Generator> generators = new ArrayList<>();

    public static void start(Map<String, Entry> map) {
        try {
            new Generator(map).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Generator(Map<String, Entry> map) {
        this.maps = map;
    }

    private void start() throws Exception {
        generators.add(new EntryGenerator(maps));
        generators.add(new MapperGenerator(maps));
        generators.add(new XmlGenerate(maps));
        generators.add(new ServiceGenerator(maps));
        generators.add(new ServiceImplGenerator(maps));
        generators.add(new ControllerGenerator(maps));

        for (Generator generator : generators) {
            generator.generator(maps);
        }
    }

    protected final String getKey(Entry entry) {
        String key = "";
        for (Property property : entry.getProperties()) {
            if (property.getCloumnName().equals(entry.getPrimaryKey())) {
                key = property.getName();
                break;
            }
        }
        return key;
    }

    protected void generator(Map<String, Entry> map) throws Exception {

    }
}
