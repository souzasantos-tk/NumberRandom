
package numberRandom;

   import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random generate = new Random();

        int i = 0;
        while(i<6) {

            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }
    }
}