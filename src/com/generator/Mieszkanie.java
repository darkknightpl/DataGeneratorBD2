package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class Mieszkanie
{
    private int ID_Mieszkanie;
    private int ID_Adres;
    private int Liczba_Pokoi;
    private String Stan_Wyposazenia;
    private String Data_Remontu;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO MIESZKANIE VALUES(");
        insert.append(ID_Mieszkanie + "," + ID_Adres + "," + Liczba_Pokoi + ",'" + Stan_Wyposazenia + "',");
        insert.append("TO_DATE('" + Data_Remontu + "','YYYY-MM-DD')");
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Mieszkanie() {
        return ID_Mieszkanie;
    }

    public void setID_Mieszkanie(int ID_Mieszkanie) {
        this.ID_Mieszkanie = ID_Mieszkanie;
    }

    public int getID_Adres() {
        return ID_Adres;
    }

    public void setID_Adres(int ID_Adres) {
        this.ID_Adres = ID_Adres;
    }

    public int getLiczba_Pokoi() {
        return Liczba_Pokoi;
    }

    public void setLiczba_Pokoi(int liczba_Pokoi) {
        Liczba_Pokoi = liczba_Pokoi;
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
