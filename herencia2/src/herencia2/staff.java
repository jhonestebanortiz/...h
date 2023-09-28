package herencia2;

public class staff extends person{
	private String school;
	private double pay;
	
	
	public staff(String name, String addres, String school, double pay ) {
		super(name, addres);
		this.school = school;
		this.pay = pay;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}


	@Override
	public String toString() {
		return "staff [person [ name = " + getName() + " addres = " + getAddres() + " school = " + school + ", pay = " + pay + "]";
	}

	
	
}

