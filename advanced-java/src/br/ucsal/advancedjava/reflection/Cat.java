package br.ucsal.advancedjava.reflection;

public class Cat {

	private final String name;
	private Integer age;

	public Cat(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void meow() {
		System.out.println("Meow");
	}

	private void heyThisIsPrivate() {
		System.out.println("How ddi you call this?");
	}

	public static void thisIsAPublicStaticMethod() {
		System.out.println("I'm public and static");
	}

	private static void thisIsAPrivateMethodAndStaticMethos() {
		System.out.println("hey, i'm a private and static as method");
	}
}
