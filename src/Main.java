
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {  //Creating the File object
        InputStream inputStream = new FileInputStream("src/strategy.txt");
        Scanner sc = new Scanner(inputStream);

        int sum = 0;
        while (sc.hasNext()) {
            String eersteCombinatie = sc.nextLine();
            String tweedeCombinatie = null;

            //Day 2 part 2
            switch (eersteCombinatie) {
                case "A X" -> tweedeCombinatie = "A Z";
                case "A Y" -> tweedeCombinatie = "A X";
                case "A Z" -> tweedeCombinatie = "A Y";
                case "B X" -> tweedeCombinatie = "B X";
                case "B Y" -> tweedeCombinatie = "B Y";
                case "B Z" -> tweedeCombinatie = "B Z";
                case "C X" -> tweedeCombinatie = "C Y";
                case "C Y" -> tweedeCombinatie = "C Z";
                case "C Z" -> tweedeCombinatie = "C X";
            }

            //Day 2 part 1
            switch (tweedeCombinatie) {
                case "A X" -> sum += 4;
                case "A Y" -> sum += 8;
                case "A Z" -> sum += 3;
                case "B X" -> sum += 1;
                case "B Y" -> sum += 5;
                case "B Z" -> sum += 9;
                case "C X" -> sum += 7;
                case "C Y" -> sum += 2;
                case "C Z" -> sum += 6;
            }
        }
        System.out.println(sum);
    }
}






