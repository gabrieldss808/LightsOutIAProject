package DAO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import entity.Tabuleiro;

public class InputInstance {

    public static Tabuleiro getInstance(String file) {

        Tabuleiro tabuleiro = null;

        InputStream is;
        InputStreamReader isr;
        BufferedReader br;

        try {

            is = new FileInputStream(file);
            isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            br = new BufferedReader(isr);
            String line;

            int TabuleiroType = Integer.parseInt(br.readLine());

            int[][] lampadas = new int[TabuleiroType][TabuleiroType];
            for(int i = 0; i< TabuleiroType; i++) {
                line = br.readLine();
                String[] valores = line.split(" ");
                for(int j = 0; j< TabuleiroType; j++) {
                    lampadas[i][j] = Integer.parseInt(valores[j]);
                }
            }
            tabuleiro = new Tabuleiro(lampadas,TabuleiroType);

        }catch(IOException e) {
            e.printStackTrace();
        }

        return tabuleiro;


    }

}