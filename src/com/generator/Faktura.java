package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class Faktura
{
    private int ID_Faktura;
    private int ID_Wynajem;
    private int Semestr; //NUMBER(1)
    private double Kwota; //NUMBER(6,2)
    private char Oplacona; //CHAR
    private String Data_Upomnienia1;
    private String Data_Upomnienia2;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO FAKTURA VALUES(");
        insert.append(ID_Faktura + "," + ID_Wynajem + "," + Semestr + "," + Kwota + ",");
        insert.append("'" + Oplacona + "',");

        if(Data_Upomnienia1.equals("NULL"))
            insert.append(Data_Upomnienia1 + ",");
        else
            insert.append("'" + Data_Upomnienia1 + "',");

        if(Data_Upomnienia2.equals("NULL"))
            insert.append(Data_Upomnienia2);
        else
            insert.append("'" + Data_Upomnienia1 + "'");

        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Faktura() {
        return ID_Faktura;
    }

    public void setID_Faktura(int ID_Faktura) {
        this.ID_Faktura = ID_Faktura;
    }

    public int getID_Wynajem() {
        return ID_Wynajem;
    }

    public void setID_Wynajem(int ID_Wynajem) {
        this.ID_Wynajem = ID_Wynajem;
    }

    public int getSemestr() {
        return Semestr;
    }

    public void setSemestr(int semestr) {
        Semestr = semestr;
    }

    public double getKwota() {
        return Kwota;
    }

    public void setKwota(double kwota) {
        Kwota = kwota;
    }

    public char getOplacona() {
        return Oplacona;
    }

    public void setOplacona(char oplacona) {
        Oplacona = oplacona;
    }

    public String getData_Upomnienia1() {
        return Data_Upomnienia1;
    }

    public void setData_Upomnienia1(String data_Upomnienia1) {
        Data_Upomnienia1 = data_Upomnienia1;
    }

    public String getData_Upomnienia2() {
        return Data_Upomnienia2;
    }

    public void setData_Upomnienia2(String data_Upomnienia2) {
        Data_Upomnienia2 = data_Upomnienia2;
    }
}
