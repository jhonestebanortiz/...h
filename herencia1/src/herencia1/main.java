package herencia1;

public class main {
	
    public static void main(String[] args) {
        
    	
    	System.out.println("     circle ");
       
    	Circle circle1 = new Circle();
       
        System.out.println("Circle : " + circle1);
        
        cylinder cylinder1 = new cylinder(4.0);
        
        System.out.println("     cilynder ");
        
        System.out.println("Cylinder : " + cylinder1);
        
        System.out.println("     volume");
       
        System.out.println("Volume of Cylinder : " + cylinder1.getVolume());
       
    }
}
