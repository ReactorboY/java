import java.util.HashMap;

public class Library{
	public Library(){
		
	}
	
	public void getFinishedBooks(HashMap<String, Boolean> library){
		if (library.size() < 1){
			System.out.println("HashMap is empty");
		} else {
			for (String book : library.keySet()){
				if (book){
					System.out.println(book);
				}
			}
		}
	}
	
	public static void main(String[] args){
		HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
		myBooks.put("Road down the funnel", true);
		Library myLibrary = new Library();
		myLibrary.getFinishedBooks(myBooks);
	}
}