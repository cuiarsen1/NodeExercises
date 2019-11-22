
public class NodeClass<T> implements Node<T>{

	private T data;
	
	private NodeClass<T> next;
	private NodeClass<T> previous;
	
	public NodeClass(T n)
	{
		data = n;
	}

	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setValue(Node<T> n)
	{
		
	}

	@Override
	public void setNext(Node<T> n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPrev(Node<T> n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NodeClass<T> getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeClass<T> getPrev() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
