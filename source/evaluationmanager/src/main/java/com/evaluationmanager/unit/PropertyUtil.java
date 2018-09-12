package com.evaluationmanager.unit;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PropertyUtil {
	@SuppressWarnings("unchecked")
	public static Method getGetMethod(Class objectClass, String fieldName) {
		//拼接方法名，toUpperCase方法将小写字母转换成大写字母
		StringBuffer sb = new StringBuffer();  
		sb.append("get");
		sb.append(fieldName.substring(0, 1).toUpperCase());  
		sb.append(fieldName.substring(1));  
		try {
			//发挥get方法执行结果
			return objectClass.getMethod(sb.toString());  
		} catch (Exception e) {
			e.printStackTrace();
	    }  
		return null;
	}
	@SuppressWarnings("unchecked")
	public static Method getSetMethod(Class objectClass, String fieldName) {  
	    try {
	    	//获取参数
	    	Class[] parameterTypes = new Class[1];  
	        Field field = objectClass.getDeclaredField(fieldName);  
	        parameterTypes[0] = field.getType();
	        //拼接方法名，toUpperCase方法将小写字母转换成大写字母
	        StringBuffer sb = new StringBuffer();  
	        sb.append("set");  
	        sb.append(fieldName.substring(0, 1).toUpperCase());  
	        sb.append(fieldName.substring(1));
	        //返回方法对象
	        Method method = objectClass.getMethod(sb.toString(), parameterTypes[0]);  
	        return method;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }  
	    return null;  
    }
	/**
	 * 根据属性名调用set方法
	 * @param o 属性所属对象
	 * @param fieldName 属性名
	 * @param value 值
	 */
	public static void invokeSet(Object o, String fieldName, Object value) {  
        Method method = getSetMethod(o.getClass(), fieldName);  
        try {
        	if(o.getClass().getDeclaredField(fieldName).getType().equals(String.class))
        		method.invoke(o, (String)value);
        	else if(o.getClass().getDeclaredField(fieldName).getType().equals(Integer.class))
        		method.invoke(o, Integer.parseInt((String)value));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	/**
	 * 根据属性名调用get方法
	 * @param o 属性所属对象 
	 * @param fieldName 属性名
	 * @return
	 */
	public static Object invokeGet(Object o, String fieldName) {  
        Method method = getGetMethod(o.getClass(), fieldName);  
        try {
            return method.invoke(o, new Object[0]); 
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
    }
}
