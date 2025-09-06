package ElevatorDesign;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
     private int id;
     private int currentFloor;
     private Status status;
     private Direction direction;
     private Queue<Request> requestQueue;
     public Elevator(int id) {
         this.id = id;
         this.currentFloor = 0;
         this.status = Status.IDLE;
         this.direction = Direction.IDLE;
         this.requestQueue = new LinkedList<Request>();
     }

     public int getId() { return id;}

    public int getCurrentFloor() { return currentFloor;}
    public Status getStatus() { return status;}
    public Direction getDirection() { return direction;}

    public void addRequest(Request request){
        requestQueue.add(request);
        if(status == Status.IDLE){
            processNextRequest();
        }
    }

    private void processNextRequest(){
         if(requestQueue.isEmpty()){
             this.status = Status.IDLE;
             this.direction = Direction.IDLE;
             return;
         }

         Request request = requestQueue.poll();

         // moving  to source
         moveElevator(request.getSourceFloor());
         System.out.println("Elevator reached at floor:" + request.getSourceFloor());
         // moving to destination
         moveElevator(request.getDestinationFloor());
         System.out.println("Elevator reached at floor:" + request.getDestinationFloor());

         processNextRequest();
    }

    private void moveElevator(int destinationFloor){
         status = Status.MOVING;
         if(destinationFloor > currentFloor){
             direction = direction.UP;
         }else if(destinationFloor < currentFloor){
             direction = direction.DOWN;
         }else{
             direction = Direction.IDLE;
         }

         while(currentFloor != destinationFloor){
             if(direction == Direction.UP){
                 currentFloor++;
             }
             else if(direction == Direction.DOWN){
                 currentFloor--;
             }
         }

         status = Status.STOPPED;
         direction = Direction.IDLE;
    }


}
