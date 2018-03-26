import java.util.Vector;

/**
 * clase VectorHeap
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
	
	protected Vector<E> data; 
	
	public VectorHeap()
	{
		data = new Vector<E>();
	}
	
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E value) {
		data.add(value);
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
