package lab2.tryToFix;

public abstract class Automate {

    private String[] input = {""};// string in what I add element of the sc.input string
    private int n;// variable by which I switch between elements in the array
    private int[] print;// array of output values
    private int countElements;

    public  abstract void state();
    public void setCountElements(int countElements){
        this.countElements =countElements;
    }
    public int getCountElements(){
        return countElements;
    }
    public  void printArray(){
        for (int i = 0; i < countElements; i++){
            System.out.print(input[i] + " ");
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int[] getPrint() {
        return print;
    }

    public void setPrint(int p, int n) {
        print[n] = p;
    }

    public String getInput(int n) {
        return input[n];
    }
    public void setInput(String str){
        System.out.println("set input array");
    }
}
