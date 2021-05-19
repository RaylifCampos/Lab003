
public class ListLinked <T> implements TDAList<T>{
	private Node<T> first;
	private int count;
	
	public ListLinked() {
		this.first= null;
		this.count=0;
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
		Node<T> aux = this.first;
		for(int i=0; aux != null; aux= aux.getNext(),i++)
			if(aux.getData().equals(x))
				return i;
		return -1;
	}
	public void insertLast(T x) {
		if(this.isEmptyList())
			this.insertFirst(x);
		else {
			Node<T> lastNode = getLastNode();
			lastNode.setNext(new Node<T>(x));
			this.count++;
			
		}	
	}
	private Node<T> getLastNode(){
		Node<T> aux= this.first;
		while(aux.getNext()!=null)
			aux=aux.getNext();
		return aux;
	}
	public void insertFirst(T x) {
		this.first = new Node<T>(x,this.first);
		this.count++;
		
	}
	public void remove(T x) {
		
	}
	
	public String toString() {
		String str="";
		Node<T> aux = this.first;
		for(int i=0;aux!=null;aux=aux.getNext(), i++)
			str += "["+i+"] = "+aux.getData()+"\n";
		return str;
	}
	
}
