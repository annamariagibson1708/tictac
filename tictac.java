import java.util.Random;


public class tictac {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;


    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }


    static void tossAndAssignSymbols() {
        Random random = new Random();
        // 0 for Human, 1 for Computer
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }


    static void displayTossResult() {
        System.out.println("Toss Result:");
        if (isHumanTurn) {
            System.out.println("Human goes first!");
        } else {
            System.out.println("Computer goes first!");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
