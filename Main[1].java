class Vehicle {
    void display() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("Car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("Bike");
    }
}

public class Main {
    public static void main(String[] args) {
    
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        vehicle.display();  
        car.display();      
        bike.display();     

        
        Vehicle parentRef = new Car();
        parentRef.display();
    }
}