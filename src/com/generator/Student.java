package com.generator;

/**
 * Created by Marcin on 2016-01-10.
 */
public class Student
{
    private int ID_Student;
    private String Imie;
    private String Nazwisko;
    private int ID_Adres;
    private String Data_Urodzenia; //DATE
    private char Plec;// CHAR
    private int ID_Typ_Studiow;
    private int ID_Tryb_Studiow;
    private String Narodowosc;
    private char Palacz; //CHAR
    private String Nr_Telefonu; //NUMBER(11)
    private String Adres_Email;
    private String Wymagania;
    private String Status_Przydzialu;
    private int ID_Kierunek;
    private String Data_Rozpoczecia; //DATE
    private String Data_Zakonczenia; //DATE
    private int ID_Opiekun;
    private int ID_Wynajem;

    private int rokUrodzenia;
    private int rokRozpoczecia;

    @Override
    public String toString() {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO STUDENT VALUES(");
        insert.append(ID_Student + ",'" + Imie + "','" + Nazwisko + "'," + ID_Adres + ",'" + Data_Urodzenia + "',");
        insert.append("'" + Plec +"'," + ID_Typ_Studiow + "," + ID_Tryb_Studiow + ",'" + Narodowosc + "','" + Palacz + "',");
        insert.append("'" + Nr_Telefonu + "','" + Adres_Email + "','" + Wymagania + "','" + Status_Przydzialu + "',");
        insert.append(ID_Kierunek + ",'" + Data_Rozpoczecia + "','" + Data_Zakonczenia + "'," + ID_Opiekun + "," + "NULL");
        insert.append(");");
        String output = insert.toString();
        return output;
    }

    public static String toStringUpdate(int idStudent, int idWynajem)
    {
        StringBuilder insert = new StringBuilder();
        insert.append("UPDATE STUDENT SET ID_Wynajem = " + idWynajem);
        insert.append("WHERE ID_Student = " + idStudent + ";");
        String output = insert.toString();
        return output;
    }

    public int getID_Student() {
        return ID_Student;
    }

    public void setID_Student(int ID_Student) {
        this.ID_Student = ID_Student;
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

    public String getData_Urodzenia() {
        return Data_Urodzenia;
    }

    public void setData_Urodzenia(String data_Urodzenia) {
        Data_Urodzenia = data_Urodzenia;
        rokUrodzenia = Integer.parseInt(data_Urodzenia.substring(0,4));
        rokRozpoczecia = 19 + rokUrodzenia;
    }

    public char getPlec() {
        return Plec;
    }

    public void setPlec(char plec) {
        Plec = plec;
    }

    public int getID_Typ_Studiow() {
        return ID_Typ_Studiow;
    }

    public void setID_Typ_Studiow(int ID_Typ_Studiow) {
        this.ID_Typ_Studiow = ID_Typ_Studiow;
    }

    public int getID_Tryb_Studiow() {
        return ID_Tryb_Studiow;
    }

    public void setID_Tryb_Studiow(int ID_Tryb_Studiow) {
        this.ID_Tryb_Studiow = ID_Tryb_Studiow;
    }

    public String getNarodowosc() {
        return Narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        Narodowosc = narodowosc;
    }

    public char getPalacz() {
        return Palacz;
    }

    public void setPalacz(char palacz) {
        Palacz = palacz;
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

    public String getWymagania() {
        return Wymagania;
    }

    public void setWymagania(String wymagania) {
        Wymagania = wymagania;
    }

    public String getStatus_Przydzialu() {
        return Status_Przydzialu;
    }

    public void setStatus_Przydzialu(String status_Przydzialu) {
        Status_Przydzialu = status_Przydzialu;
    }

    public int getID_Kierunek() {
        return ID_Kierunek;
    }

    public void setID_Kierunek(int ID_Kierunek) {
        this.ID_Kierunek = ID_Kierunek;
    }

    public String getData_Rozpoczecia() {
        return Data_Rozpoczecia;
    }

    public void setData_Rozpoczecia(String data_Rozpoczecia) {
        Data_Rozpoczecia = data_Rozpoczecia;
    }

    public String getData_Zakonczenia() {
        return Data_Zakonczenia;
    }

    public void setData_Zakonczenia(String data_Zakonczenia) {
        Data_Zakonczenia = data_Zakonczenia;
    }

    public int getID_Opiekun() {
        return ID_Opiekun;
    }

    public void setID_Opiekun(int ID_Opiekun) {
        this.ID_Opiekun = ID_Opiekun;
    }

    public int getID_Wynajem() {
        return ID_Wynajem;
    }

    public void setID_Wynajem(int ID_Wynajem) {
        this.ID_Wynajem = ID_Wynajem;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getRokRozpoczecia() {
        return rokRozpoczecia;
    }

    public void setRokRozpoczecia(int rokRozpoczecia) {
        this.rokRozpoczecia = rokRozpoczecia;
    }
}
