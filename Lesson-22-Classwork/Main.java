class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Me, Myself, and I"};
   
    
  }

  

  double celsiusToFarhenheit(double c){
    double[] tempsC = {randInt(0,100)}
    double[] tempsF = new double[tempsC.length];
    for(int i=0;i<tempsC.length;i++){
      tempsF[i] = convert(tempsC[i]);
      printt(tempsC[i]+"C = ");
      print(tempsF[i]+"F");
    }
        return c*9/5+32;
  }
}