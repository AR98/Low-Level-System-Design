package ElevatorDesign;

import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;

    public ElevatorController(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public void requestSubmit(int sourceFloor, int destinationFloor){

        // finding first idle elevator
        for(Elevator elevator : elevators){
            if(elevator.getCurrentFloor() == sourceFloor){
                elevator.addRequest(new Request(sourceFloor,destinationFloor));
                return;
            }
        }

        // default assign first elevator
        elevators.get(0).addRequest(new Request(sourceFloor, destinationFloor));
    }

}
