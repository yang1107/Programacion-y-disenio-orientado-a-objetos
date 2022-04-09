# encoding: UTF-8

class Monster
  
  #Atributos
  attr_reader :name, :combat_level, :prize, :badConsequence
  
  #Constructor
  def initialize(name, level, bc, prize)
    @name = name
    @combat_level = level
    @prize = prize
    @badConsequence = bc
  end

  def to_s
    "Monster = #{@name} | CombatLevel = #{@combat_level}" +
      " Prize = [[ #{@prize.to_s} ]]" +
      " badConsequence = [[ #{@badConsequence.to_s} ]]"
  end
  
  def nivelSuperiorA(lvl)
    ( @combat_level > lvl )
  end

  def MalRolloPerdidaNiveles
    ( @badConsequence.levels > 0 && @badConsequence.nHiddenTreasures == 0 && @badConsequence.nVisibleTreasures == 0 && @badConsequence.specificHiddenTreasures.empty? && @badConsequence.specificVisibleTreasures.empty?  )
  end

  def BuenRolloGananciaNivelesSupA(lvl)
    ( @prize.level > lvl )
  end
  
  def PerdidaTesoroVisibleOculto
    ( @badConsequence.nHiddenTreasures != 0 || @badConsequence.nVisibleTreasures != 0 || !@badConsequence.specificHiddenTreasures.empty? || !@badConsequence.specificVisibleTreasures.empty? )
  end
  
end

