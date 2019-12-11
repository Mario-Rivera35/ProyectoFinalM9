package calculadora.cientifica;

public class estandar extends javax.swing.JFrame {

    private boolean igual, inicio = true, operacion1, operacion2;
    private double a, b, c, cos, acos, sin, asin, tan, atan, memoria = 0, resultado, valor1, valor2;
    private String cadena, funciones, tipoOperaciones;

    public estandar() {
        initComponents();
        Label_Memoria.setVisible(false);
        setTitle("Calculadora Estándar");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Button_1x = new javax.swing.JButton();
        Button_Porcentaje = new javax.swing.JButton();
        Button_N1 = new javax.swing.JButton();
        Button_Mmenos = new javax.swing.JButton();
        Button_MS = new javax.swing.JButton();
        Button_N4 = new javax.swing.JButton();
        Button_MR = new javax.swing.JButton();
        Button_MC = new javax.swing.JButton();
        Button_N5 = new javax.swing.JButton();
        Button_Mmas = new javax.swing.JButton();
        Button_N3 = new javax.swing.JButton();
        Button_RaizCuadrada = new javax.swing.JButton();
        Button_N6 = new javax.swing.JButton();
        Button_C = new javax.swing.JButton();
        Button_Multiplicacion = new javax.swing.JButton();
        Button_CE = new javax.swing.JButton();
        Button_N9 = new javax.swing.JButton();
        Button_Division = new javax.swing.JButton();
        Button_N2 = new javax.swing.JButton();
        Button_Signo = new javax.swing.JButton();
        Button_N7 = new javax.swing.JButton();
        Button_N8 = new javax.swing.JButton();
        Button_Decimal = new javax.swing.JButton();
        Button_N0 = new javax.swing.JButton();
        Button_gual = new javax.swing.JButton();
        Button_Resta = new javax.swing.JButton();
        Button_Suma = new javax.swing.JButton();
        Button_Retroseso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Label_Memoria = new javax.swing.JLabel();
        TextField_Principal = new javax.swing.JTextField();
        TextField_Previo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_estandar = new javax.swing.JMenuItem();
        jMenuItem_cientifica = new javax.swing.JMenuItem();
        jMenuItem_salir = new javax.swing.JMenuItem();
        acerca_de = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ");

        Button_1x.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Button_1x.setText("1/x");
        Button_1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1xActionPerformed(evt);
            }
        });

        Button_Porcentaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Porcentaje.setText("%");
        Button_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PorcentajeActionPerformed(evt);
            }
        });

        Button_N1.setBackground(new java.awt.Color(255, 255, 255));
        Button_N1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N1.setText("1");
        Button_N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N1ActionPerformed(evt);
            }
        });

        Button_Mmenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Mmenos.setText("M-");
        Button_Mmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MmenosActionPerformed(evt);
            }
        });

        Button_MS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MS.setText("MS");
        Button_MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MSActionPerformed(evt);
            }
        });

        Button_N4.setBackground(new java.awt.Color(255, 255, 255));
        Button_N4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N4.setText("4");
        Button_N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N4ActionPerformed(evt);
            }
        });

        Button_MR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MR.setText("MR");
        Button_MR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MRActionPerformed(evt);
            }
        });

        Button_MC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MC.setText("MC");
        Button_MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MCActionPerformed(evt);
            }
        });

        Button_N5.setBackground(new java.awt.Color(255, 255, 255));
        Button_N5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N5.setText("5");
        Button_N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N5ActionPerformed(evt);
            }
        });

        Button_Mmas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Mmas.setText("M+");
        Button_Mmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MmasActionPerformed(evt);
            }
        });

        Button_N3.setBackground(new java.awt.Color(255, 255, 255));
        Button_N3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N3.setText("3");
        Button_N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N3ActionPerformed(evt);
            }
        });

        Button_RaizCuadrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_RaizCuadrada.setText("√");
        Button_RaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RaizCuadradaActionPerformed(evt);
            }
        });

        Button_N6.setBackground(new java.awt.Color(255, 255, 255));
        Button_N6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N6.setText("6");
        Button_N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N6ActionPerformed(evt);
            }
        });

        Button_C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_C.setForeground(new java.awt.Color(251, 54, 1));
        Button_C.setText("C");
        Button_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CActionPerformed(evt);
            }
        });

        Button_Multiplicacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Multiplicacion.setText("*");
        Button_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MultiplicacionActionPerformed(evt);
            }
        });

        Button_CE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_CE.setForeground(new java.awt.Color(251, 115, 0));
        Button_CE.setText("CE");
        Button_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CEActionPerformed(evt);
            }
        });

        Button_N9.setBackground(new java.awt.Color(255, 255, 255));
        Button_N9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N9.setText("9");
        Button_N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N9ActionPerformed(evt);
            }
        });

        Button_Division.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Division.setText("/");
        Button_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DivisionActionPerformed(evt);
            }
        });

        Button_N2.setBackground(new java.awt.Color(255, 255, 255));
        Button_N2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N2.setText("2");
        Button_N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N2ActionPerformed(evt);
            }
        });

        Button_Signo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Signo.setText("±");
        Button_Signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SignoActionPerformed(evt);
            }
        });

        Button_N7.setBackground(new java.awt.Color(255, 255, 255));
        Button_N7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N7.setText("7");
        Button_N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N7ActionPerformed(evt);
            }
        });

        Button_N8.setBackground(new java.awt.Color(255, 255, 255));
        Button_N8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N8.setText("8");
        Button_N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N8ActionPerformed(evt);
            }
        });

        Button_Decimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Decimal.setText(".");
        Button_Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DecimalActionPerformed(evt);
            }
        });

        Button_N0.setBackground(new java.awt.Color(255, 255, 255));
        Button_N0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N0.setText("0");
        Button_N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N0ActionPerformed(evt);
            }
        });

        Button_gual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_gual.setText("=");
        Button_gual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_gualActionPerformed(evt);
            }
        });

        Button_Resta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Resta.setText("-");
        Button_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RestaActionPerformed(evt);
            }
        });

        Button_Suma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Suma.setText("+");
        Button_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SumaActionPerformed(evt);
            }
        });

        Button_Retroseso.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Retroseso.setText("<--");
        Button_Retroseso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RetrosesoActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Memoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Memoria.setText("M");
        jPanel1.add(Label_Memoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        TextField_Principal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TextField_Principal.setForeground(new java.awt.Color(0, 51, 153));
        TextField_Principal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField_Principal.setText("0 ");
        TextField_Principal.setToolTipText("");
        TextField_Principal.setBorder(null);
        TextField_Principal.setFocusable(false);
        jPanel1.add(TextField_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 48));

        TextField_Previo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextField_Previo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField_Previo.setText(" ");
        TextField_Previo.setBorder(null);
        TextField_Previo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextField_Previo.setFocusable(false);
        jPanel1.add(TextField_Previo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 270, 24));

        jMenu1.setText("Ver");

        jMenuItem_estandar.setText("Estandar");
        jMenuItem_estandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_estandarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_estandar);

        jMenuItem_cientifica.setText("Cientifica");
        jMenuItem_cientifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cientificaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_cientifica);

        jMenuItem_salir.setText("Salir");
        jMenuItem_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_salir);

        jMenuBar1.add(jMenu1);

        acerca_de.setText("Ayuda");

        jMenuItem4.setText("Acerca de");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        acerca_de.add(jMenuItem4);

        jMenuBar1.add(acerca_de);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_N0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Button_N1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Retroseso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_CE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_MR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Decimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Button_N3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_N6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_N9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_MS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Signo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Mmas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Mmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_RaizCuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Button_Multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_gual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Mmas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Mmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Retroseso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_RaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_N7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_N4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_N1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_N0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_gual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botones numericos
    private void Button_N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N1ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("1");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "1");
        }
    }//GEN-LAST:event_Button_N1ActionPerformed

    private void Button_N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N2ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("2");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "2");
        }
    }//GEN-LAST:event_Button_N2ActionPerformed

    private void Button_N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N3ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("3");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "3");
        }
    }//GEN-LAST:event_Button_N3ActionPerformed

    private void Button_N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N4ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("4");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "4");
        }
    }//GEN-LAST:event_Button_N4ActionPerformed

    private void Button_N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N5ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("5");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "5");
        }
    }//GEN-LAST:event_Button_N5ActionPerformed

    private void Button_N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N6ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("6");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "6");
        }
    }//GEN-LAST:event_Button_N6ActionPerformed

    private void Button_N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N7ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("7");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "7");
        }
    }//GEN-LAST:event_Button_N7ActionPerformed

    private void Button_N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N8ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("8");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "8");
        }
    }//GEN-LAST:event_Button_N8ActionPerformed

    private void Button_N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N9ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("9");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "9");
        }
    }//GEN-LAST:event_Button_N9ActionPerformed

    private void Button_N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N0ActionPerformed
        if (inicio == true) {
            TextField_Principal.setText("");
            TextField_Principal.setText("0");
            inicio = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + "0");
        }
    }//GEN-LAST:event_Button_N0ActionPerformed

    //Botón la función de punto decimal
    private void Button_DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DecimalActionPerformed
        if (TextField_Principal.getText().contains(".")) {

        } else {
            TextField_Principal.setText(TextField_Principal.getText() + ".");
            inicio = false;
        }
    }//GEN-LAST:event_Button_DecimalActionPerformed

    //Botón de la función de suma
    private void Button_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SumaActionPerformed
        igual = true;
        inicio = true;
        //Condicion para la variable operacion 1
        if (operacion1 = true) {
            valor1 = Double.parseDouble(TextField_Principal.getText());
            TextField_Previo.setText("");
            TextField_Previo.setText(TextField_Principal.getText() + "+");
            operacion1 = false;
        } else {

            //Condicion para la variable operacion 2
            if (operacion2 = true) {
                valor2 = Double.parseDouble(TextField_Principal.getText());
                TextField_Previo.setText("");
                TextField_Previo.setText(TextField_Principal.getText() + "+");
                operacion2 = false;
            } else {
                TextField_Previo.setText(TextField_Principal.getText() + "+");
                Operaciones(resultado, valor2);
            }
        }

        tipoOperaciones = "+";
    }//GEN-LAST:event_Button_SumaActionPerformed

    //Botón de la función de resta
    private void Button_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RestaActionPerformed
        igual = true;
        inicio = true;
        //Condicion para la variable operacion 1
        if (operacion1 = true) {
            valor1 = Double.parseDouble(TextField_Principal.getText());
            TextField_Previo.setText("");
            TextField_Previo.setText(TextField_Principal.getText() + "-");
            operacion1 = false;
        } else {

            //Condicion para la variable operacion 2
            if (operacion2 = true) {
                valor2 = Double.parseDouble(TextField_Principal.getText());
                TextField_Previo.setText("");
                TextField_Previo.setText(TextField_Principal.getText() + "-");
                operacion2 = false;
            } else {
                TextField_Previo.setText(TextField_Principal.getText() + "-");
                Operaciones(resultado, valor2);
            }
        }

        tipoOperaciones = "-";
    }//GEN-LAST:event_Button_RestaActionPerformed

    //Botón de la función de multiplicar
    private void Button_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MultiplicacionActionPerformed
        igual = true;
        inicio = true;
        //Condicion para la variable operacion 1
        if (operacion1 = true) {
            valor1 = Double.parseDouble(TextField_Principal.getText());
            TextField_Previo.setText("");
            TextField_Previo.setText(TextField_Principal.getText() + "*");
            operacion1 = false;
        } else {

            //Condicion para la variable operacion 2
            if (operacion2 = true) {
                valor2 = Double.parseDouble(TextField_Principal.getText());
                TextField_Previo.setText("");
                TextField_Previo.setText(TextField_Principal.getText() + "*");
                operacion2 = false;
            } else {
                TextField_Previo.setText(TextField_Principal.getText() + "*");
                Operaciones(resultado, valor2);
            }
        }

        tipoOperaciones = "*";
    }//GEN-LAST:event_Button_MultiplicacionActionPerformed

    //Botón de la función de división
    private void Button_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DivisionActionPerformed
        igual = true;
        inicio = true;
        //Condicion para la variable operacion 1
        if (operacion1 = true) {
            valor1 = Double.parseDouble(TextField_Principal.getText());
            TextField_Previo.setText("");
            TextField_Previo.setText(TextField_Principal.getText() + "/");
            operacion1 = false;
        } else {

            //Condicion para la variable operacion 2
            if (operacion2 = true) {
                valor2 = Double.parseDouble(TextField_Principal.getText());
                TextField_Previo.setText("");
                TextField_Previo.setText(TextField_Principal.getText() + "/");
                operacion2 = false;
            } else {
                TextField_Previo.setText(TextField_Principal.getText() + "/");
                Operaciones(resultado, valor2);
            }
        }

        tipoOperaciones = "/";
    }//GEN-LAST:event_Button_DivisionActionPerformed

    //Metodo con las operaciones bascias
    private void Operaciones(double valor1, double valor2) {
        //Switch que evalua la variable tipoOperaciones
        switch (tipoOperaciones) {
            case "+":
                resultado = valor1 + valor2;
                TextField_Principal.setText(resultado + "");
                valor1 = Double.parseDouble(TextField_Principal.getText());
                break;
            case "-":
                resultado = valor1 - valor2;
                TextField_Principal.setText(resultado + "");
                valor1 = Double.parseDouble(TextField_Principal.getText());
                break;
            case "*":
                resultado = valor1 * valor2;
                TextField_Principal.setText(resultado + "");
                valor1 = Double.parseDouble(TextField_Principal.getText());
                break;
            case "/":
                if (valor2 == 0) {
                    TextField_Principal.setText("Infinity");
                    break;
                } else {
                    resultado = valor1 / valor2;
                    TextField_Principal.setText(resultado + "");
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    break;
                }
            //Caso de la funcion que eleva la potencia de un numero
            case "potencia":
                resultado = Math.pow(valor1, valor2);
                TextField_Principal.setText(resultado + "");
                break;

            //Caso que saca la raiz de un numero
            case "raizx":
                if (valor2 <= 0) {
                    TextField_Principal.setText("Syntax Error");
                    break;
                } else {
                    TextField_Previo.setText(valor2 + " yroot ");
                    a = 1;
                    c = a / valor2;
                    TextField_Principal.setText(Math.pow(valor1, c) + "");
                    break;
                }
        }
    }

    //Botón de la función de igual
    private void Button_gualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_gualActionPerformed
        inicio = true;
        operacion1 = true;

        if (igual = true) {
            if (tipoOperaciones == null) {

            } else {
                valor2 = Double.parseDouble(TextField_Principal.getText());
                TextField_Previo.setText(TextField_Previo.getText() + TextField_Principal.getText());
                Operaciones(valor1, valor2);
                igual = false;
            }
        } else {
            TextField_Previo.setText("");
            Operaciones(valor1, valor2);
        }
    }//GEN-LAST:event_Button_gualActionPerformed

    //Botón con la función de RAIZ CUADRADA
    private void Button_RaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RaizCuadradaActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        if (valor1 >= 0) {
            TextField_Previo.setText("sqrt(" + valor1 + ")");
            TextField_Principal.setText(Math.sqrt(valor1) + "");
        } else {
            TextField_Principal.setText("Syntax Error");
        }
    }//GEN-LAST:event_Button_RaizCuadradaActionPerformed

    //Botón con la función de PORCENTAJE
    private void Button_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PorcentajeActionPerformed
        valor2 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText(TextField_Previo.getText() + TextField_Principal.getText());
        TextField_Principal.setText((valor1 * valor2) / 100 + " ");
        igual = true;
    }//GEN-LAST:event_Button_PorcentajeActionPerformed

    //Botón que realiza la operación inversa 1/x
    private void Button_1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1xActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText("Reciproco( " + valor1 + " )");
        TextField_Principal.setText(1 / valor1 + "");
    }//GEN-LAST:event_Button_1xActionPerformed

    //Botón que realiza la operación cambio de signo
    private void Button_SignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SignoActionPerformed
        double nu1 = 0, nu2, nu3;

        nu2 = Double.parseDouble(TextField_Principal.getText());
        nu3 = nu1 - nu2;
        TextField_Principal.setText(nu3 + " ");
    }//GEN-LAST:event_Button_SignoActionPerformed

    //Botón con la función de C
    private void Button_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CActionPerformed
        TextField_Principal.setText("0");
        TextField_Previo.setText("");
        inicio = true;
        funciones = "";
        operacion1 = true;
        operacion2 = true;
        igual = true;
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
    }//GEN-LAST:event_Button_CActionPerformed

    //Botón con la función de CE
    private void Button_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CEActionPerformed
        TextField_Principal.setText("0");
        TextField_Previo.setText("");
        inicio = true;
        funciones = "";
    }//GEN-LAST:event_Button_CEActionPerformed

    //Botón con la función de RETROCEDER
    private void Button_RetrosesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RetrosesoActionPerformed
        if (TextField_Principal.getText().length() > 0) {
            TextField_Principal.setText(TextField_Principal.getText().substring(0, TextField_Principal.getText().length() - 1));
            if (TextField_Principal.getText().length() == 0) {
                TextField_Principal.setText("0");
                inicio = true;
            }
        }
    }//GEN-LAST:event_Button_RetrosesoActionPerformed

    //Botón con la función MC
    private void Button_MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MCActionPerformed
        memoria = 0;
        Label_Memoria.setVisible(false);
    }//GEN-LAST:event_Button_MCActionPerformed

    //Botón con la función MR
    private void Button_MRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MRActionPerformed
        TextField_Principal.setText(memoria + "");
    }//GEN-LAST:event_Button_MRActionPerformed
