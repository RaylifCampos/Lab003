
public class TestList {
	
	public static void main(String[] args) {
		
		TDAList <Integer> l1= new ListLinked<Integer>();
		
	
		l1.insertLast(3);
		l1.insertLast(2);
		l1.insertLast(4);


		
		System.out.println(l1);
		System.out.println(l1.search(4));
		
		
	}

}
