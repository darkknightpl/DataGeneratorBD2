package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class KontrolaMieszkan
{
    private int ID_Kontrola;
    private int ID_Pracownik;
    private String Data;
    private int ID_Mieszkanie;
    private String Ocena; //VARCHAR2(15)
    private String Uwagi; //VARCHAR2

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO KONTROLA_MIESZKAN VALUES(");
        insert.append(ID_Kontrola + "," + ID_Pracownik + ",");
        insert.append("TO_DATE('" + Data + "','YYYY-MM-DD')," + ID_Mieszkanie + ",");
        insert.append("'" + Ocena + "','" + Uwagi + "'");
        insert.append(");");
        String output = insert.toString();
        return output;
    }


    public int getID_Kontrola() {
        return ID_Kontrola;
    }

    public void setID_Kontrola(int ID_Kontrola) {
        this.ID_Kontrola = ID_Kontrola;
    }

    public int getID_Pracownik() {
        return ID_Pracownik;
    }

    public void setID_Pracownik(int ID_Pracownik) {
        this.ID_Pracownik = ID_Pracownik;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public int getID_Mieszkanie() {
        return ID_Mieszkanie;
    }

    public void setID_Mieszkanie(int ID_Mieszkanie) {
        this.ID_Mieszkanie = ID_Mieszkanie;
    }

    public String getOcena() {
        return Ocena;
    }

    public void setOcena(String ocena) {
        Ocena = ocena;
    }

    public String getUwagi() {
        return Uwagi;
    }

    public void setUwagi(String uwagi) {
        Uwagi = uwagi;
    }
}
