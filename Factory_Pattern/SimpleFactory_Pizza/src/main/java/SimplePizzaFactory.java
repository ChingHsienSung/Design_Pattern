public class SimplePizzaFactory {
    public SimplePizzaFactory(){}

    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        } else if (pizzaType.equals("greek")){
            pizza = new GreekPizza();
        } else if (pizzaType.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
