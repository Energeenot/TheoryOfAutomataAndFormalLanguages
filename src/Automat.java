public abstract class Automat {
    String[][] arrayDescription = {{}};
    String description1 = "Unknown Automate";

    public String getDescription1(){return description1;}
//    public void getArrayDescription() {
//        for (int i = 0; i > 4; i++){
//            for (int j = 0; j > 4; j++){
//                System.out.print(arrayDescription[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    public abstract void state();
}
