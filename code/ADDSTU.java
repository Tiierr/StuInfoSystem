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

public class ADDSTU extends JFrame implements ActionListener {

    /**
     * 标签
     */
    private JLabel stuID; //学号
    private JLabel stuName; //姓名
    private JLabel stuSex; //性别
    private JLabel stuClass; //班级
    private JLabel stuMajor; //专业
    private JLabel subject_A;//科目一
    private JLabel subject_B;//科目二

    /**
     * 文本框
     */
    private JTextField Text_stuID; //学号
    private JTextField Text_stuName; //姓名
    private JTextField Text_stuSex; //性别
    private JTextField Text_stuClass;//班级
    private JTextField Text_stuMajor;//专业
    private JTextField Text_subject_A;//科目一
    private JTextField Text_subject_B;//科目二

    /**
     * 按钮
     */
    private JButton Submit_Button;
    private JButton Submit_Cancel;
    public ADDSTU() {

    /**
     * 文本框
     */

        stuID = new JLabel("学号:");
        stuName = new JLabel("姓名:");
        stuSex = new JLabel("性别:");
        stuClass = new JLabel("班级:");
        stuMajor = new JLabel("专业");
        subject_A = new JLabel("科目");
        subject_B = new JLabel("科目");

        Text_stuID = new JTextField(15);
        Text_stuName = new JTextField(15);
        Text_stuSex = new JTextField(15);
        Text_stuClass = new JTextField(15);
        Text_stuMajor = new JTextField(15);
        Text_subject_A = new JTextField(15);
        Text_subject_B = new JTextField(15);

        Submit_Button = new JButton("提交");
        Submit_Cancel = new JButton("取消");

    }

    public void launchLogin() {
        Container c = getContentPane();
        
        c.setLayout(new GridLayout(10, 1));
        JPanel p[] = new JPanel[8];
        for (int i = 0; i < 8; i++) {
            p[i] = new JPanel();
            p[i].setLayout(new FlowLayout());
        }
        p[0].add(stuID);
        p[0].add(Text_stuID);
        p[1].add(stuName);
        p[1].add(Text_stuName);
        p[2].add(stuSex);
        p[2].add(Text_stuSex);
        p[3].add(stuClass);
        p[3].add(Text_stuClass);
        p[4].add(stuMajor);
        p[4].add(Text_stuMajor);
        p[5].add(subject_A);
        p[5].add(Text_subject_A);
        p[6].add(subject_B);
        p[6].add(Text_subject_B);
        p[7].add(Submit_Button, JPanel.LEFT_ALIGNMENT);
        p[7].add(Submit_Cancel, JPanel.RIGHT_ALIGNMENT);
        for (int i = 0; i < 8; i++) {
            c.add(p[i]);
        }
        /**
         * 为组合框和按钮注册监听器
         */
        Submit_Button.addActionListener(this);
        Submit_Cancel.addActionListener(this);

        setSize(600, 400);
        setTitle("添加学生");
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
                    || Text_stuName.getText().length() == 0
                    || Text_stuClass.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "学号,姓名,班级都不能为空!",
                        "警告", JOptionPane.WARNING_MESSAGE);
            } 
          else {
            
                JOptionPane.showMessageDialog(null, "新会员信息如下：\n" + "学号：" + Text_stuID.getText() + "\n" + "姓名：" + Text_stuName.getText()+ "\n"
                        + "性别：" + Text_stuSex.getText()+ "\n" + "班级：" + Text_stuClass.getText()  + "\n" + "专业：" + Text_stuMajor.getText() + "\n"+ "科目：" + Text_subject_A.getText()+ "\n" +  "科目：" + Text_subject_B.getText() 
                        + "\n" , "新用户", JOptionPane.INFORMATION_MESSAGE);
            }
            }
           
        if (source == Submit_Cancel) {
            dispose();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ADDSTU demo = new ADDSTU();
        demo.launchLogin();
    }
}
