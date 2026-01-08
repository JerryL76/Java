class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car("Toyota", "Camry", "Red", 2018, 22000.0);
    Car car2 = new Car("Honda", "Civic", "Blue", 2020, 25000.0);

    car1.honk();
    car2.honk();
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}