public class Student{
	private String name;
	private String rollNo;
	private String course;
	
	public Student(String name,String rollNo,String course){
		this.name=name;
		this.rollNo=rollNo;
		this.course=course;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getRollNo(){
		return rollNo;
	}
	
	public void setRollNo(String rollNo){
		this.rollNo=rollNo;
	}
	
	public String getCourse(){
		return course;
	}
	
	public void setCourse(String course){
		this.course=course;
	}
	
	public void display(){
			System.out.println("Student name:"+name);
			System.out.println("Student rollNo:"+rollNo);
			System.out.println("Student course:"+course);
			
	}
	
	public static void main(String[] args){
		Student student=new Student("john doe","2022/ICT/100","information Technology");
		student.display();
		student.setName("anof");
		student.display();
		
	}
}