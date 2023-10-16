package br.ucsal.advancedjava.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		Cat myCat = new Cat("Stella", 18);
		System.out.println(myCat.getName());

		Field[] catFields = myCat.getClass().getDeclaredFields();

		for (Field field : catFields) {

			if (field.getName().equals("name")) {
				field.setAccessible(true);
				field.set(myCat, "ninika");
			}

		}
		System.out.println(myCat.getName());
		Method[] catMethods = myCat.getClass().getDeclaredMethods();
		for (Method method : catMethods) {

			if (method.getName().equals("getAge")) {
				method.setAccessible(true);
				method.invoke(null);
			}
			// System.out.println(method.getName());

		}
	}

}
