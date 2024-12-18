package mypack;
import pkg3.MyPackage;

public class TestMyPackage {

	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		MyPackage mypack2=new MyPackage();
		MyPackage mypack3=new MyPackage();
		mypack1.display();
		mypack2.display();
		mypack3.display();
	}
}