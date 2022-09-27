package lab2;

import lab1.Automat;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static String[] input = {""};
    public static int[] print;
    public static int n = 0;
    public static String str1;
    public static Automat JAutomat = new JustAutomat();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку состоящую только из -+");
        str1 = scanner.nextLine();
        str1 += "1";
        print = new int[str1.length()];
        input = str1.split("(?!^)");
        Automat jautomat = new JustAutomat();
        jautomat = new s1(jautomat);
        jautomat.state();
        System.out.println(Arrays.toString(print));
//        for (int i = 0; i < str1.length(); i++){
//            System.out.print(print[i]);
//            System.out.print(" ");
//        }
//        System.out.println(print[0]);
//        printArray(print);

    }

//    public static void printArray(int[] array){
//        for (int i = 0; i < str1.length(); i++){
//            System.out.print(print[i]);
//            System.out.print(" ");
//        }
//    }
}
