/**
 * Interfaz Priority Queue
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
public interface PriorityQueue <E extends Comparable<E>>{
	
	/**
	 * Obtener el primer elemento de la cola, si la cola no esta vacia
	 * @return primer lemento de la cola, o si esta vacia null
	 */
	public E getFirst();
	
	/**
	 * Prueba si la cola tiene elementos
	 * @return true si y solo si la cola tiene elementos, tamaño = 0, de lo contrario false
	 */
	public boolean isEmpty();
	
	/**
	 * Elimina todos los elementos de la cola
	 */
	public void clear();
	
	/**
	 * Agrega un valor nuevo a la cola siguiendo el orden de la implementacion (maxHeaps o minHeaps)
	 * @param value valor a agregar a la cola
	 */
	public void add(E value);
	
	/**
	 * Elimina el valor minimo de la cola
	 * @return retorna el valor eliminado
	 */
	public E remove();
	
	/**
	 * Tamaño de la cola
	 * @return numerp de elentos en la cola
	 */
	public int size();
	
}
