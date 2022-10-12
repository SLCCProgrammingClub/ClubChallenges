package debugging;

/**
 * Code example from on the following debugging tutorial 
 * https://www.youtube.com/watch?v=aqcJsKdjjvU
 */
public class DebuggingExample2 {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Kramer");
		cat1.setLitterPreference("TidyCats");
		cat1.setAge(3);
		
		Cat cat2 = new Cat("George");
		cat2.setLitterPreference("Fresh Step");
		cat2.getLitterPreference();
		System.out.println(cat2.getAge());
		
		Cat[] cats = new Cat[2];
		
		cats[0] = cat1;
		cats[1] = cat2;

	}

}
