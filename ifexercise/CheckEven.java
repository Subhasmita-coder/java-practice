package ifexercise;

import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given Number is Even");
		}else
		{
			System.out.println("Given Number is Odd");
		}

	}

}
