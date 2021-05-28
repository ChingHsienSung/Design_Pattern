public class Main {
    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza pizza;

        pizza = pizzaStore.orderPizza("cheese");
        System.out.println("======================================");
        pizza = pizzaStore.orderPizza("greek");
    }
}
