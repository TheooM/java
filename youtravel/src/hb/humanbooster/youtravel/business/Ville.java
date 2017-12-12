package hb.humanbooster.youtravel.business;

import java.util.ArrayList;

public class Ville {

    private static Long compteur;
    private Long idVille;
    private String nomVille;
    private Pays pays;
    private ArrayList<Activite> listeActivite;
    private ArrayList<Sejour> listeSejour;

    public Ville() {
        this.idVille=++compteur;
        listeActivite=new ArrayList<>();
        listeSejour = new ArrayList<>();
    }

    public Ville(String nomVille, Pays pays) {
        this();
        this.nomVille = nomVille;
        this.pays = pays;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Ville.compteur = compteur;
    }

    public Long getIdVille() {
        return idVille;
    }

    public void setIdVille(Long idVille) {
        this.idVille = idVille;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "idVille=" + idVille +
                ", nomVille='" + nomVille + '\'' +
                ", pays=" + pays +
                ", listeActivite=" + listeActivite +
                ", listeSejour=" + listeSejour +
                '}';
    }
}
