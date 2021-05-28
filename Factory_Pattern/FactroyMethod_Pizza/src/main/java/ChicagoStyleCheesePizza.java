public class ChicagoStyleCheesePizza extends  Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Sauce and Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
    
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
