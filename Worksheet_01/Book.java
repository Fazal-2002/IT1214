class Book {
	private String title;
	private String author;
	private double price;
	
	Book(String title, String author, double price) {
		// Initialize all attributes
		this.title = title;
        this.author = author;
        this.price = price;
	}
	
	Book(String title, String author) {
		// Initialize with price = 0
		this.title = title;
        this.author = author;
        this.price = 0.0;
	}
	
	void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : Rs" + price);
    }
	
	
	public static void main(String[] args){
		Book book1 = new Book("Java Basics", "Author A", 300.0);
		Book book2 = new Book("Python Essentials", "Author B");
		book1.display();
		book2.display();
	}
}


