package Interface;

public interface Interfaces {
    
    String hi = "hi";
    void sayingHi();

}

class TestClass implements Interfaces{

    public void sayingHi() {
        final String hi = "hi";
        System.out.println(hi);
    }
}

interface Vehicle {
    void changeGear(int gear);
    void speed(int speed);
}

class Car implements Vehicle {
    //Herança
    private int gear;
    private int speed;

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speed(int speed) {
        this.speed = this.speed + speed;
    }

    @Override
    public String toString() {
        return "Changing gear to " + gear + ". Max speed " + speed;
    }
}

class RunApp {
    public static void main(String[] args) {
        //Interface
        TestClass t = new TestClass();
        t.sayingHi();
        System.out.println(Interfaces.hi);

        Car car = new Car();
        car.changeGear(2);
        car.speed(3);

        System.out.println(car);
    }
}
