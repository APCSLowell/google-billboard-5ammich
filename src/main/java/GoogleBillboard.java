

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
  int two = 2; 
  int twelve = 12;
  int adder = 0;
  while (adder < e.length()-10){
      String calc = e.substring(two,twelve);
      double cNum = Double.parseDouble(calc);
      if (isPrime(cNum) == true){
        System.out.println(cNum);
        break;
      }
      else{
        two++;
        twelve++;
        adder++;
      }
}
	}
	

	//Finish this function
	public static boolean isPrime(double dNum){

  for (int i = 2; i <= Math.sqrt(dNum); i++){
    if (dNum%i == 0)
      return false;
}
  return true;
	}

}

