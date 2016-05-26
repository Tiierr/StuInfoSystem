package UNIT6;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LogIn extends JFrame implements ActionListener {

    /**
     * 标签
     */
    private JLabel User_Email; //用户账号,采用邮箱注册形式
    private JLabel User_Name; //用户名
    private JLabel User_Password; //用户密码
    private JLabel User_Repatt_password; //确认密码
    private JLabel User_Sex;  //性别
    private JLabel User_Birth; //生日
    private JLabel User_Phone_Number; //手机号
    private JLabel Security_Code; //验证码
    /**
     * 文本框
     */
    private JTextField Text_User_Email; //用户账号
    private JTextField Text_User_Name; //昵称
    private JPasswordField Text_User_Password; //密码
    private JPasswordField Text_User_Repeat_Password; //确认密码
    private JTextField Text_User_Phone_Number; //手机号
    private JTextField  Text_Security_Code; //验证码
    /**
     * 组合框
     */
    //生日  年-月-日
    private JComboBox com_YEAR;
    private JComboBox com_MONTH;
    private JComboBox com_DAY;

    /**
     * 按钮
     */
    private JRadioButton MALE;
    private JRadioButton FEMALE;
    private ButtonGroup group;
    private JButton  Code; //验证码
    private JButton Submit_Button;
    private JButton Submit_Cancel;

    /**
     * 文本
     */
   // private String CALENDAR[] = {"公历", "农历"};
    private String[] YEAR = {"    年   ", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001",
        "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982",
        "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963",
        "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944",
        "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925",
        "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916"};
    private String MONTH[] = {"    月   ", "01", "02", "03", "04", "05", "06", "07", "08", "08", "10", "11", "12"};
    private String[] DAY = {"    日   ", "01", "02", "03", "04", "05", "06", "07", "08", "08", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String code;

    /**
     * 静态变量，用来存放会员注册信息
     */
    //会员性别
    private static String str_sex = "";
    //出生日期
    private static String str_YEAR = "";
    private static String str_MONTH = "";
    private static String str_DAY = "";
    public LogIn() {

        User_Email = new JLabel("       邮箱:");
        User_Name = new JLabel("   用户名:");
        User_Password = new JLabel("输入密码:");
        User_Repatt_password = new JLabel("确认密码:");
        User_Sex = new JLabel("性别:");
        User_Birth = new JLabel("生日:");
        User_Phone_Number = new JLabel("   手机号:");
        
        Security_Code = new JLabel("验证码:");

        Text_User_Email = new JTextField(20);
        Text_User_Name = new JTextField(20);
        Text_User_Password = new JPasswordField(20);
        Text_User_Repeat_Password = new JPasswordField(20);
        Text_User_Phone_Number = new JTextField(20);
        Text_Security_Code = new JTextField(12);

        MALE = new JRadioButton("男");
        FEMALE = new JRadioButton("女                                      ");
        group = new ButtonGroup();
        
                
        Submit_Button = new JButton(" 提交 ");
        Submit_Cancel = new JButton(" 取消 ");
        
        code = RandomStr.randomStr(4);
        Code = new JButton(code);
        
        Code.setBackground(Color.WHITE);
        Submit_Button.setBackground(Color.WHITE);
        Submit_Cancel.setBackground(Color.WHITE);
      
        com_YEAR = new JComboBox(YEAR);
        com_MONTH = new JComboBox(MONTH);
        com_DAY = new JComboBox(DAY);
        
        com_YEAR.setBackground(Color.WHITE);
        com_MONTH.setBackground(Color.WHITE);
        com_DAY.setBackground(Color.WHITE);
        
    }

    public void launchLogin() {
        Container c = getContentPane();
        
        c.setLayout(new GridLayout(10, 1));
        group.add(MALE);
        group.add(FEMALE);
        JPanel p[] = new JPanel[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new JPanel();
            p[i].setLayout(new FlowLayout());
        }
        p[0].add(User_Email);
        p[0].add(Text_User_Email);
        p[1].add(User_Name);
        p[1].add(Text_User_Name);
        p[2].add(User_Password);
        p[2].add(Text_User_Password);
        p[3].add(User_Repatt_password);
        p[3].add(Text_User_Repeat_Password);
        p[4].add(User_Phone_Number);
        p[4].add(Text_User_Phone_Number);
        p[5].add(User_Sex);
        p[5].add(MALE);
        p[5].add(FEMALE);
        p[6].add(User_Birth);
        p[6].add(com_YEAR);
        p[6].add(com_MONTH);
        p[6].add(com_DAY);
 
        p[7].add(Security_Code);
        p[7].add(Text_Security_Code);
        p[7].add(Code);
        p[8].add(Submit_Button, JPanel.LEFT_ALIGNMENT);
        p[8].add(Submit_Cancel, JPanel.RIGHT_ALIGNMENT);
        for (int i = 0; i < 10; i++) {
            c.add(p[i]);
        }
        /**
         * 为组合框和按钮注册监听器
         */
        MALE.addItemListener(new Listener_sex_button());
        FEMALE.addItemListener(new Listener_sex_button());
        com_YEAR.addItemListener(new Listener_sex_button());
        com_MONTH.addItemListener(new Listener_sex_button());
        com_DAY.addItemListener(new Listener_sex_button());
        Submit_Button.addActionListener(this);
        Submit_Cancel.addActionListener(this);
        Code.addActionListener(this);
        
        setSize(600, 400);
        setTitle("新用户注册");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        setLocation((tk.getScreenSize().width - getSize().width) / 2, (tk.getScreenSize().height - getSize().height) / 2);
        setVisible(true);
    }
    //内部类实现性别按钮和组合框的监听

    class Listener_sex_button implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            Object source_button_box = e.getItemSelectable();
            if (source_button_box == MALE) {
                str_sex = "男";
            }
            if (source_button_box == FEMALE) {
                str_sex = "女";
            }
           
            if (source_button_box == com_YEAR) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    str_YEAR = com_YEAR.getSelectedItem().toString() + '-';
                }
            }
            if (source_button_box == com_MONTH) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    str_MONTH = com_MONTH.getSelectedItem().toString() + '-';
                }
            }
            if (source_button_box == com_DAY) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    str_DAY = com_DAY.getSelectedItem().toString();
                }
            }
        }

    }

    /**
     * 对其组件注册监听器
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object source = e.getSource();
        String format = "\\p{Alpha}\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
        if (source == Submit_Button) {
            ;
            if (Text_User_Email.getText().length() == 0
                    || Text_User_Name.getText().length() == 0
                    || Text_User_Password.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "邮箱,用户名,密码都不能为空!",
                        "警告", JOptionPane.WARNING_MESSAGE);
                
             
            } 
            else if (!Text_User_Password.getText().equals(Text_User_Repeat_Password.getText())) {
                JOptionPane.showMessageDialog(null, "再次密码输入不一致!",
                        "警告", JOptionPane.WARNING_MESSAGE);}
            else if(Text_User_Password.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "密码长度不能低于8位！",
                        "警告", JOptionPane.WARNING_MESSAGE);
                    }
           else if(!Text_User_Email.getText().matches(format)){
                JOptionPane.showMessageDialog(null, "邮箱格式错误！",
                        "警告", JOptionPane.WARNING_MESSAGE);
            }
           else if((Text_User_Phone_Number.getText().length()!=11) && (Text_User_Phone_Number.getText().length()!=0)){
                JOptionPane.showMessageDialog(null, "手机号格式错误！",
                        "警告", JOptionPane.WARNING_MESSAGE);
            }
           else if(!Text_Security_Code.getText().equals(code)){
                JOptionPane.showMessageDialog(null, "验证码输入错误！",
                        "警告", JOptionPane.WARNING_MESSAGE);
            }
            else {
                
                JOptionPane.showMessageDialog(null, "新会员信息如下：\n" + "邮箱：" + Text_User_Email.getText() + "\n" + "用户名：" + 
                        Text_User_Name.getText() + "\n" + "性别：" + str_sex + "\n" + "出生年月：" + str_YEAR + str_MONTH +str_DAY + "\n" + 
                        "绑定手机号：" + Text_User_Phone_Number.getText() + "\n","新用户", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (source == Submit_Cancel) {
            dispose();
        }
        if(source == Code){
            code = RandomStr.randomStr(4);
            Code.setText(code);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LogIn demo = new LogIn();
        demo.launchLogin();
    }
}
