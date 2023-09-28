package herencia5;

public class disco extends publicacion {
	  float duracionMinutos;
	  public disco(String titulo, float precio, float duracionMinutos) {
	     super(titulo, precio);
	     this.duracionMinutos = duracionMinutos;
	    }

	    @Override
	    public void mostrar() {
	        super.mostrar();
	        System.out.println("Duración en minutos: " + duracionMinutos);
	    }

		public float getDuracionMinutos() {
			return duracionMinutos;
		}

		public void setDuracionMinutos(float duracionMinutos) {
			this.duracionMinutos = duracionMinutos;
		}
	}