# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Treasure
  attr_accesor :name, :bonus, :type
  def initialize (name, bonus, type)
    @name=name
    @bonus=bonus
    @type=type
  end

end
