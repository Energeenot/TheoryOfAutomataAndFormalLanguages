package lab2;

import lab1.Automat;
import lab1.State0;
import lab1.State1;
import lab1.StateDecorator;

public class s1 extends StateDecorator{

    public s1(Automat automat){this.automat = automat;}

    @Override
    public void state() {
        String abc = lab2.test.input[lab2.test.n];
        if (lab2.test.n < lab2.test.input.length - 1){
            lab2.test.n++;
        }else{
            System.out.println("Выполнение окончено");
            System.exit(0);
        }

        if (abc.equals("+")){
            lab2.test.JAutomat = new s2(lab2.test.JAutomat);
            if (lab2.test.n == 1){
                System.out.println("Начал движение по состояниям");
            }
            test.print[test.n - 1] = 0;
            System.out.println("Перешёл в 2-е состояние");
            System.out.println("Выходное значение 0");
            lab2.test.JAutomat.state();

        }
        else{
            if (lab2.test.n == 1){
                System.out.println("Начал движение по состояниям");
            }
            test.print[test.n - 1] = 2;
            System.out.println("Переходит в 3-е состояние");
            System.out.println("Выходное значение 2");
            lab2.test.JAutomat = new s3(lab2.test.JAutomat);
            lab2.test.JAutomat.state();
        }
    }
}
