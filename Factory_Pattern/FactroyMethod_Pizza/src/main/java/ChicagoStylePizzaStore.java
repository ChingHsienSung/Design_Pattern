public class ChicagoStylePizzaStore extends PizzaStore{
    public ChicagoStylePizzaStore(){}

    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (pizzaType.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        } else if (pizzaType.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        } else if (pizzaType.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }

}
