public interface LListQueue<T> {
	/*
	 * Inserts a node at the end of the queue
	 */
	public void enqueue(Node<T> n);
	
	/*
	 * Remove and return the first node of the queue, if the queue is not empty
	 */
	public Node<T> dequeue();
	
	/*
	 * Returns the first node in the queue but does not remove it
	 */
	public Node<T> peek();
	
	/*
	 * returns the number of nodes in the queue
	 */
	public int size();
	
	/*
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty();
	
	public String toString();
}