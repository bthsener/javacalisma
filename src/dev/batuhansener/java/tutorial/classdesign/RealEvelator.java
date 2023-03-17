package dev.batuhansener.java.tutorial.classdesign;

public class RealEvelator implements Evelator {

    private boolean doorOpen = false;
    private boolean stopped = true;
    private Floor currentFloor = Floor.ENTRANCE;
    private int weight = 0;

    private final int CAPACITY = 1000;

    @Override
    public void openDoor() {
        if (stopped)
            doorOpen = true;
        System.out.println("Door is open.");
    }

    @Override
    public void go(Floor desiredFloor){
        int compare = currentFloor.compareTo(desiredFloor);

        while (compare!=0){
            if (compare < 0){
                System.out.println("yukari cikiyor... su anki kat "+currentFloor.getIntFloor());
                goUp();
            }else {
                System.out.println("asagi iniyor... su anki kat "+currentFloor.getIntFloor());
                goDown();
            }
            compare = currentFloor.compareTo(desiredFloor);
        }
        System.out.println("su anki kat "+ currentFloor.getIntFloor());
        stopped = true;
        openDoor();
    }

    private void goUp(){
        if (currentFloor.compareTo(Floor.FOUR)<0){
            currentFloor = currentFloor.increase();
        }
    }

    private void goDown(){
        if (currentFloor.compareTo(Floor.ENTRANCE)>0){
            currentFloor = currentFloor.decrease();
        }
    }
}
