package hb.humanbooster.youtravel.business;

import java.util.Date;

public class DemiJournee {

    private Activite activite = new Activite();
    private Crenneau crenneau = new Crenneau();
    private Date idDate;
    private Sejour sejour = new Sejour();

    public DemiJournee() {
    }

    public DemiJournee(Activite activite, Crenneau crenneau, Date idDate, Sejour sejour) {
        this.activite = activite;
        this.crenneau = crenneau;
        this.idDate = idDate;
        this.sejour = sejour;
    }

    @Override
    public String toString() {
        return "DemiJournee{" +
                "activite=" + activite +
                ", crenneau=" + crenneau +
                ", idDate=" + idDate +
                ", sejour=" + sejour +
                '}';
    }
}
