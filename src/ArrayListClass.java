
public class ArrayListClass<T> implements ArrayList<T> {
	
	private Node<T>[] list;

	public ArrayListClass(int n)
	{
		list = new Node[n];
	}
	
	@Override
	public void addNode(Node<T> n) {
		
		int newSize = list.length + 1;
		
		Node<T>[] listNew = new Node[newSize];
		
		for (int i = 0; i < list.length; i += 1)
		{
			listNew[i] = list[i];
		}
		
		listNew[newSize - 1] = n;
		
	}
	
	public void insertNode(Node<T> n, int i) {
		
	}
	
	@Override
	public void removeNode(Node<T> n) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Node<T> removeNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Node<T> getNode(int i) {
		
	}

	@Override
	public Node<T> getFirstNode() {
		return list[0];
	}

	@Override
	public Node<T> getLastNode() {
		return list[list.length];
	}

	@Override
	public int size() {
		return list.length;
	}
	
	public String toString() {
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
