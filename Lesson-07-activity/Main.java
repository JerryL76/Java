
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    double x;
    System.out.println("Enter a value for x");
    x = Input.readDouble();
    double y = Math.pow(x, 7);
    System.out.println("The value of y is " + y);


/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    double z;
    System.out.println("Enter a value for z");
    z = Input.readDouble();
    double q = Math.pow(z, 3) + 5;
    System.out.println("The value of q is " + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    double t;
    double r;
    System.out.println("Enter a value for t");
    t = Input.readDouble();
    System.out.println("Enter a value for r");
    r = Input.readDouble();
    double s = Math.pow(t, 5) * Math.pow(r + 2, 4); 

 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    double a;
    double b;
    System.out.println("Enter a value for a");
    a = Input.readDouble();
    System.out.println("Enter a value for b");
    b = Input.readDouble();
    double c = Math.sqrt(a + b);
    System.out.println("The value of c is " + c);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    double x1;
    double x2;
    double y1;
    double y2;
    System.out.println("Enter a value for x1");
    x1 = Input.readDouble();
    System.out.println("Enter a value for x2");
    x2 = Input.readDouble();
    System.out.println("Enter a value for y1");
    y1 = Input.readDouble();
    System.out.println("Enter a value for y2");
    y2 = Input.readDouble();
    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println("The value of d is " + d);


/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    double deg;
    System.out.println("Enter a value for deg");
    deg = Input.readDouble();
    double g = Math.sin(deg);
    System.out.println("The value of g is " + g);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
    double m;
    double n;
    System.out.println("Enter a value for m");
    m = Input.readDouble();
    System.out.println("Enter a value for n");
    n = Input.readDouble();
    double k = Math.pow(m, 5) / Math.sqrt(n + 1);
    System.out.println("The value of k is " + k);



/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/
    System.out.println("Enter a value for a");
    double A = Input.readDouble();
    System.out.println("Enter a value for b");
    double B = Input.readDouble();
    System.out.println("Enter a value for c");
    double C = Input.readDouble();
    double x = -B + Math.sqrt(Math.pow(B, 2) - 4 * A * C) / (2 * A);
    double x = -B - Math.sqrt(Math.pow(B, 2) - 4 * A * C) / (2 * A);
    System.out.println("The value of x is " + x);




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}