package temp;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a Fahrenheit Temperature: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " is equivalent to " + celsius + " in Celsius");
        
       

        System.out.print("Enter a Celcius Temperature: ");
        double Celcius = input.nextDouble();

        double  Fahrenheit =9/5.0 * Celcius + 32 ;
        System.out.println(Celcius + " is equivalent to " + Fahrenheit + " in Fahrenheit");


	}

}
