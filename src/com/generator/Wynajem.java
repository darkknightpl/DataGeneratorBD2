package com.generator;

/**
 * Created by Marcin on 2016-01-14.
 */
public class Wynajem
{
    private int ID_Wynajem;
    private int Okres_Najmu; //NUMBER(1)
    private int ID_Student;
    private int ID_Pokoj;
    private String Data_Opuszczenia;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO SPRZATANIE VALUES(");
        insert.append(ID_Wynajem + "," + Okres_Najmu + "," + ID_Student + "," + ID_Pokoj + ",'" + Data_Opuszczenia + "'");
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Wynajem() {
        return ID_Wynajem;
    }

    public void setID_Wynajem(int ID_Wynajem) {
        this.ID_Wynajem = ID_Wynajem;
    }

    public int getOkres_Najmu() {
        return Okres_Najmu;
    }

    public void setOkres_Najmu(int okres_Najmu) {
        Okres_Najmu = okres_Najmu;
    }

    public int getID_Student() {
        return ID_Student;
    }

    public void setID_Student(int ID_Student) {
        this.ID_Student = ID_Student;
    }

    public int getID_Pokoj() {
        return ID_Pokoj;
    }

    public void setID_Pokoj(int ID_Pokoj) {
        this.ID_Pokoj = ID_Pokoj;
    }

    public String getData_Opuszczenia() {
        return Data_Opuszczenia;
    }

    public void setData_Opuszczenia(String data_Opuszczenia) {
        Data_Opuszczenia = data_Opuszczenia;
    }
}
