package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range =8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		 //System.out.println(firstNum+",");
		for(int i=1; i<=range; i++) {
			
			System.out.print(firstNum+",");
			
			 //if(i<=1) { System.out.print(firstNum); }
			 	
		sum = firstNum+secNum; 
		firstNum = secNum;  
		secNum = sum;
		// System.out.println(sum +" "+ firstNum+"     "+ secNum);
		
		}
    
	}

}
