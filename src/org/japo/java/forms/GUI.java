/* 
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import org.japo.java.components.BackgroundPanel;
import org.japo.java.entities.DataAccessManager;
import org.japo.java.entities.Modelo;
import org.japo.java.libraries.UtilesBD;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class GUI extends javax.swing.JFrame {

    // Propiedades
    private final Properties prp;

    // Componentes
    private JPanel pnlPpal;

    // Imágenes
    private Image imgFondo;

    // Modelo
    private Modelo modelo;

    // Artefactos JDBC
    private DataAccessManager dam;
    private ResultSet rs;

    // Semáforos de validación
    private boolean idOK;
    private boolean nombreOK;
    private boolean acronimoOK;
    private boolean codigoOK;

    // Constructor
    public GUI(Properties prp) {
        // Conectar Referencia
        this.prp = prp;

        // Inicialización Anterior
        initBefore();

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btgCurso = new javax.swing.ButtonGroup();
        pnlDatos = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblAcronimo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        LblCurso = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        txfAcronimo = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfCodigo = new javax.swing.JTextField();
        lblHorasDato = new javax.swing.JLabel();
        rbtCurso1 = new javax.swing.JRadioButton();
        rbtCurso2 = new javax.swing.JRadioButton();
        sldHoras = new javax.swing.JSlider();
        pnlControl = new javax.swing.JPanel();
        btnIni = new javax.swing.JButton();
        btnAnt = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        btnFin = new javax.swing.JButton();
        sldRegAct = new javax.swing.JSlider();
        lblRegAct = new javax.swing.JLabel();
        lblNumReg = new javax.swing.JLabel();
        btnIns = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnBor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de módulos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        pnlDatos.setOpaque(false);

        lblId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("Id");

        lblAcronimo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAcronimo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcronimo.setText("Acrónimo");

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");

        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");

        lblHoras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHoras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHoras.setText("Horas");

        LblCurso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LblCurso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblCurso.setText("Curso");

        txfId.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.id}"), txfId, org.jdesktop.beansbinding.BeanProperty.create("text_ON_FOCUS_LOST"), "id");
        bindingGroup.addBinding(binding);

        txfId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfIdFocusLost(evt);
            }
        });

        txfAcronimo.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.acronimo}"), txfAcronimo, org.jdesktop.beansbinding.BeanProperty.create("text_ON_FOCUS_LOST"), "acronimo");
        bindingGroup.addBinding(binding);

        txfAcronimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfAcronimoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfAcronimoFocusLost(evt);
            }
        });

        txfNombre.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        txfNombre.setAutoscrolls(false);
        txfNombre.setMaximumSize(new java.awt.Dimension(6, 20));
        txfNombre.setPreferredSize(new java.awt.Dimension(20, 20));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.nombre}"), txfNombre, org.jdesktop.beansbinding.BeanProperty.create("text_ON_FOCUS_LOST"), "nombre");
        bindingGroup.addBinding(binding);

        txfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfNombreFocusLost(evt);
            }
        });

        txfCodigo.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        txfCodigo.setAutoscrolls(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.codigo}"), txfCodigo, org.jdesktop.beansbinding.BeanProperty.create("text_ON_FOCUS_LOST"));
        bindingGroup.addBinding(binding);

        txfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCodigoFocusLost(evt);
            }
        });

        lblHorasDato.setBackground(new java.awt.Color(255, 255, 255));
        lblHorasDato.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        lblHorasDato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHorasDato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHorasDato.setOpaque(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldHoras, org.jdesktop.beansbinding.ELProperty.create("${value}"), lblHorasDato, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        btgCurso.add(rbtCurso1);
        rbtCurso1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbtCurso1.setText("Primero");
        rbtCurso1.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.curso1}"), rbtCurso1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        btgCurso.add(rbtCurso2);
        rbtCurso2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbtCurso2.setText("Segundo");
        rbtCurso2.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.curso2}"), rbtCurso2, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        sldHoras.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        sldHoras.setMajorTickSpacing(100);
        sldHoras.setMaximum(500);
        sldHoras.setMinorTickSpacing(100);
        sldHoras.setPaintLabels(true);
        sldHoras.setPaintTicks(true);
        sldHoras.setToolTipText("");
        sldHoras.setOpaque(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${modelo.horas}"), sldHoras, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblAcronimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfAcronimo))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfId))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblHoras)
                        .addGap(4, 4, 4)
                        .addComponent(sldHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHorasDato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCodigo))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(LblCurso)
                        .addGap(18, 18, 18)
                        .addComponent(rbtCurso1)
                        .addGap(18, 18, 18)
                        .addComponent(rbtCurso2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LblCurso, lblAcronimo, lblCodigo, lblHoras, lblId, lblNombre});

        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfAcronimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAcronimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(txfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtCurso1)
                            .addComponent(rbtCurso2)
                            .addComponent(LblCurso)))
                    .addComponent(lblHorasDato, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rbtCurso1, rbtCurso2, sldHoras});

        pnlDatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAcronimo, lblCodigo, lblHoras, lblHorasDato, lblId, lblNombre, txfAcronimo, txfCodigo, txfId, txfNombre});

        pnlControl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        pnlControl.setOpaque(false);

        btnIni.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnIni.setText("<<");
        btnIni.setEnabled(false);
        btnIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniActionPerformed(evt);
            }
        });

        btnAnt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnAnt.setText("<");
        btnAnt.setEnabled(false);
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        btnSig.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnSig.setText(">");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        btnFin.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnFin.setText(">>");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        sldRegAct.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        sldRegAct.setMaximum(0);
        sldRegAct.setOpaque(false);
        sldRegAct.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRegActStateChanged(evt);
            }
        });

        lblRegAct.setBackground(new java.awt.Color(255, 255, 255));
        lblRegAct.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        lblRegAct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegAct.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblRegAct.setOpaque(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldRegAct, org.jdesktop.beansbinding.ELProperty.create("${value}"), lblRegAct, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblNumReg.setBackground(new java.awt.Color(255, 255, 255));
        lblNumReg.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        lblNumReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumReg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNumReg.setMaximumSize(new java.awt.Dimension(12, 23));
        lblNumReg.setMinimumSize(new java.awt.Dimension(12, 23));
        lblNumReg.setOpaque(true);
        lblNumReg.setPreferredSize(new java.awt.Dimension(12, 23));

        btnIns.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnIns.setText("Insertar");
        btnIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsActionPerformed(evt);
            }
        });

        btnAct.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnBor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBor.setText("Borrar");
        btnBor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addComponent(btnIni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIns, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sldRegAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRegAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFin, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(lblNumReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnt, btnFin, btnIni, btnSig, lblNumReg, lblRegAct});

        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlControlLayout.createSequentialGroup()
                        .addComponent(btnIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBor))
                    .addComponent(btnFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sldRegAct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegAct, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumReg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblNumReg, lblRegAct, sldRegAct});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        try {
            if (rs.previous()) {
                actualizarInterfaz();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, sqle.getMessage());
        }
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        try {
            if (rs.next()) {
                actualizarInterfaz();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, sqle.getMessage());
        }
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniActionPerformed
        try {
            if (rs.first()) {
                actualizarInterfaz();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, sqle.getMessage());
        }
    }//GEN-LAST:event_btnIniActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        try {
            if (rs.last()) {
                actualizarInterfaz();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, sqle.getMessage());
        }
    }//GEN-LAST:event_btnFinActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dam.desconectarBD();
    }//GEN-LAST:event_formWindowClosing

    private void sldRegActStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRegActStateChanged
        try {
            if (rs.absolute(sldRegAct.getValue())) {
                actualizarInterfaz();
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, sqle.getMessage());
        }
    }//GEN-LAST:event_sldRegActStateChanged

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
        procesarInsercion(evt);
    }//GEN-LAST:event_btnInsActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        procesarActualizacion(evt);
    }//GEN-LAST:event_btnActActionPerformed

    private void btnBorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorActionPerformed
        procesarBorrado(evt);
    }//GEN-LAST:event_btnBorActionPerformed

    private void txfIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdFocusGained
        txfId.setSelectionStart(0);
        txfId.setForeground(Color.BLACK);
        txfId.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfIdFocusGained

    private void txfAcronimoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfAcronimoFocusGained
        txfAcronimo.setSelectionStart(0);
        txfAcronimo.setForeground(Color.BLACK);
        txfAcronimo.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfAcronimoFocusGained

    private void txfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreFocusGained
        txfNombre.setSelectionStart(0);
        txfNombre.setForeground(Color.BLACK);
        txfNombre.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfNombreFocusGained

    private void txfCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCodigoFocusGained
        txfCodigo.setSelectionStart(0);
        txfCodigo.setForeground(Color.BLACK);
        txfCodigo.setBackground(Color.CYAN);
    }//GEN-LAST:event_txfCodigoFocusGained

    private void txfIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdFocusLost
        idOK = UtilesSwing.validarCampo(txfId, Modelo.ER_ID, "*");
        txfId.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfIdFocusLost

    private void txfAcronimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfAcronimoFocusLost
        acronimoOK = UtilesSwing.validarCampo(txfAcronimo, Modelo.ER_ACRONIMO, "*");
        txfAcronimo.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfAcronimoFocusLost

    private void txfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreFocusLost
        nombreOK = UtilesSwing.validarCampo(txfNombre, Modelo.ER_NOMBRE, "*");
        txfNombre.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfNombreFocusLost

    private void txfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCodigoFocusLost
        codigoOK = UtilesSwing.validarCampo(txfCodigo, Modelo.ER_CODIGO, "*");
        txfCodigo.setBackground(Color.WHITE);
    }//GEN-LAST:event_txfCodigoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCurso;
    private javax.swing.ButtonGroup btgCurso;
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnBor;
    private javax.swing.JButton btnFin;
    private javax.swing.JButton btnIni;
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel lblAcronimo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblHorasDato;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumReg;
    private javax.swing.JLabel lblRegAct;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JRadioButton rbtCurso1;
    private javax.swing.JRadioButton rbtCurso2;
    private javax.swing.JSlider sldHoras;
    private javax.swing.JSlider sldRegAct;
    private javax.swing.JTextField txfAcronimo;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNombre;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    // Inicialización Anterior
    private void initBefore() {
        // Establecer LnF
        UtilesSwing.establecerLnFProfile(prp.getProperty("look_and_feel_profile"));

        // Textura de Fondo
        imgFondo = UtilesSwing.importarImagenRecurso(prp.getProperty("img_back_resource"));

        // Panel Principal
        pnlPpal = new BackgroundPanel(imgFondo);
        setContentPane(pnlPpal);

        // Gestor Acceso Datos
        dam = new DataAccessManager(prp);

        // Modelo de Datos
        modelo = new Modelo();

        // Conectar Base de Datos
        try {
            rs = dam.conectarBD(modelo);
        } catch (SQLException e) {
            // Información Error > Consola
            System.out.println("ERROR: Acceso a la Base de Datos CANCELADO");
            System.out.printf("Código de error .: %d%n", e.getErrorCode());
            System.out.printf("Estado SQL ......: %s%n", e.getSQLState());
            System.out.printf("Descripción .....: %s%n", e.getLocalizedMessage());

            // Dialogo Informativo
            JOptionPane.showMessageDialog(this, "No se puede iniciar el programa");

            // Desconectar Base de Datos
            dam.desconectarBD();

            // Terminar Programa
            UtilesSwing.terminarPrograma(this);
        }
    }

    // Inicialización Posterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty("img_favicon_resource"));

        // Ventana Principal
        setTitle(prp.getProperty("form_title"));

        // ResultSet > Modelo > Interfaz
        actualizarInterfaz();
    }

    // ResultSet > Modelo > Interfaz
    private void actualizarInterfaz() {
        try {
            // ResultSet > Modelo
            dam.importarModelo(rs, modelo);

            // Actualizar botones
            actualizarBotonesNavegacion(rs);

            // Actualizar selector
            actualizarDeslizadorNavegacion(sldRegAct, lblNumReg, rs);

            // Validar Campos
            validarCampos();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // ResultSet > Botones Navegación
    private void actualizarBotonesNavegacion(ResultSet rs) {
        // Número Registros
        int numeroTotalRegistros = UtilesBD.obtenerNumeroRegistros(rs);

        // Numero Registro Actual
        int numeroRegistroActual = UtilesBD.obtenerPosicionActual(rs);

        if (numeroTotalRegistros == 0) {                        // Base de datos vacia
            btnAnt.setEnabled(false);
            btnIni.setEnabled(false);
            btnSig.setEnabled(false);
            btnFin.setEnabled(false);
            btnBor.setEnabled(false);
            btnAct.setEnabled(false);
        } else if (numeroTotalRegistros == 1) {                 // Un sólo registro
            btnAnt.setEnabled(false);
            btnIni.setEnabled(false);
            btnSig.setEnabled(false);
            btnFin.setEnabled(false);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        } else if (numeroRegistroActual == 1) {                  // Primer registro
            btnAnt.setEnabled(false);
            btnIni.setEnabled(false);
            btnSig.setEnabled(true);
            btnFin.setEnabled(true);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        } else if (numeroRegistroActual == numeroTotalRegistros) {           // Último registro
            btnAnt.setEnabled(true);
            btnIni.setEnabled(true);
            btnSig.setEnabled(false);
            btnFin.setEnabled(false);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        } else {                                    // Registro intermedio
            btnAnt.setEnabled(true);
            btnIni.setEnabled(true);
            btnSig.setEnabled(true);
            btnFin.setEnabled(true);
            btnBor.setEnabled(true);
            btnAct.setEnabled(true);
        }
    }

    // ResultSet > Deslizador Navegación
    private void actualizarDeslizadorNavegacion(JSlider sldActual, JLabel lblActual,
            ResultSet rs) throws SQLException {
        // Número Registros
        int numeroTotalRegistros = UtilesBD.obtenerNumeroRegistros(rs);

        // Numero Registro Actual
        int numeroRegistroActual = UtilesBD.obtenerPosicionActual(rs);

        // Guarda los gestores de eventos
        ChangeListener[] lista = sldActual.getChangeListeners();

        // Desconecta los ChangeListener definidos en tiempo de diseño
        // Pero no los BeanBinding - Si se desconectan todos en enlazado
        // NO FUNCIONA
        for (ChangeListener cl : lista) {
            // Obtiene la representación de texto del Listener
            String texto = cl.toString();

            // Ignora el listener si es BeanBinding
            if (!texto.contains("org.jdesktop")) {
                sldActual.removeChangeListener(cl);
            }
        }

        // Actualiza Parámetros Deslizador
        if (numeroTotalRegistros > 0) {
            sldActual.setEnabled(true);
            sldActual.setMinimum(1);                        // Change Listeners notificados
            sldActual.setMaximum(numeroTotalRegistros);     // Change Listeners notificados
            sldActual.setValue(numeroRegistroActual);       // Change Listeners notificados
        } else {
            sldActual.setEnabled(false);
            sldActual.setMinimum(0);          // Change Listeners notificados
            sldActual.setMaximum(0);          // Change Listeners notificados
            sldActual.setValue(0);            // Change Listeners notificados
        }

        // Total de registros
        lblActual.setText(numeroTotalRegistros + "");

        // Conecta los ChangeListener desconectados
        for (ChangeListener cl : lista) {
            // Obtiene la representación de texto del Listener
            String texto = cl.toString();

            // Ignora el listener si es BeanBinding
            if (!texto.contains("org.jdesktop")) {
                sldActual.addChangeListener(cl);
            }
        }
    }

    // --- ENCAPSULACIÓN MODELO ---
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    // --- ENCAPSULACIÓN MODELO ---

    // Validar Contenido Controles Subjetivos
    private boolean validarCampos() {
        // Validar id
        idOK = UtilesSwing.validarCampo(txfId, Modelo.ER_ID, "*");

        // Validar acrónimo
        acronimoOK = UtilesSwing.validarCampo(txfAcronimo, Modelo.ER_ACRONIMO, "*");

        // Validar nombre
        nombreOK = UtilesSwing.validarCampo(txfNombre, Modelo.ER_NOMBRE, "*");

        // Validar codigo
        codigoOK = UtilesSwing.validarCampo(txfCodigo, Modelo.ER_CODIGO, "*");

        return idOK && acronimoOK && nombreOK && codigoOK;
    }

    // Datos Interfaz > Nuevo Registro
    private void procesarInsercion(ActionEvent evt) {
        // Proceso de inserción
        if (validarCampos()) {
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "Insertar los datos actuales",
                    "Insertar registro",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (respuesta == JOptionPane.OK_OPTION) {
                try {
                    // Insertar la fila actual
                    dam.insertarRegistro(rs);

                    // Actualizar interfaz
                    actualizarInterfaz();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Inserción cancelada");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay datos erróneos");
        }
    }

    // Datos Interfaz > Modifica Registro Actual
    private void procesarActualizacion(ActionEvent evt) {
        // Proceso de inserción
        if (validarCampos()) {
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "Actualizar los datos actuales",
                    "Actualizar registro",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            if (respuesta == JOptionPane.OK_OPTION) {
                try {
                    // Actualizar la fila actual
                    dam.actualizarRegistro(rs);

                    // Actualizar interfaz
//                    actualizarInterfaz();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Actualización cancelada");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay datos erróneos");
        }
    }

    // Registro Actual > Registro Borrado
    private void procesarBorrado(ActionEvent evt) {
        // Muestra diálogo de confirmación
        int respuesta = JOptionPane.showConfirmDialog(this,
                "Borrar los datos actuales",
                "Borrar registro",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (respuesta == JOptionPane.OK_OPTION) {
            try {
                // Borrar la fila actual
                dam.borrarRegistro(rs);

                // Actualizar interfaz
                actualizarInterfaz();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Eliminación cancelada");
            }
        }
    }
}
