package lab2;

import java.util.Scanner;

public class taskm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку состоящую только из +- ");
        String strX = sc.nextLine();
        String strY = "";
        int i = 0;
        int S = 1;
        int count2 = 0;
        boolean[] one = new boolean[7];
        while (S != 7 && i < strX.length()) {
            switch (S) {
                case 1:
                    if (strX.charAt(i) == '+') {
                        S = 2;
                        strY = "0";
                    } else if (strX.charAt(i) == '-') {
                        S = 3;
                        strY = "2";
                        count2++;
                    } else S = 8;
                    one[1] = true;
                    i++;
                    break;
                case 2:
                    if (strX.charAt(i) == '+') {
                        S = 4;
                        strY += "2";
                    } else if (strX.charAt(i) == '-') {
                        S = 1;
                        strY += "1";
                    } else S = 8;
                    one[2] = true;
                    i++;
                    break;
                case 3:
                    if (strX.charAt(i) == '+') {
                        S = 2;
                        strY += "0";
                    } else if (strX.charAt(i) == '-') {
                        S = 4;
                        strY += "4";
                    } else S = 8;
                    one[3] = true;
                    i++;
                    break;
                case 4:
                    if (strX.charAt(i) == '+') {
                        S = 5;
                        strY += "1";
                    } else if (strX.charAt(i) == '-') {
                        S = 4;
                        strY += "1";
                    } else S = 8;
                    one[4] = true;
                    i++;
                    break;
                case 5:
                    if (strX.charAt(i) == '+') {
                        S = 6;
                        strY = "0";
                    } else if (strX.charAt(i) == '-') {
                        S = 6;
                        strY += "4";
                    } else S = 8;
                    one[5] = true;
                    i++;
                    break;
                case 6:
                    if (strX.charAt(i) == '+') {
                        S = 4;
                        strY += "3";
                    } else if (strX.charAt(i) == '-') {
                        S = 6;
                        strY += "2";
                    } else S = 8;
                    one[6] = true;
                    i++;
                    break;
            }
        }
        if (S == 6) {
            System.out.println("Выходное слово: " + strY);
        }

        int count = 0;
        for(char elementY: strY.toCharArray()){
            if(elementY == '0' ) count+=1;
        }
        System.out.println("а) Кол-во символа 0 в выходном слове " + count);
        count =0;

        for(int j = 0; j < strY.length(); j ++ ){
            if( j < strY.length() - 2 && strY.charAt(j) == '0' && strY.charAt(j+1) == '1' && strY.charAt(j+2) == '2' ){
                count +=1;
            }
        }
        System.out.println("б) Кол-во под слов 012 в выходном слове: " + count);
        count = 0;

        System.out.println("в) " + count2);
        count = 0;

        System.out.println("г)") ;
        if (strY.length() >= 10){
            if(strY.charAt(9) == '0'){
                System.out.println("На 10 такте: встретился (" + strY.charAt(9) + ")");
            }else System.out.println("На 10 такте: не встретился (" + strY.charAt(9) + ")");
        } else System.out.println("Тактов меньше 10");
        if (strY.length() >=20){
            if(strY.charAt(19) == '0'){
                System.out.println("На 20 такте: встретился (" + strY.charAt(19) + ")" );
            }else System.out.println("На 20 такте: не встретился (" + strY.charAt(19) + ")");
        }else System.out.println("Тактов меньше 20");
        if (strY.length() >=30){
            if(strY.charAt(29) == '0'){
                System.out.println("На 30 такте: встретился (" + strY.charAt(29) + ")");
            }else System.out.println("На 30 такте: не встретился (" + strY.charAt(29) + ")");
        } else System.out.println("Тактов меньше 30");


        int max=0;
        for(int j = 0; j < strY.length(); j++ ){
            if(j < strY.length() - 1 && strY.charAt(j) == '0' && strY.charAt(j+1) == '0'){
                count+= 2;
                max = count;
            }else count=0;
        }
        System.out.println("д) " + max);
        count = 0;

        for(int j = 0; j < 7; j++) {
            if (one[j]) {
                count += 1;
            }else if (count == 6){ System.out.println("ж) Оказался в каждом состоянии");
            }else if(j == 6)
                System.out.println("ж) Не оказался в каждом состоянии");
        }

        count = 0;
        count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for(int j = 0; j < strY.length(); j++){
            if(strY.charAt(j) == '0') count+=1;
            else if (strY.charAt(j) == '1') count2+= 1;
            else if (strY.charAt(j) == '2') count3 += 1;
            else if (strY.charAt(j) == '3') count4 += 1;
            else if (strY.charAt(j) == '4') count5 += 1;

        }
        System.out.println("з) Символ '0' встретился: " + count + "\n Символ '1' встретился: " + count2 +
                "\n Символ '2'  встретился " + count3 + "\n Символ '3'  встретился " + count4 +
                "\n Символ '4'  встретился " + count5);
    }
}

