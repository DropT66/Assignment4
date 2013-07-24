public class Queue <T>
{

	Node <T> head;
	Node <T> end;
	Node <T> tempNode;
	int size = 0;
	
	public Queue()
	{
		head = null;
		end = null;
	}
	
	public synchronized void enqueue(T data)
	{
		Node <T> newNode = new Node <T> (data);

		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			end.setLink(newNode);
		}
		
		end = newNode;
		size++;
	}
	
	public synchronized Node <T> dequeue() throws QueueUnderFlowException
	{
		Node <T> temp = null;
		if(!isEmpty())
		{
			temp = head;
			head = head.link;
		}
		else
		{
			throw new QueueUnderFlowException("Empty Queue");
		}
		size--;
		return temp;
	}

	public T getHead() {
		return head.getData();
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public boolean isEmpty()
	{
		return(head == null);
	}
	
	public void display()
	{
		tempNode = head;
		while(tempNode != null)
		{
			System.out.println(tempNode.getData());
			tempNode = tempNode.getLink();
		}
	}
}
