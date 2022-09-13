public class State2 extends StateDecorator{

    public State2(Automat automat){this.automat = automat;}
    @Override
    public void state() {
        String abc = test.input[test.n];
        if (test.n < test.str1.length()){
            test.n++;
        }else {
            System.out.println("Что-то пошло не так");
            System.exit(0);
        }
        if (abc.equals("0")){
            System.out.println("Перешёл в 1 состояние");
            test.DFA = new State1(test.DFA);
            test.DFA.state();

//            System.exit(0);
        }else {
            System.out.println("Остался в 2 состоянии");
            test.DFA = new State2(test.DFA);
            test.DFA.state();
        }
    }
}
