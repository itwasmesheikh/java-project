package Encapsulation;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		this.name = "Numan";
		this.age = 24;
		this.gender = "male";
	}

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public boolean setAge(int age) {
		if(age>0 && age <=100) {
			this.age = age;
			return true;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
