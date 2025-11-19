class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Me, Myself, and I"};
   
    
  }

  

  double[] convert(double[] c){
    int tmp = new int[c.length];
    for(int i=0;i<c.length;i++){
      tmp[i] = CtoF (c[i]);
    }
    return tmp;
  }

  double CtoF(double c){
    return c*9/5+32;
  }
}