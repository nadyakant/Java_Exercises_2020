import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вход: за всеки кег: model, radius, height
        //обем = пи * радиус * радиус * височина
        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxKegModel = "";
        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if(volume > maxVolume) {
                maxVolume = volume;
                maxKegModel = model;
            }

        }

        System.out.println(maxKegModel);
    }
}