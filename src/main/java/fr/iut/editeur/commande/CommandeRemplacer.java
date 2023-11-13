package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Classe CommandeRemplacer qui permet de remplacer un texte dans le document
 */
public class CommandeRemplacer extends CommandeDocument {


    /**
     * Constructeur de la classe CommandeRemplacer
     * @param document
     * @param parameters
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }


    /**
     * Méthode executer qui permet d'executer la commande Remplacer
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;x1;x2;texte");
            return;
        }
        String texte = parameters[3];
        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), texte);
        super.executer();
    }


    /**
     * Méthode getDescriptionCommande qui permet d'afficher la commande Remplacer
     */
    @Override
    public void getDescriptionCommande() {
        System.out.println("Remplacer");
    }

}
