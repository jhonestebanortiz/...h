package invoiceIteam;

public class Main {

	public static void main(String[] args) {
		
		invoice item = new invoice("ptr21","gaseosa",12,2500 );
		System.out.println("descripcion del item");
		System.out.println("Información del item:");
        System.out.println("ID: " + item.getId());
        System.out.println("Descripción: " + item.getDesc());
        System.out.println("Cantidad: " + item.getQty());
        System.out.println("Precio unitario: $" + item.getUnitPrice());
        System.out.println("Total: $" + item.getTotal());
        
        
        
	}

}
