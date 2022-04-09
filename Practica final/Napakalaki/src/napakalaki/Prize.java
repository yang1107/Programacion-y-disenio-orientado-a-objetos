package napakalaki;

public class Prize {
    private int treasures;
    private int level;

    public Prize(int treasures, int level) {
        this.treasures = treasures;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
    public int getTreasures(){
        return treasures;
    }
    
    public String toString(){
        return "Treasures = " + Integer.toString(treasures)
                + " Levels = " + Integer.toString(level);
    }
    
}
