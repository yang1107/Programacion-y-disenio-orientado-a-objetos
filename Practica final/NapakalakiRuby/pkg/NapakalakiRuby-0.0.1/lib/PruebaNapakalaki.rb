# encoding: UTF-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative 'prize'
require_relative 'bad_consequence'
require_relative 'monster'
require_relative 'treasure_kind'

module NapakalakiRuby

  monsters = Array.new
  @unused_monsters = Array.new
  @used_monsters = Array.new #inicializamos los dos array





  #Monstruo 8
  prize = Prize.new(4,2)
  badConsequence = BadConsequence.newLevelNumberOfTreasures('Pierdes 5 niveles y 3 tesoros visibles',5,3,0)
  monsters << Monster.new('El rey de rosa',13,prize,badConsequence)
  
  #Monstruo 4
  prize = Prize.new(4,1)
  tvp = [ONEHAND]#//tesoros visibles perdidos/
  top = [ONEHAND]#//tesoros ocultos perdidos/
  badConsequence = BadConsequence.newLevelSpecificTreasures('Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo.
Descarta 1 mano visible y 1 mano oculta',0,tvp,top)
  monsters<< Monster.new('Ángeles de la noche ibicenca', 14, prize,
    badConsequence)
  
  #Monstruo 1
  tvp = [ARMOR]
  top = [ARMOR]
  badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes tu armadura visible y otra oculta", 0, tvp, top)
  prize = Prize.new(2, 1)
  monsters<< Monster.new("3 Byakhees de bonanza", 8, badConsequence, prize)

  #Monstruo 2
  tvp = [HELMET]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Embobados con el lindo primigenio te descartas de tu casco visible", 0, tvp, top)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("Chibithulhu", 2, badConsequence, prize)

  #Monstruo 3
  tvp = [SHOES]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("El primordial bostezo contagioso. Pierdes el calzado visible", 0, tvp, top)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("El sopor de Dunwich", 2, badConsequence, prize)

  #Monstruo 5
  tvp = [SHOES,ONEHAND,HELMET,BOTHHAND,ARMOR]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes todos tus tesoros visibles", 0, tvp, top)
  prize = Prize.new(3, 1)
  monsters<< Monster.new("El gorrón en el umbral", 10, badConsequence, prize)

  #Monstruo 6
  tvp = [ARMOR]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes la armadura visible", 0, tvp, top)
  prize = Prize.new(2, 1)
  monsters<< Monster.new("H.P. Munchcraft", 6, badConsequence, prize)

  #Monstruo 7
  tvp = [ARMOR]
  top = []
  badConsequence = BadConsequence.newLevelNumberOfTreasures("Sientes bichos bajo la ropa. Descarta la armadura visible", 0, tvp, top)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("Bichgooth", 2, badConsequence, prize)

  #Monstruo 9
  badConsequence = BadConsequence.newLevelNumberOfTreasures("Toses los pulmones y pierdes 2 niveles", 2,0,0)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("La que redacta en las tinieblas", 2, badConsequence, prize)

  #Monstruo 10
  badConsequence = BadConsequence.newDeath("Estos monstruos resultan bastante superciales y te aburren mortalmente. Estas muerto")
  prize = Prize.new(2, 1);
  monsters<< Monster.new("Los hondos", 8, badConsequence, prize)

  #Monstruo 11
  badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2 tesoros ocultos.", 2, 0, 2)
  prize = Prize.new(2, 1)
  monsters<< Monster.new("Semillas Cthulhu", 4, badConsequence, prize)

  #Monstruo 12
  tvp = [ONEHAND]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Te intentas escaquear. Pierdes una mano visible.", 0, tvp, top)
  prize = Prize.new(2, 1)
  monsters<< Monster.new("Dameargo", 1, badConsequence, prize)

  #Monstruo 13
  tvp = []
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Da mucho asquito, Pierdes 3 niveles", 3, tvp, top)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("Pollipólito volante", 3, badConsequence, prize)

  #Monstruo 14
  badConsequence = BadConsequence.newDeath("No le hace gracia que pronuncien mal su nombre. Estas muerto")
  prize = Prize.new(3, 1)
  monsters<< Monster.new("Yskhtihyssg-Goth", 12, badConsequence, prize)

  #Monstruo 15
  badConsequence = BadConsequence.newDeath("La familia te atrapa. Estas muerto")
  prize = Prize.new(4, 1)
  monsters<< Monster.new("Familia feliz", 1, badConsequence, prize)

  #Monstruo 16
  tvp = [BOTHHAND]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible", 2, tvp, top)
  prize = Prize.new(2, 1)
  monsters<< Monster.new("Roboggoth", 8, badConsequence, prize)

  #Monstruo 17
  tvp = [HELMET]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Te asusta en la noche. Pierdes un casco visible.", 0, tvp, top)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("El espia", 5, badConsequence, prize)

  #Monstruo 18
  badConsequence = BadConsequence.newLevelNumberOfTreasures("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles", 2, 5, 0)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("El lenguas", 20, badConsequence, prize)

  #Monstruo 19
  tvp = [BOTHHAND]
  top = []
  badConsequence = BadConsequence.newLevelSpecificTreasures("Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos.", 3, tvp, top)
  prize = Prize.new(1, 1)
  monsters<< Monster.new("Bicefalo", 20, badConsequence, prize)
    
  monsters.each do |monstruos|
    puts monstruos
  end
  
 # Mostrar todos los monstruos que tengan un nivel de combate superior a 10.
#• Mostrar todos los monstruos que tengan un mal rollo que implique sólo pérdida de
#niveles.
#• Mostrar todos los monstruos que tengan un buen rollo que indique una ganancia de
#niveles superior a 1.
#• Mostrar todos los monstruos que tengan un mal rollo que suponga la pérdida de un
#determinado tipo de tesoros ya sea visibles y,o, ocultos. Debe mostrarse el
#nombre, nivel de combate, buen rollo y mal rollo de cada monstruo.*/
  
end