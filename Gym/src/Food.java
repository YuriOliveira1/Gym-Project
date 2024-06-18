public class Food extends registerBase {
    public String nameFood;
    public float kcalFood;
    public int amount;

    public Food(String nameFood, float kcalFood, int amount) {
        super();
        this.nameFood = nameFood;
        this.kcalFood = kcalFood;
        this.amount = 1;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void registerFood(String nameFood, float kcalFood, int amount) {
        if (amount > 1) {
            kcalFood *= amount;
        }
        registerItemF(nameFood, kcalFood, amount);
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public float getKcalFood() {
        return kcalFood;
    }

    public void setKcalFood(float kcalFood) {
        this.kcalFood = kcalFood;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
