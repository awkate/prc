import java.sql.*;

class PreSelecte {
    public static void main(String args[]) {
        try {
            //JDBCドライバのロード
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //各設定
            String url = "jdbc:odbc:SampleDB030";
            String user = "";
            String pass = "";
            //データベースに接続
            Connection con = DriverManager.getConnection(url,user,pass);
            //ステートメントオブジェクトを作成
            Statement stmt = con.createStatement();

            //SQL文作成
            String mySql = "select * from T01Prefecture order by PREF_CD";
            //検索するSQL実行
            ResultSet rs = stmt.executeQuery(mySql);

            System.out.println();
            System.out.println("PREF_CD PREF_NAME");
            System.out.println("--------------------");

            //結果セットからデータを取り出す next()で次の行に移動
            while(rs.next()) {
                int prefCd = rs.getInt("PREF_CD");
                String prefName = rs.getString("PREF_NAME");
                System.out.print(prefCd + "\t");
                System.out.println(prefName + "\t");
            }

            System.out.println("--------------------");

            //オブジェクトを解放
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("例外発生：" + e );
        }
    }
}