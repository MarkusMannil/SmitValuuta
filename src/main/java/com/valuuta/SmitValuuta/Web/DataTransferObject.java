package com.valuuta.SmitValuuta.Web;

import com.valuuta.SmitValuuta.valuuta.Valuuta;

public class DataTransferObject {

    private Valuuta valitudValuuta;
    private double vahetus;
    private double tulemus;

    public DataTransferObject(Valuuta valitudValuuta, double vahetus) {
        this.valitudValuuta = valitudValuuta;
        this.vahetus = vahetus;
    }

    public DataTransferObject() {
    }

    public Valuuta getValitudValuuta() {
        return valitudValuuta;
    }

    public void setValitudValuuta(Valuuta valitudValuuta) {
        this.valitudValuuta = valitudValuuta;
    }

    public double getVahetus() {
        return vahetus;
    }

    public void setVahetus(double vahetus) {
        this.vahetus = vahetus;
    }

    public double getTulemus() {
        return tulemus;
    }

    public void setTulemus(double tulemus) {
        this.tulemus = tulemus;
    }

    public void calcToEur(){
        tulemus = vahetus * valitudValuuta.getVaartus();
    }
    public void calcToSelected(){
        tulemus = vahetus / valitudValuuta.getVaartus();
    }

}
