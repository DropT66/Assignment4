public class LinkedList <T> implements LinkedListInterface <T>
{
	Node <T> head = new Node <T> ();
	Node <T> end = new Node <T> ();
 
	public LinkedList()
	{
		head = null;
	}
	
	public void insertLast(T value)
	{
		Node <T> newNode = new Node <T> (value);
		end.setLink(null);
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			end.setLink(newNode);
		}
		
		end = newNode;
	}
	
	public Node <T> delete()
	{
		Node <T> temp = null;
		try
		{
			temp = head;
			head = head.link;
		}
		catch(Exception e)
		{
			System.err.println("Pop From Empty Stack!");
		}
		return temp;
	}
	
	public boolean isEmpty()
	{
		return(head == null);
	}
	
	public void display()
	{
		Node <T> tempNode = head;
		while(tempNode != null)
		{
			System.out.println("[" +tempNode.getData()+"]");
			tempNode = tempNode.getLink();
		}
	}
	
	public T getHead() 
	{
		return head.getData();
	}

	public void setHead(Node <T> head) 
	{
		this.head = head;
	}
}