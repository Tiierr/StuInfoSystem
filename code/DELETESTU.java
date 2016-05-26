package UNIT7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DELETESTU extends JFrame implements ActionListener {

    /**
     * 标签
     */
    private JLabel stuID; //学号
    private JLabel stuName; //姓名


    /**
     * 文本框
     */
    private JTextField Text_stuID; //学号
    private JTextField Text_stuName; //姓名
           
    private JButton Submit_Button;
    private JButton Submit_Cancel;


    public DELETESTU() {
        

    /**
     * 文本框
     */

        stuID = new JLabel("学号:");
        stuName = new JLabel("姓名:");
   

        Text_stuID = new JTextField(15);
        Text_stuName = new JTextField(15);
 

        Submit_Button = new JButton("提交");
        Submit_Cancel = new JButton("取消");

    }

    public void launchLogin() {
        Container c = getContentPane();
        
        c.setLayout(new GridLayout(5, 1));
        JPanel p[] = new JPanel[3];
        for (int i = 0; i < 3; i++) {
            p[i] = new JPanel();
            p[i].setLayout(new FlowLayout());
        }
        p[0].add(stuID);
        p[0].add(Text_stuID);
        p[1].add(stuName);
        p[1].add(Text_stuName);
        p[2].add(Submit_Button, JPanel.LEFT_ALIGNMENT);
        p[2].add(Submit_Cancel, JPanel.RIGHT_ALIGNMENT);
        for (int i = 0; i < 3; i++) {
            c.add(p[i]);
        }
        /**
         * 为组合框和按钮注册监听器
         */
        Submit_Button.addActionListener(this);
        Submit_Cancel.addActionListener(this);

        setSize(400, 250);
        setTitle("删除学生");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        setLocation((tk.getScreenSize().width - getSize().width) / 2, (tk.getScreenSize().height - getSize().height) / 2);
        setVisible(true);
    }

    /**
     * 对其组件注册监听器
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object source = e.getSource();
        if (source == Submit_Button) {
            if (Text_stuID.getText().length() == 0
                    || Text_stuName.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "学号,姓名都不能为空!",
                        "警告", JOptionPane.WARNING_MESSAGE);
            } 
     
         }
        if (source == Submit_Cancel) {
            dispose();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DELETESTU demo = new DELETESTU();
        demo.launchLogin();
    }
}
