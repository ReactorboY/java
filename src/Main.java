import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `user`");
            Getter obj = new Getter();
            Scanner sc = new Scanner(System.in);
            System.out.println("Use 1 to insert & 2 to retrieve data ");
            int a = sc.nextInt();
            if (a == 1){
                obj.setId(sc.nextInt());
                obj.setName(sc.next());
                obj.setType(sc.next());
                obj.setPrice(sc.nextInt());
                obj.setQuantity(sc.nextInt());
                PreparedStatement statement = conn.prepareStatement("insert into user (`id`, `name`, `type`, `price`, `quantity`) values (?,?,?,?,?)");
                statement.setInt(1, obj.getId());
                statement.setString(2, obj.getName());
                statement.setString(3, obj.getType());
                statement.setInt(4, obj.getPrice());
                statement.setInt(5, obj.getQuantity());
                statement.executeUpdate();
            }
                while(rs.next()){
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getInt(4));
                    System.out.println(rs.getInt(5));
                    System.out.println("Total Price "+rs.getInt(5)*rs.getInt(4));
                }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
