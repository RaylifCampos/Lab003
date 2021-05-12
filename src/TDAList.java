
public interface TDAList {
	boolean isEmptyList();
	int length();
	void destroyList();
	int search(T x);
	void insertLast(T x);
	void insertFirst(T x);
	void remove(T x);

}
