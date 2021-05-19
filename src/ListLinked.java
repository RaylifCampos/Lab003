
public class ListLinked <T> implements TDAList<T>{
	private Node<T> first;
	private int count;
	
	public ListLinked() {
		this.first= null;
	}
	public boolean isEmptyList() {
		return this.first == null;
	}
	public int length() {
		return this.count;
	}
	public void destroyList() {
		while(this.first != null)
			this.first=this.first.getNext();
	}
	public int search(T x) {
		
	}
	public void insertLast(T x) {
		
	}
	public void insertFirst(T x) {
		
	}
	public void remove(T x) {
		
	}
	
}
