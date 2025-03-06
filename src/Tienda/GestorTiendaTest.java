package Tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	

	@Test
	void testCalcularDescuento() {
		GestorTienda gestortienda = new GestorTienda();
		assertEquals(0, gestortienda.calcularDescuento(6, 3));  
        assertEquals(2.5, gestortienda.calcularDescuento(50, 5));  
        assertEquals(10, gestortienda.calcularDescuento(100, 10)); 
	}

	@Test
	void testCategorizarProducto() {
		GestorTienda gestortienda = new GestorTienda();
		 assertEquals("Económico", gestortienda.categorizarProducto(4));
	     assertEquals("Estándar", gestortienda.categorizarProducto(27));
	     assertEquals("Premium", gestortienda.categorizarProducto(96));
	}

	@Test
	void testBuscarProducto() {
		GestorTienda gestortienda = new GestorTienda();
		String[] inventario = {"Galletas","Huevos"};
		 assertEquals("Galletas", gestortienda.buscarProducto(inventario, "Galletas"));
	     assertNull(gestortienda.buscarProducto(inventario, "Leche")); 
	}

}
