package sample100;
import java.sql.*;
/**
 * Created by kei.watanabe on 2016/10/25.
 */
    class DbConnect {
        public static void main(String args[]) {
            try {
                //JDBCドライバのロード
                Class.forName("com.mysql.jdbc.Driver");
                //各設定
                String url = "jdbc:mysql://localhost:3306/mini_blog";
                String user = "root";
                String pass = "";

                //データベースに接続
                Connection con = DriverManager.getConnection(url,user,pass);

                Statement stmt = con.createStatement();

                String Sql1 = "select * from `user`";

                ResultSet rs = stmt.executeQuery(Sql1);

                System.out.println("-----------------------------");

                while(rs.next()) {
                    String UserName = rs.getString("user_name");
                    String PassWord = rs.getString("password");
                    String created_at = rs.getString("created_at");
                    System.out.print(UserName + "\t");
                    System.out.println(PassWord + "\t");
                    System.out.println(created_at + "\t");
                }

                System.out.println("-----------------------------");

                System.out.println("接続成功");




                //データベースを切断
                con.close();

            } catch (Exception e) {
                System.out.println("例外発生：" + e);
            }
        }
}
