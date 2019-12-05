public interface LinkedList<T> {
	/**
	 * Adds a NodeClass to the end of this linked list.
	 * @param n
	 */
	public void addNodeClass(NodeClass<T> n);
	
	/*
	 * Insert a NodeClass n at the ith position of this list
	 */
	public void insertNodeClass(NodeClass<T> n, int i);

	/*
	 * Removes a given NodeClass from the linked list
	 */
	public void removeNodeClass(NodeClass<T> n);
	
	/*
	 * Removes the ith NodeClass from the linked list and return it
	 */
	public NodeClass<T> removeNodeClass(int i);
	
	/*
	 * Returns the ith NodeClass from the linked list
	 */
	public NodeClass<T> getNodeClass(int i);

	public NodeClass<T> getFirstNodeClass();
	
	public NodeClass<T> getLastNodeClass();
	
	public int size();
	
	/*
	 * Returns a String representation of this linked list, each NodeClass is separated by a space
	 */
	public String toString();

}