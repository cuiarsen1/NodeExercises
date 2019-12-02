
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
		
		queue[]
		
		return object;
	}

	@Override
	public Node<T> peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
