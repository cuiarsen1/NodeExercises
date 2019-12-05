public interface ArrayStack<T> {
	/**
	 * Implements a LIFO stack using an array
	 * 
	 * @param <T>
	 */
	
	/*
	 * Places (or pushes) a NodeClass on the stack
	 */
	public void push(NodeClass<T> n);
		
	/*
	 * Removes (or pops) a NodeClass from the top of the stack
	 */
	public NodeClass<T> pop();
	
	/*
	 * Returns the NodeClass at the top of the stack but does not remove it
	 */
	public NodeClass<T> peek();
	
	/*
	 * returns the number of NodeClass on the stack
	 */
	public int size();
	
	/*
	 * Returns true if the stack is empty
	 */
	public boolean isEmpty();
		
	public String toString();
}