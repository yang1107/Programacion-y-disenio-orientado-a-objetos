/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author mabad
 */
public class Dice {
    public static final Dice instance=new Dice();
    private Dice()
    {
    }
    public static Dice getInstance()
    {
        return instance;
    }
    public int nextNumber()
    {
        return (int)Math.floor(Math.random()*6)+1;
    }
}


