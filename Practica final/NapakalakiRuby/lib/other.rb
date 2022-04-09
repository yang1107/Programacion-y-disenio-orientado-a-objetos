# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
#EXAMEN

require_relative 'combat_result'

module Other
  
  require_relative 'combat_result'
    class ResultTransformer
      def self.transform (cr)
        
        if cr == CombatResult::LOSE 
          a= cr
        else a= cr
          a
        end
      end
    end
    
end
#FIN EXAMEN
