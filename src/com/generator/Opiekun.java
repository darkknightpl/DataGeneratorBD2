package com.generator;

/**
 * Created by Marcin on 2016-01-10.
 */
public class Opiekun
{
    private int ID_Opiekun;
    private String Imie;
    private String Nazwisko;
    private int ID_Wydzial;
    private int Nr_Pokoju;
    private String Nr_Telefonu;// NUMBER(11)
    private String Adres_Email;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO OPIEKUN VALUES(");
        insert.append(ID_Opiekun + ",'" + Imie + "','" + Nazwisko + "'," + ID_Wydzial + "," + Nr_Pokoju + "," + Nr_Telefonu + ",'" + Adres_Email + "')");
        String output = insert.toString();
        return output;
    }

    public int getID_Opiekun() {
        return ID_Opiekun;
    }

    public void setID_Opiekun(int ID_Opiekun) {
        this.ID_Opiekun = ID_Opiekun;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getID_Wydzial() {
        return ID_Wydzial;
    }

    public void setID_Wydzial(int ID_Wydzial) {
        this.ID_Wydzial = ID_Wydzial;
    }

    public int getNr_Pokoju() {
        return Nr_Pokoju;
    }

    public void setNr_Pokoju(int nr_Pokoju) {
        Nr_Pokoju = nr_Pokoju;
    }

    public String getNr_Telefonu() {
        return Nr_Telefonu;
    }

    public void setNr_Telefonu(String nr_Telefonu) {
        Nr_Telefonu = nr_Telefonu;
    }

    public String getAdres_Email() {
        return Adres_Email;
    }

    public void setAdres_Email(String adres_Email) {
        Adres_Email = adres_Email;
    }
}
