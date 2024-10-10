import java.sql.*;
import java.time.LocalDate;

public class Metodos{

    String driver = "jdbc:postgresql:";
    String host = "//localhost:"; // tamen poderia ser una ip como "192.168.1.14"
    String porto = "5432";
    String sid = "postgres";
    String usuario = "postgres";
    String password = "postgres";
    String url = driver + host+ porto + "/" + sid;
    Connection conn;


    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void inserirProd(String cod, String desc, int prezo, LocalDate data) {
        String command = "INSERT INTO produtos(codigo, descricion,prezo, datac) VALUES(?,?,?,?)";
        try {
            Connection conn = DriverManager.getConnection(url,usuario,password);
            PreparedStatement ps = conn.prepareStatement(command);
            ps.setString(1,cod);
            ps.setString(2,desc);
            ps.setInt(3,prezo);
            ps.setDate(4,Date.valueOf(data));

            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void listaProd(){
        String command = "SELECT * from produtos";
        String cod = null;
        String desc = null;
        int prezo = 0;
        Date date = null;
        try{
            Connection conn = DriverManager.getConnection(url,usuario,password);
            PreparedStatement ps = conn.prepareStatement(command);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            cod = rs.getString(1);
            desc = rs.getString(2);
            prezo = rs.getInt(3);
            date = rs.getDate(4);

            System.out.println(cod + " " + desc + " " + prezo + " " + date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void

}
