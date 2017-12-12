package hb.humanbooster.youtravel.business;

import java.util.Date;

public abstract class Personne {

    private static Long compteur = 0L;
    private Long idPersonne;
    private String nomPersonne;
    private String prenomPersonne;
    private Date dateNaissance;
    public Personne() {
        this.idPersonne = ++compteur;
    }

    public Personne(Long idPersonne, String nomPersonne, String prenomPersonne, Date dateNaissance) {
        this();
        this.idPersonne = idPersonne;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
        this.dateNaissance = dateNaissance;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Personne.compteur = compteur;
    }

    public Long getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "idPersonne=" + idPersonne +
                ", nomPersonne='" + nomPersonne + '\'' +
                ", prenomPersonne='" + prenomPersonne + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
