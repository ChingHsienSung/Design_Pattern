public class NYStylePizzaStore extends PizzaStore {
    public NYStylePizzaStore(){}

    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if (pizzaType.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        } else if (pizzaType.equals("clam")){
            pizza = new NYStyleClamPizza();
        } else if (pizzaType.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
