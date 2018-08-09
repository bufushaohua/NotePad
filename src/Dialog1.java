import java.awt.*;
import javax.swing.*;

public class Dialog1 extends JFrame {
	public static void main(String[] args){
		new Dialog1();
	}
	public Dialog1(){
	Container c = getContentPane();
	JComboBox<String> combox1 = new JComboBox<String>();
	JComboBox<Integer> combox2 = new JComboBox<Integer>();
	JComboBox<String> combox3 = new JComboBox<String>();
	JLabel lb1 = new JLabel("请选择字体：");
	JLabel lb2 = new JLabel("请选择字形：");
	JLabel lb3 = new JLabel("请选择大小：");
	final String[] fontArr;
	final String[] sizeArr = {"8","9","10","12","14","16","18","20",
			"24","28","32","36","40","44","48","54","60","66","72","80","88"};
	final int[] style = {Font.PLAIN, Font.BOLD, Font.ITALIC};//PLAIN：常规 、 BOLD：粗体 、ITALIC：斜体
	
	
		setTitle("字体设置");
		setVisible(true);
		setBounds(420, 250, 480, 250);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		//获取Windows系统自带的字体名称
		GraphicsEnvironment env=GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		fontArr=env.getAvailableFontFamilyNames();
		for(int i=0; i<fontArr.length; i++){
			combox1.addItem(fontArr[i]);
		}
		for(int j=0; j<style.length; j++){
			combox2.addItem(style[j]);
		}
		for(int k=0; k<sizeArr.length; k++){
			combox3.addItem(sizeArr[k]);
		}
		
		lb1.setBounds(5, 40, 100, 60);
		combox1.setBounds(80, 55, 70, 30);
		lb2.setBounds(155, 40, 100, 60);
		combox2.setBounds(230, 55, 70, 30);
		lb3.setBounds(300, 40, 100, 60);
		combox3.setBounds(370, 55, 70, 30);
		
		c.add(lb1);
		c.add(lb2);
		c.add(lb3);
		c.add(combox1);
		c.add(combox2);
		c.add(combox3);
	}
	
	
	
}
