
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaivor = new Quack();
        flyBehaivor = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a read Mallard duck");
    }
}