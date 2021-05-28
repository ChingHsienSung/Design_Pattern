public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType){
        Pizza pizza;

        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 工廠方法必須宣告為抽象方法
    abstract Pizza createPizza(String pizzaType);
}
