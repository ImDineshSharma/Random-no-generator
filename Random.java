import java.util.Random;

public class RandNumber{

   Random rand = new Random();
   int number = 0;
   for(int counter = 1; counter<=10; counter++){
     number = 1+rand.nextInt(10); // 1+ = coz i don't want to start from zero
     System.out.println(number);
   }

}
