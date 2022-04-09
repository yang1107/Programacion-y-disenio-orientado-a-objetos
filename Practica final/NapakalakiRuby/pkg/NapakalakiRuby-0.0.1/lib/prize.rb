# encoding: UTF-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

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
    " Treasures: #{@treasures} \n Levels: #{@level}"
  end
  
end

