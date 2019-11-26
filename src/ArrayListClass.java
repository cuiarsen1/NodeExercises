
public class ArrayListClass<T> implements ArrayList<T> {
	
	private Node<T>[] list;

	public ArrayListClass(int n)
	{
		list = new Node[n];
	}
	
	@Override
	public void addNode(Node<T> n) {
		
		Node<T>[] listTemp = list;
		
		int newSize = list.length + 1;
		
		list = new Node[newSize];
		
		for (int i = 0; i < listTemp.length; i += 1)
		{
			list[i] = listTemp[i];
		}
		
		list[newSize - 1] = n;
		
	}
	
	@Override
	public void insertNode(Node<T> n, int i) {
		
		Node<T>[] listTemp = list;
		
		int newSize = list.length + 1;
		
		list = new Node[newSize];
		
		for (int x = 0; x < i; x += 1)
		{
			list[x] = listTemp[x];
		}
		
		list[i] = n;
		
		for (int y = i + 1; y < newSize; y += 1)
		{
			list[y] = listTemp[y - 1];
		}
	}
	
	@Override
	public void removeNode(Node<T> n) {
		
		int index = 0;
		
		for (int i = 0; i < list.length; i += 1)
		{
			if (list[i].equals(n))
			{
				index = i;
				
				break;
			}
		}
		
		for (int x = index; x < list.length - 1; x += 1)
		{
			list[x] = list[x + 1];
		}
		
		list[list.length - 1] = null;

	}
	
	@Override
	public Node<T> removeNode(int i) {
		
		Node<T> node = list[i];
		
		for (int x = i; x < list.length - 1; x += 1)
		{
			list[x] = list[x + 1];
		}
		
		list[list.length - 1] = null;
		
		return node;
	}
	
	@Override
	public Node<T> getNode(int i) {
	
		return list[i];
	}

	@Override
	public Node<T> getFirstNode() {
		return list[0];
	}

	@Override
	public Node<T> getLastNode() {
		return list[list.length - 1];
	}

	@Override
	public int size() {
		return list.length;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		for (int i = 0; i < list.length; i += 1)
		{
			s += list[i] + " ";
		}
		
		return s;
	}

	
	public static void main(String[] args) {
		
		ArrayListClass<Integer> array = new ArrayListClass(0); 
		
		array.addNode(new NodeClass(1));
		array.addNode(new NodeClass(2));
		array.addNode(new NodeClass(3));
		array.addNode(new NodeClass(4));
		array.addNode(new NodeClass(5));
		
		System.out.println(array);
		
		array.removeNode(new NodeClass(3));
		System.out.println(array);
	}

}
