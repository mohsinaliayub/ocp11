import java.util.Date;
import java.sql.*;
import ocp11.basics.Animal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));

        Date date = new Date();

        Animal animal = new Animal();
        animal.setName("Fluffy");
        System.out.println(animal.getName());
    }
}