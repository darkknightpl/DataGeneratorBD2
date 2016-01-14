package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class PokojMieszkanie
{
    private int ID_Pokoj;
    private int Nr_Pokoju;
    private double Czynsz;
    private int ID_Mieszkanie;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO POKOJ_MIESZKANIE VALUES(");
        insert.append(ID_Pokoj + "," + Nr_Pokoju + "," + Czynsz + "," + ID_Mieszkanie);
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

    public int getID_Mieszkanie() {
        return ID_Mieszkanie;
    }

    public void setID_Mieszkanie(int ID_Mieszkanie) {
        this.ID_Mieszkanie = ID_Mieszkanie;
    }
}
