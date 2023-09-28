package herencia4;

public class mammal extends animal{


public mammal(String name) {
		super(name);
	
}

@Override
public String toString() {
	 return "Mammal [Animal [name=" + super.toString() +"]";
	 
}

   

}
