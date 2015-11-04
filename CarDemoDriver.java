
public class CarDemoDriver {

	public static void main(String[] args) {
		CarDemo car1= new CarDemo();		
		car1.read();
		System.out.print(car1);
		CarDemo car2 =new CarDemo();
		car2.read();
		System.out.print(car2);
		CarDemo car3 =new CarDemo();
		car3.read();
		System.out.print(car3);
		CarDemo car4 =new CarDemo();
		car4.read();
		System.out.print("The number of cars added is "+car4);
		System.out.println("\n"+car1.getCount());
		System.out.println(car1+"\n"+car2+"\n"+car3+"\n"+car4);
		System.out.println("Is car 4 the same as car 3: "+car3.equal(car4));
	}

}
