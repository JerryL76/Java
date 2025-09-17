class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){


/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
    int num1 = 7;
    int num2 = 5;
    int sum = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
    int grade1 = 85;
    int grade2 = 90;
    int grade3 = 78;
    int totalGrades = grade1 + grade2 + grade3;
    System.out.println("The total of the three grades is " + totalGrades);


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
    double average = totalGrades / 3.0;
    System.out.println("The average of the three grades is " + average);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
    int a = 10;
    int x = 4;
    int EQ1result = a / (x + 1);
    System.out.println("The result of the equation is " + EQ1result);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
    int EQ2result = 2 * x * (x + 1) * (-x / 2) / a;
    System.out.println("The result of the equation is " + EQ2result);





/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
    int b = 2;
    int h = 4;
    int EQ3result = (b * h) / 2;
    System.out.println("The result of the equation is " + EQ3result);





/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/
    int totalEggs = 100;
    int eggsPerBasket = 12;
    int fullBaskets = totalEggs / eggsPerBasket;
    int leftoverEggs = totalEggs % eggsPerBasket;
    System.out.println("We can fill " + fullBaskets + " full baskets.");
    System.out.println("The number of leftover eggs is " + leftoverEggs);




    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}