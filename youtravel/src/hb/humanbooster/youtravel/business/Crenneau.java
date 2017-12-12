package hb.humanbooster.youtravel.business;

public class Crenneau {
    private static Long Compteur=0L;
    private Long idCrenneau;
    private String intituleCrenneau;

    public Crenneau() {
    }

    public Crenneau(String intituleCrenneau) {
        this.intituleCrenneau = intituleCrenneau;
    }

    public Long getIdCrenneau() {
        return idCrenneau;
    }

    public void setIdCrenneau(Long idCrenneau) {
        this.idCrenneau = idCrenneau;
    }

    public String getIntituleCrenneau() {
        return intituleCrenneau;
    }

    public void setIntituleCrenneau(String intituleCrenneau) {
        this.intituleCrenneau = intituleCrenneau;
    }

    @Override
    public String toString() {
        return "Crenneau{" +
                "idCrenneau=" + idCrenneau +
                ", intituleCrenneau='" + intituleCrenneau + '\'' +
                '}';
    }
}
