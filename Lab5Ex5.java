import java.util.Scanner;
class Lab5Ex5{
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int a = scn.nextInt();
		
		
		int fact=1,i=1;
		
		while(i<=a){
			
			fact=fact*i;
			i++;
	}
		System.out.println("Factorial of "+a+":"+fact);
	}
	
	
}