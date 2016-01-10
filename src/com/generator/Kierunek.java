package com.generator;

/**
 * Created by Marcin on 2016-01-09.
 */
public class Kierunek
{

    private int ID_Kierunek;
    private String Nazwa;
    private int ID_Wydzial;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO KIERUNEK VALUES(");
        insert.append(ID_Kierunek + ",'" + Nazwa + "'," + ID_Wydzial + ")");
        String output = insert.toString();
        return output;
    }

    public int getID_Kierunek() {
        return ID_Kierunek;
    }

    public void setID_Kierunek(int ID_Kierunek) {
        this.ID_Kierunek = ID_Kierunek;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public int getID_Wydzial() {
        return ID_Wydzial;
    }

    public void setID_Wydzial(int ID_Wydzial) {
        this.ID_Wydzial = ID_Wydzial;
    }
}
