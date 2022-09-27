package lab2;

import lab1.Automat;
import lab1.StateDecorator;

public class s5 extends StateDecorator{

    public s5(Automat automat){this.automat = automat;}
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
            test.print[test.n - 1] = 0;
            lab2.test.JAutomat = new s6(lab2.test.JAutomat);
            System.out.println("Перешёл в 6-е состояние");
            System.out.println("Выходное значение 0");
            lab2.test.JAutomat.state();

        }
        else{
            test.print[test.n - 1] = 4;
            System.out.println("Переходит в 6-е состояние");
            System.out.println("Выходное значение 4");
            lab2.test.JAutomat = new s6(lab2.test.JAutomat);
            lab2.test.JAutomat.state();
        }
    }
}
