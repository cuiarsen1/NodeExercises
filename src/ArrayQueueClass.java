
public class ArrayQueueClass<T> implements ArrayQueue<T> {
	
	private Node<T>[] queue;
	
	public ArrayQueueClass(int n)
	{
		queue = new Node[n];
	}

	@Override
	public void enqueue(Node<T> n) {

		Node<T>[] temp = queue;
		
		queue = new Node[temp.length + 1];
		
		for (int i = 0; i < temp.length; i += 1)
		{
			queue[i + 1] = temp[i];
		}
		
		queue[0] = n;
	}

	@Override
	public Node<T> dequeue() {
		
		Node<T> object = queue[queue.length - 1];
		
		Node<T>[] temp = queue;
		
		queue = new Node[temp.length - 1];
		
		for (int i = 0; i < queue.length; i += 1)
		{
			queue[i] = temp[i];
		}
		
		return object;
		
	}

	@Override
	public Node<T> peek() {
		
		return queue[queue.length - 1];
		
		
	}

	@Override
	public int size() {

		return queue.length;
	}

	@Override
	public boolean isEmpty() {

		if (queue.length > 0)
			return false;
		else if (queue.length == 0)
			return true;

		return true;
	}
	
	
	@Override
	public String toString() {
		
		String s = "";
		
		for (int i = queue.length - 1; i >= 0; i -= 1)
		{
			s += queue[i] + " ";
		}
		
		return s;
	}

	public static void main(String[] args) {

		ArrayQueueClass<Integer> list = new ArrayQueueClass(0);
		
		list.enqueue(new NodeClass(1));
		list.enqueue(new NodeClass(2));
		list.enqueue(new NodeClass(3));
		
		list.dequeue();
		
		System.out.println(list.size());
		
		System.out.println(list);
	}


}
