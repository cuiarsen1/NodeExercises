
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
	public void push(NodeClass<T> n) {
		
		n.setPrev(tail.getPrev());
		tail.getPrev().setNext(n);
		tail.setPrev(n);
		n.setNext(tail);
		
		length += 1;
	}
	
	@Override
	public NodeClass<T> pop() {
		
		NodeClass<T> removedNodeClass = tail.getPrev();
		
		tail.setPrev(removedNodeClass.getPrev());
		removedNodeClass.getPrev().setNext(tail);
		
		length -= 1;
		
		return removedNodeClass;
	}
	
	@Override
	public NodeClass<T> peek() {
		
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
		
		NodeClass<T> temp = tail;
		
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
		
		list.pop();
		
		System.out.println(list);
		
	}
	

}
