package solid.interfaceSegregation.fixed;

public class Robot implements Machine, Work {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void power_on() {
       System.out.println("Robot on");
    }

    @Override
    public void power_off() {
        System.out.println("Robot off");
    }  
}
