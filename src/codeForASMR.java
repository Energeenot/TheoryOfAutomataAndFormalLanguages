import java.util.Scanner;

public class codeForASMR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        str1 += 'A';
        int x = 0;

        if (str1.length() > 100001){
            System.out.println("No");
            System.exit(0);
        }

        if (Character.isLowerCase(str1.charAt(0))){
            System.out.println("No");
            System.exit(0);
        }

        for (int i = 1; i < str1.length(); i++){
            if (Character.isUpperCase(str1.charAt(i))){
                if ((x < 1) || (x > 3)){
                    System.out.println("No");
                    System.exit(0);
                }
                x = 0;
            }
            else {x++;}
        }
        System.out.println("Yes");
    }
}
