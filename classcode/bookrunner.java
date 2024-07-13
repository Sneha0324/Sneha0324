package classcode;

public class bookrunner {

	public static void main(String[] args) {
		book b = new book("Data Science");
		book c = new book("Python for Data Analysis");
		
		System.out.println(b.bk);
		
		b.name_of_book();
		
		System.out.println(b.name_of_book);
		System.out.println(c.name_of_book);
		
		System.out.println(b.getName());

		b.setName("Data");
		System.out.println(b.getName());

	}

}
