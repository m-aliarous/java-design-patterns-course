/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class RoomDecorator implements Room{
    private final Room room;
    
    public RoomDecorator(Room room){
        this.room = room;
    }
    @Override
    public void printFurniture(){
        this.room.printFurniture();
    }
}
