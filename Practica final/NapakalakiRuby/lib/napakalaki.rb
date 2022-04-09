# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Napakalaki
  include Singleton
  
  att_accessor :currentPlayer, :currentMoster;
  def initialize (currentPlayer, players, currentMonster, dealer )
    @currentPlayer=currentPlayer
    @players=players
    @currentMonster=currentMonster
    @dealer=dealer
  end
  def initPlayers (names)
  end
  
  def nextPlayer()
    
  end
  def nextTurnAllowed
    false
  end
  def setEnemies
    
  end
  def developCombat
    return CombatResult::WIN
  end
  def discardVisibleTreasures (treasures)
    
  end
  
  def discardHiddenTreasures (treasures)
    
  end
  
  def makeTreasuresVisible (treasures)
  end
  
  def intGame (players)
    
  end
  
  def nextTurn
    false
  end
  
  def endOfGame (combat_result)
  end
  
  
  
end
