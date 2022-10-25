package lab3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        int S = 1;
        int i = 0;
        while (S != 4 && i < str.length()){
            switch (S){
                case 1:
                    if (str.charAt(i) == 'A' || str.charAt(i) == 'C'){
                        S = 2;
                    } else if (str.charAt(i) == 'B') {
                        S = 1;
                } else {
                        System.out.println("No");
                        break;
                    }
                    i++;
                    break;
                case 2:
                    if (str.charAt(i) == 'B'){
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
                        System.out.println("Yes");
                    }
                    else {
                        System.out.println("No");
                        break;
                    }
                    i++;
                    break;
            }
        }
    }
}
