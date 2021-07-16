package week1.day1;

public class PrimeNumber {

	 //input 13
	//output 13
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int inPut = 13;
	  boolean to_check = false;
	  int remainder =0;
	  
	  for(int i=2; i<=inPut/2; i++)
	  {
		  remainder = inPut%i;
		  //remainder = 0;
		 //System.out.println(remainder);
		 if(remainder==0)
		 {
			 to_check=true;
		 }
		 else
		 {
			 to_check=false;
			 //System.out.println("inside");
		 }	 
		 break;  
	  }
	  if(to_check==false)
		 {
			 System.out.println(inPut+" is a Prime Number");
		 }
		 else
		 {
			 System.out.println(inPut+" Not a Prime Number");
		 }

	}

}
