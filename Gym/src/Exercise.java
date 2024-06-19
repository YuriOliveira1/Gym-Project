public class Exercise extends registerBase{
    public String typeExercise;
    public float kcalLost;

    
    public Exercise(String typeExercise, float kcalLost) {
        super();
        this.typeExercise = typeExercise;
        this.kcalLost = kcalLost;
    }

    public void registerExerciseC(String typeExercise, float kcalLost){
        registerExerciseF(typeExercise, kcalLost);
    }

    public String getTypeExercise() {
        return typeExercise;
    }
    public void setTypeExercise(String typeExercise) {
        this.typeExercise = typeExercise;
    }
    public float getKcalLost() {
        return kcalLost;
    }
    public void setKcalLost(float kcalLost) {
        this.kcalLost = kcalLost;
    }
}
