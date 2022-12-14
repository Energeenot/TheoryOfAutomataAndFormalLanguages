package lab5;


public class test {
    public static void main(String[] args) {
        RndRegularExpression rndRegularExpression = new RndRegularExpression(7);
        String rng = rndRegularExpression.generateRegularExpression();
        rndRegularExpression.soutInFile("regu", rng);
        rndRegularExpression.soutInFile("regul", rndRegularExpression.generateRegularExpression());
    }
}