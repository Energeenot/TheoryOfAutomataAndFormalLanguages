package lab2;

import lab1.Automat;
import lab1.StateDecorator;

public class s2 extends StateDecorator{

    public s2(Automat automat){this.automat =automat;}

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
            test.print[test.n - 1] = 2;
            lab2.test.JAutomat = new s4(lab2.test.JAutomat);
            System.out.println("Перешёл в 4-е состояние");
            System.out.println("Выходное значение 2");
            lab2.test.JAutomat.state();

        }
        else{
            test.print[test.n - 1] = 1;
            System.out.println("Переходит в 1-е состояние");
            System.out.println("Выходное значение 1");
            lab2.test.JAutomat = new s1(lab2.test.JAutomat);
            lab2.test.JAutomat.state();
        }
    }
}
