package hb.humanbooster.youtravel.business;

import java.util.ArrayList;
import java.util.Arrays;

public class Pays {

    private Long idPays;
    private String nomPays;
    private ArrayList<Ville> villes;

    public Pays() {
        villes = new ArrayList<>();
    }

    public Pays(String nomPays, ArrayList<Ville> villes) {
        this.nomPays = nomPays;
        this.villes = villes;
    }

    public Long getIdPays() {
        return idPays;
    }

    public void setIdPays(Long idPays) {
        this.idPays = idPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "idPays=" + idPays +
                ", nomPays='" + nomPays + '\'' +
                ", villes=" + villes +
                '}';
    }
}
