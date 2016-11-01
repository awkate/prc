package sample200;
import java.awt.*;
import java.awt.event.*;

class PreFrame extends Frame {

    public PreFrame(String title) {

        //フレームのタイトル
        setTitle(title);

        //ウィンドウを閉じる時
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


    public class PreTest {

        public static void main(String args[]) {
            PreFrame frm = new PreFrame("都道府県マスター");
            frm.setLocation(300, 200);
            frm.setSize(250, 350);
            frm.setBackground(Color.LIGHT_GRAY);
            frm.setVisible(true);
        }

    }


