/**
 * Interfaz Priority Queue
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
public interface PriorityQueue <E extends Comparable<E>>{
	
	public E getFirst();
	
	public boolean isEmpty();
	
	public void clear();
	
	public void add(E value);
	
	public E remove();
	
	public int size();
	
}
