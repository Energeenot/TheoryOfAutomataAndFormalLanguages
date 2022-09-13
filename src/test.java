import java.util.Scanner;

public class test {
    public static String[] input = {""};
    public static int n = 0;
    public static Automat DFA = new DeterministicFiniteAutomaton();

    public static String str1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку состоящую только из 1, 0");
        str1 = scanner.nextLine();
        str1 += "1";
        input = str1.split("(?!^)");
        DFA = new State0(DFA);
        DFA.state();
        // 1001, 11
    }
}
