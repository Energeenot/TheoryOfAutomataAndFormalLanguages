package lab4;

import java.util.Iterator;
import java.util.LinkedList;

public class task1 {
        String[][] matrix = {{"q1", "q0", "q0"},
                            {"q4", "q2", "q4"},
                            {"q4", "q4", "q0"}, // переделать под нарисованный автомат
                            {"q4", "q4", "q3"},
                            {"q4", "q4", "q4"}};
        LinkedList<String> adjList[];
        boolean[] visited = new boolean[5];


    void DFS(String[][] matrix){
        for(int  i = 0; i < matrix.length; i++){  // если будет передаваться состояние автомата то один фор надо убирать
            for (int j = 0; j < matrix[1].length; j++){ // через оставшийся фор будем проходить по столбцам одного из состояний
                visited[i] = true; //
                Iterator<String> ite = adjList[i].listIterator();
                while (ite.hasNext()){
                    String adj = ite.next();
                    if(!visited[i]){
//                        DFS();
//                        надо сделать так чтобы передавалось состояние автомата
                    }
                }
            }
        }

    }

}
