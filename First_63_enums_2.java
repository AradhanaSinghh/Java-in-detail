package com.company;
/*
values():
We can obtain an array of all the possible values of a
Java enum type by calling its static method values().
*/
enum Direction{
    EAST,WEST,NORTH,SOUTH;
}

public class First_63_enums_2 {
    public static void main(String[] args) {
        Direction d=Direction.EAST;
        switch (d){
            case EAST :
                System.out.println("East stands for light!");
                break;
            case WEST:
                System.out.println("West stands for strength!");
                break;
            case NORTH:
                System.out.println("North stands for silence!");
                break;
            case SOUTH:
                System.out.println("South stands for love!");
                break;
            default:
                System.out.println("Unknown direction. This case will never occur when we use enums.");
        }
        for(Direction dir: Direction.values()){
            System.out.println(dir);
        }
    }
}
