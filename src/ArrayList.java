public interface ArrayList<T> {
	/**
	 * Adds a node to the end of this array list.
	 * @param n
	 */
	public void addNode(NodeClass<T> n);

	/*
	 * Removes a given node from the array list
	 */
	public void removeNode(NodeClass<T> n);
	
	/*
	 * Removes the ith node from the array list
	 */
	public NodeClass<T> removeNode(int i);
	
	public NodeClass<T> getFirstNode();
	
	public NodeClass<T> getLastNode();
	
	public int size();
	
	/*
	 * Returns a String representation of this array list, each node is separated by a space
	 */
	public String toString();
	
	/*
	 * Insert a Node n at the ith position of this list
	 */
	public void insertNode(NodeClass<T> n, int i);

	/*
	 * Returns the ith node from the array list
	 */
	public NodeClass<T> getNode(int i);
}