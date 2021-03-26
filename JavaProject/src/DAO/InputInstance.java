package DAO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import entity.Tabuleiro3_3;

public class InputInstance {

    public static Tabuleiro3_3 getInstance(String file) {

        Tabuleiro3_3 tabuleiro = null;

        InputStream is;
        InputStreamReader isr;
        BufferedReader br;

        try {

            is = new FileInputStream(file);
            isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            br = new BufferedReader(isr);
            String line;

            int tabulareiroType = Integer.parseInt(br.readLine());

            if(tabulareiroType == 3){
                int[][] lampadas = new int[Tabuleiro3_3.N][Tabuleiro3_3.N];
                for(int i = 0; i< Tabuleiro3_3.N; i++) {
                    line = br.readLine();
                    String[] valores = line.split(" ");
                    for(int j = 0; j< Tabuleiro3_3.N; j++) {
                        lampadas[i][j] = Integer.parseInt(valores[j]);
                    }
                }
                tabuleiro = new Tabuleiro3_3(lampadas);
            }else
            {
                System.out.println("Em breve novo tabuleiro");
            }


        }catch(IOException e) {
            e.printStackTrace();
        }

        return tabuleiro;


    }

}