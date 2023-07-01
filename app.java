import javax.swing.*;
import java.awt.event.*;

public class app {
    public static void main(String[] args) {
        // 外側のウィンドウの作成
        JFrame frame = new JFrame("Outer Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // レイアウトマネージャーをnullに設定
        frame.setLayout(null);

        // 内部フレームの作成
        JInternalFrame internalFrame = new JInternalFrame("Inner Window", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);

        // 内部フレームの位置を設定
        internalFrame.setLocation(50, 50);

        // ボタンの作成
        JButton button = new JButton("Button");
        button.setBounds(50, 50, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(internalFrame, "Button Clicked!");
            }
        });

        // テキストエリアの作成
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 200, 100);

        // 内部フレームにボタンとテキストエリアを追加
        internalFrame.getContentPane().add(button);
        internalFrame.getContentPane().add(textArea);

        // 内部フレームを親ウィンドウに追加
        frame.getContentPane().add(internalFrame);

        // フレームのサイズを設定
        frame.setSize(400, 300);

        // フレームを表示
        frame.setVisible(true);
    }
}
