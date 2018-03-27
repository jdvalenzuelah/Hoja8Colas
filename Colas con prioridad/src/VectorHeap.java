import java.util.Vector;

/**
 * clase VectorHeap
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
	
	protected Vector<E> data; 
	
	/**
	 * Constructor de la clase
	 */
	public VectorHeap()
	{
		data = new Vector<E>();
	}
	
	/* (non-Javadoc)
	 * @see PriorityQueue#getFirst()
	 */
	@Override
	public E getFirst() {
		if(!this.isEmpty()) {
			return data.firstElement();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see PriorityQueue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	/* (non-Javadoc)
	 * @see PriorityQueue#clear()
	 */
	@Override
	public void clear() {
		this.data.removeAllElements();
		
	}

	/* (non-Javadoc)
	 * @see PriorityQueue#add(java.lang.Comparable)
	 */
	@Override
	public void add(E value) {
		if(value != null) {
			data.add(value);
			int indexValue = this.data.size() - 1;
			int padre = this.padre(indexValue);

			while(padre > 0 && value.compareTo(this.data.get(padre)) < 0){
				this.data.set(indexValue, this.data.get(padre));
				this.data.set(padre, value);
				
				indexValue = padre;
				padre = this.padre(indexValue);
			}			
		}
	}

	/* (non-Javadoc)
	 * @see PriorityQueue#remove()
	 */
	@Override
	public E remove() {
		if(!this.isEmpty()) {
			E minVal = getFirst();
			data.set(0,data.get(data.size()-1));
			data.setSize(data.size()-1);
			if (data.size() > 1) pushDownRoot(0);
			return minVal;
		}else {
			return null;
		}
	}

	@Override
	public int size() {
		return this.data.size();
	}
	
	/**
	 * Obtener el nodo padre de un objeto, basados en index desde cero done el indice del padre es (i-1)/2
	 * @param index indice del objeto que se busca el padre
	 * @return indice del padre
	 */
	protected int padre(int index) {
		if(index >= 0 && index < this.size()) {
			return (index -1)/2;
		}else {
			return 0;
		}
	}
	
	/**
	 * Obtener el nodo derecho de un objeto, basados en index desde cero done el indice del padre es (i-1)/2
	 * @param index indice del objeto que se busca el nodo derecho
	 * @return indice del nodo derecho
	 */
	protected int derecha(int index) {
		if(index >= 0 && index < this.size()) {
			return (2 * index + 2);
		}else {
			return 0;
		}
	}
	
	/**
	 * Obtener el nodo izquierdo de un objeto, basados en index desde cero done el indice del padre es (i-1)/2
	 * @param index indice del objeto que se busca el nodo izquierdo
	 * @return indice del nodo izquierdo
	 */
	protected int izquierda(int index) {
		if(index >= 0 && index < this.size()) {
			return (2 * index + 1);
		}else {
			return 0;
		}
	}
	
	/**
	 * Codigo obtenido de ejemplo Canvas, codigo obtenido del libro.
	 * @param root
	 */
	protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = izquierda(root);
			if (childpos < heapSize)
			{
				if ((derecha(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

}
