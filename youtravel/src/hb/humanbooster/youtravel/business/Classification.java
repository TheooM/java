package hb.humanbooster.youtravel.business;

public class Classification {
    private static Long compteur=0L;
    private Long idnombreEtoile;
    private Integer nombreEtoile;

    public Classification() {
    }

    public Classification(Long idnombreEtoile, Integer nombreEtoile) {
        this.idnombreEtoile = idnombreEtoile;
        this.nombreEtoile = nombreEtoile;
    }

    public Long getIdnombreEtoile() {
        return idnombreEtoile;
    }

    public void setIdnombreEtoile(Long idnombreEtoile) {
        this.idnombreEtoile = idnombreEtoile;
    }

    public Integer getNombreEtoile() {
        return nombreEtoile;
    }

    public void setNombreEtoile(Integer nombreEtoile) {
        this.nombreEtoile = nombreEtoile;
    }


    @Override
    public String toString() {
        return "Classification{" +
                "idnombreEtoile=" + idnombreEtoile +
                ", nombreEtoile=" + nombreEtoile +
                '}';
    }
}