//Botón con la función MS
    private void Button_MSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MSActionPerformed
        memoria = Double.parseDouble(TextField_Principal.getText());
        Label_Memoria.setVisible(true);
    }//GEN-LAST:event_Button_MSActionPerformed
//Botón con la función M+
    private void Button_MmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MmasActionPerformed
        memoria = memoria + Double.parseDouble(TextField_Principal.getText());
        Label_Memoria.setVisible(true);
    }//GEN-LAST:event_Button_MmasActionPerformed
//Botón con la función M-
    private void Button_MmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MmenosActionPerformed
        memoria = memoria - Double.parseDouble(TextField_Principal.getText());
        Label_Memoria.setVisible(true);
    }//GEN-LAST:event_Button_MmenosActionPerformed

    private void jMenuItem_estandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_estandarActionPerformed
        estandar es = new estandar();
        es.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_estandarActionPerformed

    private void jMenuItem_cientificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cientificaActionPerformed
        cientifica cf = new cientifica();
        cf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_cientificaActionPerformed

    private void jMenuItem_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem_salirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        acerca ac = new acerca();
        ac.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(estandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estandar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_1x;
    private javax.swing.JButton Button_C;
    private javax.swing.JButton Button_CE;
    private javax.swing.JButton Button_Decimal;
    private javax.swing.JButton Button_Division;
    private javax.swing.JButton Button_MC;
    private javax.swing.JButton Button_MR;
    private javax.swing.JButton Button_MS;
    private javax.swing.JButton Button_Mmas;
    private javax.swing.JButton Button_Mmenos;
    private javax.swing.JButton Button_Multiplicacion;
    private javax.swing.JButton Button_N0;
    private javax.swing.JButton Button_N1;
    private javax.swing.JButton Button_N2;
    private javax.swing.JButton Button_N3;
    private javax.swing.JButton Button_N4;
    private javax.swing.JButton Button_N5;
    private javax.swing.JButton Button_N6;
    private javax.swing.JButton Button_N7;
    private javax.swing.JButton Button_N8;
    private javax.swing.JButton Button_N9;
    private javax.swing.JButton Button_Porcentaje;
    private javax.swing.JButton Button_RaizCuadrada;
    private javax.swing.JButton Button_Resta;
    private javax.swing.JButton Button_Retroseso;
    private javax.swing.JButton Button_Signo;
    private javax.swing.JButton Button_Suma;
    private javax.swing.JButton Button_gual;
    private javax.swing.JLabel Label_Memoria;
    private javax.swing.JTextField TextField_Previo;
    private javax.swing.JTextField TextField_Principal;
    private javax.swing.JMenu acerca_de;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_cientifica;
    private javax.swing.JMenuItem jMenuItem_estandar;
    private javax.swing.JMenuItem jMenuItem_salir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
