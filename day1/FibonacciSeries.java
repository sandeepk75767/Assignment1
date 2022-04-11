/* Sandeep Kaur*/

package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secondNum = 1;
		System.out.println("Fibonacci Series of "+range+"");
		
		for (int i = 1; i <= range; ++i)
		
		{
			System.out.print(firstNum +" ");
			int sumOf = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sumOf;
		}
		
} 
}

