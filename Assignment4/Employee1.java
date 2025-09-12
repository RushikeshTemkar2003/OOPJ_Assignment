public class Employee1{
	public static void main (String args[]){
	int [] id = {1,2,3,4,5};
	int hrs = 0 ;
	int salary = 4000 ;
	try{
		try{
			id [7]= 9;	
			int a = salary % hrs;
	}
	}
	catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Invalid Index");}
		catch(ArithmeticException e){
			System.out.println("Division by Zero");
	}
	}
	}
	}