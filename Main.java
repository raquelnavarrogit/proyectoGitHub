package projectogithub;

public class MainTienda {

	public static void main(String[] args) {

		Tienda mercadona= new Tienda ();
		mercadona.añadirCliente();
		mercadona.añadirProducto();
		

		Tienda teashop = new Tienda ();
		
		teashop.mostrarClientes();
		teashop.mostrarProductos();

		System.out.println("Aquí estamos probando la nueva rama que hemos creado");
		
		
		System.out.println("Esto es una prueba de git");
	

		System.out.println(teashop.toString());

		
		Tienda decathlon = new Tienda ();
		System.out.println(decathlon.toString());

	}

}
