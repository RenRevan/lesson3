package exercise;

public class EX8 {

    //"8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.
    public class Main {

        public static void main(String[] args) {
            // write your code here
            int[] ch = {72, 2};
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
}
