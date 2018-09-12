package com.evaluationmanager.unit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.evaluationmanager.annotation.Foreignkey;

/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月25日-下午3:28:02
 * @Description 对象操作工具类
 */
public class ClassUnit {

	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年7月25日-下午3:40:59
	 * @Description 普通对象转换为Map对象
	 * @param object
	 * @return
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public Map<String, Object> parseMap(Object object) throws InstantiationException, IllegalAccessException {
		Map<String, Object> result = new HashMap<>();
		String key = "";
		Object value = null;
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			key = field.getName();
			value = getFieldValueByName(key, object);
			Annotation[] fieldAnnotations = field.getAnnotations();
			for(Annotation annotation : fieldAnnotations) {
				if(annotation instanceof Foreignkey) {
					Object foreign = getFieldValueByName("value",Foreignkey.class);
					value = foreign.getClass().newInstance();
				}
			}
			result.put(key, value);
		}
		return result;
	}

	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年7月25日-下午3:33:46
	 * @Description 根据属性名获取属性值
	 * @param 属性名
	 * @param 属性所属的对象
	 * @return 属性值
	 */
	private Object getFieldValueByName(String fieldName, Object o) {
		try {
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);
			Method method = o.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(o, new Object[] {});
			return value;
		} catch (Exception e) {
			return null;
		}
	}
}
