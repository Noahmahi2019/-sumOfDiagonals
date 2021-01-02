import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> line1 = new ArrayList<>();
        line1.add(1);
        line1.add(2);
        line1.add(3);
        List<Integer> line2 = new ArrayList<>();
        line2.add(4);
        line2.add(5);
        line2.add(6);
        List<Integer> line3 = new ArrayList<>();
        line3.add(7);
        line3.add(8);
        line3.add(9);

        List<List<Integer>> squareMatrix = new ArrayList<>();
        squareMatrix.add(line1);
        squareMatrix.add(line2);
        squareMatrix.add(line3);
        diagonalDifference(squareMatrix);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int diagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonal += arr.get(i).get(i);
            diagonal -= arr.get(i).get(arr.size() - (i + 1));
        }
        System.out.println(arr.get(0).get(0));
        System.out.println(arr.get(1).get(1));
        System.out.println(arr.get(2).get(2));
        
        return Math.abs(diagonal);
    }

}