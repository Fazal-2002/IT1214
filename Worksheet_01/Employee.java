class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : Rs" + salary);
    }
}

class Manager extends Employee {

    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }


    @Override
    void displayDetails() {
        super.displayDetails(); 
        double bonus = salary * 0.20;
        System.out.println("Manager Bonus : Rs" + bonus);
    }
	
	public static void main(String[] args){
		Manager manager = new Manager("Bob", 201, 75000);
		manager.displayDetails();
	}
	
}
