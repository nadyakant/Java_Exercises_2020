package MethodsLab;

import java.util.Scanner;

/**
 * Created by USER on 4.2.2021 г..
 */
public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if(type.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b= Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(a,b));
        }
        else  if(type.equals("char")){
            char a = scanner.nextLine().charAt(0);
            char b= scanner.nextLine().charAt(0);
            System.out.println(getMax(a,b));
        }
        else if(type.equals("string")){
            String a = scanner.nextLine();
            String b= scanner.nextLine();
            System.out.println(getMax(a,b));
        }
    }

    public static int getMax(int a,int b){
        if(a>b) return a;
        return b;
    }

    public static char getMax(char a,char b){
        if(a>b) return a;
        return b;
    }

    public static String getMax(String a,String b){
        if(a.compareTo(b)>=0)
            return a;
        return b;
    }
}
