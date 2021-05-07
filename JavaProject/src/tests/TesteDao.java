package tests;
import DAO.InputInstance;
import entity.Tabuleiro;

public class TesteDao {

    public static void main(String[] args) {
        Tabuleiro t = InputInstance.getInstance("files/inst_4_0178.in");

        System.out.println(t);
    }
}

