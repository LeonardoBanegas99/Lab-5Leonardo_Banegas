package lab5leonardobanegas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Lab5GUI extends javax.swing.JFrame {

    private ArrayList<Persona> personas = new ArrayList();
    //private ArrayList<Villanos> villanos = new ArrayList();

    public Lab5GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameListas = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaSuperheroes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaVillanos = new javax.swing.JList<>();
        btnregresarLista = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FrameCrearSuperheroes = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfnombreSuperheroe = new javax.swing.JTextField();
        tfpoderSuperheroe = new javax.swing.JTextField();
        tfdebilidadSuperheroe = new javax.swing.JTextField();
        tffuerzaSuperheroe = new javax.swing.JTextField();
        tfagilidadfisicaSuperheroe = new javax.swing.JTextField();
        tfagilidadmentalSuperheroe = new javax.swing.JTextField();
        btncrearSuperheroe = new javax.swing.JButton();
        btnregresarheroe = new javax.swing.JButton();
        FrameCrearVillanos = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        btncrearVillano = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnregresarvillano = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfnombreVillano = new javax.swing.JTextField();
        tfpoderVillano = new javax.swing.JTextField();
        tfdebilidadVillano = new javax.swing.JTextField();
        tffuerzaVillano = new javax.swing.JTextField();
        tfagilidadfisicaVillano = new javax.swing.JTextField();
        tfagilidadmentalVillano = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PUMSuperheroes = new javax.swing.JPopupMenu();
        ModificarSuperheroe = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        EliminarSuperheroe = new javax.swing.JMenuItem();
        PUMVillanos = new javax.swing.JPopupMenu();
        ModificarVillano = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        EliminarVillano = new javax.swing.JMenuItem();
        FrameCrearEscuadron = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        FrameListas.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameListas.setSize(new java.awt.Dimension(800, 650));
        FrameListas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaSuperheroes.setModel(new DefaultListModel());
        ListaSuperheroes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaSuperheroesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaSuperheroes);

        FrameListas.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 310, 420));

        ListaVillanos.setModel(new DefaultListModel());
        ListaVillanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaVillanosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaVillanos);

        FrameListas.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 320, 420));

        btnregresarLista.setText("Regresar");
        btnregresarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregresarListaMouseClicked(evt);
            }
        });
        FrameListas.getContentPane().add(btnregresarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText("Superheroes");
        FrameListas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 260, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setText("Villanos");
        FrameListas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 50));
        FrameListas.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        FrameCrearSuperheroes.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameCrearSuperheroes.setSize(new java.awt.Dimension(800, 600));

        jLabel3.setText("Nombre");

        jLabel4.setText("Poder");

        jLabel5.setText("Debilidad");

        jLabel6.setText("Fuerza");

        jLabel7.setText("Agilidad Fisica");

        jLabel8.setText("Agilidad Mental");

        btncrearSuperheroe.setText("Crear Superheroe");
        btncrearSuperheroe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearSuperheroeMouseClicked(evt);
            }
        });

        btnregresarheroe.setText("Regresar");
        btnregresarheroe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregresarheroeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameCrearSuperheroesLayout = new javax.swing.GroupLayout(FrameCrearSuperheroes.getContentPane());
        FrameCrearSuperheroes.getContentPane().setLayout(FrameCrearSuperheroesLayout);
        FrameCrearSuperheroesLayout.setHorizontalGroup(
            FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCrearSuperheroesLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameCrearSuperheroesLayout.createSequentialGroup()
                        .addComponent(btncrearSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FrameCrearSuperheroesLayout.createSequentialGroup()
                        .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnombreSuperheroe)
                            .addComponent(tfpoderSuperheroe)
                            .addComponent(tfdebilidadSuperheroe)
                            .addComponent(tfagilidadmentalSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfagilidadfisicaSuperheroe)
                            .addComponent(tffuerzaSuperheroe))
                        .addGap(261, 261, 261))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameCrearSuperheroesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresarheroe)
                .addContainerGap())
        );
        FrameCrearSuperheroesLayout.setVerticalGroup(
            FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCrearSuperheroesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfnombreSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfpoderSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdebilidadSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tffuerzaSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfagilidadfisicaSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearSuperheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfagilidadmentalSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btncrearSuperheroe, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btnregresarheroe)
                .addGap(24, 24, 24))
        );

        FrameCrearVillanos.setPreferredSize(new java.awt.Dimension(800, 600));
        FrameCrearVillanos.setSize(new java.awt.Dimension(800, 600));

        jLabel9.setText("Debilidad");

        btncrearVillano.setText("Crear Villano");
        btncrearVillano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearVillanoMouseClicked(evt);
            }
        });

        jLabel10.setText("Fuerza");

        btnregresarvillano.setText("Regresar");
        btnregresarvillano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregresarvillanoMouseClicked(evt);
            }
        });

        jLabel11.setText("Agilidad Fisica");

        jLabel12.setText("Agilidad Mental");

        jLabel13.setText("Nombre");

        jLabel14.setText("Poder");

        javax.swing.GroupLayout FrameCrearVillanosLayout = new javax.swing.GroupLayout(FrameCrearVillanos.getContentPane());
        FrameCrearVillanos.getContentPane().setLayout(FrameCrearVillanosLayout);
        FrameCrearVillanosLayout.setHorizontalGroup(
            FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCrearVillanosLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameCrearVillanosLayout.createSequentialGroup()
                        .addComponent(btncrearVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FrameCrearVillanosLayout.createSequentialGroup()
                        .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnombreVillano)
                            .addComponent(tfpoderVillano)
                            .addComponent(tfdebilidadVillano)
                            .addComponent(tfagilidadmentalVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfagilidadfisicaVillano)
                            .addComponent(tffuerzaVillano))
                        .addGap(261, 261, 261))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameCrearVillanosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresarvillano)
                .addContainerGap())
        );
        FrameCrearVillanosLayout.setVerticalGroup(
            FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCrearVillanosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfnombreVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfpoderVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfdebilidadVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tffuerzaVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfagilidadfisicaVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameCrearVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfagilidadmentalVillano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btncrearVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btnregresarvillano)
                .addGap(24, 24, 24))
        );

        ModificarSuperheroe.setText("Modificar");
        ModificarSuperheroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSuperheroeActionPerformed(evt);
            }
        });
        PUMSuperheroes.add(ModificarSuperheroe);
        PUMSuperheroes.add(jSeparator1);

        EliminarSuperheroe.setText("Eliminar");
        EliminarSuperheroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarSuperheroeActionPerformed(evt);
            }
        });
        PUMSuperheroes.add(EliminarSuperheroe);

        ModificarVillano.setText("Modificar");
        ModificarVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarVillanoActionPerformed(evt);
            }
        });
        PUMVillanos.add(ModificarVillano);
        PUMVillanos.add(jSeparator2);

        EliminarVillano.setText("Eliminar");
        EliminarVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarVillanoActionPerformed(evt);
            }
        });
        PUMVillanos.add(EliminarVillano);

        javax.swing.GroupLayout FrameCrearEscuadronLayout = new javax.swing.GroupLayout(FrameCrearEscuadron.getContentPane());
        FrameCrearEscuadron.getContentPane().setLayout(FrameCrearEscuadronLayout);
        FrameCrearEscuadronLayout.setHorizontalGroup(
            FrameCrearEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameCrearEscuadronLayout.setVerticalGroup(
            FrameCrearEscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Modificar/Eliminar Personas");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 60));

        jButton2.setText("Crear Superheroes");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 230, 60));

        jButton3.setText("Crear Villanos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 230, 60));

        jButton4.setText("Crear Escuadron");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 230, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bvs2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-530, 0, 1330, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearSuperheroeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearSuperheroeMouseClicked
        String nombre = tfnombreSuperheroe.getText();
        for (int i = 0; i < personas.size(); i++) {
            while (personas.get(i).getNombre().equals(nombre)) {
                nombre = JOptionPane.showInputDialog(this, "Ingrese nombre Valido");
                break;
            }
        }
        String poder = tfpoderSuperheroe.getText();
        String debilidad = tfdebilidadSuperheroe.getText();
        int fuerza = Integer.parseInt(tffuerzaSuperheroe.getText());
        int agilidadFIS = Integer.parseInt(tfagilidadfisicaSuperheroe.getText());
        int agilidadMEN = Integer.parseInt(tfagilidadmentalSuperheroe.getText());
        personas.add(new Superheroes(nombre, poder, debilidad, fuerza, agilidadFIS, agilidadMEN));

        DefaultListModel modelolistaSuperHeroes = (DefaultListModel) ListaSuperheroes.getModel();
        modelolistaSuperHeroes.addElement(personas.get(personas.size() - 1));
        ListaSuperheroes.setModel(modelolistaSuperHeroes);

        tfnombreSuperheroe.setText("");
        tfpoderSuperheroe.setText("");
        tfdebilidadSuperheroe.setText("");
        tffuerzaSuperheroe.setText("");
        tfagilidadfisicaSuperheroe.setText("");
        tfagilidadmentalSuperheroe.setText("");
    }//GEN-LAST:event_btncrearSuperheroeMouseClicked

    private void btncrearVillanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearVillanoMouseClicked
        String nombre = tfnombreVillano.getText();
        for (int i = 0; i < personas.size(); i++) {
            while (personas.get(i).getNombre().equals(nombre)) {
                nombre = JOptionPane.showInputDialog(this, "Ingrese nombre Valido");
                break;
            }
        }
        String poder = tfpoderVillano.getText();
        String debilidad = tfdebilidadVillano.getText();
        int fuerza = Integer.parseInt(tffuerzaVillano.getText());
        int agilidadFIS = Integer.parseInt(tfagilidadfisicaVillano.getText());
        int agilidadMEN = Integer.parseInt(tfagilidadmentalVillano.getText());
        personas.add(new Villanos(nombre, poder, debilidad, fuerza, agilidadFIS, agilidadMEN));

        DefaultListModel modelolistaSuperHeroes = (DefaultListModel) ListaVillanos.getModel();
        modelolistaSuperHeroes.addElement(personas.get(personas.size() - 1));
        ListaVillanos.setModel(modelolistaSuperHeroes);

        tfnombreVillano.setText("");
        tfpoderVillano.setText("");
        tfdebilidadVillano.setText("");
        tffuerzaVillano.setText("");
        tfagilidadfisicaVillano.setText("");
        tfagilidadmentalVillano.setText("");
    }//GEN-LAST:event_btncrearVillanoMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        FrameCrearSuperheroes.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setVisible(false);
        FrameCrearVillanos.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        FrameListas.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnregresarvillanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarvillanoMouseClicked
        this.setVisible(true);
        FrameCrearVillanos.setVisible(false);
    }//GEN-LAST:event_btnregresarvillanoMouseClicked

    private void btnregresarheroeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarheroeMouseClicked
        this.setVisible(true);
        FrameCrearSuperheroes.setVisible(false);
    }//GEN-LAST:event_btnregresarheroeMouseClicked

    private void btnregresarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarListaMouseClicked
        this.setVisible(true);
        FrameListas.setVisible(false);
    }//GEN-LAST:event_btnregresarListaMouseClicked

    private void ListaSuperheroesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaSuperheroesMouseClicked
        if (evt.isMetaDown()) {
            PUMSuperheroes.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ListaSuperheroesMouseClicked

    private void ModificarSuperheroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSuperheroeActionPerformed
        if (ListaSuperheroes.getSelectedIndex() >= 0) {
            int num = ListaSuperheroes.getSelectedIndex();
            String nombre = JOptionPane.showInputDialog(FrameListas, "Ingrese nuevo nombre");
            for (int i = 0; i < personas.size(); i++) {
                while (personas.get(i).getNombre().equals(nombre)) {
                    nombre = JOptionPane.showInputDialog(FrameListas, "Ingrese nombre Valido");
                    break;
                }
            }
            String poder = JOptionPane.showInputDialog(FrameListas, "Ingrese nuevo poder");
            String debilidad = JOptionPane.showInputDialog(FrameListas, "Ingrese nueva debilidad");
            int fuerza = Integer.parseInt(JOptionPane.showInputDialog(FrameListas, "Ingrese nueva fuerza"));
            int agilidadFIS = Integer.parseInt(JOptionPane.showInputDialog(FrameListas, "Ingrese nueva agilidad fisica"));
            int agilidadMEN = Integer.parseInt(JOptionPane.showInputDialog(FrameListas, "Ingrese nuevo agilidad mental"));

            DefaultListModel modeloSH = (DefaultListModel) ListaSuperheroes.getModel();
            ((Persona) modeloSH.getElementAt(num)).setNombre(nombre);
            ((Persona) modeloSH.getElementAt(num)).setPoder(poder);
            ((Persona) modeloSH.getElementAt(num)).setDebilidad(debilidad);
            ((Persona) modeloSH.getElementAt(num)).setFuerza(fuerza);
            ((Persona) modeloSH.getElementAt(num)).setAgilidadfisica(agilidadFIS);
            ((Persona) modeloSH.getElementAt(num)).setAgilidadmental(agilidadMEN);
            ListaSuperheroes.setModel(modeloSH);
            JOptionPane.showMessageDialog(FrameListas, "Modificado con Exito");
        } else {
            JOptionPane.showMessageDialog(FrameListas, "Seleccione un elemento");
        }
    }//GEN-LAST:event_ModificarSuperheroeActionPerformed

    private void ModificarVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarVillanoActionPerformed
        if (ListaVillanos.getSelectedIndex() >= 0) {
            int num = ListaVillanos.getSelectedIndex();
            String nombre = JOptionPane.showInputDialog(FrameListas, "Ingrese nuevo nombre");
            for (int i = 0; i < personas.size(); i++) {
                while (personas.get(i).getNombre().equals(nombre)) {
                    nombre = JOptionPane.showInputDialog(FrameListas, "Ingrese nombre Valido");
                    break;
                }
            }
            String poder = JOptionPane.showInputDialog(FrameListas, "Ingrese nuevo poder");
            String debilidad = JOptionPane.showInputDialog(FrameListas, "Ingrese nueva debilidad");
            int fuerza = Integer.parseInt(JOptionPane.showInputDialog(FrameListas, "Ingrese nueva fuerza"));
            int agilidadFIS = Integer.parseInt(JOptionPane.showInputDialog(FrameListas, "Ingrese nueva agilidad fisica"));
            int agilidadMEN = Integer.parseInt(JOptionPane.showInputDialog(FrameListas, "Ingrese nuevo agilidad mental"));

            DefaultListModel modeloSH = (DefaultListModel) ListaVillanos.getModel();
            ((Persona) modeloSH.getElementAt(num)).setNombre(nombre);
            ((Persona) modeloSH.getElementAt(num)).setPoder(poder);
            ((Persona) modeloSH.getElementAt(num)).setDebilidad(debilidad);
            ((Persona) modeloSH.getElementAt(num)).setFuerza(fuerza);
            ((Persona) modeloSH.getElementAt(num)).setAgilidadfisica(agilidadFIS);
            ((Persona) modeloSH.getElementAt(num)).setAgilidadmental(agilidadMEN);
            ListaVillanos.setModel(modeloSH);
            JOptionPane.showMessageDialog(FrameListas, "Modificado con Exito");
        } else {
            JOptionPane.showMessageDialog(FrameListas, "Seleccione un elemento");
        }
    }//GEN-LAST:event_ModificarVillanoActionPerformed

    private void EliminarSuperheroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarSuperheroeActionPerformed
        if (ListaSuperheroes.getSelectedIndex() >= 0) {
            int num = ListaSuperheroes.getSelectedIndex();
            DefaultListModel modeloSH = (DefaultListModel) ListaSuperheroes.getModel();
            modeloSH.remove(num);
            ListaSuperheroes.setModel(modeloSH);
            JOptionPane.showMessageDialog(FrameListas, "Modificado con Exito");
        } else {
            JOptionPane.showMessageDialog(FrameListas, "Seleccione un elemento");
        }
    }//GEN-LAST:event_EliminarSuperheroeActionPerformed

    private void EliminarVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarVillanoActionPerformed
        if (ListaVillanos.getSelectedIndex() >= 0) {
            int num = ListaVillanos.getSelectedIndex();
            DefaultListModel modeloSH = (DefaultListModel) ListaVillanos.getModel();
            modeloSH.remove(num);
            ListaVillanos.setModel(modeloSH);
            JOptionPane.showMessageDialog(FrameListas, "Modificado con Exito");
        } else {
            JOptionPane.showMessageDialog(FrameListas, "Seleccione un elemento");
        }
    }//GEN-LAST:event_EliminarVillanoActionPerformed

    private void ListaVillanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaVillanosMouseClicked
        if (evt.isMetaDown()) {
            PUMVillanos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ListaVillanosMouseClicked

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
            java.util.logging.Logger.getLogger(Lab5GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab5GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab5GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab5GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab5GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarSuperheroe;
    private javax.swing.JMenuItem EliminarVillano;
    private javax.swing.JFrame FrameCrearEscuadron;
    private javax.swing.JFrame FrameCrearSuperheroes;
    private javax.swing.JFrame FrameCrearVillanos;
    private javax.swing.JFrame FrameListas;
    private javax.swing.JList<String> ListaSuperheroes;
    private javax.swing.JList<String> ListaVillanos;
    private javax.swing.JMenuItem ModificarSuperheroe;
    private javax.swing.JMenuItem ModificarVillano;
    private javax.swing.JPopupMenu PUMSuperheroes;
    private javax.swing.JPopupMenu PUMVillanos;
    private javax.swing.JButton btncrearSuperheroe;
    private javax.swing.JButton btncrearVillano;
    private javax.swing.JButton btnregresarLista;
    private javax.swing.JButton btnregresarheroe;
    private javax.swing.JButton btnregresarvillano;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField tfagilidadfisicaSuperheroe;
    private javax.swing.JTextField tfagilidadfisicaVillano;
    private javax.swing.JTextField tfagilidadmentalSuperheroe;
    private javax.swing.JTextField tfagilidadmentalVillano;
    private javax.swing.JTextField tfdebilidadSuperheroe;
    private javax.swing.JTextField tfdebilidadVillano;
    private javax.swing.JTextField tffuerzaSuperheroe;
    private javax.swing.JTextField tffuerzaVillano;
    private javax.swing.JTextField tfnombreSuperheroe;
    private javax.swing.JTextField tfnombreVillano;
    private javax.swing.JTextField tfpoderSuperheroe;
    private javax.swing.JTextField tfpoderVillano;
    // End of variables declaration//GEN-END:variables
}
