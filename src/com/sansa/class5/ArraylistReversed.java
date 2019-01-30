   package com.sansa.class5;
  /*
   * create method that accept arraylist of integers and 
  * return arraylist that reverse the order
  */

    import java.util.ArrayList;

    public class ArraylistReversed {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(20);
		number.add(10);
		number.add(45);
		number.add(32);

		ArraylistReversed ar = new ArraylistReversed();

		ArrayList<Integer> renumber1 = ar.arrayListreversed(number);


	}

	public ArrayList<Integer> arrayListreversed(ArrayList<Integer> number) {

           for (int i = number.size() - 1; i >= 0; i--) {
			System.out.println(number.get(i));

		}
		return number;

	}

}
