package exercise;

public class Main {

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args){

        /*ex 1
        *1) New string variable should be created.
        *2) Each string should be printed from a new line."
        */
        System.out.println("Ex.1______________________");
        String sometext = "Cats say meow";

        for (int i=1; i<6; i++){
            //System.out.println(sometext);
            System.out.print(sometext+"\n");
        }

        /*ex 2
         *1) All primitives data type should be created and initialized.(8)
         */
        //System.out.println("Ex.2______________________");
        Boolean logical = true;
        Byte bln;
        bln = 13;
        char ch1, ch2;
        ch1 = 64;
        ch2 = '\u0054';
        short sh = 30000;
        int numb = 2000000000;
        long numbL = 9L;
        float f = 1.77f;
        double dbl = 3.14;


        /*ex 3
         *3. Create a program which calculates area of a rectangle.
         */
        int width=5, length=7, area;
        area= width*length;
        System.out.println("Ex.3______________________");
        System.out.println("Rectangle area = "+area);


        /*ex 5
         * Change the operations  to get the result 20:
         * */
        System.out.println("Ex.5______________________");

                //int result = - a * b / c + d;
                int result = - a + b - c + d;
                System.out.println(result);







        //Main m=new Main();
        //m.check();
    }

    public void check(){
        System.out.println("check method");
    }
}


