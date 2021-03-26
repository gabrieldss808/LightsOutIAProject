package tests;
import DAO.InputInstance;
import entity.Tabuleiro3_3;

public class TesteDao {

    public static void main(String[] args) {
        Tabuleiro3_3 t = InputInstance.getInstance("files/inst_3_0003.in");

        System.out.println(t);
    }
}

