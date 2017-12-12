package hb.humanbooster.youtravel.business;

import java.util.ArrayList;
import java.util.Date;

public class Voyageur extends Personne {

    private String numeroPasseport;
    private ArrayList<Sejour> listeSejour = new ArrayList<>();

    public Voyageur() {
        listeSejour = new ArrayList<>();
    }

    public Voyageur(String numeroPasseport) {
        this();
        this.numeroPasseport = numeroPasseport;
    }

    public String getNumeroPasseport() {
        return numeroPasseport;
    }

    public void setNumeroPasseport(String numeroPasseport) {
        this.numeroPasseport = numeroPasseport;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "numeroPasseport='" + numeroPasseport + '\'' +
                ", listeSejour=" + listeSejour +
                '}';
    }
}
