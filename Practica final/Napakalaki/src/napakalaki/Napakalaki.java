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
public class Napakalaki {
    private static final Napakalaki instance=new Napakalaki();
    ArrayList<Player> players=new ArrayList();
    Player currentPlayer;
    Monster currentMonster;
    private Napakalaki()
    {
        
    }
    private void initPlayers(ArrayList<String> names)
    {
    }
    private Player nextPlayer()
    {
        return null;
    }
    private boolean nextTurnAllowed()
    {
        return false;
    }
    private void setEnemies()
    {
               
    }
    public CombatResult developCombat()
    {
        return null;
}
    public void discardVisibleTreasures(ArrayList<Treasure> treasures)
    {
}
    public void discardHiddenTreasures(ArrayList<Treasure> treasures)
    {
}
    public void makeTreasuresVisible(ArrayList<Treasure> treasures)
    {
    }
    public void initGame (ArrayList<String> players)
    {
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }
public boolean nextTurn()
{
    return false;
}
public boolean endOfGame(CombatResult result) 
{
    return false;
}
}
    
