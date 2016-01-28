package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class PokojAkademik
{
    private int ID_Pokoj;
    private int Nr_Pokoju;
    private double Czynsz; //NUMBER(6,2)
    private int ID_Akademik; //NUMBER
    private int Nr_Pietra;
    private String Nr_Wewnetrzny; //NUMBER(11)
    private String Data_Remontu;
    private String Stan_Wyposazenia;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO POKOJ_AKADEMIK VALUES(");
        insert.append(ID_Pokoj + "," + Nr_Pokoju + "," + Czynsz + "," + ID_Akademik + "," + Nr_Pietra + "," + Nr_Wewnetrzny + ",");
        insert.append("TO_DATE('" + Data_Remontu + "','YYYY-MM-DD'),'" + Stan_Wyposazenia + "'");
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Pokoj() {
        return ID_Pokoj;
    }

    public void setID_Pokoj(int ID_Pokoj) {
        this.ID_Pokoj = ID_Pokoj;
    }

    public int getNr_Pokoju() {
        return Nr_Pokoju;
    }

    public void setNr_Pokoju(int nr_Pokoju) {
        Nr_Pokoju = nr_Pokoju;
    }

    public double getCzynsz() {
        return Czynsz;
    }

    public void setCzynsz(double czynsz) {
        Czynsz = czynsz;
    }

    public int getID_Akademik() {
        return ID_Akademik;
    }

    public void setID_Akademik(int ID_Akademik) {
        this.ID_Akademik = ID_Akademik;
    }

    public int getNr_Pietra() {
        return Nr_Pietra;
    }

    public void setNr_Pietra(int nr_Pietra) {
        Nr_Pietra = nr_Pietra;
    }

    public String getNr_Wewnetrzny() {
        return Nr_Wewnetrzny;
    }

    public void setNr_Wewnetrzny(String nr_Wewnetrzny) {
        Nr_Wewnetrzny = nr_Wewnetrzny;
    }

    public String getData_Remontu() {
        return Data_Remontu;
    }

    public void setData_Remontu(String data_Remontu) {
        Data_Remontu = data_Remontu;
    }

    public String getStan_Wyposazenia() {
        return Stan_Wyposazenia;
    }

    public void setStan_Wyposazenia(String stan_Wyposazenia) {
        Stan_Wyposazenia = stan_Wyposazenia;
    }
}
