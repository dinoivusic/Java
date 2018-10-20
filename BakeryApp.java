import java.util.Scanner;
public class BakeryApp{
	public static void main(String[]args){
		//variables
		double loaf, buns, donuts, cash;
		//creating and declaring objects
		Bakery shop;
		Scanner keyboard;

		keyboard = new Scanner(System.in);
		//input
		System.out.println("How many loafs u want?");
		loaf=keyboard.nextDouble();
		System.out.println("How many buns u want?");
		buns=keyboard.nextDouble();
		System.out.println("How many donuts u want?");
		donuts=keyboard.nextDouble();
		System.out.println("Cash paid?");
		cash=keyboard.nextDouble();
		//calling mehods
		shop=new Bakery(loaf, buns, donuts);
		shop.setCash(cash);
		shop.computeChange();
		System.out.println("Your change is " + shop.getChange());

		//output

	}

}