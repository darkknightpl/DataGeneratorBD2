package com.generator;

/**
 * Created by Marcin on 2016-01-09.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Generator
{
    public final static int liczbaWynajmow = 3500;
    public final static int liczbaFaktur = liczbaWynajmow;

    public final static int liczbaMieszkan = 100;
    public final static int liczbaAkademikow = 10;
    public final static int liczbaPokojowAkademik = liczbaAkademikow * 1000;
    public final static int liczbaPokojeMieszkanie = liczbaMieszkan * 5;

    public final static int liczbaSprzataczek = 20;
    public final static int liczbaTechnicznych = 20;
    public final static int liczbaKierownikow = 10;
    public final static int liczbaDyrektorow = 1;
    public final static int liczbaPracownikow = liczbaDyrektorow + liczbaKierownikow + liczbaTechnicznych + liczbaSprzataczek;

    public final static int liczbaStudentow = 4000;
    public final static int liczbaSprzatan = 400;
    public final static int liczbaKontrolii = 100;
    public final static int liczbaUczelni = 2;
    public final static int liczbaWydzialow = 40;
    public final static int liczbaKierunkow = liczbaWydzialow*20;

    public final static int liczbaAdresow = liczbaMieszkan + liczbaAkademikow + liczbaPracownikow + liczbaStudentow + liczbaWydzialow + liczbaUczelni;


    private String[] imiona;
    private String[] nazwiska;

    public static void main(String[] args)
    {

        Generator generator = new Generator();
        System.out.println("Generator danych");

//        generator.wczytajImionaNazwiska();
//        generator.generujAdresy();
//        generator.generujWydzialy();
//        generator.generujKierunki();
//        generator.generujOpiekunow();
//        generator.generujStudentow();
//        generator.generujKrewnych();
//        generator.generujPracownikow();
//        generator.generujAkademiki();
//        generator.generujMieszkania();
//        generator.generujPokojeAkademik();
//        generator.generujPokojeMieszkanie();
//        generator.generujWynajmy();
//        generator.generujFaktury();
//        generator.generujSprzatania();
        generator.generujKontrole();

        System.out.println("Koniec.");
    }



    public void generujSprzatania()
    {
        PrintWriter outFile = openFile("sprzatania inserts.txt");;
        Random rand = new Random();
        Sprzatanie sprzatanie = new Sprzatanie();

        for(int j = 0; j < 4; j++)
        {
            if(j == 0)
                sprzatanie.setData("2015-10-31");
            else if (j == 1)
                sprzatanie.setData("2015-11-28");
            else if (j == 2)
                sprzatanie.setData("2015-12-19");
            else
                sprzatanie.setData("2016-01-23");
            for (int i = 1; i <= liczbaMieszkan; i++)
            {
                sprzatanie.setID_Sprzatanie(i);
                sprzatanie.setID_Pracownik(32 + rand.nextInt(20));
                sprzatanie.setID_Mieszkanie(i);
                sprzatanie.setUsterki("brak");
                sprzatanie.setUwagi("brak");
                outFile.println(sprzatanie.toString());
            }
        }
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

        for(int i = 1; i <= liczbaFaktur; i++)
        {
            faktura.setID_Faktura(i);
            faktura.setID_Wynajem(i);
            faktura.setSemestr(1);
            faktura.setKwota(321.12);
            faktura.setOplacona('T');
            if(i%100 == 0)
                faktura.setData_Upomnienia1("2015-12-01");
            else
                faktura.setData_Upomnienia1("NULL");
            faktura.setData_Upomnienia2("NULL");
            outFile.println(faktura.toString());
        }

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

        for(int i = 1; i <= liczbaWynajmow; i++)
        {
            wynajem.setID_Wynajem(i);
            wynajem.setOkres_Najmu(2);
            wynajem.setID_Student(i);
            wynajem.setID_Pokoj(i);
            wynajem.setData_Opuszczenia("2016-08-31");
            outFile.println(wynajem.toString());
            outFile.println(Student.toStringUpdate(i,i));
        }
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

        for(int i = 1 + liczbaPokojowAkademik; i <= liczbaPokojeMieszkanie + liczbaPokojowAkademik; i++)
        {
            pokojMieszkanie.setID_Pokoj(i);
            int nrPokoju = i % 5; if(nrPokoju == 0) nrPokoju = 5;
            pokojMieszkanie.setNr_Pokoju(nrPokoju);
            pokojMieszkanie.setCzynsz(432.12);
            int nrMieszkania = i/5 + 1; if(nrPokoju == 5) nrMieszkania--;
            pokojMieszkanie.setID_Mieszkanie(nrMieszkania);
            outFile.println(pokojMieszkanie.toString());
        }

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

        for(int i = 1; i <= liczbaPokojowAkademik; i++)
        {
            pokojAkademik.setID_Pokoj(i);
            int nrPokoju = i % 1000; if(nrPokoju == 0) nrPokoju = 1000;
            pokojAkademik.setNr_Pokoju(nrPokoju);
            pokojAkademik.setCzynsz(321.12);
            int nrAkademika = i/1000 + 1; if(nrPokoju == 1000) nrAkademika--;
            pokojAkademik.setID_Akademik(nrAkademika);
            pokojAkademik.setNr_Pietra(nrPokoju/100);
            pokojAkademik.setNr_Wewnetrzny("48" + "123456789");
            pokojAkademik.setData_Remontu(generujDate(2012,2015));
            pokojAkademik.setStan_Wyposazenia("bardzo dobry");
            outFile.println(pokojAkademik.toString());
        }

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

        for(int i = 1; i<=liczbaMieszkan; i++)
        {
            mieszkanie.setID_Mieszkanie(i);
            mieszkanie.setID_Adres(liczbaUczelni + liczbaWydzialow + liczbaStudentow + liczbaPracownikow + liczbaAkademikow + i);
            mieszkanie.setLiczba_Pokoi(5);
            mieszkanie.setStan_Wyposazenia("bardzo dobry");
            mieszkanie.setData_Remontu(generujDate(2012,2015));
            outFile.println(mieszkanie.toString());
        }

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

        for(int i = 1; i<=liczbaAkademikow; i++)
        {
            akademik.setID_Akademik(i);
            akademik.setNazwa("Alcatraz No." + i);
            akademik.setID_Adres(liczbaUczelni + liczbaWydzialow + liczbaStudentow + liczbaPracownikow + i);
            akademik.setNr_Recepcji("48" + "123456789");
            akademik.setNr_Dyrektor("48" + "123456789");
            akademik.setID_Dyrektor(i+1); //kolejni kierownicy
            outFile.println(akademik.toString());
        }

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

        for(int i = 1; i <= liczbaPracownikow; i++)
        {
            pracownik.setID_Pracownik(i);
            pracownik.setImie(imiona[rand.nextInt(imiona.length)]);
            pracownik.setNazwisko(nazwiska[rand.nextInt(nazwiska.length)]);
            pracownik.setID_Adres(liczbaUczelni + liczbaWydzialow + liczbaStudentow + i);
            if(i == 1)
                pracownik.setID_Stanowisko(1); //dyrektor
            else if(i <= 11)
                pracownik.setID_Stanowisko(2); //kierownik
            else if(i <= 31)
                pracownik.setID_Stanowisko(3); //techniczny
            else
                pracownik.setID_Stanowisko(4); //sprzataczka
            pracownik.setNr_Telefonu("48" + "123456789");
            pracownik.setAdres_Email(pracownik.getImie() + "." + pracownik.getNazwisko() + "@m.pl");
            pracownik.setData_Urodzenia(generujDate(1978,1990));
            if(i%2==0) pracownik.setPlec('M'); else pracownik.setPlec('K');
            if(i == 1)
                pracownik.setID_Miejsce_Pracy(1);//biuro -> dyrektor
            else
                pracownik.setID_Miejsce_Pracy(2);//akademik -> reszta
            pracownik.setID_Przelozony(1);//jeden dyrektor biura mieszkaniowego
            outFile.println(pracownik.toString());
        }

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
        for (int i = 1; i <= liczbaWydzialow; i++)
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
        for(int i = 1; i <= liczbaAdresow; i++)
        {
            Adres adres = new Adres();
            adres.setID_Adres(i); //
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

    public void generujKontrole()
    {
        PrintWriter outFile = openFile("kontrole inserts.txt");;
        Random rand = new Random();
        KontrolaMieszkan kontrolaMieszkan = new KontrolaMieszkan();

        for(int i = 1; i <= liczbaKontrolii; i++)
        {
            kontrolaMieszkan.setID_Kontrola(i);
            kontrolaMieszkan.setID_Mieszkanie(i);
            kontrolaMieszkan.setID_Pracownik(12 + rand.nextInt(20));
            kontrolaMieszkan.setData("2015-11-28");
            kontrolaMieszkan.setID_Mieszkanie(i);
            kontrolaMieszkan.setOcena("bardzo dobra");
            kontrolaMieszkan.setUwagi("brak");
            outFile.println(kontrolaMieszkan.toString());
        }

        outFile.flush();
        outFile.close();
        System.out.println("Wygenerowano kontrole.");
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

