package gopal.gk.projects.me;

public class Main extends Vehicles{

	public Main(String model, int year, String make) {
		super(model, year, make);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c1 = new Car("Mercedze", "Camry", 2023, 4);
     c1.display();
    
     Motorcycle m1  = new Motorcycle("Ninja H2R", 2020, "Logo", 400);
     m1.display();
	}

}
