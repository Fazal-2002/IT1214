import java.util.Scanner;

class Person {
    private String name;
    private int age;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
    
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		setName(scanner.nextLine());
		System.out.print("Enter age: ");
		setAge(scanner.nextInt());
	}
	
	public static void main(String[] args){
		
		Person person = new Person();
		person.setName("Alice");
		person.setAge(25);
		person.input();
		System.out.println("Person Name: " + person.getName());
		System.out.println("Person Age: " + person.getAge());
		
		
	
	}
	
}
