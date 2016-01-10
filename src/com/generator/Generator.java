package com.generator;

/**
 * Created by Marcin on 2016-01-09.
 */

//założenia co do liczności
//uczelnie 2
//wydziały 40
//kierunki po 20 na wydział
//studenci 4000
//adresy 1000
//kraj Polska
//miasta 100

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;


public class Generator
{
    public final static int liczbaAdresow = 4000;
    private ArrayList<Adres> adresy;

    public Generator()
    {
        adresy = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        Generator generator = new Generator();
        System.out.println("Generator danych");

        generator.generujAdresy();
        generator.generujWydzialy();
        generator.generujKierunki();
        generator.generujOpiekunow();

        System.out.println("Koniec.");
    }

    public PrintWriter openFile(String name)
    {
        PrintWriter outFile = null;
        try
        {
            outFile = new PrintWriter(name);
        }
        catch (IOException e)
        {
            System.out.println("Error while opening file");
            e.printStackTrace();
            return null;
        }
        return outFile;
    }

    public void generujStudentow()
    {
        PrintWriter outFile = openFile("student inserts.txt");;
        Random rand = new Random();

        Student student = new Student();

        for(int i = 1; i<=4000; i++)
        {
            student.setID_Adres(42+i);
            student.setAdres_Email(student.getImie() + "." + student.getNazwisko() + "@m.edu.pl");
        }

        outFile.flush();
        outFile.close();

        System.out.println("Wygenerowano studentow.");
        return;
    }

    public String generujDateUrodzenia()
    {
        StringBuilder randomDate = new StringBuilder();
        Random rand = new Random();

        randomDate.append("'");
        int year = rand.nextInt(10) + 1985;
        randomDate.append(year);
        randomDate.append("-");

        int month = rand.nextInt(11) + 1;
        if(month < 10)
            randomDate.append("0" + month);
        else
            randomDate.append(month);
        randomDate.append("-");

        int day = rand.nextInt(27) + 1;
        if(day < 10)
            randomDate.append("0" + day);
        else
            randomDate.append(day);

        randomDate.append("'");
        String generatedDate = randomDate.toString();

        return generatedDate;
    }

    public void generujKierunki()
    {
        PrintWriter outFile = openFile("kierunki inserts.txt");;
        Random rand = new Random();

        Kierunek kierunek = new Kierunek();
        int key = 1;
        for (int i = 1; i <= 40; i++)
        {
            for(int j = 1; j <= 20; j++)
            {
                kierunek.setID_Kierunek(key);
                kierunek.setNazwa("Kierunek#" + j);
                kierunek.setID_Wydzial(i);
                key++;
                outFile.println(kierunek.toString());
            }
        }

        outFile.flush();
        outFile.close();

        System.out.println("Wygenerowano kierunki.");
        return;
    }

    public void generujOpiekunow()
    {
        PrintWriter outFile = openFile("opiekun inserts.txt");;
        Random rand = new Random();

       Opiekun opiekun = new Opiekun();
        int key = 1;
        for (int i = 1; i <= 80; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                opiekun.setID_Opiekun(key);
                opiekun.setImie("Imie_" + j);
                opiekun.setNazwisko("Nazwisko_" + j);
                opiekun.setID_Wydzial(i);
                opiekun.setNr_Pokoju(rand.nextInt(100));

                //StringBuilder nrTelefonu = new StringBuilder();
                //int phoneNumber = rand.nextInt(100);

                opiekun.setNr_Telefonu("48" + "123456789");
                opiekun.setAdres_Email(opiekun.getImie() + "." + opiekun.getNazwisko() + "@m.edu.pl");
                key++;
                outFile.println(opiekun.toString());
            }
        }

        outFile.flush();
        outFile.close();

        System.out.println("Wygenerowano opiekonow.");
        return;
    }

    public void generujWydzialy()
    {
        PrintWriter outFile = openFile("wydzialy inserts.txt");;
        Random rand = new Random();
        Wydzial wydzial = new Wydzial();

        for(int i = 1; i <= 40; i++)
        {
            wydzial.setID_Wydzial(i);
            wydzial.setNazwa("Wydzial#" + i);
            wydzial.setID_Adres(2+i);
            if(i<20) wydzial.setID_Uczelnia(1); else wydzial.setID_Uczelnia(2);

            outFile.println(wydzial.toString());
        }

        outFile.flush();
        outFile.close();

        System.out.println("Wygenerowano wydzialy.");
        return;
    }

    public void generujAdresy()
    {
        PrintWriter outFile = openFile("adresy inserts.txt");
        Random rand = new Random();
        for(int i = 0; i < liczbaAdresow; i++)
        {
            Adres adres = new Adres();
            adres.setID_Adres(i+1); //od 1
            adres.setUlica("Ulica#" + rand.nextInt(100));
            adres.setNumer_Domu(rand.nextInt(100));
            adres.setNumer_Mieszkania(rand.nextInt(100));
            adres.setMiasto("Miasto#" + rand.nextInt(100));
            adresy.add(adres);
            outFile.println(adres.toString());
        }

        outFile.flush();
        outFile.close();

        System.out.println("Wygenerowano adresy.");
        return;
    }

}//Generator

