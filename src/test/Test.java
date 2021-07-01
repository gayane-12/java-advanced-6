package test;

import models.Car;
import services.CarService;

public class Test {
    public static void carSerializableSingletonTest(){
        Car carToBeSerialized = Car.getInstance();
        carToBeSerialized.setModel("BMW");
        carToBeSerialized.setColor("blue");
        carToBeSerialized.setYear(2018);
        CarService.serialize(carToBeSerialized);

        Car deserializedCar = CarService.deserialize();

        System.out.println(carToBeSerialized.hashCode());
        System.out.println(deserializedCar.hashCode());
    }
}
