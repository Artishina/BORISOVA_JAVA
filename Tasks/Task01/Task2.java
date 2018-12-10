class Task2 {
	public static void main(String[] args) {

		int num = 137;

		int bit1 = num % 2;
		int bit1Remainder = num / 2;

		int bit2 = bit1Remainder % 2;
		int bit2Remainder = bit1Remainder / 2;

		int bit3 = bit2Remainder % 2;
		int bit3Remainder = bit2Remainder / 2;

		int bit4 = bit3Remainder % 2;
		int bit4Remainder = bit3Remainder / 2;

		int bit5 = bit4Remainder % 2;
		int bit5Remainder = bit4Remainder / 2;

		int bit6 = bit5Remainder % 2;
		int bit6Remainder = bit5Remainder / 2;

		int bit7 = bit6Remainder % 2;
		int bit7Remainder = bit6Remainder / 2;

		int bit8 = bit7Remainder % 2;
		int bit8Remainder = bit7Remainder / 2;

		System.out.println(bit8 + "" + bit7 + "" + bit6 + "" + bit5 + "" + bit4 + "" + bit3 + "" + bit2 + "" + bit1);
		System.out.println(Integer.toBinaryString(num));
	}
}