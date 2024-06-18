public class Drink extends registerBase{
    public String nameDrink;
    public float mlDrink;
    public int amount;

    public Drink(String nameDrink, float mlDrink, int amount) {
        super();
        this.nameDrink = nameDrink;
        this.mlDrink = mlDrink;
        this.amount = 1;
    }

    public void registerDrink(String nameDrink, float mlDrink, int amount){
        registerDrink(nameDrink, mlDrink, amount);
    }
    
    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public float getMlDrink() {
        return mlDrink;
    }

    public void setMlDrink(float mlDrink) {
        this.mlDrink = mlDrink;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
}
