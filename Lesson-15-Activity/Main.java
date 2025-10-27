class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String spaces(int n){
    String result = "";
    for(int i = 0; i < n; i++){
      result += " " + "Done";
    }
    return result;
  }

  String harmonic(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
      sum += 1/i;
    }
    return sum;
  }

  String sine(int n, double angle){
    double sum = 0;
    for(int i = 0; i < n; i++){
      sum += Math.sin(angle) * Math.pow(angle, 2*i + 1) / factorial(2*i + 1);
    }
    return sum;
  }

  String fibonacci(int n){
    for (int i = 0; i < n; i++){
      if(n <= 0) return 0;
      if(n == 1) return 1;
      return fibonacci(n-1) + fibonacci(n-2);
  }

  void init(){

  }

    
  }


  
}