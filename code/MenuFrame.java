package UNIT7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuFrame extends JFrame{
	//设置组件

	private JMenuBar menuBar;
	private JMenu helpMenu;
                  private JMenu stuMenu;
	private JMenu sysMenu;
                  private JMenu searchMenu;
	
                  private JLabel showItems;
	private JScrollPane jScrollPane;
	private JMenuItem aboutItem;
                  private JMenuItem addStu,deleteStu,modiStu;
                  private JMenuItem findStu,findGrade,showAllStu;
                  private JMenuItem logOut;
	
	MenuFrame() {
                            Init();
	}
	
	public void Init(){
		JFrame frame = new JFrame("学生信息管理系统");
		frame.setBounds(300, 300, 700, 450);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();//菜单栏
		//fileMenu = new JMenu("文件");
		helpMenu = new JMenu("帮助");
                                    stuMenu = new JMenu("学生管理");
                                    searchMenu = new JMenu("信息查询");
                                    sysMenu = new JMenu("系统管理");
                                    
                                    showItems = new JLabel("");
		//jTextArea = new JTextArea(10, 40);
		Font x = new Font("Monospaced",10,30);
		
		//jTextArea.setFont(x);
		//jTextArea.setLineWrap(true);//到达指定宽度则换行
		//应当首先利用构造函数指定JScrollPane的控制对象，此处为JTextArea，然后再讲JScrollPane
		//添加进面板
		jScrollPane = new JScrollPane(showItems);
		//设置滚动条自动出现
		jScrollPane.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		jScrollPane.setViewportView(showItems);
		
		aboutItem = new JMenuItem("关于");
                                  
                                    addStu = new JMenuItem("添加学生");
		deleteStu = new JMenuItem("删除学生");
		modiStu = new JMenuItem("修改信息");
		findStu = new JMenuItem("查找学生");
                                    findGrade = new JMenuItem("查看成绩");
                                    showAllStu = new JMenuItem("查看所有学生信息");
		logOut = new JMenuItem("退出");
                                    
                    
		//添加两个选项卡到JMenu
		//添加字菜单项到菜单项
		
                                    menuBar.add(stuMenu);
                                    menuBar.add(searchMenu);
                                    menuBar.add(sysMenu);
                                    menuBar.add(helpMenu);
                                    		
		helpMenu.add(aboutItem);
                
                                    stuMenu.add(addStu);
                                    stuMenu.add(deleteStu);
                                    stuMenu.add(modiStu);
                                    searchMenu.add(findStu);
                                    searchMenu.add(findGrade);
                                    searchMenu.add(showAllStu);
                                    sysMenu.add(logOut);
                                    
		//放置菜单项及输入框
		frame.add(menuBar, BorderLayout.NORTH);
		frame.add(jScrollPane, BorderLayout.CENTER);	
	    Event();
	    frame.setVisible(true);
	}
	/*
	 * 组件添加事件
	 */	
	public void Event() {
		logOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
                                    
		addStu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 ADDSTU demo = new ADDSTU();
                                                                         demo.launchLogin();
			}
		});
                                    deleteStu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 DELETESTU demo = new DELETESTU();
                                                                         demo.launchLogin();
			}
		});
		aboutItem.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "学生信息管理系统\n实现学生增删查改等功能\n"
						+ "made by RayYu(于雷)\nshiliuhuasheng@gmail.com");
			}
		});
	       
	}
	
	public static void main(String[] args){
		new MenuFrame();
	}
}
