/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author mabad
 */
public class Player {
    String name;
    int level;
    boolean dead=true;
    boolean canISteal=true;
    private Player enemy;
    private ArrayList<Treasure> hiddenTreasures=new ArrayList();
    private ArrayList<Treasure> visibleTreasures=new ArrayList();
    private BadConsequence pendingBadConsequence;
    ArrayList<Monster> friends;
    ArrayList<Mood> moods;
    
 public Player(String name)
 {
     this.name=name;
 }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean canISteal() {
        return canISteal;
    }

    public Player getEnemy() {
        return enemy;
    }

    public ArrayList<Treasure> getHiddenTreasures() {
        return hiddenTreasures;
    }

    public ArrayList<Treasure> getVisibleTreasures() {
        return visibleTreasures;
    }

    public BadConsequence getPendingBadConsequence() {
        return pendingBadConsequence;
    }
private void brintToLife()
{   
    dead=false;
}
private int getCombatLevel()
{
    int result=level;
    for (Treasure t: visibleTreasures)
        result+=t.getBonus();
    //EXAMEN
        for (Monster m: friends)
        result+=m.getCombatLevel();
        // FIN EXAMEN
    return result;
}
private void incrementLevels(int l)
{
    level+=l;
}
private void decrementLevels (int l)
{
    level-=l;
}
private void setPendingBadConsequence(BadConsequence b)
{
    pendingBadConsequence=b;
}
private void applyPrize(Monster m)
{
}
private void applyBadConsequence(Monster m)
{
}
private boolean canMakeTreasureVisible(Treasure t)
{
return false;
}
private int howManyVisibleTreasures(TreasureKind tKind)
{
    int total=0;
    for (Treasure t: visibleTreasures)
        if (t.getType()==tKind) total++;
    return total;
}
private void dieIfNoTreasures()
{
    dead=true;
}
public CombatResult combat (Monster m)
{
    return null;
}
public void makeTreasureVisible(Treasure t)
{
}
public void discardVisibleTreasure(Treasure t)
{
}
public void discardHiddenTreasure (Treasure t)
{
}
public boolean validState()
{
    return pendingBadConsequence.isEmpty() && 
            hiddenTreasures.size()>=4;
}
public void initTreasures()
{
}
public int getLevels()
{
return level;
}
public Treasure stealTreasure()
{
        return null;
}
public void setEnemy (Player enemy)
{
    this.enemy=enemy;
}
private Treasure giveMeATreasure()
{
    return null;
}
private boolean canYouGiveMeATreasure()
{
        return !hiddenTreasures.isEmpty();
}
private void haveStolen()
{
    canISteal=false;
}
public void discardAllTreasures()
{
}

}


