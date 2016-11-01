package sample300;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class PrefFrame extends Frame implements ActionListener {
    Label lb1;
    TextArea txtar1;
    Button btn1, btn2, btn3;

    public PrefFrame(String title) {
        //フレームのタイトル
        setTitle(title);

        //ウィンドウを閉じる時
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //ラベル
        lb1 = new Label("ボタンをクリックしてください。", Label.CENTER);
        add(lb1, BorderLayout.NORTH);

        //テキストエリア
        txtar1 = new TextArea();
        add(txtar1, BorderLayout.CENTER);

        //パネル
        Panel pn1 = new Panel();
        pn1.setLayout(new GridLayout(1, 3));

        //ボタンの設定とパネルへ追加
        btn1 = new Button("表示");
        btn1.addActionListener(this);
        pn1.add(btn1);
        btn2 = new Button("クリア");
        btn2.addActionListener(this);
        pn1.add(btn2);
        btn3 = new Button("終了");
        btn3.addActionListener(this);
        pn1.add(btn3);

        //パネルを追加
        add(pn1, BorderLayout.SOUTH);
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == btn1) {
            prefDisplay();
        }else if (e.getSource() == btn2) {
            txtar1.setText("");
        }else {
            System.exit(0);
        }
    }

    private void prefDisplay () {
        StringBuffer temp  = new StringBuffer();
        ArrayList userinfo = new ArrayList();
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
                userinfo.add(rs.getString("user_name"));
                userinfo.add(rs.getString("password"));
                userinfo.add(rs.getString("created_at"));
            }

            System.out.println("-----------------------------");

            System.out.println("接続成功");

            //データベースを切断
            con.close();

        } catch (Exception e) {
            System.out.println("例外発生：" + e);
        }

        for (int i = 0; i < userinfo.size(); i++) {
            temp.append(userinfo.get(i) + "\t");
        }
        txtar1.setText(temp.toString());
    }

}


public class PrefTest {

    public static void main(String args[]) {
        PrefFrame frm = new PrefFrame("都道府県マスター");
        //フレームの設定
        frm.setLocation(300, 200);
        frm.setSize(250, 350);
        frm.setBackground(Color.LIGHT_GRAY);
        frm.setVisible(true);

    }
}
