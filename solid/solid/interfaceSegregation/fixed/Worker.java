package solid.interfaceSegregation.fixed;

public class Worker implements Human, Work {

     @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is sleeping");
    }
}
