
public interface Node<T> {

	public T getValue();
	
	public void setValue(T n);
	
	/*
	 * Sets the next node reference
	 */
	public void setNext(NodeClass<T> n);
	
	/*
	 * Sets the previous node reference
	 */
	public void setPrev(NodeClass<T> n);
	
	/*
	 * Returns a reference to the next node
	 */
	public NodeClass<T> getNext();
	
	/*
	 * Returns a reference to the previous node
	 */
	public NodeClass<T> getPrev();
	
	public String toString();

}