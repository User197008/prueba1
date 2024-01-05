class Main{
  public static int BracketCombinations(int n) {
    
    return (int)(factorial(n * 2) / (factorial(n + 1) * factorial(n)));
}

    public static double factorial(int n) {
		double fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}  
    
    public static void main (String[] args) {  
    
    int num = 3;
    
    System.out.println(BracketCombinations(num));
  }    
  
}
