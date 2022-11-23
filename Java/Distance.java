import java.util.*;
class Conv{
	Scanner sc = new Scanner(System.in);
	void mm_cm(){
		System.out.print("Enter Millimeter: ");
		double mm = sc.nextDouble();
		double cm = mm*0.1;
		System.out.print(mm+" Millimeter = "+cm+" Centimeter");
	}
	void cm_m(){
		System.out.print("Enter Centimeter: ");
		double cm = sc.nextDouble();
		double m = cm*0.01;
		System.out.print(cm+" Centimeter = "+m+" Meter");
	}
	void m_km(){
		System.out.print("Enter Meter: ");
		double m = sc.nextDouble();
		double km = m*0.001;
		System.out.print(m+" Meter = "+km+" Kilometer");
	}
	void f_i(){
		System.out.print("Enter Foot: ");
		double f = sc.nextDouble();
		double inch = f*12;
		System.out.print(f+" Foot = "+inch+" Inches");
	}
}
class Distance{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\n1.mm to cm\n2.cm to m\n3.m to km\n4.feet to inch\n");
		int n = s.nextInt();
		Conv obj = new Conv();
		if(n==1){
			obj.mm_cm();
		}
		else if(n==2){
			obj.cm_m();
		}
		else if(n==3){
			obj.m_km();
		}
		else if(n==4){
			obj.f_i();
		}
		else{
			System.out.println("!! Error !!");
		}
	}
}