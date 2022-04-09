# encoding: UTF-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  #Atributos
  attr_reader :text, :levels, :nVisibleTreasures, :nHiddenTreasures, :death, :specificVisibleTreasures, :specificHiddenTreasures
  
  #Constructor        
  def initialize(aText, someLevels=0, someVisibleTreasures=0, someHiddenTreasures=0, someSpecificVisibleTreasures=Array.new, someSpecificHiddenTreasures=Array.new, death=false)
    @text = aText
    @levels = someLevels
    @nVisibleTreasures = someVisibleTreasures
    @nHiddenTreasures = someHiddenTreasures
    @specificVisibleTreasures = someSpecificVisibleTreasures
    @specificHiddenTreasures = someSpecificHiddenTreasures
    @death = death
  end
  
  #Métodos, estos métodos sobrecargan el constructor, ya que en Ruby, solo puede haber un constructor.
  private_class_method :new
  def BadConsequence.newLevelNumberOfTreasures (aText, someLevels, someVisibleTreasures, someHiddenTreasures)
    new(aText, someLevels, someVisibleTreasures, someHiddenTreasures)
  end  
  def BadConsequence.newLevelSpecificTreasures (aText, someLevels, someSpecificVisibleTreasures, someSpecificHiddenTreasures)
    new(aText,someLevels,0, 0, someSpecificVisibleTreasures, someSpecificHiddenTreasures)  
  end
  def BadConsequence.newDeath (aText)
    new(aText, 0, 0, 0, Array.new, Array.new, true)  
  end
  
  def to_s
      " Mal rollo: #{@text} \n Pierdes: #{@levels} niveles."
    end
  
end
