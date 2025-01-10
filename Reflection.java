package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
public static void main(String[] args) {
	try {
		Class<?>employeeClass=Class.forName("crud.Employee");
		
		System.out.println("Employee class name:"+employeeClass.getName());
		
		System.out.println("SuperClass:"+employeeClass.getSuperclass());
		
		System.out.println("\nFields:");
		
		Field[]fields=employeeClass.getDeclaredFields();
		for(Field field:fields) {
			System.out.println("Name:"+field.getName()+", Type:"+field.getType());
		}
		
		System.out.println("\nConstructors");
		
		Constructor <?>[] constructors=employeeClass.getDeclaredConstructors();
		for (Constructor<?>constructor:constructors) {
			System.out.println(constructor.toString());
		}
		
		System.out.println("\nMethods:");
		
		Method[]method=employeeClass.getDeclaredMethods();
		for(Method method1:method) {
			System.out.println("Name:"+method1.getName()+",Return Type"+method1.getReturnType());
		}
	}catch(ClassNotFoundException e) {
		System.out.println("Employee Class Not Found:");
		e.printStackTrace();
	}
}
}
