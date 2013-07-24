public interface NodeInterface <T> 
{
	public T getData();
	public void setData(T value);
	public Node <T> getLink();
	public void setLink(Node <T> link);
}
