
public class LListStackClass<T> implements LListStack<T> {
	
	private NodeClass<T> head;
	private NodeClass<T> tail;
	
	private int length;
	
	public LListStackClass()
	{
		head = new NodeClass<T>(null);
		tail = new NodeClass<T>(null);
		
		head.setNext(tail);
		tail.setPrev(head);
		
		length = 0;
	}
	
	@Override
	public void push(Node<T> n) {
		
		n.setPrev(tail.getPrev());
		tail.getPrev().setNext(n);
		tail.setPrev(n);
		n.setNext(tail);
		
		length += 1;
	}
	
	@Override
	public Node<T> pop() {
		
		Node<T> removedNode = tail.getPrev();
		
		tail.setPrev(removedNode.getPrev());
		removedNode.getPrev().setNext(tail);
		
		length -= 1;
		
		return removedNode;
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

		LListStackClass<Integer> list = new LListStackClass();
		
		list.push(new NodeClass(1));
		list.push(new NodeClass(2));
		list.push(new NodeClass(3));
		
		System.out.println(list);
		
	}
	

}
