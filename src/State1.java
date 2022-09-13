public class State1 extends StateDecorator{

    public State1(Automat automat){this.automat = automat;}
    @Override
    public void state() {
        String abc = test.input[test.n];
        if (test.n < test.input.length - 1){
            test.n++;
        }else{
            System.out.println("Что-то пошло не так");
            System.exit(0);
        }
        if (test.str1.length() == test.n + 1){
            test.DFA = new State0(test.DFA);
            System.out.println("Перешёл в начальное(конечное) состояние");
            System.exit(0);
            test.DFA.state();

        }
        if (abc.equals("1")){
            test.DFA = new State0(test.DFA);
            System.out.println("Перешёл в начальное(конечное) состояние");
            test.DFA.state();
//            System.exit(0);
        }else {
            System.out.println("Перешёл в 2 состояние");
            test.DFA = new State2(test.DFA);
            test.DFA.state();
//            System.exit(0);
        }
    }
}
