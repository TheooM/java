package hb.humanbooster.youtravel.business;

public class Hotel {

    private static Long compteur=0L;
    private Long idHotel;
    private String nomHotel;
    private Ville ville = new Ville();
    private Classification classification = new Classification();

    public Hotel() {
        this.idHotel=++compteur;
    }

    public Hotel(Long idHotel, String nomHotel, Ville ville, Classification classification) {
        this();
        this.idHotel = idHotel;
        this.nomHotel = nomHotel;
        this.ville = ville;
        this.classification = classification;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", nomHotel='" + nomHotel + '\'' +
                ", ville=" + ville +
                ", classification=" + classification +
                '}';
    }
}
