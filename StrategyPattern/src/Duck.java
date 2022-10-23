public abstract class Duck {
    FlyBehaivor flyBehaivor;
    QuackBehaivor quackBehaivor;

    public Duck() {}

    public void performFly() {
        flyBehaivor.fly();
    }

    public void performQuack() {
        quackBehaivor.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaivor(FlyBehaivor fb) {
        flyBehaivor = fb;
    }

    public void setQuackBehaivor(QuackBehaivor qb) {
        quackBehaivor = qb;
    }
}