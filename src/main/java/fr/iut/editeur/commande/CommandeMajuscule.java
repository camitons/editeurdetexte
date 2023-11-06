package fr.iut.editeur.commande;
import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{
    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        int start = Integer.parseInt(parameters[2]);
        int end = Integer.parseInt(parameters[3]);
        this.document.majuscules(start, end);
        super.executer();
    }
}
