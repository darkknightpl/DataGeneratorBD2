package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class Sprzatanie
{
    private int ID_Sprzatanie;
    private int ID_Pracownik;
    private int ID_Mieszkanie;
    private String Data;
    private String Usterki; //VARCHAR
    private String Uwagi; //VARCHAR

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO SPRZATANIE VALUES(");
        insert.append(ID_Sprzatanie + "," + ID_Pracownik + "," + ID_Mieszkanie + ",");
        insert.append("'" + Data + "','" + Usterki + "','" + Uwagi + "'");
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Sprzatanie() {
        return ID_Sprzatanie;
    }

    public void setID_Sprzatanie(int ID_Sprzatanie) {
        this.ID_Sprzatanie = ID_Sprzatanie;
    }

    public int getID_Pracownik() {
        return ID_Pracownik;
    }

    public void setID_Pracownik(int ID_Pracownik) {
        this.ID_Pracownik = ID_Pracownik;
    }

    public int getID_Mieszkanie() {
        return ID_Mieszkanie;
    }

    public void setID_Mieszkanie(int ID_Mieszkanie) {
        this.ID_Mieszkanie = ID_Mieszkanie;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getUsterki() {
        return Usterki;
    }

    public void setUsterki(String usterki) {
        Usterki = usterki;
    }

    public String getUwagi() {
        return Uwagi;
    }

    public void setUwagi(String uwagi) {
        Uwagi = uwagi;
    }
}
