public class Exercise {
    public String typeExercise;
    public String kcalLost;

    
    public Exercise(String typeExercise, String kcalLost) {
        this.typeExercise = typeExercise;
        this.kcalLost = kcalLost;
    }

    public String getTypeExercise() {
        return typeExercise;
    }
    public void setTypeExercise(String typeExercise) {
        this.typeExercise = typeExercise;
    }
    public String getKcalLost() {
        return kcalLost;
    }
    public void setKcalLost(String kcalLost) {
        this.kcalLost = kcalLost;
    }
}
