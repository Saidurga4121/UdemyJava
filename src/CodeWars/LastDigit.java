package CodeWars;

import java.math.BigInteger;

public class LastDigit {

	public static void main(String[] args)
	{
		int n1=10;
		int n2=97;
		System.out.println(lastDigit(n1, n2));
	}
	public static int lastDigit(int n1, int n2)
	{
		char ch=String.valueOf(n1).charAt(0);
		int unitDigit=Integer.parseInt(ch+"");
		int pow=0;
		if(n2%4==0)
		{
			if(unitDigit==2 || unitDigit==4 || unitDigit==6|| unitDigit== 8)
			{
				pow=6;
			}
			else if(unitDigit==3 || unitDigit==7 || unitDigit==9)
			{
				pow=0;
			}
			else if(unitDigit==5)
			{
				pow=5;
			}
		}
		else
		{
			int rem=n2%4;
			double value=Math.pow(unitDigit, rem);
			pow=(int)value;
		}
		System.out.println(pow);
		return 1;
	}
}
//	public static int lastDigit(BigInteger n1, BigInteger n2) 
//	{     
//        int remainder = n2.remainder(new BigInteger("4")).intValue();
//        int last_digit_a = n1.remainder(new BigInteger("10")).intValue();
//
//        switch (remainder) {
//            case 0 :
//                if (n2.toString().equals("0")) {
//                    return 1;
//                } else if (last_digit_a % 2 == 0 && last_digit_a != 0){
//                    return 6;
//                } else if (last_digit_a == 0) {
//                    return 0;
//                } else if (last_digit_a == 5) {
//                    return 5;
//                }
//                return 1;
//            case 1 :
//                return last_digit_a;
//            default:
//                return (int) pow(last_digit_a, remainder) % 10;
//        }
//   }
	
