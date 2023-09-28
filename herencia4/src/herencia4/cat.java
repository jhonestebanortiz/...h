package herencia4;

public class cat extends mammal{
  public cat(String name ) {
	  super(name);
	  
  }

@Override
public String toString() {
	
	 return "Cat [" + super.toString() + "]";
}
	
  
}
