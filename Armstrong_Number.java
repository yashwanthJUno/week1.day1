package week1.day1;

public class Armstrong_Number {

	

		public static void main(String[] args) {


			// Declare your input

			int originalno = 153;
			int remainder = 0;
            int quotient = 0;
			int new_num=originalno;
            int calculate =0;
	        while (new_num != 0)
	        {
	            remainder = new_num % 10;
	          //  calculate = calculate+(remainder*remainder*remainder);
	            calculate  += Math.pow(remainder, 3);
	            new_num = new_num/10;
	           // System.out.println(remainder+"  "+calculate+"     "+new_num);
	        }

	        if(calculate == originalno)
	            System.out.println("The given Number is Armstrong Number " + originalno);
	        else
	            System.out.println(" it's not an Armstrong Number  "+ originalno);
			//}
			
			}
		


		}


	

	


