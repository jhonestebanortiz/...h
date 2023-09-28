package herencia5;

public class publicacion {
	    private String titulo;
	    private float precio;

	    public publicacion(String titulo, float precio) {
	        this.titulo = titulo;
	        this.precio = precio;
	    }

	    public void mostrar() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Precio: " + precio);
	    }
	
	
}
