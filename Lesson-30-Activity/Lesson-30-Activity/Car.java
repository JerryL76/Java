class Car{
    String brand;
    String model;
    String color;
    int year;
    double value;

    Car(String brand, String model, String color, int year, double value){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
    }

    void honk(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Value: $" + value);
        System.out.println("Honk! Honk!");
    }
}