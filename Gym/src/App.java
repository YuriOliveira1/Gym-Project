import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        menuActivity(scan);
        scan.close();
    }

    public static int menuApp(Scanner scan) {
        // Fazer funções para remover ou editar a dieta, ou os exercicios.
        int option = 1;
        boolean loop = false;

        while (!loop) {
            System.out.println("Welcome to the Lonf Gym Project");
            System.out.println("1 - Add a Food to your Diet");
            System.out.println("2 - Add a Drink to your Diet");
            System.out.println("3 - Add a Workout");
            System.out.println("4 - Exit");

            try {
                option = scan.nextInt();

                if (option >= 1 && option <= 4) {
                    loop = true;
                } else {
                    System.out.println("Input Wrong!!!");
                    System.out.print("Put a correct Option: ");
                    option = scan.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Wrong!!!");
                option = scan.nextInt();
            }
        }
        return option;
    }

    // Corrigir a questão dos tipos 
    public static void menuActivity(Scanner scan) {
        int optionMenu = menuApp(scan);

        switch (optionMenu) {
            case 1:
                System.out.println("You chose to add a Food to your Diet.");
                scan.nextLine();
                System.out.print("Name of Food: ");
                String nameFood = scan.nextLine();
                System.out.print("Kcal of Food: ");
                Float kcal = scan.nextFloat();
                System.out.print("Amount: ");
                int amount = scan.nextInt();
                
                Food food = new Food(nameFood, kcal, amount);
                food.registerFood(nameFood, kcal, amount);
                break;
            case 2:
                System.out.println("You chose to add a Drink to your Diet.");
                scan.nextLine();
                System.out.print("Name of Food: ");
                String nameDrink = scan.nextLine();
                System.out.print("Kcal of Food: ");
                Float mlDrink = scan.nextFloat();
                System.out.print("Amount: ");
                int amountDrink = scan.nextInt();
                
                Drink drink = new Drink(nameDrink, mlDrink, amountDrink);
                drink.registerDrink(nameDrink, mlDrink, amountDrink);
                break;
            case 3:
                System.out.println("You chose to add a Workout.");
                scan.nextLine();
                System.out.print("Type of Exercise: ");
                String typeExercise = scan.nextLine();
                System.out.print("Kcal Lost: ");
                float kcalLost = scan.nextFloat();

                Exercise exercise = new Exercise(typeExercise, kcalLost);
                exercise.registerExerciseC(typeExercise, kcalLost);
                break;
            case 4:
                System.out.println("Exiting...");
                break;
        }
    }
}
