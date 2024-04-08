/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class TableRoom extends RoomDecorator{
    
    public TableRoom(Room room) {
        super(room);
    }
    
    @Override
    public void printFurniture(){
        super.printFurniture();
        System.out.println("Table");
    }
    
}
