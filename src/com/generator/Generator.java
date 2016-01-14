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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Generator
{

    //public final static int liczbaMieszkan = 50; //? przykladowo
    //public final static int liczbaAkademikow = 6; //? przykladowo
   // public final static int liczbaPracownikow = 100; //? przykladowo
    public final static int liczbaStudentow = 4000;
    public final static int liczbaUczelni = 2;
    public final static int liczbaWydzialow = 40;
    public final static int liczbaKierunkow = liczbaWydzialow*20;
    public final static int liczbaAdresow = liczbaStudentow + liczbaWydzialow + liczbaUczelni; 


    private String[] imiona;
    private String[] nazwiska;

    public static void main(String[] args)
    {
        Generator generator = new Generator();
        System.out.println("Generator danych");
        generator.wczytajImionaNazwiska();
        generator.generujAdresy();
        generator.generujWydzialy();
        generator.generujKierunki();
        generator.generujOpiekunow();
        generator.generujStudentow();
        generator.generujKrewnych();

        //dalsze generowanie
        //mozna zmienic kolejnosc, w zaleznosci od potrzeb
        generator.generujPracownikow();
        generator.generujAkademiki();
        generator.generujMieszkania();
        generator.generujPokojeAkademik();
        generator.generujPokojeMieszkanie();
        generator.generujWynajmy();
        generator.generujFaktury();
        generator.generujSprzatania();
        generator.generujKontrole();

        System.out.println("Koniec.");
    }

    public void generujKontrole()
    {
        PrintWriter outFile = openFile("kontrole inserts.txt");;
        Random rand = new Random();
        KontrolaMieszkan kontrolaMieszkan = new KontrolaMieszkan();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano kontrole.");
        return;
    }

    public void generujSprzatania()
    {
        PrintWriter outFile = openFile("sprzatania inserts.txt");;
        Random rand = new Random();
        Sprzatanie sprzatanie = new Sprzatanie();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano sprzatania.");
        return;
    }

    public void generujFaktury()
    {
        PrintWriter outFile = openFile("faktury inserts.txt");;
        Random rand = new Random();
        Faktura faktura = new Faktura();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano faktury.");
        return;
    }

    public void generujWynajmy()
    {
        PrintWriter outFile = openFile("wynajem inserts.txt");;
        Random rand = new Random();
        Wynajem wynajem = new Wynajem();

        // TODO: 2016-01-13
        // student.toStringUpdate(idStudena, idWynajmu) - generuje UPDATE
        // mozna dodawac do pliku txt na przemian insert/update itd

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano wynajmy.");
        return;
    }

    public void generujPokojeMieszkanie()
    {
        PrintWriter outFile = openFile("pokoje mieszkanie inserts.txt");;
        Random rand = new Random();
        PokojMieszkanie pokojMieszkanie = new PokojMieszkanie();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano pokoje mieszkanie.");
        return;
    }

    public void generujPokojeAkademik()
    {
        PrintWriter outFile = openFile("pokoje akademik inserts.txt");;
        Random rand = new Random();
        PokojAkademik pokojAkademik = new PokojAkademik();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano pokoje akademik.");
        return;
    }

    public void generujMieszkania()
    {
        PrintWriter outFile = openFile("mieszkania inserts.txt");;
        Random rand = new Random();
        Mieszkanie mieszkanie = new Mieszkanie();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano mieszkania.");
        return;
    }

    public void generujAkademiki()
    {
        PrintWriter outFile = openFile("akademik inserts.txt");;
        Random rand = new Random();
        Akademik akademik = new Akademik();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano akademiki.");
        return;
    }

    public void generujPracownikow()
    {
        PrintWriter outFile = openFile("pracownik inserts.txt");;
        Random rand = new Random();
        Pracownik pracownik = new Pracownik();

        // TODO: 2016-01-13

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano pracownikow.");
        return;
    }

    public void generujKrewnych()
    {
        PrintWriter outFile = openFile("krewny inserts.txt");;
        Random rand = new Random();
        Krewny krewny = new Krewny();

        for(int i = 1; i<=liczbaStudentow; i++)
        {
            krewny.setID_Krewny(i);
            krewny.setImie(imiona[rand.nextInt(imiona.length)]);
            krewny.setNazwisko(nazwiska[rand.nextInt(nazwiska.length)]);
            krewny.setID_Student(i);
            krewny.setID_Adres(liczbaUczelni + liczbaWydzialow + i); // liczbaUczelni + liczbaWydzialow -> offset
            krewny.setNr_Telefonu("48" + "123456789");
            krewny.setAdres_Email(krewny.getImie() + "." + krewny.getNazwisko() + "@m.pl");
            outFile.println(krewny.toString());
        }
        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano krewnych.");
        return;
    }

    public void generujStudentow()
    {
        PrintWriter outFile = openFile("student inserts.txt");;
        Random rand = new Random();
        Student student = new Student();

        for(int i = 1; i<=liczbaStudentow; i++)
        {
            student.setID_Student(i);
            student.setImie(imiona[rand.nextInt(imiona.length)]);
            student.setNazwisko(nazwiska[rand.nextInt(nazwiska.length)]);
            student.setID_Adres(liczbaUczelni + liczbaWydzialow + i); // liczbaUczelni + liczbaWydzialow -> offset
            student.setData_Urodzenia(generujDate(1988,1996));
            if(i%2==0) student.setPlec('M'); else student.setPlec('K');
            student.setID_Typ_Studiow(rand.nextInt(2) + 1);
            student.setID_Tryb_Studiow(rand.nextInt(1) + 1);
            student.setNarodowosc("Polska");
            if(i%10==0) student.setPalacz('T'); else student.setPalacz('N');
            student.setNr_Telefonu("48" + "123456789");
            student.setAdres_Email(student.getImie() + "." + student.getNazwisko() + "@m.edu.pl");
            student.setWymagania("Brak specjalnych wymagan");
            student.setStatus_Przydzialu("oczekujacy");
            student.setID_Kierunek(rand.nextInt(799) + 1);
            student.setData_Rozpoczecia(generujDate(student.getRokRozpoczecia(),student.getRokRozpoczecia()));
            student.setData_Zakonczenia(generujDate(student.getRokRozpoczecia()+5,student.getRokRozpoczecia()+5));
            student.setID_Opiekun(rand.nextInt(799)+1);//1-800

            outFile.println(student.toString());
        }
        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano studentow.");
        return;
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
            wydzial.setID_Adres(liczbaUczelni + i);
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
            //adresy.add(adres);
            outFile.println(adres.toString());
        }

        outFile.flush();
        outFile.close();

        System.out.println("Wygenerowano adresy.");
        return;
    }

    public static String generujDate(int rokMin, int rokMax)
    {
        StringBuilder randomDate = new StringBuilder();
        Random rand = new Random();

        int delta = rokMax - rokMin;
        //randomDate.append("'");
        int year = rand.nextInt(delta + 1) + rokMin;
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

        //randomDate.append("'");
        String generatedDate = randomDate.toString();

        return generatedDate;
    }

    public PrintWriter openFile(String name)
    {
        PrintWriter outFile = null;
        try
        {
            outFile = new PrintWriter("inserts\\" + name);
        }
        catch (IOException e)
        {
            System.out.println("Error while opening file");
            e.printStackTrace();
            return null;
        }
        return outFile;
    }

    public void wczytajImionaNazwiska()
    {
        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();

        Scanner inFileFirstNames = null;
        try {
            inFileFirstNames = new Scanner(Paths.get("first names.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner inFileLastNames = null;
        try {
            inFileLastNames = new Scanner(Paths.get("last names.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(inFileFirstNames.hasNextLine())
            firstNames.add(inFileFirstNames.nextLine());

        imiona = new String[firstNames.size()];
        imiona = firstNames.toArray(imiona);

        while(inFileLastNames.hasNextLine())
            lastNames.add(inFileLastNames.nextLine());

        nazwiska = new String[lastNames.size()];
        nazwiska = lastNames.toArray(nazwiska);
    }

}//Generator

