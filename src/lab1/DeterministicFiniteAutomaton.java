package lab1;


public class DeterministicFiniteAutomaton extends Automat {

    public DeterministicFiniteAutomaton() {
        description1 = """
                Принимает только двоичные числа, делящиеся на три
                _       0   1
                Q0(F)   Q0  Q1
                Q1      Q2  Q0
                Q2      Q1  Q2
                """;
    }

    @Override
    public void state() {
    }
}
