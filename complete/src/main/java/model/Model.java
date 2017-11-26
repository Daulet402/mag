package model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Model {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Rate of mass according to Earth:");
        Double massRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Rate of radius according to Earth:");
        Double radiusRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Falling time on Earth:");
        Double time = Double.parseDouble(scanner.nextLine());

        System.out.println("Falling time on another planet is " + decimalFormat.format(((Math.sqrt(massRate) * time) / radiusRate)));
    }
}