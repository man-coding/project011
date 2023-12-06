package object;

public class Ex04 {

	public static void main(String[] args) {

		Book book = new Book(200,"개미");
		
		System.out.println(book.toString());
		System.out.println(book); //book.toString()과 같음
	}

}

class Book {
	int bookNumber;
	String booktitle;

	public Book(int bookNumber, String booktitle) {
		super();
		this.bookNumber = bookNumber;
		this.booktitle = booktitle;
	}

	@Override //generate-tostring 메뉴 사용
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", booktitle=" + booktitle + "]";
	}
	
}