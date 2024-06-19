import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class registerBase {

    public void registerItemF(String nameFood, float value, int amount) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(arq.DATABASE_FOOD, true))) {
            pw.printf("%s, %.2f kcal, %d", nameFood, value, amount, "\n");
        } catch (IOException e) {
            System.out.println("Error saving to File...");
        }
    }

    public void registerExerciseF(String type, float valueLost){ // Add Time
        try (PrintWriter pw = new PrintWriter(new FileWriter(arq.DATABASE_EXERCISE, true))) {
            pw.printf("%s, %.2f ", type, valueLost, "\n");
        } catch (IOException e) {
            System.out.println("Error saving to File...");
        }
    }

}
