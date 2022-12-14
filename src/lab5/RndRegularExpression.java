package lab5;

import java.io.*;
import java.util.Random;

public class RndRegularExpression {

    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
    String str;
    int strLength;
    Random random = new Random();

    public RndRegularExpression(int strLength) {
        this.strLength = strLength;
    }

    public String generateRegularExpression(){
        StringBuilder regularExpression = new StringBuilder();
        int j = 0;
        int countLetter = 0;
        int countSymbol = 0;
        int countSymbolU = 0;
        int countOpenBracket = 0;
        int countBracket = 0;
        for (int i = 0; i < strLength; i++) {
            j = random.nextInt(0, strLength + 5);

            switch (j){
                case 0:
                    regularExpression.append(alphabet[0]);
                    countLetter +=1;
                    break;
                case 1:
                    regularExpression.append(alphabet[1]);
                    countLetter +=1;
                    break;
                case 2:
                    regularExpression.append(alphabet[2]);
                    countLetter +=1;
                    break;
                case 3:
                    regularExpression.append(alphabet[3]);
                    countLetter +=1;
                    break;
                case 4:
                    regularExpression.append(alphabet[4]);
                    countLetter +=1;
                    break;
                case 5:
                    regularExpression.append(alphabet[5]);
                    countLetter +=1;
                    break;
                case 6:
                    regularExpression.append(alphabet[6]);
                    countLetter +=1;
                    break;
                case 7:
                    if ( i == strLength - 1){
                        regularExpression.append("U");
                        countSymbolU += 1;
                    } else {
                        regularExpression.append("(");
                        countOpenBracket += 1;
                    }
                    break;
                case 8:
                    if (countOpenBracket == countBracket){
                        regularExpression.append("*");
                        countSymbol += 1;
                    } else {
                        regularExpression.append(")");
                        countBracket += 1;
                    }
                    break;
                case 9:
                    regularExpression.append("*");
                    countSymbol += 1;
                    break;
                case 10:
                    regularExpression.append("U");
                    countSymbolU += 1;
                    break;

            }
            if (countOpenBracket > countBracket){
                regularExpression.append(")");
                countBracket += 1;
                i++;
            }
            if (countSymbol == 0){
                regularExpression.append("*");
                countSymbol += 1;
                i++;
            }
            if (countSymbolU == 0){
                regularExpression.append("U");
                countSymbolU += 1;
                i++;
            }
            if (countOpenBracket == 0){
                regularExpression.append("(");
                countOpenBracket += 1;
                i++;
            }
        }
        return regularExpression.toString();
    }

    public void soutInFile(String name, String regularExpression){
            try (FileWriter fileWriter = new FileWriter(name, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
                bufferedWriter.write(regularExpression + "\n");
            } catch (IOException e) {
            }
    }
}
