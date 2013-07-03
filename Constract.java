class Book{
	String title;
	int price;
	String author;
	Date published;

	Book(String title, int price, String author, Date published){
		this.title = title;
		this.price = price;
		this.author = author;
		this.published = published;
	}
	Book(String title, int price, String author){
		this.title = title;
		this.price = price;
		this.author = author;
		this.published = new Date();
	}
}


