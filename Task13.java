public class Task13 {
    public static void main(String[] args) {
        Car[] car = new Car[]{
                new Car("Toyota", "Camry", 2022, 4)
        };
        for(Car c : car){
            System.out.println(c);
        }
    }
}

class Vehicle{
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public String toString(){
        return "Car Details" +
                "\nMake: " + make +
                "\nModel:" + model +
                "\nYear: " + year +
                "\nNumber of Doors: " + numberOfDoors;
    }
}