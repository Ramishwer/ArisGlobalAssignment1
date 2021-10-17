class Question3{
	

	public static boolean checkNumber(int number) {
		boolean flag=false;
		int currentDigit = number % 10;
		number = number/10;

	     
	       while(number>0){
	     
	           if(currentDigit <= number % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = number % 10;
	           number = number/10;
	       }
           if(flag==true){
	           return false;
	       }else{
	    	   return true;
	       }
		
	}
	public static void main(String args[]) {
	
	System.out.println(checkNumber(467));
		
	}
}