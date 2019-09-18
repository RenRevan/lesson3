package exercise;
import java.util.ArrayList;

public class EX8 {

    //"8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.


        public static void main(String[] args) {
            // write your code here
            int[] ch = {72, 101, 108,108,111,127,119,111,114,108,100};
            ArrayList<Character> chlist = transformIntToChar(ch);
            printList(chlist);
        }

        private static ArrayList<Character> transformIntToChar(int... values) {
            ArrayList<Character> buffer = new ArrayList<>();
            for (int i : values) {
                buffer.add(((char) i));
            }
            return buffer;
        }

        private static void printList(ArrayList<Character> characters) {
            for (char c : characters) {
                System.out.print(c);
            }
        }



}
