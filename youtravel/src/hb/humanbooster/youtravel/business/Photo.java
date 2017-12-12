package hb.humanbooster.youtravel.business;

public class Photo {

    private static Long compteur = 0L;

    private Long idPhoto;
    private String nomPhoto;
    private Activite activite;

    public Photo() {
        this.idPhoto = ++compteur;
    }

    public Photo(Long idPhoto, String nomPhoto, Activite activite) {
        this.idPhoto = idPhoto;
        this.nomPhoto = nomPhoto;
        this.activite = activite;
    }

    public Long getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(Long idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "idPhoto=" + idPhoto +
                ", nomPhoto='" + nomPhoto + '\'' +
                ", activite=" + activite +
                '}';
    }
}
