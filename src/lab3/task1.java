package lab3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        int S = 1;
        int i = 0;
        while (S != 5 && i < str.length()){
            switch (S){
                case 1:
                    if (str.charAt(i) == 'A'){
                        S = 2;
                    }
                    else {
                        System.out.println("No");
                        break;
                    }
                    i++;
                    break;
                case 2:
                    if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'D'){
                        S = 3;
                    }
                    else {
                        System.out.println("No");
                        break;
                    }
                    i++;
                    break;
                case 3:
                    if (str.charAt(i) == 'A' || str.charAt(i) == 'C'){
                        S = 4;
                    }
                    else {
                        System.out.println("No");
                        break;
                    }
                    i++;
                    break;
                case 4:
                    if (str.charAt(i) == 'E'){
                        System.out.println("Yes");
                    }
                    else {
                        System.out.println("No");
                    }
                    i++;
                    break;
            }
        }
    }
}
