class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String s){
		System.out.println(s);
	}

	double FtoC(double f){
		return (f - 32) * 5.0/9.0;
    }

	double sphereVolume(double r){
		return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

	double coneVolume(double r1, double h){
		return (1.0/3.0) * Math.PI * Math.pow(r1, 2) * h;
	}

	double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

  	void init(){
		print("Hello");
		print("The temperature is " + FtoC(100) + " degrees Celsius");
		print("The volume of a sphere with radius 5 is " + sphereVolume(5));
		print("The volume of a cone with radius 3 and height 5 is " + coneVolume(3, 5));
		print("The distance between (1,2) and (4,6) is " + distance(1, 2, 4, 6));
    }

}