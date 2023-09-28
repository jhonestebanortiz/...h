package herencia5;

public class libro extends publicacion{
	
	    private int numPaginas;
	    private int anioPublicacion;

	    public libro(String titulo, float precio, int numPaginas, int anioPublicacion) {
	        super(titulo, precio);
	        this.numPaginas = numPaginas;
	        this.anioPublicacion = anioPublicacion;
	    }
       
	    public int getNumPaginas() {
			return numPaginas;
		}

		public void setNumPaginas(int numPaginas) {
			this.numPaginas = numPaginas;
		}

		public int getAnioPublicacion() {
			return anioPublicacion;
		}

		public void setAnioPublicacion(int anioPublicacion) {
			this.anioPublicacion = anioPublicacion;
		}

		@Override
	    public void mostrar() {
	        super.mostrar();
	        System.out.println("Número de páginas: " + numPaginas);
	        System.out.println("Año de publicación: " + anioPublicacion);
	    }
	}


