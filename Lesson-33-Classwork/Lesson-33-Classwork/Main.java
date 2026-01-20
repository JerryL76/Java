class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};
    //Create a new student object 
    String[] studentNames = {"Tom","Jerry","Mickey"};
    int[] studentGrades = {9,11,10};
    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student object 
    Student student1 = new Student("Tom",9,g1,courses1);)
    Student student2 = new Student("Jerry",11,g2,courses2);
    Student student3 = new student(studentNames, studentGrades, g1, courses1);
    if(student3 >= student3.calculateAvg()){
      print("Student 3 has a higher average than Student 1");
    } else {
      print("Student 1 has a higher average than Student 3");
    }

   
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}