
public class LListQueueClass<T> implements LListQueue<T> {
	
	private NodeClass<T> head;
	private NodeClass<T> tail;
	
	private int length;
	
	public LListQueueClass()
	{
		head = new NodeClass<T>(null);
		tail = new NodeClass<T>(null);
		
		head.setNext(tail);
		tail.setPrev(head);
		
		length = 0;
	}
	
	@Override
	public void enqueue(Node<T> n) {

		Node<T> temp = head.getNext();
		
		head.setNext(n);
		n.setPrev(head);
		n.setNext(temp);
		temp.setPrev(n);
		
		length += 1;
	}

	@Override
	public Node<T> dequeue() {
		
		Node<T> temp = tail.getPrev();
		
		temp.getPrev().setNext(tail);
		tail.setPrev(temp);
		
		length -= 1;
		
		return temp;
	}

	@Override
	public Node<T> peek() {

		return tail.getPrev();
	}

	@Override
	public int size() {

		return length;
	}

	@Override
	public boolean isEmpty() {

		if (length > 0)
			return false;
		else if (length == 0)
			return true;
		
		return true;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		Node<T> temp = tail;
		
		for (int i = length; i > 0; i -= 1)
		{
			temp = temp.getPrev();
			s += temp + " ";
		}
		
		return s;
	}
	
	public static void main(String[] args) {

		LListQueueClass<Integer> list = new LListQueueClass();
		
		list.enqueue(new NodeClass(1));
		list.enqueue(new NodeClass(2));
		list.enqueue(new NodeClass(3));
		
		list.dequeue();
		
		System.out.println(list);
		
		System.out.println(list.size());

	}

}
