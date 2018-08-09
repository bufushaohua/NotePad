import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class NoteBook {

	public static void main(String[] args) {
		new NoteBook();
	}
	
	public NoteBook(){
		JFrame frame = new JFrame("记事本");//标题
		
		Container c = frame.getContentPane();//初始化一个容器
		JTextArea jt = new JTextArea();
		
		//初始化菜单栏
		final JMenuBar menuBar = new JMenuBar();
		//创建"文件"菜单文本
		final JMenu fileMenu = new JMenu("文件 (F)");
		final JMenu EditMenu = new JMenu("编辑 (E)");
		final JMenu formatMenu = new JMenu("格式 (O)");
		final JMenu HelpMenu = new JMenu("帮助 (H)");
		//创建菜单文本中的小菜单
		final JMenuItem newItem = new JMenuItem("新建 (N)");
		final JMenuItem openMenu = new JMenuItem("打开 (O)");
		final JMenuItem saveItem = new JMenuItem("保存 (S)");
		final JMenuItem copyItem = new JMenuItem("复制 (C)");
		
		//设置快捷键
		fileMenu.setMnemonic(KeyEvent.VK_F);
		newItem.setMnemonic(KeyEvent.VK_N);
		openMenu.setMnemonic(KeyEvent.VK_O);
		saveItem.setMnemonic(KeyEvent.VK_S);
		EditMenu.setMnemonic(KeyEvent.VK_E);
		copyItem.setMnemonic(KeyEvent.VK_C);
		
		//添加到菜单栏
		menuBar.add(fileMenu);
		menuBar.add(EditMenu);
		menuBar.add(formatMenu);
		menuBar.add(HelpMenu);
		
		//添加到菜单
		fileMenu.add(newItem);
		fileMenu.add(openMenu);
		fileMenu.add(saveItem);
		EditMenu.add(copyItem);
		
		//添加动作监听器
		newItem.addActionListener(new ItemListener());
		
		
		
		c.add(jt);
		//c.setLayout(new FlowLayout());
		//c.setLayout(null);
		
		jt.setBounds(0, 0, 800, 600);
		frame.setVisible(true);//可见性
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口结束程序
		frame.setBounds(300, 110, 800, 600);//设置位置
		frame.setResizable(false);//设置不可改变窗体大小
		frame.setJMenuBar(menuBar);
		
		
	}

	private class ItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}
