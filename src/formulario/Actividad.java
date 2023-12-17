package formulario;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jharo
 */
public class Actividad extends javax.swing.JFrame {
    
    // Declarar el Clip como una variable de instancia para que pueda ser accesible desde diferentes métodos
    private Clip clip;
    int xMouse, yMouse;
    String pinIngresado, txtPin;
    URL url;
    LocalDateTime fechaHoraInicio;
    
    public Actividad() {
        initComponents();
        this.fechaHoraInicio = fechaHoraInicio;
    }
    
// Método para reproducir el sonido en bucle
private void reproducirSonido() {
    try {
        
        int op = cboTipoSonido.getSelectedIndex();
        switch(op){
            case 1:
                // Obtener la URL del sonido predeterminado
                url = getClass().getResource("/sonidos/Alarma.wav");
                break;
            case 2:
                // Obtener la URL del sonido predeterminado
                url = getClass().getResource("/sonidos/Suave.wav");
                break;
            case 3:
                // Obtener la URL del sonido predeterminado
                url = getClass().getResource("/sonidos/Motivacion.wav");
                break;
            case 4:
                // Obtener la URL del sonido predeterminado
                url = getClass().getResource("/sonidos/Divertido.wav");
                break;
        }

        // Crear un Clip de sonido
        clip = AudioSystem.getClip();

        // Abrir el archivo de sonido
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
        clip.open(audioInputStream);

        // Configurar para reproducir en bucle
        clip.loop(Clip.LOOP_CONTINUOUSLY);

        // Reproducir el sonido
        clip.start();
    } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboH = new javax.swing.JComboBox<>();
        cboM = new javax.swing.JComboBox<>();
        cboS = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboTipoSonido = new javax.swing.JComboBox<>();
        cboMetDes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD: JSV7");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setToolTipText("");
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setText("INGRESO DE PERSONAS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 270, 68));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PLANIFICACIÓN DE LA ACTIVIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 68));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario (1).png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 70, 70));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 540, 100));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setText("Actividad");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Seg:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Elije el método de desactivación:");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 270, 34));

        cboH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        bg.add(cboH, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, -1));

        cboM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        cboM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMActionPerformed(evt);
            }
        });
        bg.add(cboM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, -1));

        cboS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cboS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSActionPerformed(evt);
            }
        });
        bg.add(cboS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 50, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("¿Hasta qué hora vas a realizar esta actividad?");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 360, 34));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("H:");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 20, 30));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setText("Min:");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        btnAceptar.setBackground(new java.awt.Color(0, 51, 102));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(null);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        bg.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 260, 50));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione un tipo de Sonido:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 240, 34));

        cboTipoSonido.setForeground(new java.awt.Color(102, 102, 102));
        cboTipoSonido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Sonido Intenso y Energético", "Sonido Suave y Relajante", "Sonido Motivacional", "Sonido Divertido" }));
        bg.add(cboTipoSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 260, 40));

        cboMetDes.setForeground(new java.awt.Color(102, 102, 102));
        cboMetDes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "PIN", "Puzzle" }));
        bg.add(cboMetDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 260, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        //System.exit(0);
        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        btnExit.setBackground(Color.red);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        btnExit.setBackground(Color.white);
        lblExit.setForeground(Color.black);
    }//GEN-LAST:event_lblExitMouseExited

    private void cboMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMActionPerformed

    private void cboSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (cboMetDes.getSelectedIndex() == 0) {
            String mensaje = "Seleccione un Método de Desactivación";
            JOptionPane.showMessageDialog(null, mensaje, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else if (cboTipoSonido.getSelectedIndex() == 0) {
            String mensaje = "Seleccione un Sonido";
            JOptionPane.showMessageDialog(null, mensaje, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Obtener el método de desactivación seleccionado
            String metodoDesactivacion = (String) cboMetDes.getSelectedItem();

            // Dependiendo del método de desactivación, mostrar la notificación correspondiente
            switch (metodoDesactivacion) {
                case "PIN":
                    txtPin = ingresarPIN();
                    Cronometro();
                    break;
                case "Puzzle":
                    PuzzleFrame puzzleFrame = new PuzzleFrame();
                    Cronometro();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
    //Función para ingresar un PIN dentro de una notificación
    private String ingresarPIN() {
        String pinIngresado = JOptionPane.showInputDialog("Ingrese el PIN:");
        return pinIngresado;
    }

    //Funcion que me calcula el tiempo en el acabara la actividad
    private void Cronometro(){
        // Obtener la hora seleccionada
        String hora = (String) cboH.getSelectedItem();
        String min = (String) cboM.getSelectedItem();
        String seg = (String) cboS.getSelectedItem();

        // Obtener la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Crear un objeto LocalDateTime con la fecha actual y la hora seleccionada
        LocalDateTime fechaHoraSeleccionada = LocalDateTime.of(
                fechaHoraActual.getYear(),
                fechaHoraActual.getMonthValue(),
                fechaHoraActual.getDayOfMonth(),
                Integer.parseInt(hora),
                Integer.parseInt(min),
                Integer.parseInt(seg)
        );

        // Calcular la diferencia de tiempo
        Duration diferencia = Duration.between(fechaHoraActual, fechaHoraSeleccionada);

        // Mostrar mensaje con la información de la diferencia de tiempo
        long dias = diferencia.toDays();
        long horas = diferencia.toHours() - dias * 24;
        long minutos = diferencia.toMinutes() - dias * 24 * 60 - horas * 60;
        long segundos = diferencia.getSeconds() - dias * 24 * 60 * 60 - horas * 60 * 60 - minutos * 60;

        String mensajeDiferencia = "Tiempo restante:\n" +
                "Días: " + dias +
                "\nHoras: " + horas +
                "\nMinutos: " + minutos +
                "\nSegundos: " + segundos;

        // Crear un temporizador para mostrar la notificación en el momento específico
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Reproducir el sonido en bucle hasta que se ingrese el PIN
                reproducirSonido();
                // Mostrar la notificación inicial
                JOptionPane.showMessageDialog(null, "¡LA ACTIVIDAD A FINALIZADO!");

                // Pedir al usuario que ingrese el PIN para desactivar la notificación
                while (true) {
                    pinIngresado = JOptionPane.showInputDialog("Para desactivar la notificación, ingrese el PIN:");

                    // Verificar si el PIN ingresado coincide
                    if (pinIngresado != null && pinIngresado.equals(txtPin)) {
                        // Mostrar el cuadro de diálogo con los botones
                        JOptionPane.showMessageDialog(
                                null,
                                "Notificación desactivada. Haz Completado tu Actividad."
                        );

                        // Detener el sonido al ingresar el PIN
                        detenerSonido();

                        break; // Salir del bucle si el PIN es correcto
                    } else {
                        // Muestra un diálogo con el mensaje y los botones personalizados
                        int option = JOptionPane.showOptionDialog(
                            null,
                            "PIN incorrecto. ¿Olvidaste tu PIN?",
                            "Desactivar Notificación",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            new Object[]{"Reintentar", "Olvidé mi PIN"},
                            "default"
                        );

                        // Verifica la opción seleccionada
                        if (option == 1) {
                            // Genera dos números aleatorios
                            int num1 = (int) (Math.random() * 100);
                            int num2 = (int) (Math.random() * 100);

                            // Calcula la suma
                            int sumaCorrecta = num1 + num2;

                            // Muestra un cuadro de diálogo para que el usuario ingrese la respuesta
                            String respuesta = JOptionPane.showInputDialog(
                                    null,
                                    "Resuelve esta suma para desactivar tu recordatorio:\n" +
                                            num1 + " + " + num2 + " = ?",
                                    "Desactivar Notificación",
                                    JOptionPane.WARNING_MESSAGE
                            );

                            // Verifica si la respuesta es correcta
                            if (respuesta != null && respuesta.matches("\\d+")) {
                                int respuestaUsuario = Integer.parseInt(respuesta);
                                if (respuestaUsuario == sumaCorrecta) {
                                    // Respuesta correcta, detén la notificación
                                    detenerSonido();
                                    JOptionPane.showMessageDialog(null, "¡Recordatorio Desactivado!");
                                    break;
                                } else {
                                    // Respuesta incorrecta, muestra un mensaje
                                    JOptionPane.showMessageDialog(
                                            null,
                                            "Respuesta incorrecta. La notificación seguirá sonando.",
                                            "Desactivar Notificación",
                                            JOptionPane.WARNING_MESSAGE
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }, Date.from(fechaHoraSeleccionada.atZone(ZoneId.systemDefault()).toInstant()));
    }
        
    // Método para detener el sonido
    private void detenerSonido() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
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
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JComboBox<String> cboH;
    private javax.swing.JComboBox<String> cboM;
    private javax.swing.JComboBox<String> cboMetDes;
    private javax.swing.JComboBox<String> cboS;
    private javax.swing.JComboBox<String> cboTipoSonido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExit;
    // End of variables declaration//GEN-END:variables
}
