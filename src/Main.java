import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Вы запустили кофейный аппарат.");
        Coffeemachine coffeemachine = new Coffeemachine(100,100,100,100);

        while (coffeemachine.isLife()){

            coffeemachine.printIngredients();
            coffeemachine.printMenu();

            int firstAction = coffeemachine.inputInt("Выберите напиток: " , 0,3);

            switch (firstAction){

                case 1: {
                    System.out.println("Хороший выбор.");

                }
            }

        }
    }
}