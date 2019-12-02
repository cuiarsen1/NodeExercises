
public class LinkedListClass<T> implements LinkedList<T> {
	
	private NodeClass<T> head;
	private NodeClass<T> tail;
	
	private int length;
	
	public LinkedListClass()
	{
		head = new NodeClass<T>(null);
		tail = new NodeClass<T>(null);
		
		head.setNext(tail);
		tail.setPrev(head);

		length = 0;
	}
	
	@Override
	public void addNode(Node<T> n) {
		
		n.setPrev(tail.getPrev());
		tail.getPrev().setNext(n);
		tail.setPrev(n);
		n.setNext(tail);
		
		length += 1;
		
	}

	@Override
	public void insertNode(Node<T> n, int i) {

		Node<T> temp = head.getNext();
		
		for (int x = 0; x < i; x += 1)
		{
			temp = temp.getNext();
		}
		
		n.setPrev(temp.getPrev());
		temp.getPrev().setNext(n);
		temp.setPrev(n);
		n.setNext(temp);
		
		length += 1;
	}
	
	@Override
	public void removeNode(Node<T> n) {
		
		Node<T> temp = head.getNext();

		for (int i = 0; i < length; i += 1)
		{
			temp = temp.getNext();
			
			if (temp.getValue() == n.getValue())
				break;
		}
		
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
	
		length -= 1; 
	}

	@Override
	public Node<T> removeNode(int i) {
		
		Node<T> temp = head.getNext();

		for (int x = 0; x < i; x += 1)
		{
			temp = temp.getNext();
		}
		
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		
		length -= 1;
	
		return temp;
		
	}

	@Override
	public Node<T> getNode(int i) {
		
		Node<T> temp = head.getNext();
		
		for (int x = 0; x < i; x += 1)
		{
			temp = temp.getNext();
		}
		
		return temp;
	}

	@Override
	public Node<T> getFirstNode() {

		return head.getNext();
	}

	@Override
	public Node<T> getLastNode() {
		return tail.getPrev();
	}

	@Override
	public int size() {
		return length;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		Node<T> temp = head;
		
		for (int i = 0; i < length; i += 1)
		{
			temp = temp.getNext();
			s += temp + " ";
		}
		
		return s;
	}
	
	public static void main(String[] args) {

		LinkedListClass<Integer> list = new LinkedListClass();
		
		list.addNode(new NodeClass(1));
		list.addNode(new NodeClass(2));
		list.addNode(new NodeClass(3));
		
		System.out.println(list);
		
		list.size();
		System.out.println(list.size());
	}
	
}
