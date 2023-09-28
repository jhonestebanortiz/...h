package herencia4;

public class Main {
	
	public static void main(String[]args) {
		animal animal = new animal("perro");
		animal animal2 = new animal("gato");
        mammal mammal = new mammal("gato");
        cat cat = new cat("Meow");
        dog dog = new dog("Woof");
        
        
        System.out.println(animal);
        System.out.println(animal2);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog);
	}
}

