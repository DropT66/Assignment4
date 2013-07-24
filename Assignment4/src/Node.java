public class Node <T> implements NodeInterface <T>
{
	T data;
	Node <T> link;
	
	public Node()
	{
		super();
	}
	
	public Node(T data)
	{
		this.data = data;
		link = null;
	}
	
	public T getData()
	{
		return data;
	}
	
	public void setData(T value)
	{
		this.data = value;
	}
	
	public Node <T> getLink()
	{
		return link;
	}
	
	public void setLink(Node <T> link)
	{
		this.link = link;
	}
}