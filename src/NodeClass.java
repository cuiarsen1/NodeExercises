import java.util.ArrayList;

public class NodeClass<T> implements Node<T> {

	private T data;
	
	private NodeClass<T> next;
	private NodeClass<T> previous;
	
	public NodeClass(T n)
	{
		data = n;
	}

	@Override
	public T getValue() {
		return data;
	}
	
	@Override
	public void setValue(T n) {
		data = n;
	}

	@Override
	public void setNext(NodeClass<T> n) {
		next = n;
	}

	@Override
	public void setPrev(NodeClass<T> n) {
		previous = n;
		
	}

	@Override
	public NodeClass<T> getNext() {
		return next;
	}

	@Override
	public NodeClass<T> getPrev() {
		return previous;
	}
	
	public String toString() {
		return data.toString();
	}
	
	public static void main(String[] args) {
		
		NodeClass<Integer> n = new NodeClass(new Integer(5));
		NodeClass<Integer> m = new NodeClass(new Integer(5));
		
		NodeClass<String> s = new NodeClass(new String("Hello World"));
		
		n.setNext(m);
		
		ArrayList<NodeClass> list = new ArrayList();
		
		list.add(n);
		list.add(s);
		
		for (int i = 0; i < list.size(); i += 1)
		{
			System.out.println(list.get(i));
		}
	}
}
