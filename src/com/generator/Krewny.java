package com.generator;

/**
 * Created by Marcin on 2016-01-12.
 */
public class Krewny
{
    private int ID_Krewny;
    private String Imie;
    private String Nazwisko;
    private int ID_Student;
    private int ID_Adres;
    private String Nr_Telefonu; //NUMBER(11)
    private String Adres_Email; //VARCHAR2(30)

    @Override
    public String toString()
    {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO KREWNY VALUES(");
        insert.append(ID_Krewny + ",'" + Imie + "','" + Nazwisko + "'," + ID_Student + "," + ID_Adres + "," + Nr_Telefonu + ",");
        insert.append("'" + Adres_Email + "'");
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public int getID_Krewny() {
        return ID_Krewny;
    }

    public void setID_Krewny(int ID_Krewny) {
        this.ID_Krewny = ID_Krewny;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getID_Adres() {
        return ID_Adres;
    }

    public void setID_Adres(int ID_Adres) {
        this.ID_Adres = ID_Adres;
    }

    public int getID_Student() {
        return ID_Student;
    }

    public void setID_Student(int ID_Student) {
        this.ID_Student = ID_Student;
    }

    public String getNr_Telefonu() {
        return Nr_Telefonu;
    }

    public void setNr_Telefonu(String nr_Telefonu) {
        Nr_Telefonu = nr_Telefonu;
    }

    public String getAdres_Email() {
        return Adres_Email;
    }

    public void setAdres_Email(String adres_Email) {
        Adres_Email = adres_Email;
    }
}
