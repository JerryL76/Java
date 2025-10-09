
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

double gpa(double gpaValue){
	if (gpaValue > 90){
		return gpaValue * 1.1;
	}
	else{
		return gpaValue;
	}
}	
  
boolean isGraduating (int gradeLevel, double credits){
	if (gradeLevel == 12 && credits >= 44){
		return true;
	}
	else{
		return false;
	}
			
}

String BMI (double weight, double height){
	double bmi = weight / (height * height) * 703;
	if (bmi < 18.5){
		return "Underweight";
	}
	else if (bmi >= 18.5 && bmi <= 24.9){
		return "Normal weight";
	}
	else if (bmi >= 25 && bmi <= 39.9){
		return "Overweight";
	}
	else{
		return "Obesity";
	}
}

double shippingCost(double weightlbs){
	if (weightlbs <= 10){
		return 0;
	}
	else if (weightlbs > 10 && weightlbs <= 15){
		return 5;
	}
	else if (weightlbs > 15 && weightlbs <= 25){
		return 10;
	}
	else{
		return 10 + (weightlbs - 25) * 0.02 ;
	}
}

boolean blueOrViolet(double lightFrequency){
	if ((lightFrequency >= 600 && lightFrequency <= 670) || (lightFrequency <= 700 && lightFrequency >= 750)){
		return true;
	}
	else{
		return false;
	}
}
	void init(){
		System.out.println(gpa(91));
		if (isGraduating(12, 45)){
			System.out.println("You are graduating!");
		}
		else{
			System.out.println("You are not graduating.");
		}
		if (isGraduating(11, 45)){
			System.out.println("You are graduating!");
		}
		else{
			System.out.println("You are not graduating.");
		}
		System.out.println(BMI(150, 68));
		System.out.println(shippingCost(30));
		if (blueOrViolet(650)){
			System.out.println("The light is blue or violet.");
		}
		else{
			System.out.println("The light is not blue or violet.");
		}
		if (blueOrViolet(720)){
			System.out.println("The light is blue or violet.");
		}
		else{
			System.out.println("The light is not blue or violet.");
		}
}