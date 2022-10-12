package debugging;

/**
 * Code example based on the following debugging tutorial 
 * https://www.youtube.com/watch?v=aqcJsKdjjvU
 */
public class Cat {
	private String name;
	private String litterPreference;
	private int age;
	
	public Cat(String name) {
		this.name = name;
	}

	public String getLitterPreference() {
		return litterPreference;
	}

	public void setLitterPreference(String litterPreference) {
		this.litterPreference = litterPreference;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", litterPreference=" + litterPreference + ", age=" + age + "]";
	}
}
