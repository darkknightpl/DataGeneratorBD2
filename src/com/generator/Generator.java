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
        System.out.println("Hello World!");
        generator.generujAdresy();
        generator.generujWydzialy();
        generator.generujKierunki();
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

    public void generujWydzialy()
    {
        PrintWriter outFile = openFile("wydzialy inserts.txt");;
        Random rand = new Random();
        Wydzial wydzial = new Wydzial();

        for(int i = 1; i <= 40; i++)
        {
            wydzial.setID_Wydzial(i);
            wydzial.setNazwa("Wydzial#" + i);
            wydzial.setID_Adres(3+i);
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

