import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.SwingUtilities;


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
public class NewJFramee extends javax.swing.JFrame {
	private JButton jButton1;
	private JButton jButton4;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JPanel jPanel2;
	private JTabbedPane jTabbedPane1;
	private JPanel jPanel1;
	private JButton jButton3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JScrollPane jScrollPane1;
	private AbstractAction closeAboutAction;
	private JButton jButton5;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JDialog jDialog1;
	private AbstractAction aboutAction;
	private JMenuItem jMenuItem1;
	private JMenu jMenu2;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JTable jTable1;
	private JButton jButton2;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFramee inst = new NewJFramee();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFramee() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Test jForm");
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("File");
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("Help");
					{
						jMenuItem1 = new JMenuItem();
						jMenu2.add(jMenuItem1);
						jMenuItem1.setText("jMenuItem1");
						jMenuItem1.setAction(getAboutAction());
					}
				}
			}
			{
				jButton1 = new JButton();
				jButton1.setText("Cancel");
				jButton1.setFont(new java.awt.Font("Segoe UI",1,12));
			}
			{
				jButton2 = new JButton();
				jButton2.setText("Ok");
				jButton2.setFont(new java.awt.Font("Segoe UI",1,12));
			}
			{
				jTabbedPane1 = new JTabbedPane();
				{
					jPanel1 = new JPanel();
					jTabbedPane1.addTab("jPanel1", null, jPanel1, null);
					GroupLayout jPanel1Layout = new GroupLayout((JComponent)jPanel1);
					jPanel1.setLayout(jPanel1Layout);
					jPanel1.setBorder(BorderFactory.createTitledBorder(null,"Best Border",TitledBorder.LEADING,TitledBorder.DEFAULT_POSITION));
					jPanel1.setPreferredSize(new java.awt.Dimension(356, 68));
					{
						jTextField1 = new JTextField();
						jTextField1.setText("jTextField1");
					}
					{
						jTextField2 = new JTextField();
						jTextField2.setText("jTextField2");
					}
					{
						jButton3 = new JButton();
						jButton3.setText("jButton3");
					}
					jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup()
						    .addGroup(jPanel1Layout.createSequentialGroup()
						        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
						        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(213, Short.MAX_VALUE));
					jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jButton3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED));
				}
				{
					jPanel2 = new JPanel();
					jTabbedPane1.addTab("jPanel1Copy", null, jPanel2, null);
					GroupLayout jPanel2Layout = new GroupLayout((JComponent)jPanel2);
					jPanel2.setPreferredSize(new java.awt.Dimension(356, 75));
					jPanel2.setBorder(BorderFactory.createTitledBorder(null,"Best Border",TitledBorder.LEADING,TitledBorder.DEFAULT_POSITION));
					jPanel2.setLayout(jPanel2Layout);
					{
						jTextField3 = new JTextField();
						jTextField3.setText("jTextField1");
					}
					{
						jTextField4 = new JTextField();
						jTextField4.setText("jTextField2");
					}
					{
						jButton4 = new JButton();
						jButton4.setText("jButton3");
					}
					jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(jTextField4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jButton4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED));
					jPanel2Layout.setHorizontalGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup()
						    .addGroup(jPanel2Layout.createSequentialGroup()
						        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
						        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(213, Short.MAX_VALUE));
				}
			}
			{
				jScrollPane1 = new JScrollPane();
				{
					TableModel jTable1Model = 
							new DefaultTableModel(
									new String[][] { { "One", "Two" }, { "Three", "Four" } },
									new String[] { "Column 1", "Column 2" });
					jTable1 = new JTable();
					jScrollPane1.setViewportView(jTable1);
					jTable1.setModel(jTable1Model);
				}
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jTabbedPane1, 0, 120, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jButton1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(27, 27));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(238)
				        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(46, Short.MAX_VALUE));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButton1, jButton2});
			pack();
			this.setSize(435, 333);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private AbstractAction getAboutAction() {
		if(aboutAction == null) {
			aboutAction = new AbstractAction("About", null) {
				public void actionPerformed(ActionEvent evt) {
					getJDialog1().pack();
					getJDialog1().setLocationRelativeTo(null);
					getJDialog1().setVisible(true);
				}
			};
			aboutAction.putValue(javax.swing.Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("shift ctrl pressed A"));
		}
		return aboutAction;
	}
	
	private JDialog getJDialog1() {
		if(jDialog1 == null) {
			jDialog1 = new JDialog(this);
			GroupLayout jDialog1Layout = new GroupLayout((JComponent)jDialog1.getContentPane());
			jDialog1.setLayout(jDialog1Layout);
			jDialog1.setTitle("About");
			jDialog1.setSize(221, 123);
			jDialog1Layout.setVerticalGroup(jDialog1Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getJLabel1(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJLabel2(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJButton5(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 6, Short.MAX_VALUE));
			jDialog1Layout.setHorizontalGroup(jDialog1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jDialog1Layout.createParallelGroup()
				    .addComponent(getJLabel1(), GroupLayout.Alignment.CENTER, 0, 181, Short.MAX_VALUE)
				    .addComponent(getJLabel2(), GroupLayout.Alignment.CENTER, 0, 181, Short.MAX_VALUE)
				    .addComponent(getJButton5(), GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
		}
		return jDialog1;
	}
	
	private JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("This was designed by Dylan Cruz");
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jLabel1;
	}
	
	private JLabel getJLabel2() {
		if(jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("(C) 2012 Awesome Software Ltd.");
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jLabel2;
	}
	
	private JButton getJButton5() {
		if(jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("Ok");
			jButton5.setAction(getCloseAboutAction());
		}
		return jButton5;
	}
	
	private AbstractAction getCloseAboutAction() {
		if(closeAboutAction == null) {
			closeAboutAction = new AbstractAction("Ok", null) {
				public void actionPerformed(ActionEvent evt) {
					getJDialog1().dispose();
				}
			};
		}
		return closeAboutAction;
	}

}
