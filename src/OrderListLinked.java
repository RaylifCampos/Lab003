
public class OrderListLinked <T> extends ListLinked{
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
