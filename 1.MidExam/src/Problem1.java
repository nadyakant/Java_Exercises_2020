import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        int freePackages = 0;
        for (int i = 1; i <= students; i++){
            if(i % 5 == 0){
                freePackages ++;
            }
        }
        double finalCost = apronPrice*(Math.ceil(students*1.2)) + eggPrice*10*(students) + flourPrice*(students - freePackages);

        if (finalCost <= budget){
            System.out.printf("Items purchased for %.2f$.", finalCost);
        }else {
            double neededMoney = finalCost - budget;
            System.out.printf("%.2f$ more needed.", neededMoney);
        }


    }
}
