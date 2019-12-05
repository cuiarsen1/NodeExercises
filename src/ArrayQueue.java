public interface ArrayQueue<T> {
	
	/*
	 * Inserts a NodeClass at the end of the queue
	 */
	public void enqueue(NodeClass<T> n);
	
	/*
	 * Remove and return the first NodeClass of the queue, if the queue is not empty
	 */
	public NodeClass<T> dequeue();
	
	/*
	 * Returns the first NodeClass in the queue but does not remove it
	 */
	public NodeClass<T> peek(); // dequeue side
	
	/*
	 * returns the number of NodeClass in the queue
	 */
	public int size();
	
	/*
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty();
	
	public String toString();
}