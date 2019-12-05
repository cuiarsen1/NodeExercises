
public class ArrayStackClass<T> implements ArrayStack<T> {
	
	private NodeClass<T>[] list;
	
	public ArrayStackClass(int n)
	{
		list = new NodeClass[n];
	}
	
	@Override
	public void push(NodeClass<T> n) {

		NodeClass<T>[] temp = list;
		
		list = new NodeClass[temp.length + 1];
		
		for (int i = 0; i < temp.length; i += 1)
		{
			list[i] = temp[i];
		}
		
		list[list.length - 1] = n;
		
	}

	@Override
	public NodeClass<T> pop() {
		
		NodeClass<T> object = list[list.length - 1];
		
		NodeClass<T>[] temp = list;
		
		list = new NodeClass[temp.length - 1];
		
		for (int i = 0; i < list.length; i += 1)
		{
			list[i] = temp[i];
		}
		
		return object;
		
	}

	@Override
	public NodeClass<T> peek() {
		
		return list[list.length - 1];
	}

	@Override
	public int size() {

		return list.length;
	}

	@Override
	public boolean isEmpty() {

		if (list.length > 0)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		for (int i = list.length - 1; i >= 0; i -= 1)
		{
			s += list[i] + " ";
		}
		
		return s;
	}
	
	public static void main(String[] args) {

		ArrayStackClass<Integer> array = new ArrayStackClass(0);
		
		array.push(new NodeClass(1));
		array.push(new NodeClass(2));
		array.push(new NodeClass(3));
		
		array.pop();
		
		System.out.println(array.size());
		System.out.println(array);
		
		
	}

}
