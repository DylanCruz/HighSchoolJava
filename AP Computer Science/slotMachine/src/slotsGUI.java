import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.util.Random;
import java.util.Scanner;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class slotsGUI extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	int money;
    int plays;
    int wins;
    int loses;
    int moneyWon;
    int moneyLost;
    int net;
    int betTotal;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JButton jButton1;
	private AbstractAction openStatsAction;
	private JTextPane jTextPane2;
	private JLabel jLabel3;
	private JLabel jLabel5;
	private AbstractAction aboutAction1;
	private JLabel jLabel6;
	private JDialog jDialog4;
	private JButton jButton5;
	private AbstractAction playSlotsAction;
	private JDialog jDialog2;
	private JTextPane jTextPane1;
	private JButton jButton4;
	private JButton jButton3;
	private JDialog jDialog1;
	private AbstractAction exitAction;
	private JButton jButton2;

	public slotsGUI() {
		super();
        money = 1000;
        plays = 0;
        wins = 0;
        loses = 0;
        moneyWon = 0;
        moneyLost = 0;
        betTotal = 0;
		initGUI();
	}
	
	public void main()
    {
        System.out.print("\f");
        int menuChoice = 0;
        
        while(menuChoice != 3)
        {
            menuChoice = menu();
            if(menuChoice == 1)
                game();
            if(menuChoice == 2)
                stats();
        }
    }
    
    public int menu()
    {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("***** Slot Machine *****");
        System.out.println("1. Play Slots");
        System.out.println("2. Stats.");
        System.out.println("3. Exit program.");
        choice = scan.nextInt();
        System.out.println("************************");
        return choice;
    }
    
    public void game()
    {
        System.out.print("\f");
        Random gen = new Random();
        Scanner scan = new Scanner(System.in);
        int r1c1 = gen.nextInt(4);
        int r1c2 = gen.nextInt(4);
        int r1c3 = gen.nextInt(4);
        int r2c1 = gen.nextInt(4);
        int r2c2 = gen.nextInt(4);
        int r2c3 = gen.nextInt(4);
        int r3c1 = gen.nextInt(4);
        int r3c2 = gen.nextInt(4);
        int r3c3 = gen.nextInt(4);
        
        /**
        String sr1c1;
        String sr1c2;
        String sr1c3;
        String sr2c1;
        String sr2c2;
        String sr2c3;
        String sr3c1;
        String sr3c2;
        String sr3c3;
        **/
        
        int bet;
        boolean win3 = false;
        if(money < 1)
        {
            System.out.println("Sorry, you're out of money. You can't play.");
            return;
        }
        System.out.println("Current Money = $" + money);
        System.out.println("Place your bet.");
        System.out.print("Bet = $");
        bet = scan.nextInt();
        while(bet > money)
        {
            System.out.println("Sorry, you can't bet more than you have. Please bet lower.");
            System.out.println("Place your bet.");
            System.out.print("Bet = $");
            bet = scan.nextInt();
        }
        plays++;
        betTotal = betTotal + bet;
        System.out.println("Rolling the machine...");
        System.out.print(r1c1);
        System.out.print("\t");
        System.out.print(r1c2);
        System.out.print("\t");
        System.out.print(r1c3);
        System.out.println("");
        System.out.print(r2c1);
        System.out.print("\t");
        System.out.print(r2c2);
        System.out.print("\t");
        System.out.print(r2c3);
        System.out.println("");
        System.out.print(r3c1);
        System.out.print("\t");
        System.out.print(r3c2);
        System.out.print("\t");
        System.out.println(r3c3);
        
        //Row 1 wins & checks other rows
        if(r1c1 == r1c2 && r1c2 == r1c3)
        {
            if((r2c1 == r2c2 && r2c2 == r2c3) && (r3c1 == r3c2 && r3c2 == r3c3))
            {
                System.out.println("Win on top, middle and bottom rows! Congrats! You win $" + (bet * 4));
                money = money + bet * 4;
                moneyWon = moneyWon + bet * 4;
                wins++;
                win3 = true;
            }
            else if(((r2c1 == r2c2 && r2c2 == r2c3) || (r3c1 == r3c2 && r3c2 == r3c3)) && win3 == false)
            {
                System.out.println("Win on top row, and either middle or bottom! Congrats! You win $" + (bet * 3));
                money = money + bet * 3;
                moneyWon = moneyWon + bet * 3;
                wins++;
            }
            
            else if(win3 == false)
            {
                System.out.println("Win on top row, congrats. You win $" + (bet * 2));
                money = money + bet * 2;
                moneyWon = moneyWon + bet * 2;
                wins++;
            }
        }
        //Row 2 wins & checks other rows
        else if(r2c1 == r2c2 && r2c2 == r2c3)
        {
            if((r1c1 == r1c2 && r1c2 == r1c3) && (r3c1 == r3c2 && r3c2 == r3c3))
            {
                System.out.println("Win on top, middle and bottom rows! Congrats! You win $" + (bet * 4));
                money = money + bet * 4;
                moneyWon = moneyWon + bet * 4;
                wins++;
                win3 = true;
            }
            else if(((r1c1 == r1c2 && r1c2 == r1c3) || (r3c1 == r3c2 && r3c2 == r3c3)) && win3 == false)
            {
                System.out.println("Win on middle row, and either top or bottom! Congrats! You win $" + (bet * 3));
                money = money + bet * 3;
                moneyWon = moneyWon + bet * 3;
                wins++;
            }
            
            else if(win3 == false)
            {
                System.out.println("Win on middle row, congrats. You win $" + (bet * 2));
                money = money + bet * 2;
                moneyWon = moneyWon + bet * 2;
                wins++;
            }
        }
        //Row 3 wins & checks other rows
        else if(r3c1 == r3c2 && r3c2 == r3c3)
        {
            if((r2c1 == r2c2 && r2c2 == r2c3) && (r1c1 == r1c2 && r1c2 == r1c3))
            {
                System.out.println("Win on top, middle and bottom rows! Congrats! You win $" + (bet * 4));
                money = money + bet * 4;
                moneyWon = moneyWon + bet * 4;
                wins++;
                win3 = true;
            }
            else if(((r2c1 == r2c2 && r2c2 == r2c3) || (r1c1 == r1c2 && r1c2 == r1c3)) && win3 == false)
            {
                System.out.println("Win on bottom row, and either middle or top! Congrats! You win $" + (bet * 3));
                money = money + bet * 3;
                moneyWon = moneyWon + bet * 3;
                wins++;
            }
            
            else if(win3 == false)
            {
                System.out.println("Win on bottom row, congrats. You win $" + (bet * 2));
                money = money + bet * 2;
                moneyWon = moneyWon + bet * 2;
                wins++;
            }
        }
        else
        {
            System.out.println("You lose. No rows match.");
            money = money - bet;
            moneyLost = moneyLost + bet;
            loses++;
        }
    }
    
    public void stats()
    {
        net = moneyWon - moneyLost;
        System.out.println("Your stats so far this game...");
        System.out.println("Plays: " + plays);
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Money Won: $" + moneyWon);
        System.out.println("Money Lost: $" + moneyLost);
        System.out.println("Net: $" + net);
        System.out.println("Average bet: $" + (betTotal / plays));
    }

	
	/**
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 * THIS IS THE SPACE BETWEEN GUI AND PROGRAM
	 */
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				slotsGUI inst = new slotsGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setTitle("Slots Launcher");
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Welcome to the Slot Machine!");
				jLabel1.setFont(new java.awt.Font("Arial",1,16));
				jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Please choose an option.");
				jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
				jLabel2.setFont(new java.awt.Font("Arial",1,12));
			}
			{
				jButton1 = new JButton();
				jButton1.setText("Play Slots");
				jButton1.setAction(getPlaySlotsAction());
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Exit");
				jButton2.setAction(getExitAction());
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addGap(45)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 67, Short.MAX_VALUE)
				        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
				    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, 0, 233, Short.MAX_VALUE)
				    .addComponent(jLabel2, GroupLayout.Alignment.LEADING, 0, 233, Short.MAX_VALUE))
				.addGap(6));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton2, jButton1});
			pack();
			this.setSize(265, 175);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private AbstractAction getExitAction() {
		if(exitAction == null) {
			exitAction = new AbstractAction("Exit", null) {
				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			};
		}
		return exitAction;
	}
	
	private JDialog getJDialog1() {
		if(jDialog1 == null) {
			jDialog1 = new JDialog(this);
			GroupLayout jDialog1Layout = new GroupLayout((JComponent)jDialog1.getContentPane());
			jDialog1.getContentPane().setLayout(jDialog1Layout);
			jDialog1.setTitle("Play Slots");
			jDialog1.setPreferredSize(new java.awt.Dimension(474, 342));
			jDialog1.setSize(474, 342);
			jDialog1Layout.setHorizontalGroup(jDialog1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jDialog1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jDialog1Layout.createSequentialGroup()
				        .addComponent(getJButton4(), GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
				        .addGap(85)
				        .addComponent(getJButton3(), GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 80, Short.MAX_VALUE)
				        .addComponent(getJButton5(), GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
				    .addComponent(getJTextPane1(), GroupLayout.Alignment.LEADING, 0, 438, Short.MAX_VALUE))
				.addContainerGap());
			jDialog1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {getJButton5(), getJButton3(), getJButton4()});
			jDialog1Layout.setVerticalGroup(jDialog1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJButton4(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJButton3(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJButton5(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(getJTextPane1(), 0, 248, Short.MAX_VALUE)
				.addContainerGap());
			jDialog1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {getJButton5(), getJButton3(), getJButton4()});
		}
		return jDialog1;
	}
	
	private JButton getJButton3() {
		if(jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Stats");
			jButton3.setAction(getOpenStatsAction());
		}
		return jButton3;
	}
	
	private JButton getJButton4() {
		if(jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Start A Play");
		}
		return jButton4;
	}
	
	private JTextPane getJTextPane1() {
		if(jTextPane1 == null) {
			jTextPane1 = new JTextPane();
			jTextPane1.setEditable(false);
		}
		return jTextPane1;
	}
	
	private JDialog getJDialog2() {
		if(jDialog2 == null) {
			jDialog2 = new JDialog(this);
			GroupLayout jDialog2Layout = new GroupLayout((JComponent)jDialog2.getContentPane());
			jDialog2.getContentPane().setLayout(jDialog2Layout);
			jDialog2.setTitle("Stats");
			jDialog2.setSize(284, 224);
			jDialog2Layout.setHorizontalGroup(jDialog2Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jDialog2Layout.createParallelGroup()
				    .addComponent(getJLabel3(), GroupLayout.Alignment.LEADING, 0, 244, Short.MAX_VALUE)
				    .addComponent(getJTextPane2(), GroupLayout.Alignment.LEADING, 0, 244, Short.MAX_VALUE))
				.addContainerGap());
			jDialog2Layout.setVerticalGroup(jDialog2Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getJLabel3(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJTextPane2(), 0, 140, Short.MAX_VALUE)
				.addContainerGap());
		}
		return jDialog2;
	}
	
	private JLabel getJLabel3() {
		if(jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Your stats so far this game...");
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setFont(new java.awt.Font("Arial",1,16));
		}
		return jLabel3;
	}
	
	private JTextPane getJTextPane2() {
		if(jTextPane2 == null) {
			jTextPane2 = new JTextPane();
			jTextPane2.setEditable(false);
		}
		return jTextPane2;
	}
	
	private AbstractAction getOpenStatsAction() {
		if(openStatsAction == null) {
			openStatsAction = new AbstractAction("Stats", null) {
				public void actionPerformed(ActionEvent evt) {
					getJDialog2().pack();
					getJDialog2().setLocationRelativeTo(null);
					getJDialog2().setVisible(true);
				}
			};
		}
		return openStatsAction;
	}
	
	private AbstractAction getPlaySlotsAction() {
		if(playSlotsAction == null) {
			playSlotsAction = new AbstractAction("Play Slots", null) {
				public void actionPerformed(ActionEvent evt) {
				    getJDialog1().pack();
					getJDialog1().setLocationRelativeTo(null);
					getJDialog1().setVisible(true);
				}
			};
		}
		return playSlotsAction;
	}
	
	private JButton getJButton5() {
		if(jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("About");
			jButton5.setAction(getAboutAction1());
		}
		return jButton5;
	}
	


	private JDialog getJDialog4() {
		if(jDialog4 == null) {
			jDialog4 = new JDialog(this);
			GroupLayout jDialog4Layout = new GroupLayout((JComponent)jDialog4.getContentPane());
			jDialog4.setLayout(jDialog4Layout);
			jDialog4.setTitle("About");
			jDialog4.setSize(178, 106);
			jDialog4Layout.setHorizontalGroup(jDialog4Layout.createSequentialGroup()
				.addContainerGap(36, 36)
				.addGroup(jDialog4Layout.createParallelGroup()
				    .addGroup(jDialog4Layout.createSequentialGroup()
				        .addComponent(getJLabel5(), GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, jDialog4Layout.createSequentialGroup()
				        .addGap(16)
				        .addComponent(getJLabel6(), GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 12, Short.MAX_VALUE)))
				.addContainerGap(48, 48));
			jDialog4Layout.setVerticalGroup(jDialog4Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getJLabel5(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJLabel6(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(18, Short.MAX_VALUE));
		}
		return jDialog4;
	}
	
	private JLabel getJLabel5() {
		if(jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("By Dylan Cruz");
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jLabel5;
	}
	
	private JLabel getJLabel6() {
		if(jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("(C) 2012 Dylan Cruz");
		}
		return jLabel6;
	}
	
	private AbstractAction getAboutAction1() {
		if(aboutAction1 == null) {
			aboutAction1 = new AbstractAction("About", null) {
				public void actionPerformed(ActionEvent evt) {
					getJDialog4().pack();
					getJDialog4().setLocationRelativeTo(null);
					getJDialog4().setVisible(true);
				}
			};
		}
		return aboutAction1;
	}

}
