public interface LinkedListInterface <T>
{
	public void insertLast(T value);
	public Node <T> delete();
	public T getHead();
	public void setHead(Node <T> head);
}