package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {


    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;int lieu;texte");
            return;
        }
        String texte = parameters[2];
        this.document.inserer(Integer.parseInt(parameters[1]), texte);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Inserer");
    }

}
