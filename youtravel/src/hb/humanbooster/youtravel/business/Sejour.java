package hb.humanbooster.youtravel.business;

import java.util.ArrayList;
import java.util.Date;

public class Sejour {

    private static Long compteur;
    private Long idSejour;
    private Date dateAller;
    private Date dateRetour;
    private ArrayList<Personne>voyageurs;
    private Consommateur consommateur = new Consommateur();
    private Ville villeDepart = new Ville();
    private Ville ville1 = new Ville();
    private Ville ville2 = new Ville();
    private Classification nombreEtoile = new Classification();
    private ArrayList<DemiJournee> demiJournees;

    public Sejour() {
        this.idSejour=++compteur;
    }

    public Sejour(Long idSejour, Date dateAller, Date dateRetour, Consommateur consommateur, Ville villeDepart, Ville ville1, Ville ville2, Classification nombreEtoile, ArrayList<DemiJournee> demiJournees) {
        this();
        this.idSejour = idSejour;
        this.dateAller = dateAller;
        this.dateRetour = dateRetour;
        voyageurs = new ArrayList<>();
        this.consommateur = consommateur;
        this.villeDepart = villeDepart;
        this.ville1 = ville1;
        this.ville2 = ville2;
        this.nombreEtoile = nombreEtoile;
        this.demiJournees = demiJournees;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Sejour.compteur = compteur;
    }

    public Long getIdSejour() {
        return idSejour;
    }

    public void setIdSejour(Long idSejour) {
        this.idSejour = idSejour;
    }

    public Date getDateAller() {
        return dateAller;
    }

    public void setDateAller(Date dateAller) {
        this.dateAller = dateAller;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Override
    public String toString() {
        return "Sejour{" +
                "idSejour=" + idSejour +
                ", dateAller=" + dateAller +
                ", dateRetour=" + dateRetour +
                ", voyageurs=" + voyageurs +
                ", consommateur=" + consommateur +
                ", villeDepart=" + villeDepart +
                ", ville1=" + ville1 +
                ", ville2=" + ville2 +
                ", nombreEtoile=" + nombreEtoile +
                ", demiJournees=" + demiJournees +
                '}';
    }
}
