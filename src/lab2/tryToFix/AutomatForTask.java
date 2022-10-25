package lab2.tryToFix;

public class AutomatForTask extends Automate{
    private String[] input = {"5< 5", "fff"};
    private int[] print;
    private int n = 0;
    private int countElements;

    public void setPrint(int p, int n) {
        print[n] = p;
    }

    public int[] getPrint() {
        return print;
    }

    @Override
    public void setN(int n) {
        this.n = n;
    }

    @Override
    public int getN() {
        return n;
    }

    @Override
    public void state() {

    }

    public int getCountElements() {
        return countElements;
    }

    @Override
    public void setCountElements(int countElements) {
        this.countElements = countElements;
        print = new int[countElements];
    }

    @Override
    public void printArray() {
        for (int i = 0; i < countElements; i++){
            System.out.print(input[i] + " ");
        }
    }

    @Override
    public String getInput(int n) {
        return input[n];
    }

    @Override
    public void setInput(String str) {
        input = str.split("(?!^)");
    }
}
