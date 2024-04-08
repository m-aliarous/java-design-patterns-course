/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mstf
 */
public class FlowerFactory {
    private static Map<String,Flower> createdFlowers = new HashMap<>();
    
    public static Flower createFlower(String name){
    return createdFlowers.computeIfAbsent(name, Flower::new);
    }
    
}
