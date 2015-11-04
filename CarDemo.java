

import javax.swing.JOptionPane;

public class CarDemo {
	private String color;
	private int horsePower;
	private double engineSize;
	private static int count;
	
	public  CarDemo(){
		
		color="blue";
		horsePower=2;
		engineSize=2.5;
		this.count++;
	}
	public void read(){
		color=JOptionPane.showInputDialog(null,"Enter color of the car");
		horsePower = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter horsePower of the car"));
		engineSize=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter engineSize of the car"));
	}
	public CarDemo(String color, int horsePower, double engineSize){
		this.color=color;
		this.horsePower=horsePower;
		this.engineSize=engineSize;
		this.count++;
	}
	public static int getCount(){
		return count;
	}
	public String getColor(){
		String  color =this.color;
		 return color;
	}
	public void setColor(String color){
		this.color =color;
	}
	public int getHorsePower(){
		int horsePower=this.horsePower;
		return horsePower;
	}
	public void setHorsePower(int horsePower){
		this.horsePower=horsePower;
	}
	public double getEngineSize(){
		double engineSize=this.engineSize;
		return engineSize;
	}
	public void setEngineSize(double engineSize){
		this.engineSize=engineSize;
	}
	
	public boolean equal(CarDemo other){
		return this.color.equals(other.color)&&this.horsePower==other.horsePower&&this.engineSize==other.engineSize;
	}
	public String toString(){
		return "\nThe color of this car is "+this.color+"\nThe hosepower is "+this.horsePower+"\nThe enginesize is "+this.engineSize+"\nThe number of cars creates is "+this.count; 
	}
	
}
