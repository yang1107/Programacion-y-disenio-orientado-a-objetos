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
public class Mood {
    public int getLevel()
    {
      return (int)Math.random()*3-1;
    }
}
