
import java.util.Scanner;

public class Desktop {						//Parent Class
	Scanner scan = new Scanner(System.in);
	private double length, width, height, weight, volume;
	private int membership;
	
	Desktop(){			//Constructor without argument named Desktop
		System.out.print("Please enter desktop pc length(in cm): ");
		this.length = scan.nextDouble();
		System.out.print("Please enter desktop pc width(in cm): ");
		this.width = scan.nextDouble();
		System.out.print("Please enter desktop pc height(in cm): ");
		this.height = scan.nextDouble();
		System.out.print("Please enter desktop pc weight(in kg): ");
		this.weight = scan.nextDouble();
	}
	
	int membership() {
		System.out.println("Are you a member of shop (0 for no 1 for yes): ");
		this.membership = scan.nextInt();
		while (this.membership != 0 && this.membership != 1){
			System.out.println("Wrong input! Please enter 0 for no and 1 for yes only!");
			System.out.println("Are you a member of shop (0 for no 1 for yes): ");
			this.membership = scan.nextInt();
		}
		return membership;
	}
	
	double getLength() {
		return this.length;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	double getVolume() {
		this.volume = this.length * this.width * this.height;
		return this.volume;
	}
}
