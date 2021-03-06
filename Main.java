import java.io.*;

public class Main {

  public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < rozmiar; i++) {
      System.out.println("Podaj liczbe: ");
      tablica[i] = Integer.parseInt(in.readLine());
    }
  }

  public static void wypisz_tablice(int[] tablica, int rozmiar) {
    for (int i = 0; i < rozmiar; i++)
      System.out.println("tablica[" + i + "] = " + tablica[i]);
  }

  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int r;
      System.out.println("Podaj rozmiar: ");
      r = Integer.parseInt(in.readLine());
      int[] t = new int[r];
      wczytaj_tablice(t, r);

      System.out.println("Podales nastepujace liczby:");
      wypisz_tablice(t, r);

    } catch (IOException e) {
    }
  }
}

/*
 * Cwiczenia: 1. Zamiast wczytywac elementy tablicy, wylosuj je z przedzialu od
 * 0 do 100, a nastepnie do wartosci podanej przez uzytkownika. 2. Zamiast
 * wczytywac elementy tablicy, wypelnij ja kolejnymi liczbami calkowitymi,
 * kolejnymi potegami dwojki itp.
 */
