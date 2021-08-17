import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class My_Frame extends Frame implements ActionListener{

int tag;
Double x,y;
Double result;
Panel p1,p2;
TextField tf,ts;
String str0 = "";
String str = "";
String str1 = "";
String str2 = "";
String str3 = "";
String str4 = "";
String str5 = "";
Button bn[];
String b[] = {".","/","*","-","+","|x|","C","cos","sin","tan","x!","1","2","3","sec","cosec","cot","e^x","4","5","6","log","ln","x^2","sqrt","7","8","9","cbrt","2^x","x^y","1/x","+/-","0","="};

	public My_Frame(){
		setSize(600,600);
		// b[].setSize(10,10);
		setTitle("AB Calculator");
		setVisible(true);
		setLayout(new BorderLayout());

		p1 = new Panel();
		p2 = new Panel();
		tf = new TextField(30);
		ts = new TextField(30);

		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);


		p1.setBackground(Color.red);
		p2.setBackground(Color.cyan);

		p1.add(tf); 
		p1.add(ts);
		p2.setLayout(new GridLayout(5,7));
		int size = b.length;


		bn = new Button[size];

		for (int i = 0;i < size;i++ ) {
		  
		  bn[i] = new Button(b[i]);
		  p2.add(bn[i]);
		  bn[i].addActionListener(this);

		}

		repaint();

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.out.println("thanks for using AB Calculator");
				dispose();
			}
		});
	}

	public void paint(Graphics g)
	{
		Font f = new Font("ubuntu",Font.BOLD,30);
		g.setFont(f);
		setForeground(Color.black);
	}

	public void actionPerformed(ActionEvent ae){
        
		str = ae.getActionCommand();

		if (str == "0") {
			
			str1 = tf.getText();
			str2 = str1+"0";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "1") {
			
			str1 = tf.getText();
			str2 = str1+"1";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "2") {
			
			str1 = tf.getText();
			str2 = str1+"2";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "3") {
			
			str1 = tf.getText();
			str2 = str1+"3";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "4") {
			
			str1 = tf.getText();
			str2 = str1+"4";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "5") {
			
			str1 = tf.getText();
			str2 = str1+"5";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "6") {
			
			str1 = tf.getText();
			str2 = str1+"6";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "7") {
			
			str1 = tf.getText();
			str2 = str1+"7";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "8") {
			
			str1 = tf.getText();
			str2 = str1+"8";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "9") {
			
			str1 = tf.getText();
			str2 = str1+"9";
			tf.setText(str2);
			str0 = ts.getText();
			ts.setText(str0 + str);
		}

		if (str == "C") {
			
			tf.setText("");
			ts.setText("");
		}

		if (str == "+") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    str4 = str3+"+";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 1;
		}
        
        if (str == "-") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    str4 = str3+"-";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 2;
		}

		if (str == "*") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    str4 = str3+"*";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 3;
		}

		if (str == "/") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    str4 = str3+"/";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 4;
		}

		

		if (str == "x!") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = str3+"!";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 5;
		}

		if (str == "x^2") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = str3+"^2";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 6;
		}

		if (str == "sin") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "sin(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 7;
		}

		if (str == "cos") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "cos(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 8;
		}

		if (str == "tan") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "tan(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 9;
		}

		if (str == "cosec") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "cosec(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 10;
		}

		if (str == "sec") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "sec(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 11;
		}

		if (str == "cot") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "cot(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 12;
		}

		if (str == "|x|") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "|" + str3 + "|";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 13;
		}

		if (str == "+/-" ){
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    // str4 = "cot(" + str3 + ")";
		    // tf.setText(str4);
		    // ts.setText(str4);
		    tf.setText("");
		    tag = 14;
		}

		if (str == "log") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "log(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 15;
		}

		if (str == "e^x") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "e^" + str3;
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 16;
		}

		if (str == "ln") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "ln(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 17;
		}

		if (str == "x^y") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = str3 + "^";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 18;
		}

		if (str == "1/x") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "1/" + str3;
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 19;
		}

		if (str == "2^x") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "2^" + str3;
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 20;
		}

		if (str == "sqrt") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "sqrt(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 21;
		}

		if (str == "cbrt") {
			str0 = ts.getText();
		    str3 = tf.getText();
		    x = Double.parseDouble(str3);
		    str4 = "cbrt(" + str3 + ")";
		    tf.setText(str4);
		    ts.setText(str4);
		    tf.setText("");
		    tag = 22;
		}

		if (str == ".") {
			str0 = ts.getText();
			str3 = tf.getText();
			str4 = str2 + ".";
			tf.setText(str4);
			ts.setText(str4);
			tf.setText("");
			str3 = ts.getText();

		}


		if (str == "=") {

			if (tag > 0 && tag < 5)  {

				x = Double.parseDouble(str3);
				str5 = tf.getText();
				y = Double.parseDouble(str5);

				if (tag == 1) {
					result = x + y;
					tf.setText(String.valueOf(result));
				}

				if (tag == 2) {
					result = x - y;
					tf.setText(String.valueOf(result));
				}

				if (tag == 3) {
					result = x * y;
					tf.setText(String.valueOf(result));
				}

				if (tag == 4) {
					result = x / y;
					tf.setText(String.valueOf(result));
				}
				
			}

			if (tag == 5) {
				double factorial = 1;

				for (int i = 1;i <= x ;i++ ) {
					
					factorial = factorial * i;
				}

				result = factorial;

				tf.setText(String.valueOf(result));
				
			}

			if (tag == 6) {
				
				result = x*x;
				tf.setText(String.valueOf(result));
			}

			if (tag == 7) {
				
				double radian = Math.toRadians(x);
				result = Math.sin(radian);
				tf.setText(String.valueOf(result));
			}

			if (tag == 8) {
				
				double radian = Math.toRadians(x);
				result = Math.cos(radian);
				tf.setText(String.valueOf(result));
			}

			if (tag == 9) {
				
				double radian = Math.toRadians(x);
				result = Math.tan(radian);
				tf.setText(String.valueOf(result));
			}

			if (tag == 10) {
				
				double radian = Math.toRadians(x);
				result = 1/Math.sin(radian);
				tf.setText(String.valueOf(result));
			}

			if (tag == 11) {
				
				double radian = Math.toRadians(x);
				result = 1/Math.cos(radian);
				tf.setText(String.valueOf(result));
			}

			if (tag == 12) {
				
				double radian = Math.toRadians(x);
				result = 1/Math.tan(radian);
				tf.setText(String.valueOf(result));
			}

			if (tag == 13) {
				
				result = Math.abs(x);
				tf.setText(String.valueOf(result));
			}


			if (tag == 14) {

				x = Double.parseDouble(str3);
				
				result = (-x);
				tf.setText(String.valueOf(result));
			}


			if (tag == 15) {
				
				result = Math.log10(x);
				tf.setText(String.valueOf(result));
			}


			if (tag == 16) {
				
				result = Math.exp(x);
				tf.setText(String.valueOf(result));
			}


			if (tag == 17) {
				
				result = Math.log(x);
				tf.setText(String.valueOf(result));
			}


			if (tag == 18) {

				str5 = tf.getText();
				y = Double.parseDouble(str5);

				result = Math.pow(x,y);

				tf.setText(String.valueOf(result));
			}

			if (tag == 19) {
				result = 1/x;
				tf.setText(String.valueOf(result));
			}

			if (tag == 20) {
				result = Math.pow(2,x);
				tf.setText(String.valueOf(result));
			}

			if (tag == 21) {
             result = Math.sqrt(x);
             tf.setText(String.valueOf(result));
				
			}

			if (tag == 22) {
				result = Math.cbrt(x);
				tf.setText(String.valueOf(result));
			}


			
		}



		
		
	}	

}


public class Calculator{

	public static void main(String[] args) {
		My_Frame mf = new My_Frame();
		
	}
}
