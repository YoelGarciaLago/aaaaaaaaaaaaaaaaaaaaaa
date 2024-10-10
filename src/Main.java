import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fecha = LocalDate.parse("27/12/2020", formatter);
//       // mtd.inserirProd("p1","parafusos",3,fecha);
//        fecha = LocalDate.parse("06/07/2020",formatter);
//        mtd.inserirProd("p2","cravos",4,fecha);
//        fecha = LocalDate.parse("03/05/2021",formatter);
//        mtd.inserirProd("p3","tachas",6,fecha);

        mtd.listaProd();






    }
}