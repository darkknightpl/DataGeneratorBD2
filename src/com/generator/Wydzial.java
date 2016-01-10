package com.generator;

/**
 * Created by Marcin on 2016-01-09.
 */
public class Wydzial
{
    private int ID_Wydzial;
    private String Nazwa;
    private int ID_Adres;
    private int ID_Uczelnia;

    @Override
    public String toString()
    {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO WYDZIAL VALUES(");
        insert.append(ID_Wydzial + ",'" + Nazwa + "'," + ID_Adres + "," + ID_Uczelnia + ")");
        String output = insert.toString();
        return output;
    }

    public int getID_Wydzial() {
        return ID_Wydzial;
    }

    public void setID_Wydzial(int ID_Wydzial) {
        this.ID_Wydzial = ID_Wydzial;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public int getID_Adres() {
        return ID_Adres;
    }

    public void setID_Adres(int ID_Adres) {
        this.ID_Adres = ID_Adres;
    }

    public int getID_Uczelnia() {
        return ID_Uczelnia;
    }

    public void setID_Uczelnia(int ID_Uczelnia) {
        this.ID_Uczelnia = ID_Uczelnia;
    }
}
