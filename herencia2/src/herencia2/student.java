package herencia2;

public class student extends person {
   private String program;
   private int year;
   private  double fee;

   public student(String name, String addres, String program, int year, double fee) {
	   super(name, addres);
	   this.program = program;
	   this.year = year;
	   this.fee= fee;
	   
   }

   public String getProgram() {
	   return program;
   }

   public void setProgram(String program) {
	   this.program = program;
   }

   public int getYear() {
	   return year;
   }

   public void setYear(int year) {
	   this.year = year;
   }

   public double getFee() {
	   return fee;
   }

   public void setFee(double fee) {
	   this.fee = fee;
   }

@Override
public String toString() {
	return "student [person [ name = " + getName() + " addres = " + getAddres() + " program = " + program + ",  year = " + year + ", fee = " + fee + "]";
}
   
   
   
   
   
   
}
