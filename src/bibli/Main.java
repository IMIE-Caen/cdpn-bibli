/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibli;
/**
 *
 * @author clement
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bibliotheque bibli = new Bibliotheque();
        Registre registre= new Registre(bibli);
        

        
        
        // Methode 1
        bibli.add(new CD('A', 2, "Celine Dion"));
        
        // Methode 2
        Media cd2 = new CD('G', 7, "Radiohead");
        bibli.add(cd2);
        
        Media cd3 = Media.cd('O', 2, "Bernard Minet");
        bibli.add(cd3);
        
        
        
        // Methode 3bis à venir
        bibli.add("CD", 'K', 8, "Gorillaz", 0);
        
        
        Media cd4 = new CD('Z', 4, "Giedré");
        
        
        
        Media livre1 = new Livre("Design Patterns");
        Media livre2 = new Livre('B', 9, "Zaratoustra");
        Media livre3 = new Livre("Apprendre à lire pour les nuls");
        bibli.add(cd3);
        bibli.add(livre1);
        bibli.add(livre2);
        bibli.add(livre3);
               
        
        
        
        
        System.out.println(bibli);
        System.out.println(registre);
        
        Media livre4 = new Livre("Tintin au congo");
        bibli.add(livre4);
       // bibli.remove(livre2);
        
        System.out.println("Changement");
        System.out.println(bibli);
        System.out.println(registre);
        
        
/*
        Scanner s = new Scanner(System.in);
        String titreRecherche = new String("");
        
        do{
            System.out.println("*****\nTapez un titre (Q pour quitter) :");
            titreRecherche = s.nextLine();
            if(! titreRecherche.equals("Q")){
                if(registre.containsKey(titreRecherche)){
                    System.out.println("Résultat :");
                    System.out.println(registre.get(titreRecherche));
                }
                else {
                    System.out.println("Aucun résultat");
                }
            }

        }while( ! titreRecherche.equals("Q"));
        
        
       
        
        
     //   bibli.add()
        
        System.out.println(bibli);
        
        livre1.deplacer('P', 5);
        
        System.out.println(bibli);
        
        */
        
    }
    
}
