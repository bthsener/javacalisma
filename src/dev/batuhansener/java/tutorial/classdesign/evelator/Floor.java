package dev.batuhansener.java.tutorial.classdesign.evelator;

public enum Floor {
    ENTRANCE(0), FISRT(1), SECOND(2), THIRD(3), FOUR(4);

    int intFloor = 0;

    Floor(int intFloor){
        this.intFloor = intFloor;
    }

    int getIntFloor(){
        return intFloor;
    }

    Floor increase(){
        Floor upperFloor = null;
        if (this == ENTRANCE)
            upperFloor = FISRT;
        else if (this == FISRT)
            upperFloor = SECOND;
        else if (this == SECOND)
            upperFloor = THIRD;
        else
            upperFloor = FOUR;

        return upperFloor;
    }

    Floor decrease(){
        Floor lowerFloor = null;
        if (this == FOUR)
            lowerFloor = THIRD;
        else if (this == THIRD)
            lowerFloor = SECOND;
        else if (this == SECOND)
            lowerFloor = FISRT;
        else
            lowerFloor = ENTRANCE;

        return lowerFloor;
    }
}
