package herencia4;

public class animal {
private String name;

public animal(String name) {
	this.name = name;
	
}

@Override
public String toString() {
	return "animal [name=" + name + "]";
}

}
