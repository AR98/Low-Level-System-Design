package ElevatorDesign;

import java.util.Arrays;

public class ElevatorSystem {
    public static void main(String[] args) {
        // creating 2 elevators
        Elevator first = new Elevator(1);
        Elevator second = new Elevator(2);

        ElevatorController controller = new ElevatorController(Arrays.asList(first, second));

        controller.requestSubmit(0, 2);
        System.out.println();
        controller.requestSubmit(3,0);
    }
}
