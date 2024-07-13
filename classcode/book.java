package classcode;

public class book {

	String bk = "java";
	String name_of_book;
	
	private String name="Python";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void name_of_book() {
		System.out.println("Demo for constructor:");
	}
	
	book() {
		
	}
	
	book(String name_of_book){
		this.name_of_book = name_of_book;
	}
}
