package lab2.tryToFix;

import java.util.Scanner;

public class test {

    public static String str2 = "";

    public static void main(String[] args) {
        Automate automate = new AutomatForTask();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку состоящую только из +-");
        String str1 = scanner.next();
        automate.setCountElements(str1.length());
        automate.setInput(str1);
//        System.out.println(automate.getCountElements());
        automate = new s1(automate);
        automate.state();
        automate.printArray();
        System.out.println(str2);
    }

    public static void setStr2(String letter){
        str2 += letter;
    }
}
