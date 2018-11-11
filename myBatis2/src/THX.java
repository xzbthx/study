import java.util.Scanner;
public class THX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the side:");
		Scanner input=new Scanner(System.in);
		
		/*double amount =input.nextDouble();
		double sum=0;
		for(int i=1;i<=6;i++)
		{
			sum=(sum+amount)*(1+0.00417);
		}
		System.out.print("After the sixth month,the account value is $"+String.format("%.2f", sum));*/
		/*int number =input.nextInt();
		int sum=0;
		sum+=number/100;
		number%=100;
		sum+=number/10;
		number%=10;
		sum+=number;
		System.out.println("The sum of the digits is "+sum);*/
		
		double side=input.nextDouble();
		double area=3*Math.pow(3, 0.5)/2*side*side;
		System.out.println("The area of the hexagon is "+area);
	}

}
