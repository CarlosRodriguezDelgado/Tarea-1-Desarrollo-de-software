package solid.interfaceSegregation.fixed;

public class Main {

     public static void main(String[] args) {
        Worker employee = new Worker();
        employee.work();
        employee.eat();
        employee.sleep();

        Robot robot = new Robot();
        robot.work();
        robot.power_on();
        robot.power_off();
        
    }
    
}
