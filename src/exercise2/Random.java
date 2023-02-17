//Exercise 2 : Pick A Random Number
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a method that returns a random integer between two possible numbers.
 * Date : 09/02/2023
 */

package exercise2;


public class Random{

	public static int random(int a, int b) {
        return new java.util.Random().nextInt(a, b + 1);
    }
	public static void main(String[] args) {
		 System.out.println(Random.random(0, 10));
	}

}
