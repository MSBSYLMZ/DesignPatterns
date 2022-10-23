public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaivor = new FlyNoWay();
        quackBehaivor = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}