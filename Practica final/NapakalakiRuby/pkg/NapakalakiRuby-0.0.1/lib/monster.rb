# encoding: UTF-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

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
  
  def get_levels_gained
    @prize.level
  end
  
  def get_treasures_gained
    @prize.treasures
  end
  
  def to_s
    " Nombre: #{@name} Nivel de combate: #{@combat_level.to_s}"
  end
  
end

