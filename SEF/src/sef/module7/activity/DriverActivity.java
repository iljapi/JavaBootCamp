package sef.module7.activity;

public class DriverActivity {
    public static void main(String[] args){
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Driver driver = new Driver( "Ilja");
        driver.setDriversMoving(car);
        driver.driverStartDriving();
        driver.setDriversMoving(motorcycle);
        driver.driverStartDriving();
    }

}
