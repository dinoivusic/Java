import java.util.*;
public class Lottery3{

	private final int LOTTERY_NUMS = 6;
	private int[] userNums = new int[LOTTERY_NUMS];
	private int[] lotteryNumbers = new int[LOTTERY_NUMS];
	private int sameNum;

	public Lottery3(){

	}
	public void setUserNums(int[]userNums){
		this.userNums=userNums;
	}

	public int generateNumbers(int[] lotteryNumbers) {

			Random randNum = new Random();

			lotteryNumbers[0] = randNum.nextInt(40);
			lotteryNumbers[1] = randNum.nextInt(40);
			lotteryNumbers[2] = randNum.nextInt(40);
			lotteryNumbers[3] = randNum.nextInt(40);
			lotteryNumbers[4] = randNum.nextInt(40);
			lotteryNumbers[5] = randNum.nextInt(40);

			return lotteryNumbers[5];
	}

	public int getUserData(int[] userNums) {
			Scanner keyboard = new Scanner(System.in);

			System.out.print("Enter digit 1: ");
			userNums[0] = keyboard.nextInt();
			System.out.print("Enter digit 2: ");
			userNums[1] = keyboard.nextInt();
			System.out.print("Enter digit 3: ");
			userNums[2] = keyboard.nextInt();
			System.out.print("Enter digit 4: ");
			userNums[3] = keyboard.nextInt();
			System.out.print("Enter digit 5: ");
			userNums[4] = keyboard.nextInt();
			System.out.print("Enter digit 6: ");
			userNums[5] = keyboard.nextInt();

			keyboard.close();

			return userNums[5];
	}

	public int compareArrays(int[] userNums, int[] lotteryNumbers) {
			int sameNum = 0;

			for (int i = 0; i < 6; i++) {
				for (int x = 0; x < 6; x++) {
					if (lotteryNumbers[i] == userNums[x]) {
						sameNum++;
					}
				}
			}
		return sameNum;
	}

}