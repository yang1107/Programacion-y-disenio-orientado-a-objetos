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
public class Treasure {
 private String name;
 private int bonus;
 private TreasureKind type;

public Treasure(String name, int bonus, TreasureKind type)
{
this.name=name;
this.bonus=bonus;
this.type=type;
}

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public TreasureKind getType() {
        return type;
    }
}