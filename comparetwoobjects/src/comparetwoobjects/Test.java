package comparetwoobjects;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.collections.BeanMap;

public class Test {
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Employee emp1 = new Employee("mani", "kumar", 20000, "java");
		Employee emp2 = new Employee("mani1", "kumar", 20000, "java1");
		BeanMap map = new BeanMap(emp1);
        PropertyUtilsBean propUtils = new PropertyUtilsBean();
        for (Object propNameObject : map.keySet()) {
            String propertyName = (String) propNameObject;
            Object property1 = propUtils.getProperty(emp1, propertyName);
            Object property2 = propUtils.getProperty(emp2, propertyName);
            if (property1.equals(property2)) {
                System.out.println("  " + propertyName + " is equal");
            } else {
                System.out.println("> " + propertyName + " is different (oldValue=\"" + property1 + "\", newValue=\"" + property2 + "\")");
            }
        }

	}

}
