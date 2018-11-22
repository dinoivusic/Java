public class Lottery3App{
	public static void main(String[] args) {

        int LOTTERY_NUMS = 6;

        int[] userNums = new int[LOTTERY_NUMS];
        int[] lotteryNumbers = new int[LOTTERY_NUMS];
        int sameNum;
		Lottery3 lottery=new Lottery3();


        lottery.generateNumbers(lotteryNumbers);
        lottery.getUserData(userNums);
        sameNum = lottery.compareArrays(lotteryNumbers, userNums);

        System.out.println("Lottery numbers: " + lotteryNumbers[0] + " "
                + lotteryNumbers[1] + " " + lotteryNumbers[2] + " "
                + lotteryNumbers[3] + " " + lotteryNumbers[4] + " "+ lotteryNumbers[5] + " ");

        System.out.println("Player numbers:  " + userNums[0] + " "
                + userNums[1] + " " + userNums[2] + " " + userNums[3]
                + " " + userNums[4] + " "+ userNums[5]+ " ");
        System.out.println("Number of matching digits: " + sameNum);

        if (sameNum == 6) {
		    System.out.println("GRAND PRIZE WINNER - $5 MILLION!!");
        }
        if (sameNum == 5) {
            System.out.println("GREAT PRIZE WINNER - $1 MILLION!!");
        }

        if (sameNum == 4) {
            System.out.println("SUPER PRIZE WINNER - $500,000!!");
        }

        if (sameNum == 3) {
            System.out.println("GOOD PRIZE WINNER - $5,000!!");
        }

        if (sameNum == 2) {
            System.out.println("NICE PRIZE WINNER - $500!!");
        }

        if (sameNum == 1) {
            System.out.println("WINNER - $5!!");
        }
        if (sameNum == 0) {
            System.out.println("No matching numbers - better luck next time");
        }

    }
}