import models.Measurement;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in meters:");
        int distance = scanner.nextInt();

        Measurement measure = new Measurement(distance);

        System.out.println(measure.getCm());

        System.out.println(measure.getKm());

        System.out.println(measure.getMm());

        System.out.println(measure.getDm());
        }
    }