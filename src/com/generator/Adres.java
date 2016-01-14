package com.generator;

/**
 * Created by Marcin on 2016-01-09.
 */
public class Adres
{
    private int ID_Adres;
    private String Ulica;
    private int Numer_Domu;
    private int Numer_Mieszkania;
    private String Kod_Pocztowy = "01-001";
    private String Miasto;
    private String Kraj = "Polska";

    @Override
    public String toString()
    {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO ADRES VALUES(");
        insert.append(ID_Adres + ",'" + Ulica +"'," + Numer_Domu + "," + Numer_Mieszkania + ",'" + Kod_Pocztowy + "','" + Miasto + "','" + Kraj + "');");
        String output = insert.toString();
        return output;
    }

    public int getID_Adres() {
        return ID_Adres;
    }

    public void setID_Adres(int ID_Adres) {
        this.ID_Adres = ID_Adres;
    }

    public String getUlica() {
        return Ulica;
    }

    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    public int getNumer_Domu() {
        return Numer_Domu;
    }

    public void setNumer_Domu(int numer_Domu) {
        Numer_Domu = numer_Domu;
    }

    public int getNumer_Mieszkania() {
        return Numer_Mieszkania;
    }

    public void setNumer_Mieszkania(int numer_Mieszkania) {
        Numer_Mieszkania = numer_Mieszkania;
    }

    public String getKod_Pocztowy() {
        return Kod_Pocztowy;
    }

    public void setKod_Pocztowy(String kod_Pocztowy) {
        Kod_Pocztowy = kod_Pocztowy;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String miasto) {
        Miasto = miasto;
    }

    public String getKraj() {
        return Kraj;
    }

    public void setKraj(String kraj) {
        Kraj = kraj;
    }


}
