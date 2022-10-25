package lab2.tryToFix;

public class s1 extends StateDecorator{
    public s1(Automate automate){this.automate = automate;}

    @Override
    public void state(){
        int n = getN();
        String abc = getInput(n);
        System.out.println(abc);
//        System.out.println(automate.getCountElements() + " hjk");
        if (n < automate.getCountElements() - 1){
            setN(n+1);
        }else {
            System.out.println("Выполнение окончено");
            System.exit(0);
        }

        if (abc.equals("+")){
            automate = new s2(automate);
            if (n == 1){
                System.out.println("Начал движение по состояниям");
            }
//            automate.geprint[n- 1] = 0;
            automate.setPrint(0, n);
            test.setStr2("0");
            System.out.println("Перешёл в 2-е состояние");
            System.out.println("Выходное значение 0");
            automate.state();

        }
        else{
            if (n == 1){
                System.out.println("Начал движение по состояниям");
            }
//            JustAutomat.print[JustAutomat.n - 1] = 2;
            automate.setPrint(2, n);
            System.out.println("Переходит в 3-е состояние");
            System.out.println("Выходное значение 2");
            automate = new s3(automate);
            automate.state();
        }
    }

}
