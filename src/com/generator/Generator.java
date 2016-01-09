package com.generator;

/**
 * Created by Marcin on 2016-01-09.
 */

//założenia co do liczności
//uczelnie 1
//wydziały 20
//kierunki 80
//studenci 4000
//adresy 1000
//kraj Polska
//miasta 100

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Generator
{
    public final static int liczbaAdresow = 1000;
    private ArrayList<Adres> adresy;

    public Generator()
    {
        adresy = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        Generator generator = new Generator();
        System.out.println("Hello World!");
        generator.generateAddresses();
    }

    public void generateAddresses()
    {
        PrintWriter outFile = null;
        try
        {
            outFile = new PrintWriter("adresy inserts.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error while opening file");
            e.printStackTrace();
            return;
        }

        Random rand = new Random();

        for(int i = 1; i <= liczbaAdresow; i++)
        {
            Adres adres = new Adres();
            adres.setUlica("Ulica#" + rand.nextInt(100)+1);
            adres.setNumer_Domu(rand.nextInt(100)+1);
            adres.setNumer_Mieszkania(rand.nextInt(100)+1);
            adres.setMiasto("Miasto#" + rand.nextInt(100)+1);
            adresy.add(adres);
            outFile.println(adres.toString());
        }


        System.out.println("Wygenerowano adresy.");
        return;
    }

}//Generator

