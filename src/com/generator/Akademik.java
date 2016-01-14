package com.generator;

/**
 * Created by Marcin on 2016-01-13.
 */
public class Akademik 
{
    private int ID_Akademik;
    private String Nazwa;
    private int ID_Adres;
    private String Nr_Recepcji; //NUMBER(11)
    private String Nr_Dyrektor; //NUMBER(11)
    private int ID_Dyrektor;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO AKADEMIK VALUES(");
        insert.append(ID_Akademik + ",'" + Nazwa + "'," + ID_Adres + "," + Nr_Recepcji + "," + Nr_Dyrektor + "," + ID_Dyrektor);
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Akademik() {
        return ID_Akademik;
    }

    public void setID_Akademik(int ID_Akademik) {
        this.ID_Akademik = ID_Akademik;
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

    public String getNr_Recepcji() {
        return Nr_Recepcji;
    }

    public void setNr_Recepcji(String nr_Recepcji) {
        Nr_Recepcji = nr_Recepcji;
    }

    public String getNr_Dyrektor() {
        return Nr_Dyrektor;
    }

    public void setNr_Dyrektor(String nr_Dyrektor) {
        Nr_Dyrektor = nr_Dyrektor;
    }

    public int getID_Dyrektor() {
        return ID_Dyrektor;
    }

    public void setID_Dyrektor(int ID_Dyrektor) {
        this.ID_Dyrektor = ID_Dyrektor;
    }
}
