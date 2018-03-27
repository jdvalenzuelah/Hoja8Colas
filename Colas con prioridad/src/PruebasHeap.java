import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


 	

/**
 * clase PruebasHeap
 * @author Raul Monzon, 15014
 * @author David Valenzuela, 171001
 * @fecha 03/25/2018
 */
class PruebasHeap {

	/**
	 * Prueba que se agreguen los valores al heao y esten en el orden correcto.
	 */
	@Test
	void pruebaInsertar() {
		VectorHeap<Integer> heap = new VectorHeap<Integer>(); //Nuevo heap
		// Agregamos valores al heao
		heap.add(5);
		heap.add(9);
		heap.add(8);
		heap.add(1);
		
		assertEquals(heap.getFirst(), Integer.valueOf(1));
		
	}

	/**
	 * Prueba que se elimine el ultimo valor, y los restantes sean ordenados
	 */
	@Test
	void pruebaEliminar() {
		VectorHeap<Integer> heap = new VectorHeap<Integer>(); //Nuevo heap
		// Agregamos valores al heao
		heap.add(5);
		heap.add(9);
		heap.add(8);
		heap.add(1);
		
		assertEquals(heap.remove(), Integer.valueOf(1));
		assertEquals(heap.getFirst(), Integer.valueOf(5));
		
	}
}
