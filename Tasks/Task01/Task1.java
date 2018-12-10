class Task1 {
	public static void main(String[] args) {

		int sum = 15867;

		int fiveThousandBill = sum/5000;
		int remainderOfFive = sum % 5000;

		int twoThousandBill = remainderOfFive/2000;
		int remainderOfTwo = remainderOfFive % 2000;

		int oneThousandBill = remainderOfTwo/1000;
		int remainderOfOne = remainderOfTwo % 1000;

		int fiveHundredBill = remainderOfOne/500;

		System.out.println("5000 - " + fiveThousandBill);
		System.out.println("2000 - " + twoThousandBill);
		System.out.println("1000 - " + oneThousandBill);
		System.out.println("500 - " + fiveHundredBill);
	}
}