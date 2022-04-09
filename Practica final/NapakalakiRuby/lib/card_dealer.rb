# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class CardDealer
  
  include Singleton
  def initialize (usedMonsters, unusedMonsters, usedTreasures, unusedTreasures)
  @usedMonsters=usedMonsters
  @unusedMonsters=unusedMonsters
  @usedTreasures=usedTreasures
  @unusedTreasures=unusedTreasures  
  end
  private def initTreasureCardDeck
  @unusedTreasures << Treasure.new("Sí mi amo", 4, TreasureKind::HELMET);
  @unusedTreasures << Treasure.new("Botas del investigación", 3, TreasureKind::SHOES);
  @unusedTreasures << Treasure.new("Capucha de Cthulhu", 3, TreasureKind::HELMET);
  @unusedTreasures << Treasure.new("A prueba de babas", 2, TreasureKind.ARMOR);
  @unusedTreasures << Treasure.new("Botas de la lluvia ácida", 1, TreasureKind.BOTHHANDS);
  @unusedTreasures << Treasure.new("Casco minero", 2, TreasureKind.HELMET);  
  @unusedTreasures << Treasure.new("Ametralladora Thomson", 4, TreasureKind.BOTHHANDS);                 
  @unusedTreasures << Treasure.new("Camiseta de la UGR", 1, TreasureKind.ARMOR);  
  @unusedTreasures << Treasure.new("Clavo de rail ferroviario", 3, TreasureKind.ONEHAND);  
  @unusedTreasures << Treasure.new("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND);  
 
  end
  
  private def initMonsterCardDeck
  bc = BadConsequence.newLevelNumberOfTreasures("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        pr = new Prize(4,2);
        unusedMonsters.add(new Monster("El rey de rosa", 13, bc, pr)); 
        
        bc = BadConsequence.newLevelSpecificTreasures("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,Array.new [TreasureKind.ONEHAND],
                Array.new[TreasureKind.ONEHAND]);
        pr =Prize.new(4,1);
        unusedMonsters << Monster.new("Ángeles de la noche ibicenca", 14, bc, pr));
  
    
  end
  private def shuffleTreasures
    
  end
  def nextTreasure
    
  end
  def nextMonster
    
  end
  def giveTreasureBack (treasure)
    
  end
  def giveMonsterBack(monster)
    
  end
  def initCards()
    
  end
end
