package calculadora.cientifica;

import java.awt.Color;

public class cientifica extends javax.swing.JFrame {

    private boolean igual, inicio = true, operacion1, operacion2;
    private double a, b, c, cos, acos, sin, asin, tan, atan, memoria = 0, resultado, valor1, valor2;
    private String cadena, funciones, tipoOperaciones;

    public cientifica() {
        initComponents();
        Label_Memoria.setVisible(false);
        setTitle("Calculadora Cientifica");
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
        Button_Asin = new javax.swing.JButton();
        Button_MS = new javax.swing.JButton();
        Button_Cubo = new javax.swing.JButton();
        Button_N4 = new javax.swing.JButton();
        Button_Sin = new javax.swing.JButton();
        Button_RaizX = new javax.swing.JButton();
        Button_Tan = new javax.swing.JButton();
        Button_MR = new javax.swing.JButton();
        Button_MC = new javax.swing.JButton();
        Button_N5 = new javax.swing.JButton();
        Button_Mmas = new javax.swing.JButton();
        Button_N3 = new javax.swing.JButton();
        Button_Cos = new javax.swing.JButton();
        Button_RaizCuadrada = new javax.swing.JButton();
        Button_N6 = new javax.swing.JButton();
        Button_C = new javax.swing.JButton();
        Button_Multiplicacion = new javax.swing.JButton();
        Button_CE = new javax.swing.JButton();
        Button_Xmenos1 = new javax.swing.JButton();
        Button_N9 = new javax.swing.JButton();
        Button_Exponente = new javax.swing.JButton();
        Button_Division = new javax.swing.JButton();
        Button_PI = new javax.swing.JButton();
        Button_N2 = new javax.swing.JButton();
        Button_Signo = new javax.swing.JButton();
        Button_N7 = new javax.swing.JButton();
        Button_N8 = new javax.swing.JButton();
        Button_EXP = new javax.swing.JButton();
        Button_10levarX = new javax.swing.JButton();
        Button_Decimal = new javax.swing.JButton();
        Button_N0 = new javax.swing.JButton();
        Button_log = new javax.swing.JButton();
        Button_RaizCubica = new javax.swing.JButton();
        Button_Factorial = new javax.swing.JButton();
        Button_gual = new javax.swing.JButton();
        Button_Acos = new javax.swing.JButton();
        Button_Resta = new javax.swing.JButton();
        Button_Atan = new javax.swing.JButton();
        Button_Suma = new javax.swing.JButton();
        Button_E = new javax.swing.JButton();
        Button_Cuadrado = new javax.swing.JButton();
        Button_Retroseso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Label_Memoria = new javax.swing.JLabel();
        TextField_Principal = new javax.swing.JTextField();
        TextField_Previo = new javax.swing.JTextField();
        RadioButton_Sexages = new javax.swing.JRadioButton();
        RadioButton_Radianes = new javax.swing.JRadioButton();
        Button_primo = new javax.swing.JButton();
        Button_nesimo = new javax.swing.JButton();
        Button_seriefibo = new javax.swing.JButton();
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

        Button_Asin.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_Asin.setText("sin-1");
        Button_Asin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AsinActionPerformed(evt);
            }
        });

        Button_MS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MS.setText("MS");
        Button_MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MSActionPerformed(evt);
            }
        });

        Button_Cubo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cubo.setText("x^3");
        Button_Cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CuboActionPerformed(evt);
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

        Button_Sin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Sin.setText("sin");
        Button_Sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SinActionPerformed(evt);
            }
        });

        Button_RaizX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_RaizX.setText("y√x");
        Button_RaizX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RaizXActionPerformed(evt);
            }
        });

        Button_Tan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Tan.setText("tan");
        Button_Tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TanActionPerformed(evt);
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

        Button_Cos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cos.setText("cos");
        Button_Cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CosActionPerformed(evt);
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

        Button_Xmenos1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Xmenos1.setText("x^-1");
        Button_Xmenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Xmenos1ActionPerformed(evt);
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

        Button_Exponente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Exponente.setText("x^y");
        Button_Exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExponenteActionPerformed(evt);
            }
        });

        Button_Division.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Division.setText("/");
        Button_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DivisionActionPerformed(evt);
            }
        });

        Button_PI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_PI.setText("pi(π)");
        Button_PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PIActionPerformed(evt);
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

        Button_EXP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_EXP.setText("EXP");
        Button_EXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EXPActionPerformed(evt);
            }
        });

        Button_10levarX.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_10levarX.setText("10^x");
        Button_10levarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_10levarXActionPerformed(evt);
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

        Button_log.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_log.setText("log");
        Button_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_logActionPerformed(evt);
            }
        });

        Button_RaizCubica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_RaizCubica.setText("3√x");
        Button_RaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RaizCubicaActionPerformed(evt);
            }
        });

        Button_Factorial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Factorial.setText("n!");
        Button_Factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FactorialActionPerformed(evt);
            }
        });

        Button_gual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_gual.setText("=");
        Button_gual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_gualActionPerformed(evt);
            }
        });

        Button_Acos.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_Acos.setText("cos-1");
        Button_Acos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AcosActionPerformed(evt);
            }
        });

        Button_Resta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Resta.setText("-");
        Button_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RestaActionPerformed(evt);
            }
        });

        Button_Atan.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_Atan.setText("tan-1");
        Button_Atan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AtanActionPerformed(evt);
            }
        });

        Button_Suma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Suma.setText("+");
        Button_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SumaActionPerformed(evt);
            }
        });

        Button_E.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_E.setText("e");
        Button_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EActionPerformed(evt);
            }
        });

        Button_Cuadrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cuadrado.setText("x^2");
        Button_Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CuadradoActionPerformed(evt);
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
        jPanel1.add(Label_Memoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        TextField_Principal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TextField_Principal.setForeground(new java.awt.Color(0, 51, 153));
        TextField_Principal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField_Principal.setText("0 ");
        TextField_Principal.setToolTipText("");
        TextField_Principal.setBorder(null);
        TextField_Principal.setFocusable(false);
        jPanel1.add(TextField_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 530, 48));

        TextField_Previo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextField_Previo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField_Previo.setText(" ");
        TextField_Previo.setBorder(null);
        TextField_Previo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextField_Previo.setFocusable(false);
        jPanel1.add(TextField_Previo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 530, 24));

        buttonGroup1.add(RadioButton_Sexages);
        RadioButton_Sexages.setSelected(true);
        RadioButton_Sexages.setText("Sexages");

        buttonGroup1.add(RadioButton_Radianes);
        RadioButton_Radianes.setText("Radianes");

        Button_primo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_primo.setText("primo");
        Button_primo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Button_primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_primoActionPerformed(evt);
            }
        });

        Button_nesimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_nesimo.setText("n-esimo");
        Button_nesimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Button_nesimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_nesimoActionPerformed(evt);
            }
        });

        Button_seriefibo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_seriefibo.setText("serie fibo");
        Button_seriefibo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Button_seriefibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_seriefiboActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_primo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_nesimo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_seriefibo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_10levarX, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_EXP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_log, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_N0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Button_Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_RaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_N1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Button_E, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_RaizX, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Cubo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_N4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Button_PI, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Xmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_N7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Button_Acos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Asin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Atan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Button_Retroseso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Button_CE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Button_N8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Button_N5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Button_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Sin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Tan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_MR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioButton_Sexages)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButton_Radianes)
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_Sexages)
                    .addComponent(RadioButton_Radianes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Tan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Mmas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Mmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_primo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Acos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Asin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Atan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Retroseso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_RaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_nesimo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_PI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Xmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_seriefibo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_E, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_RaizX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cubo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_RaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_10levarX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_EXP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_log, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_gual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    //Metodo Trigonometria
    public void Trigonometria() {
        //Condicion que evalua el RadioButton si es seleccionado
        if (RadioButton_Sexages.isSelected()) {
            //Switch que evalua la varibale funciones
            switch (funciones) {
                //Seno
                case "sin":
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    TextField_Previo.setText("sin( " + valor1 + " )");
                    sin = Math.sin(Math.PI * (valor1) / 180);
                    TextField_Principal.setText(sin + "");
                    break;

                //Seno Inverso
                case "asin":
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    TextField_Previo.setText("asin( " + valor1 + " )");
                    asin = Math.asin(valor1) * 180 / Math.PI;
                    TextField_Principal.setText(asin + "");
                    break;
                //Coseno
                case "cos":
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    TextField_Previo.setText("cos( " + valor1 + " )");
                    cos = Math.cos(Math.PI * (valor1) / 180);
                    TextField_Principal.setText(cos + "");
                    break;

                //Coseno Inverso
                case "acos":
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    TextField_Previo.setText("acos( " + valor1 + " )");
                    acos = Math.acos(valor1) * 180 / Math.PI;
                    TextField_Principal.setText(acos + "");
                    break;

                //Tangente
                case "tan":
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    TextField_Previo.setText("tan( " + valor1 + " )");
                    tan = Math.tan(Math.PI * (valor1) / 180);
                    TextField_Principal.setText(tan + "");
                    break;

                //Tangente Inverso
                case "atan":
                    valor1 = Double.parseDouble(TextField_Principal.getText());
                    TextField_Previo.setText("atan( " + valor1 + " )");
                    atan = Math.atan(valor1) * 180 / Math.PI;
                    TextField_Principal.setText(atan + "");
                    break;
            }
        } else {
            //Condicion que evalua el RadioButton si es seleccionado
            if (RadioButton_Radianes.isSelected()) {
                //Switch que evalua la varibale funciones
                switch (funciones) {
                    //Seno
                    case "sin":
                        valor1 = Double.parseDouble(TextField_Principal.getText());
                        TextField_Previo.setText("sinr( " + valor1 + " )");
                        sin = Math.sin(valor1);
                        TextField_Principal.setText(sin + "");
                        break;

                    //Seno Inverso
                    case "asin":
                        valor1 = Double.parseDouble(TextField_Principal.getText());
                        TextField_Previo.setText("asinr( " + valor1 + " )");
                        asin = Math.asin(valor1);
                        TextField_Principal.setText(asin + "");
                        break;
                    //Coseno
                    case "cos":
                        valor1 = Double.parseDouble(TextField_Principal.getText());
                        TextField_Previo.setText("cosr( " + valor1 + " )");
                        cos = Math.cos(valor1);
                        TextField_Principal.setText(cos + "");
                        break;

                    //Coseno Inverso
                    case "acos":
                        valor1 = Double.parseDouble(TextField_Principal.getText());
                        TextField_Previo.setText("acosr( " + valor1 + " )");
                        acos = Math.acos(valor1);
                        TextField_Principal.setText(acos + "");
                        break;

                    //Tangente
                    case "tan":
                        valor1 = Double.parseDouble(TextField_Principal.getText());
                        TextField_Previo.setText("tanr( " + valor1 + " )");
                        tan = Math.tan(valor1);
                        TextField_Principal.setText(tan + "");
                        break;

                    //Tangente Inverso
                    case "atan":
                        valor1 = Double.parseDouble(TextField_Principal.getText());
                        TextField_Previo.setText("atanr( " + valor1 + " )");
                        atan = Math.atan(valor1);
                        TextField_Principal.setText(atan + "");
                        break;
                }
            }
        }
    }

    private void Button_CosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CosActionPerformed
        funciones = "cos";
        Trigonometria();
    }//GEN-LAST:event_Button_CosActionPerformed

    private void Button_SinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SinActionPerformed
        funciones = "sin";
        Trigonometria();
    }//GEN-LAST:event_Button_SinActionPerformed

    private void Button_TanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TanActionPerformed
        funciones = "tan";
        Trigonometria();
    }//GEN-LAST:event_Button_TanActionPerformed

    private void Button_AcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AcosActionPerformed
        funciones = "acos";
        Trigonometria();
    }//GEN-LAST:event_Button_AcosActionPerformed

    private void Button_AsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AsinActionPerformed
        funciones = "asin";
        Trigonometria();
    }//GEN-LAST:event_Button_AsinActionPerformed

    private void Button_AtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AtanActionPerformed
        funciones = "atan";
        Trigonometria();
    }//GEN-LAST:event_Button_AtanActionPerformed

    //Botón que devuelve el valor de Pi
    private void Button_PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PIActionPerformed
        TextField_Previo.setText("PI: ");
        TextField_Principal.setText(Math.PI + "");
    }//GEN-LAST:event_Button_PIActionPerformed

    //Botón que eleva a x a la -1
    private void Button_Xmenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Xmenos1ActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText(valor1 + " ˄-1");
        TextField_Principal.setText(Math.pow(valor1, -1) + "");
    }//GEN-LAST:event_Button_Xmenos1ActionPerformed

    //Botón que eleva un numero a x Potencia
    private void Button_ExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExponenteActionPerformed
        inicio = true;
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText(valor1 + "˄");
        tipoOperaciones = "potencia";
        operacion1 = false;
        igual = true;
    }//GEN-LAST:event_Button_ExponenteActionPerformed

    //Botón que saca la raíz x de un número
    private void Button_RaizXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RaizXActionPerformed
        inicio = true;
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText(valor1 + "yroot: ");
        tipoOperaciones = "raizx";
        operacion1 = false;
        igual = true;
    }//GEN-LAST:event_Button_RaizXActionPerformed

    //Botón que eleva a x al cubo
    private void Button_CuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CuboActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText("Cubo( " + valor1 + " )");
        TextField_Principal.setText(Math.pow(valor1, 3) + "");
    }//GEN-LAST:event_Button_CuboActionPerformed

    //Botón que devuelve el factorial de un número
    private void Button_FactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FactorialActionPerformed
        a = 1;
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText("fact( " + valor1 + " )");

        for (b = 1; b <= valor1; b++) {
            a = a * b;
        }

        TextField_Principal.setText(a + " ");
    }//GEN-LAST:event_Button_FactorialActionPerformed

    //Botón que devuelve el valor de e
    private void Button_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EActionPerformed
        TextField_Previo.setText("E ");
        TextField_Principal.setText(Math.E + "");

    }//GEN-LAST:event_Button_EActionPerformed

    //Botón de la raíz cubica
    private void Button_RaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RaizCubicaActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        a = 1;
        b = 3;
        c = a / b;
        TextField_Previo.setText("cuberoot( " + valor1 + " )");
        TextField_Principal.setText(Math.pow(valor1, c) + "");
    }//GEN-LAST:event_Button_RaizCubicaActionPerformed

    //Botón eleva a x al cuadrado
    private void Button_CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CuadradoActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText("sqr( " + valor1 + " )");
        TextField_Principal.setText(Math.pow(valor1, 2) + "");
    }//GEN-LAST:event_Button_CuadradoActionPerformed

    //Botón que eleva 10 a la x potencia
    private void Button_10levarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_10levarXActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText("powten( " + valor1 + " )");
        TextField_Principal.setText(Math.pow(10, valor1) + "");
    }//GEN-LAST:event_Button_10levarXActionPerformed

    //Botón de la exponenciación neperiana
    private void Button_EXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EXPActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Principal.setText(Math.exp(valor1) + "");
    }//GEN-LAST:event_Button_EXPActionPerformed

    //Botón del logaritmo neperiano
    private void Button_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_logActionPerformed
        valor1 = Double.parseDouble(TextField_Principal.getText());
        TextField_Previo.setText("log( " + valor1 + " )");
        TextField_Principal.setText(Math.log(valor1) + "");
    }//GEN-LAST:event_Button_logActionPerformed

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

    //Boton que me dice si es primo o no
    private void Button_primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_primoActionPerformed
        TextField_Previo.setText("primo");
        int m = 2;
        boolean band = true;
        valor1 = Integer.parseInt(TextField_Principal.getText());

        while ((band) && (m < valor1)) {
            if ((valor1 % m) == 0) {
                band = false;
            } else {
                m = m + 1;
            }
        }

        if (band) {
            if (valor1 <= 1) {
                TextField_Principal.setText("El Numero No Es Primo");
            } else {
                TextField_Principal.setText("Tu numero es primo");
            }
        } else {
            TextField_Principal.setText("El Numero No es primo");
        }
    }//GEN-LAST:event_Button_primoActionPerformed

    //Calcular el N_Esimo termino de la serie fibonacci
    private void Button_nesimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_nesimoActionPerformed
        TextField_Previo.setText("n-esimo termino fibonacci");
        int numero, fibo1, fibo2, i;

        valor1 = Integer.parseInt(TextField_Principal.getText());

        fibo1 = 1;
        fibo2 = 1;

        for (i = 2; i <= valor1; i++) {

            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        TextField_Principal.setText("" + fibo1);
    }//GEN-LAST:event_Button_nesimoActionPerformed

    //Calcular toda la serie fibonacci
    private void Button_seriefiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_seriefiboActionPerformed
        TextField_Previo.setText("serie fibonacci");
        int numero, fibo1, fibo2, i;

        valor1 = Integer.parseInt(TextField_Principal.getText());

        fibo1 = 1;
        fibo2 = 1;

        TextField_Principal.setText(fibo1+" ");
        for (i = 2; i <= valor1; i++) {
            TextField_Principal.setText(TextField_Principal.getText() + fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }

    }//GEN-LAST:event_Button_seriefiboActionPerformed

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
            java.util.logging.Logger.getLogger(cientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cientifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cientifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_10levarX;
    private javax.swing.JButton Button_1x;
    private javax.swing.JButton Button_Acos;
    private javax.swing.JButton Button_Asin;
    private javax.swing.JButton Button_Atan;
    private javax.swing.JButton Button_C;
    private javax.swing.JButton Button_CE;
    private javax.swing.JButton Button_Cos;
    private javax.swing.JButton Button_Cuadrado;
    private javax.swing.JButton Button_Cubo;
    private javax.swing.JButton Button_Decimal;
    private javax.swing.JButton Button_Division;
    private javax.swing.JButton Button_E;
    private javax.swing.JButton Button_EXP;
    private javax.swing.JButton Button_Exponente;
    private javax.swing.JButton Button_Factorial;
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
    private javax.swing.JButton Button_PI;
    private javax.swing.JButton Button_Porcentaje;
    private javax.swing.JButton Button_RaizCuadrada;
    private javax.swing.JButton Button_RaizCubica;
    private javax.swing.JButton Button_RaizX;
    private javax.swing.JButton Button_Resta;
    private javax.swing.JButton Button_Retroseso;
    private javax.swing.JButton Button_Signo;
    private javax.swing.JButton Button_Sin;
    private javax.swing.JButton Button_Suma;
    private javax.swing.JButton Button_Tan;
    private javax.swing.JButton Button_Xmenos1;
    private javax.swing.JButton Button_gual;
    private javax.swing.JButton Button_log;
    private javax.swing.JButton Button_nesimo;
    private javax.swing.JButton Button_primo;
    private javax.swing.JButton Button_seriefibo;
    private javax.swing.JLabel Label_Memoria;
    private javax.swing.JRadioButton RadioButton_Radianes;
    private javax.swing.JRadioButton RadioButton_Sexages;
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
