package napakalaki;

public class Monster {
    private String name;
    private int combatlevel;
    private Prize prize;
    private BadConsequence badConsequence;
    
    public Monster(String name, int combatlevel) {
        this.name = name;
        this.combatlevel = combatlevel;
    }

    public Monster(String name, int level, BadConsequence bc, Prize prize) {
        this.name = name;
        this.combatlevel = level;
        this.prize = prize;
        this.badConsequence = bc;
    }
    
    public String getName(){
        return name;
    }
    public int getCombatLevel(){
        return combatlevel;
    }
    
    public Prize getPrize(){
        return prize;
    }
    
    public BadConsequence getBadConsequence(){
        return badConsequence;
    }
    
    public int getLevelsGained()
    {
        return getPrize().getLevel();
    }
    
    public int getTreasuresGained()
    {
            return getPrize().getTreasures();
    }
    
    public String toString(){
        return "Monster Name = " + name 
                + " CombatLevel = " + Integer.toString(combatlevel) 
                + " Prize = [[ " + prize + " ]]"
                + " badConsequence = [[ " + badConsequence + " ]]";
    }
    
    public boolean nivelSuperiorA(int lvl)
    {
        return ( this.combatlevel > lvl );
    }
    
    
    public boolean MalRolloPerdidaNiveles(){
        return ( badConsequence.getLevels() > 0 
                && badConsequence.getnHiddenTreasures() == 0
                && badConsequence.getnVisibleTreasures() == 0
                && badConsequence.getSHiddenTreasures().isEmpty()
                && badConsequence.getSVisibleTreasures().isEmpty());
    }
    
    public boolean BuenRolloGananciaNivelesSupA(int lvl){
        return ( prize.getLevel() > lvl );
    }
    
    public boolean PerdidaTesoroVisibleOculto(){ //FIXME
        return ( badConsequence.getnHiddenTreasures() != 0 
                || badConsequence.getnVisibleTreasures() != 0 
                    || !badConsequence.getSHiddenTreasures().isEmpty()//Si no tiene ningun elemento en el array de tesoros ocultos
                        || !badConsequence.getSVisibleTreasures().isEmpty());
    }
}
