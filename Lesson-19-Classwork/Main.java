class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String addNums(int a, int b){
    int a = (int)(Math.random() * 56) - 5;
    int b = (int)(Math.random() * 56) - 5;
    int sum = a + b;
    return a + " + " + b + " = " + sum;
  }

  void init(){

  }
  }

  
}