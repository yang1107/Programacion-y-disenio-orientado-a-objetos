package napakalaki;

import java.util.ArrayList;

public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
            
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
    }
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
    }

    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
        this.text = text;
        this.levels = levels;
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
    }
    
    public ArrayList<TreasureKind> getSHiddenTreasures(){
        return specificHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSVisibleTreasures(){
        return specificVisibleTreasures;
    }
    
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getnHiddenTreasures(){
        return nHiddenTreasures;
    }
    public boolean getDeath(){
        return death;
    }
    
    public String toString(){
        return "Text = " + text +
               " Levels = " + Integer.toString(levels) +
               " vTreasures = " + Integer.toString(nVisibleTreasures) +
               " hTreasures = " + Integer.toString(nHiddenTreasures) +
               " Death = " + Boolean.toString(death);
    }
    public boolean isEmpty()
    {
    return 
            levels==0 && 
            nVisibleTreasures==0 && 
            nHiddenTreasures==0 && 
            specificVisibleTreasures.isEmpty() && 
            specificHiddenTreasures.isEmpty();
    }
   
    
    
}
