package hb.humanbooster.youtravel.business;

import java.util.ArrayList;

public class Activite {

    private static Long compteur=0L;
    private Long idActivite;
    private String nomActivite;
    private ArrayList<Personne> receptif;
    private ArrayList<Theme> theme;
    private ArrayList<Photo> photo;

    public Activite() {
        this.idActivite=++compteur;
        theme = new ArrayList<>();
        photo = new ArrayList<>();
        receptif = new ArrayList<>();
    }

    public Activite(String nomActivite, Personne receptif, Theme theme) {
        this();
        this.nomActivite = nomActivite;
    }

    public Long getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(Long idActivite) {
        this.idActivite = idActivite;
    }

    public String getNomActivite() {
        return nomActivite;
    }

    public void setNomActivite(String nomActivite) {
        this.nomActivite = nomActivite;
    }

    public ArrayList<Photo> getPhoto() {
        return photo;
    }

    public ArrayList<Theme> getTheme() {
        return theme;
    }

    public ArrayList<Personne> getReceptif() {
        return receptif;
    }

    @Override
    public String toString() {
        return "Activite{" +
                ", nomActivite='" + nomActivite + '\'' +
                ", receptif=" + receptif +
                ", theme=" + theme +
                ", photo=" + photo +
                '}';
    }
}
