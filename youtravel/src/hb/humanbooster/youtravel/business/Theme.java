package hb.humanbooster.youtravel.business;

public class Theme {

    private static Long compteur=0L;
    private Long idTheme;
    private String nomDuTheme;
    private Activite activite;

    public Theme() {
        this.idTheme=++compteur;
    }

    public Theme(String nomDuTheme, Activite activite) {
        this();
        this.nomDuTheme = nomDuTheme;
        this.activite = activite;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Theme.compteur = compteur;
    }

    public Long getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(Long idTheme) {
        this.idTheme = idTheme;
    }

    public String getNomDuTheme() {
        return nomDuTheme;
    }

    public void setNomDuTheme(String nomDuTheme) {
        this.nomDuTheme = nomDuTheme;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "idTheme=" + idTheme +
                ", nomDuTheme='" + nomDuTheme + '\'' +
                '}';
    }
}
