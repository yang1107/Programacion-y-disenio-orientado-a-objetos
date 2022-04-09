# encoding: UTF-8

class Prize
  #Atributos
  attr_reader :level, :treasures    #Esto es como lo implementa ruby 
  
  #Constructor
  def initialize(treasures,level)
    @treasures = treasures
    @level = level
  end
  
  #Sobrecarga del método to_s (es similar al toString() de java
  def to_s
    "Treasures: #{@treasures} Levels: #{@level}"
  end
  
end

