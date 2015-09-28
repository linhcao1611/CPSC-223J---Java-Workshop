// Programmer's name:   Linh Cao
// Email address:       linhcao@csu.fullerton.edu
// Course:              CPSC 223j
// Assignment number:   2
// Due date:            Sept 30, 2015
// Title:               Payroll User Interface
// Purpose:             Performing the basic payroll calculations
// This file name:      payrollui.java

import javax.swing.Timer;
import java.awt.event.ActionListener;

public class payrollui extends javax.swing.JFrame {
    public payrollui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                     
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Hours = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Payrate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_depend = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_healthplan = new javax.swing.JComboBox();
        lb_name = new javax.swing.JLabel();
        lb_hours = new javax.swing.JLabel();
        lb_rate = new javax.swing.JLabel();
        lb_depend = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_payfor = new javax.swing.JTextField();
        txt_grosspay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fedtax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_healthpre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fica = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_netpay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_compute = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payroll Program");

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); 
        inputPanel.setToolTipText("");
        inputPanel.setName("Input data"); 

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setText("Name");

        txt_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Hours");

        txt_Hours.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Payrate");

        txt_Payrate.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setText("Dependents");

        txt_depend.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("Health Plan");

        cb_healthplan.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        cb_healthplan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes" }));

        lb_name.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lb_name.setForeground(new java.awt.Color(255, 51, 51));
        lb_name.setText(" ");

        lb_hours.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lb_hours.setForeground(new java.awt.Color(255, 51, 51));
        lb_hours.setText(" ");

        lb_rate.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lb_rate.setForeground(new java.awt.Color(255, 51, 51));
        lb_rate.setText(" ");

        lb_depend.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lb_depend.setForeground(new java.awt.Color(255, 51, 51));
        lb_depend.setText(" ");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_depend, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_healthplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_depend)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_name)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_hours)
                            .addComponent(txt_Hours, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Payrate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_rate))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_name)
                .addGap(10, 10, 10)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_hours)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Payrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addComponent(lb_rate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_depend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_depend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_healthplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        resultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Computed Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); 

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel6.setText("Pay for");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel7.setText("Gross Pay");

        txt_payfor.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txt_payfor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_payfor.setEnabled(false);

        txt_grosspay.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txt_grosspay.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_grosspay.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel8.setText("Fed Tax");

        txt_fedtax.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txt_fedtax.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_fedtax.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel9.setText("Health Premium");

        txt_healthpre.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txt_healthpre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_healthpre.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel10.setText("Fica");

        txt_fica.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txt_fica.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_fica.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel11.setText("Net Pay");

        txt_netpay.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        txt_netpay.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_netpay.setEnabled(false);

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_grosspay, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(resultPanelLayout.createSequentialGroup()
                            .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(resultPanelLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(txt_fedtax, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_payfor, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_healthpre)
                            .addComponent(txt_fica)
                            .addComponent(txt_netpay))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_payfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_grosspay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_fedtax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_healthpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_fica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_netpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); 

        btn_compute.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btn_compute.setText("Compute Pay");
        btn_compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_computeActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_compute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_compute, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel12.setText("Payroll Program");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // this function will reset all warning lable
    private void resetLable(){
        lb_name.setText(" ");
        lb_depend.setText(" ");
        lb_rate.setText(" ");
        lb_hours.setText(" ");
    }

    // this fuction will check if inputs data are valid or not
    private boolean checkInput(){
        name = txt_Name.getText();
        strhour = txt_Hours.getText();
        strrate = txt_Payrate.getText();
        strdepend = txt_depend.getText();
        flag = true;

        //input data checking
        if(name.trim().isEmpty()){
            lb_name.setText("Missing name");
            flag = false;            
        } else if(!payrollop.onlyLetter(name)){
            lb_name.setText("Unvalid input name");
            flag = false;
        }

        if(strhour.trim().isEmpty()){
            lb_hours.setText("Missing working hours");
            flag = false;
        } else if(!payrollop.isInt(strhour)){
            lb_hours.setText("Unvalid input for working hours");
            flag = false;
        } else {
            hours = Integer.parseInt(strhour);
            if(hours<0 || hours>112){
                lb_hours.setText("Unvalid input for working hours");
                flag = false;
            } 
        }

        if(strrate.trim().isEmpty()){
            lb_rate.setText("Missing rate");
            flag = false;
        } else if(!payrollop.isDouble(strrate)){
            lb_rate.setText("Unvalid input for rate");
            flag = false;
        } else {
            rate = Double.parseDouble(strrate);
            if(rate<0){
                lb_rate.setText("Pay rate is a nonnegative number");
                flag = false;
            } 
        }

        if(strdepend.trim().isEmpty()){
            lb_depend.setText("Missing dependents");
            flag = false;
        }else if(!payrollop.isInt(strdepend)){
            lb_depend.setText("Unvalid input for dependents");
            flag = false;
        } else {
            depend = Integer.parseInt(strdepend);
            if(depend<0 || depend>15){
                lb_depend.setText("Unvalid input for dependents");
                flag = false;
            } 
        }

        return flag;
    }

    private void btn_computeActionPerformed(java.awt.event.ActionEvent evt) {
        //everytime user click on compute button, we need to reset all result field 
        // and do the calculation again
        resetLable();
        txt_fedtax.setText("");
        txt_fica.setText("");
        txt_grosspay.setText("");
        txt_healthpre.setText("");
        txt_netpay.setText("");
        txt_payfor.setText("");
        name = txt_Name.getText();
        strhour = txt_Hours.getText();
        strrate = txt_Payrate.getText();
        strdepend = txt_depend.getText();
        insurance = cb_healthplan.getSelectedItem().toString();


        if(checkInput()){//all inputs are valid
            hours = Integer.parseInt(strhour);
            rate = Double.parseDouble(strrate);
            depend = Integer.parseInt(strdepend);

            //do computation
            grosspay = payrollop.grosspay(rate, hours);
            fedtax = payrollop.fedtax(grosspay);
            if(insurance == "Yes"){
                healthins = payrollop.healthinsurance(depend);
            } else{
                healthins = 0;
            }
            fica = payrollop.fica(grosspay);
            netpay = payrollop.netpay(grosspay, fedtax, healthins, fica);

            // display result
            txt_payfor.setText(name);
            temp = String.format("%1$,.2f", grosspay);
            txt_grosspay.setText(temp);
            temp = String.format("%1$,.2f", fedtax);
            txt_fedtax.setText(temp);
            temp = String.format("%1$,.2f", healthins);
            txt_healthpre.setText(temp);
            temp = String.format("%1$,.2f", fica);
            txt_fica.setText(temp);
            temp = String.format("%1$,.2f", netpay);
            txt_netpay.setText(temp);
        }
    }

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {
        txt_Hours.setText("");
        txt_Payrate.setText("");
        txt_depend.setText("");
        txt_fedtax.setText("");
        txt_fica.setText("");
        txt_grosspay.setText("");
        txt_healthpre.setText("");
        txt_netpay.setText("");
        txt_payfor.setText("");
        cb_healthplan.setSelectedIndex(0);
        resetLable();
    }

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_compute;
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox cb_healthplan;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_depend;
    private javax.swing.JLabel lb_hours;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_rate;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JTextField txt_Hours;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Payrate;
    private javax.swing.JTextField txt_depend;
    private javax.swing.JTextField txt_fedtax;
    private javax.swing.JTextField txt_fica;
    private javax.swing.JTextField txt_grosspay;
    private javax.swing.JTextField txt_healthpre;
    private javax.swing.JTextField txt_netpay;
    private javax.swing.JTextField txt_payfor;
	private String name;
    private String strhour;
    private String strrate;
    private String strdepend;
    private int hours;
    private double rate;
    private int depend;
    private String insurance;
    private String temp;
    private boolean flag;
    private double grosspay;
    private double fedtax;
    private double healthins;
    private double fica;
    private double netpay;
    private operations payrollop;
}
