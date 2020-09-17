package utils;

public class FieldUtil {
	/**
	 * 首字母大写,剩余的转小写
	 * @param str
	 * @return
	 */
	public static String upperCase(String propertyName) {
		return propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1).toLowerCase();
	}
	
	/**
	 * 转小写
	 */
	public static String lowerCase(String str) {
		return str.toLowerCase();
	}
	
	/**
	 * 获取字段名称,首字母小写的驼峰命名
	 * @param propertyName
	 * @return
	 */
	public static String getPropertyName(String propertyName) {
		if(propertyName.equals(""))  throw new NullPointerException("propertyName is Null") ;
		String name = "";
		String[] propertys = propertyName.split("_");
		if(propertys.length>=1) {
			name += lowerCase(propertys[0]);
			for(int i=1;i<propertys.length;i++) {
				name+= upperCase(propertys[i]);
			}
		}
		return name;
	}
	
	/**
	 * 获取类名，首字母大写，剩余的驼峰
	 * @param propertyName
	 * @return
	 */
	public static String getClassName(String propertyName) {
		if(propertyName.equals(""))  throw new NullPointerException("propertyName is Null") ;
		String name = "";
		String[] propertys = propertyName.split("_");
		if(propertys.length>=1) {
			for(int i=0;i<propertys.length;i++) {
				name+= upperCase(propertys[i]);
			}
		}
		return name;
	}
	
	/**
	 * 获取方法名，首字母大写，剩余的驼峰
	 * @param propertyName
	 * @return
	 */
	public static String getMethodName(String propertyName) {
		if(propertyName.equals(""))  throw new NullPointerException("propertyName is Null") ;
		String name = "";
		String[] propertys = propertyName.split("_");
		if(propertys.length>=1) {
			for(int i=0;i<propertys.length;i++) {
				name+= upperCase(propertys[i]);
			}
		}
		return name;
	}
}
