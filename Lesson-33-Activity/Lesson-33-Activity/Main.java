class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem item1 = new CartItem("Apple", 1.50, 2, false, 0);
    CartItem item2 = new CartItem("Banana", 0.75, 3, true, 10);
    CartItem item3 = new CartItem("Orange", 2.00, 1, true, 5);
    print(item1.getPrice());
    print(item2.getPrice());
    print(item3.getPrice());
    
    double totalValue = (item1.value + item2.value + item3.value) * 1.08675;
    print("Total value of items in cart: " + totalValue +"with tax.");

  
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}