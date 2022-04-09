/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author mabad
 */
public class CardDealer {
    private static final CardDealer instance=new CardDealer();
    private ArrayList<Monster> unusedMonsters=new ArrayList();
    private ArrayList<Monster> usedMonsters=new ArrayList();
    private ArrayList<Treasure> unusedTreasures=new ArrayList();
    private ArrayList<Treasure> usedTreasures=new ArrayList();
    private CardDealer()
    {
        
    }
    private void initTreasureCardDeck()
    {
  unusedTreasures.add(new Treasure("Sí mi amo", 4, TreasureKind.HELMET));
  unusedTreasures.add(new Treasure("Botas del investigación", 3, TreasureKind.SHOES));
  unusedTreasures.add(new Treasure("Capucha de Cthulhu", 3, TreasureKind.HELMET));
  unusedTreasures.add(new Treasure("A prueba de babas", 2, TreasureKind.ARMOR));
  unusedTreasures.add(new Treasure("Botas de la lluvia ácida", 1, TreasureKind.BOTHHANDS));
  unusedTreasures.add(new Treasure("Casco minero", 2, TreasureKind.HELMET));  
  unusedTreasures.add(new Treasure("Ametralladora Thomson", 4, TreasureKind.BOTHHANDS));                 
  unusedTreasures.add(new Treasure("Camiseta de la UGR", 1, TreasureKind.ARMOR));  
  unusedTreasures.add(new Treasure("Clavo de rail ferroviario", 3, TreasureKind.ONEHAND));  
  unusedTreasures.add(new Treasure("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND));  
    }
    private void initMonsterCardDeck()
    {
     BadConsequence bc;
     Prize pr;
     bc = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        pr = new Prize(4,2);
        unusedMonsters.add(new Monster("El rey de rosa", 13, bc, pr)); 
        
        bc = new BadConsequence("Te atrapan para "
                + "llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1"
                + " mano visible y 1 mano oculta",0,
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        pr = new Prize(4,1);
        unusedMonsters.add(new Monster("Ángeles de la noche ibicenca", 14, bc, pr));
  
        
    }
    private void shuffleTreasures()
    {
        Collections.shuffle(unusedTreasures);
    }
    private void shuffleMonsters()
    {
        Collections.shuffle(unusedMonsters);
    }
    
    
    
    public static CardDealer getInstance()
    {
        return instance;
    }
    public Monster nextMonster()
    {
        return null;
    }
    public Treasure nextTreasure()
    {
        return null;
    }
    public void giveTreasureBack(Treasure t)
    {
        usedTreasures.add(t);
    }
    public void giveMonsterBack(Monster m)
    {
        usedMonsters.add(m);
    }
    public void initCards()
    {
        
    }
}
