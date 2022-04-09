package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaNapakalaki {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<Monster> monstruos = new ArrayList();
        /*
        BadConsequence bc = new BadConsequence("bc", 100, null, null);
        Prize pr = new Prize(7, 7);
        /*Monster monster = new Monster("Monstruo1", 101, bc, pr);
        
        System.out.println(monster.toString());
        */
        
        /// ------------------ CARTAS -------------------
        
        BadConsequence bc;
        Prize pr;
        ArrayList<TreasureKind> tVisibles = new ArrayList();//Tesoros visibles
        ArrayList<TreasureKind> tOcultos = new ArrayList();//tesoros ocultos
        //monstruo 8
        bc = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        pr = new Prize(4,2);
        monstruos.add(new Monster("El rey de rosa", 13, bc, pr));
        //monstruo 4
        bc = new BadConsequence("Te atrapan para "
                + "llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1"
                + " mano visible y 1 mano oculta",0,
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        pr = new Prize(4,1);
        monstruos.add(new Monster("Ángeles de la noche ibicenca", 14, bc, pr));
        //monstruo 1
        bc = new BadConsequence("Pierdes tu armadura visible y otra armadura oculta", 0, 
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        pr = new Prize(2,1);
        monstruos.add(new Monster("3 Byakhees de bonanza", 8, bc, pr));
        //monstruo 2
        tVisibles.clear();
        tOcultos.clear();//No hay tesoros ocultos.
        tVisibles.add(TreasureKind.HELMET);
        bc = new BadConsequence("Embobados con el lindo " +
                "primigenio te descartas de tu casco " +
                "visible", 0, tVisibles,
                tOcultos);
        pr = new Prize(1,1);
        monstruos.add(new Monster("Chibithulhu", 2, bc, pr));
        //monstruo 3
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.SHOES);
        bc = new BadConsequence("El primordial bostezo " +
                "contagioso. Pierdes el calzado visible", 0, 
                tVisibles, tOcultos);
        pr = new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich", 2, bc, pr));
        //monstruo 5
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.ARMOR);
        tVisibles.add(TreasureKind.BOTHHANDS);
        tVisibles.add(TreasureKind.HELMET);
        tVisibles.add(TreasureKind.ONEHAND);
        tVisibles.add(TreasureKind.SHOES);
        bc = new BadConsequence("Pierdes todos tus tesoros visibles", 0, 
                tVisibles, tOcultos);
        pr = new Prize(3,1);
        monstruos.add(new Monster("El gorrón en el umbral", 10, bc, pr));
        //monstruo 6
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.ARMOR);
        bc = new BadConsequence("Pierdes la armadura visible", 0, 
                tVisibles, tOcultos);
        pr = new Prize(2,1);
        monstruos.add(new Monster("H.P. Munchcraft", 6, bc, pr));
        //monstruo 7
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.ARMOR);
        bc = new BadConsequence("Sientes bichos bajo la " +
                "ropa. Descarta la armadura visible", 0, 
                tVisibles, tOcultos);
        pr = new Prize(1,1);
        monstruos.add(new Monster("Bichgooth", 2, bc, pr));
        //monstruo 9
        bc = new BadConsequence("Toses los pulmones y pierdes 2 niveles.", 2, 0, 0);
        pr = new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas", 2, bc, pr));
        //monstruo 10
        bc = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto", true);
        pr = new Prize(2, 1);
        monstruos.add(new Monster("Los hondos", 8, bc, pr));
        //monstruo 11
        bc = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos.", 2, 0, 2);
        pr = new Prize(2, 1);
        monstruos.add(new Monster("Semillas Cthulhu", 4, bc, pr));
        //monstruo 12
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.ONEHAND);
        bc = new BadConsequence("Te intentas escaquear. Pierdes una mano visible.", 0, 
                tVisibles, tOcultos);
        pr = new Prize(2, 1);
        monstruos.add(new Monster("Dameargo", 1, bc, pr));
        //monstruo 13
        bc = new BadConsequence("Da mucho asquito, Pierdes 3 niveles", 3, 0, 0);
        pr = new Prize(1, 1);
        monstruos.add(new Monster("Pollipólipo volante", 3, bc, pr));
        //monstruo 14
        bc = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto", true);
        pr = new Prize(3, 1);
        monstruos.add(new Monster("Yskhtihyssg-Goth", 12, bc, pr));
        //monstruo 15
        bc = new BadConsequence("La familia te atrapa. Estas muerto", true);
        pr = new Prize(4, 1);
        monstruos.add(new Monster("Familia feliz", 1, bc, pr));
        //monstruo 16
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.BOTHHANDS);
        bc = new BadConsequence("La quinta directiva primaria te obliga a perder 2 "
                + "niveles y un tesoro 2 manos visible", 2, 
                tVisibles, tOcultos);
        pr = new Prize(2, 1);
        monstruos.add(new Monster("Roboggoth", 8, bc, pr));
        //monstruo 17
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.HELMET);
        bc = new BadConsequence("Te asusta en la noche. Pierdes un casco visible.", 0, 
                tVisibles, tOcultos);
        pr = new Prize(1, 1);
        monstruos.add(new Monster("El espia", 5, bc, pr));
        //monstruo 18
        bc = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 "
                + "tesoros visibles", 2, 5, 0);
        pr = new Prize(1, 1);
        monstruos.add(new Monster("El lenguas", 20, bc, pr));
        //monstruo 19
        tVisibles.clear();
        tOcultos.clear();
        tVisibles.add(TreasureKind.BOTHHANDS);
        bc = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 "
                + "niveles y tus tesoros visibles de las manos.", 3, tVisibles, tOcultos);
        pr = new Prize(1, 1);
        monstruos.add(new Monster("Bicefalo", 20, bc, pr));
        
       
        
        System.out.println("\n// -------------------------------- //");
        
        System.out.println("\n##### nivelSuperiorA(10) :");
        for(int i = 0; i < monstruos.size(); ++i)
        {
            if(monstruos.get(i).nivelSuperiorA(10)){
                System.out.println(monstruos.get(i).toString());
            }
        }
        System.out.println("\n##### MalRolloPerdidaNiveles() :");
        for(int i = 0; i < monstruos.size(); ++i)
        {
            if(monstruos.get(i).MalRolloPerdidaNiveles()){
                System.out.println(monstruos.get(i).toString());
            }
        }
        System.out.println("\n##### BuenRolloGananciaNivelesSupA(1) :");
        for(int i = 0; i < monstruos.size(); ++i)
        {
            if(monstruos.get(i).BuenRolloGananciaNivelesSupA(1)){
                System.out.println(monstruos.get(i).toString());
            }
        }
        System.out.println("\n##### PerdidaTesoroVisibleOculto() :");
        for(int i = 0; i < monstruos.size(); ++i)
        {    
            if(monstruos.get(i).PerdidaTesoroVisibleOculto()){
                System.out.println(monstruos.get(i).toString());
            }
            
        }
        
    }
    
}
