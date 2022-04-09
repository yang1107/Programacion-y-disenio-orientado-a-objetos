# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Player
  MAX_LEVEL=10
  @level
  @dead=true
  @canISteal=true
  @enemy
  @hiddenTreasures
  @visibleTreasures
  @pendingBadConsequence
  attr_accessor :name, :canISteal, :enemy, :hiddenTreasures, :visibleHiddenTreasures
  def initialize (name)
    @name=name
  end
  private def bringToLife
    @dead=false
  end
   def getCombatLevel
    level=@level
    visibleTreasures.each {|t| level+=t.bonus}
    @level
  end
  private def incrementLevels (l)
    level+=l
  end
  private def decrementLevels (l)
    level-=l
  end
  private def pendingBadconsequence (badConsequence)
    @pendingBadConsequence=badConsequence
  end
  private def applyBadconsequence(badConsequence)
    
  end
  private def canMakeTreasureVisible (treasure)
    
  end
  private def howManyVisibleTreasures (kind)
    total=0
    @visibleTreasures.each {|t| if t.type ==kind then total=total+1   end}
    total 
  end
  private def dieIfNoTreasures
    @dead=true
  end
  
  def isDead
    @dead
  end
  def combat (monster)
    
  end
  def makeTreasureVisible (treasure)
    
  end
  def discardVisibleTreasure(treasure)
     
  end
  def discardHiddenTreasure(treausure)
    
  end
  def validState
   @pendingBadConsequence.isEmpty && hiddenTreasures.length<=4
  end
  def initTreasures
    
  end
  def getLevels
    @level
  end
  def stealTreasure
    
  end
  def giveMeATreasure
    
  end
  private def canYouGiveMeATreasure
    @hiddenTreasures.lenth>0
  end
  private def haveStole
    @canISteal=false
  end
  def discardAllTreasures
    
  end
end

