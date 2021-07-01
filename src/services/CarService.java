package services;

import models.Car;

import java.io.*;

public class CarService {
    public static void serialize(Car car) {
        try {
            FileOutputStream fileOut = new FileOutputStream("src" + File.separator + "files" + File.separator + "cars.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(car);
            out.close();
            fileOut.close();
            System.out.println("Data has been serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car deserialize() {
        Car car = null;
        try {
            FileInputStream fileIn = new FileInputStream("cars.txt");
            ObjectInputStream in = null;
            in = new ObjectInputStream(fileIn);
            car = (Car) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Car class not found.");
            e.printStackTrace();
        }
        return car;
    }
}
