package tests;
import DAO.InputInstance;
import entity.Tabuleiro;

public class TesteDao {

    public static void main(String[] args) {
        Tabuleiro t = InputInstance.getInstance("files/inst_4_0039.res");

        System.out.println(t);
    }
}

