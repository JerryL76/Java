class Dog{
    String name;
    int age;
    String breed;
    Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    void bark(){
        System.out.println("The Dog's Name is " + name + ", it is a " + breed + " and it is " + age + " years old. Woof Woof!");
    }
}