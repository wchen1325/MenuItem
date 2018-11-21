public class Trio implements MenuItem{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio (Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice(){
        double sandwichP = sandwich.getPrice();
        double saladP = salad.getPrice();
        double drinkP= drink.getPrice();

        if (sandwichP + saladP > saladP + drinkP){
            if (sandwichP + saladP > sandwichP + drinkP){
                return sandwichP + saladP;
            }
            else{
                return sandwichP + drinkP;
            }
        }
        else{
            if(saladP + drinkP > sandwichP + drinkP){
                return saladP + drinkP;
            }
            else{
                return sandwichP + drinkP;
            }
        }
    }
}
