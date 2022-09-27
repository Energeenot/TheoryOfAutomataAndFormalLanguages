package lab1;

public class State0 extends StateDecorator {
    public State0(Automat automat){this.automat = automat;}
    @Override
    public void state() {
        String abc = test.input[test.n];
        if (test.n < test.input.length - 1){
            test.n++;
        }else{
            System.out.println("Что-то пошло не так");
            System.exit(0);
        }

        if (abc.equals("1")){
            test.DFA = new State1(test.DFA);
            System.out.println("Начал движение по состояниям");
            System.out.println("Перешёл в 1 состояние");
            test.DFA.state();

        }
        else System.out.println("Остался в начальном состоянии");
        test.DFA = new State0(test.DFA);
        test.DFA.state();
    }

//    @Override
//    public String getDescription() {
//        return automat.getDescription();
//    }
}
