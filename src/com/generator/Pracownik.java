package com.generator;

import javax.xml.crypto.Data;

/**
 * Created by Marcin on 2016-01-13.
 */
public class Pracownik
{
    private int ID_Pracownik;
    private String Imie;
    private  String Nazwisko;
    private int ID_Adres;
    private int ID_Stanowisko;
    private String Nr_Telefonu;
    private String Adres_Email;
    private String Data_Urodzenia;
    private char Plec;// CHAR
    private int ID_Miejsce_Pracy;
    private int ID_Przelozony;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO PRACOWNIK VALUES(");
        insert.append(ID_Pracownik + ",'" + Imie + "','" + Nazwisko + "'," + ID_Adres + "," + ID_Stanowisko + ",");
        insert.append(Nr_Telefonu + ",'" + Adres_Email + "',TO_DATE('" + Data_Urodzenia + "','YYYY-MM-DD'),'" + Plec + "',");
        insert.append(ID_Miejsce_Pracy + "," + ID_Przelozony);
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Przelozony() {
        return ID_Przelozony;
    }

    public void setID_Przelozony(int ID_Przelozony) {
        this.ID_Przelozony = ID_Przelozony;
    }

    public int getID_Miejsce_Pracy() {
        return ID_Miejsce_Pracy;
    }

    public void setID_Miejsce_Pracy(int ID_Miejsce_Pracy) {
        this.ID_Miejsce_Pracy = ID_Miejsce_Pracy;
    }

    public char getPlec() {
        return Plec;
    }

    public void setPlec(char plec) {
        Plec = plec;
    }

    public String getData_Urodzenia() {
        return Data_Urodzenia;
    }

    public void setData_Urodzenia(String data_Urodzenia) {
        Data_Urodzenia = data_Urodzenia;
    }

    public String getAdres_Email() {
        return Adres_Email;
    }

    public void setAdres_Email(String adres_Email) {
        Adres_Email = adres_Email;
    }

    public String getNr_Telefonu() {
        return Nr_Telefonu;
    }

    public void setNr_Telefonu(String nr_Telefonu) {
        Nr_Telefonu = nr_Telefonu;
    }

    public int getID_Stanowisko() {
        return ID_Stanowisko;
    }

    public void setID_Stanowisko(int ID_Stanowisko) {
        this.ID_Stanowisko = ID_Stanowisko;
    }

    public int getID_Adres() {
        return ID_Adres;
    }

    public void setID_Adres(int ID_Adres) {
        this.ID_Adres = ID_Adres;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public int getID_Pracownik() {
        return ID_Pracownik;
    }

    public void setID_Pracownik(int ID_Pracownik) {
        this.ID_Pracownik = ID_Pracownik;
    }
}
