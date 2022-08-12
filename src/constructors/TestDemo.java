package constructors;

public class TestDemo {

	public static void main(String[] args) {
		
		Student st = new Student("Mostafa", 34, "Denver");
		Student st2 = new Student("Stof", 68, "Texas");
		System.out.println(st.age);
		System.out.println(st2.name);
		st2.eat();
		st.drink();
	}

}
