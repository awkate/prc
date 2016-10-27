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

                System.out.println("接続成功");

                //データベースを切断
                con.close();

            } catch (Exception e) {
                System.out.println("例外発生：" + e);
            }
        }
}
