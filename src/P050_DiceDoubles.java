import java.util.Random;

public class P050_DiceDoubles {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int DiceRoll1 = 1;
        int DiceRoll2 = 2;
        while (DiceRoll1 != DiceRoll2) {
            DiceRoll1 = random.nextInt(6) + 1;
            DiceRoll2 = random.nextInt(6) + 1;
            System.out.println("Roll #1: " + DiceRoll1 + "!");
            System.out.println("Roll #2: " + DiceRoll2 + "!");
            int answer = DiceRoll1 + DiceRoll2;
            System.out.println("The total is: " + answer + "!");
            Thread.sleep(2000);
        }
    }
}









