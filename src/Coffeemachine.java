import java.util.Scanner;

public class Coffeemachine {

    private int sugar;
    private int coffee;
    private int milk;
    private int strawberry_syrup;

    private boolean life = true;

    public boolean isLife() {
        return life;
    }

    public Coffeemachine(int sugar, int coffee, int milk, int strawberry_syrup){
        this.sugar = sugar;
        this.coffee = coffee;
        this.milk = milk;
        this.strawberry_syrup = strawberry_syrup;
    }

    public void printIngredients(){
        System.out.println("Сахар: " + sugar);
        System.out.println("кофейные зёрна: " + coffee);
        System.out.println("Молоко: " + milk);
        System.out.println("Клубничный сироп: " + strawberry_syrup);
    }

    public void printMenu(){
        System.out.println("-".repeat(15));
        System.out.println("1: Капучино");
        System.out.println("2: Американо");
        System.out.println("3: Эспрессо");
    }

     public int inputInt(String message, int min, int max) {
        boolean isValidInput;
        int output = 0;
        do {
            try {
                isValidInput = true;
                Scanner console = new Scanner (System.in);

                System.out.print(message);
                output = console.nextInt();

                if (output < min || output > max) {
                    System.out.println("Ошибка ввода. Вы вышли за границы диапазона от " + min + " до " + max);
                    throw new Exception();
                }

            } catch (Exception e) {
                isValidInput = false;
                System.out.println("Ошибка ввода. Пожалуйста повторите ввод");
            }

        } while (isValidInput == false);

        return output;
    }


}
