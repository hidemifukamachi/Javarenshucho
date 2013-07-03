class Book{
	String title;
	int price;
	String author;
	Date published;

	void printTitle(){
		System.out.println(this.title);
	}
}
//書物クラスの利用例
Book book1 new Book();
book1.title = "Peopleware";
book1.printTitle();
Book book2 = new Book();
book2.title = "showstopper";
System.out.println(book2.title);

    