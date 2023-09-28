package herencia4;


public class dog extends mammal {
	
	
		public dog(String name) {
	        super(name);
	    }

	    @Override
	    public String toString() {
	        return "Dog [" + super.toString() + "]";
	    }

}
