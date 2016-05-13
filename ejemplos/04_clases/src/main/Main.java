package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {

    public static void main(String[] args) {
        Vector vec = new Vector(3, 2);
        vec.setX(5);
        
        float ret = vec.getX();
        
        System.out.println(ret);
    }

}
