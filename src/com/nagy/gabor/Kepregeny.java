package com.nagy.gabor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kepregeny {
    public static ArrayList<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String faljnev) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(faljnev));
        String egysor = br.readLine();
        while (egysor != null){
            String [] szo = egysor.split(" ");
        }
    }
}
