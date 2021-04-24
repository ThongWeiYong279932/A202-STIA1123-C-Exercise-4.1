
import java.util.Scanner;

public class HP extends Desktop {			//HP as subclass and Desktop as Parent class
	Scanner scan = new Scanner(System.in);
	
	private String brand, cpu;
	private int ram, no, membership;
	private double price, totalprice, discountprice;
	
	
	HP(){					//Constructor without argument named HP
		super();
		this.brand = "HP";
		System.out.print("Please enter the CPU model(intel i5/ intel i7): ");
		this.cpu = scan.nextLine();
		while (this.cpu.equalsIgnoreCase("intel i5") == false && this.cpu.equalsIgnoreCase("intel i7") == false) {
			System.out.println("Wrong input! Please input intel i5 or intel i7 only!");
			System.out.print("Please enter the CPU model(intel i5/ intel i7): ");
			this.cpu = scan.nextLine();
		}
		System.out.print("Please enter the RAM(8/16): ");
		this.ram = scan.nextInt();
		while (this.ram != 8 && this.ram != 16) {
			System.out.println("Wrong input! Please input 8 or 16 only!");
			System.out.print("Please enter the RAM(8/16): ");
			this.ram = scan.nextInt();
		}
		determinePrice();
		System.out.printf("Price per unit = RM%.2f %n",this.price);
		System.out.print("Please enter the number of units: ");
		this.no = scan.nextInt();
		System.out.println();
	}
	
	double determinePrice() {
		if (cpu.equalsIgnoreCase("intel i5")) {
			if (ram == 8) {
				this.price = 2500;
			}
			else if (ram == 16) {
				this.price = 3000;
			}
		}
		else if (cpu.equalsIgnoreCase("intel i7")) {
			if (ram == 8) {
				this.price = 3000;
			}
			else if (ram == 16) {
				this.price = 3500;
			}
		}
		return this.price;
	}
	
	String getBrand() {
		return this.brand;
	}
	
	String getCPU() {
		return this.cpu;
	}
	
	int getRAM() {
		return this.ram;
	}
	
	double getPrice() {
		return this.price;
	}
	
	int getNo() {
		return this.no;
	}
	
	double getTotalPrice() {
		this.totalprice = this.price * this.no;
		return this.totalprice;
	}
	
	double calculateDiscountedPrice() {
		this.membership = super.membership();
		if (this.membership == 1) {
			System.out.println("You are a member of shop thus having 10% discount!");
			this.discountprice = this.totalprice*((double)9/10);
		}
		else {
			System.out.println("Sorry! You are not a member of shop thus no discount!");
			this.discountprice = this.totalprice;
		}
		return this.discountprice;
	}
}
