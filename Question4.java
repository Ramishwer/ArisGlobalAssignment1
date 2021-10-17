
 
public class Question4 {
 
 
 public static boolean checkNumber (int n)
 {
  while(n%2==0)
  {
   n=n/2;
  }
  if(n==1)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
 
 public static void main(String[] args) {
	  System.out.println("8 is power of 2 : "+checkNumber(8));
	  System.out.println("28 is power of 2 : "+checkNumber(28));
	 }
 
}
 