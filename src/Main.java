import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();

        mtd.inserirProd("p1","parafusos",3,Date.valueOf("2020-12-27"));
        mtd.inserirProd("p2","cravos",4,Date.valueOf("2020-04-06"));
        mtd.inserirProd("p3","tachas",6,Date.valueOf("2020-07-06"));

        mtd.listaProd();
        mtd.actualizaPre("p2",8);
        mtd.eliminaProduto("p3");






    }
}