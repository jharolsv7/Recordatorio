package formulario;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jharo
 */
public class PuzzleFrame extends javax.swing.JFrame {
        private Clip clip;
    int xMouse, yMouse;
    
    private ArrayList<Image> puzzlePieces;
    private JPanel puzzlePanel;
    
    public PuzzleFrame() {
        // Cargar la imagen y dividirla en piezas
        loadAndSplitImage();

        // Mezclar las piezas
        Collections.shuffle(puzzlePieces);

        // Configurar el diseño del frame
        setTitle("Rompecabezas de Imagen");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cierra solo la ventana del rompecabezas
        setResizable(false);
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

private void initComponents() {
    puzzlePanel = new JPanel(new GridLayout(3, 3));

    // Configurar el panel con las piezas del rompecabezas
    for (Image piece : puzzlePieces) {
        JButton pieceButton = new JButton(new ImageIcon(piece));
        pieceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la posición del botón clickeado
                int clickedIndex = puzzlePanel.getComponentZOrder(pieceButton);

                // Calcular las coordenadas (x, y) en la matriz del rompecabezas
                int row = clickedIndex / 3;
                int col = clickedIndex % 3;

                // Implementar la lógica para intercambiar piezas
                intercambiarPiezas(row, col);

                // Actualizar la interfaz gráfica después del intercambio
                actualizarInterfaz();
                
                // Verificar si el rompecabezas está resuelto
                if (estaResuelto()) {
                    JOptionPane.showMessageDialog(PuzzleFrame.this, "¡Felicidades! Has resuelto el rompecabezas.");
                }
            }
        });
        puzzlePanel.add(pieceButton);
    }

    add(puzzlePanel);
}
    
    private void loadAndSplitImage() {
        try {
            // Cargar la imagen desde un archivo (ajusta la URL según tu estructura de proyecto)
            URL imageURL = getClass().getResource("/Img/flor.jpg");
            BufferedImage originalImage = ImageIO.read(imageURL);

            // Dividir la imagen en piezas
            puzzlePieces = new ArrayList<>();
            int pieceWidth = originalImage.getWidth() / 3;
            int pieceHeight = originalImage.getHeight() / 3;

            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    BufferedImage piece = originalImage.getSubimage(x * pieceWidth, y * pieceHeight, pieceWidth, pieceHeight);
                    puzzlePieces.add(piece);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
int[][] puzzle = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 0}  // El 0 representa la posición vacía
};

public void intercambiarPiezas(int row, int col) {
    // Obtener el índice de la pieza seleccionada en el arreglo puzzlePieces
    int clickedIndex = row * 3 + col;

    // Obtener el índice de la posición vacía en el arreglo puzzlePieces
    int emptyIndex = obtenerIndicePosicionVacia();

    // Intercambiar las piezas
    Collections.swap(puzzlePieces, clickedIndex, emptyIndex);
}

private int obtenerIndicePosicionVacia() {
    for (int i = 0; i < puzzlePieces.size(); i++) {
        Image piece = puzzlePieces.get(i);
        // Verificar si la pieza es la posición vacía (puedes usar una imagen especial o nula)
        if (piece == null) {
            return i;
        }
    }
    return -1;  // Devolver -1 si no se encuentra la posición vacía (esto debería manejarse adecuadamente)
}

private void actualizarInterfaz() {
    // Lógica para actualizar la interfaz gráfica después de intercambiar las piezas
    puzzlePanel.removeAll();

    for (Image piece : puzzlePieces) {
        JButton pieceButton = new JButton(new ImageIcon(piece));
        pieceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la posición del botón clickeado
                int clickedIndex = puzzlePanel.getComponentZOrder(pieceButton);

                // Calcular las coordenadas (x, y) en la matriz del rompecabezas
                int row = clickedIndex / 3;
                int col = clickedIndex % 3;

                // Implementar la lógica para intercambiar piezas
                intercambiarPiezas(row, col);

                // Actualizar la interfaz gráfica después del intercambio
                actualizarInterfaz();

                // Verificar si el rompecabezas está resuelto
                if (estaResuelto()) {
                    JOptionPane.showMessageDialog(PuzzleFrame.this, "¡Felicidades! Has resuelto el rompecabezas.");
                }
            }
        });
        puzzlePanel.add(pieceButton);
    }

    puzzlePanel.revalidate();
    puzzlePanel.repaint();
}

public boolean estaResuelto() {
    int n = puzzle.length * puzzle[0].length;
    int contador = 1;

    for (int i = 0; i < puzzle.length; i++) {
        for (int j = 0; j < puzzle[0].length; j++) {
            if (puzzle[i][j] != contador % n) {
                return false;
            }
            contador++;
        }
    }

    return true;
}

    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD: JSV7");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setToolTipText("");
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setText("INGRESO DE PERSONAS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 270, 68));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PUZZLE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, 68));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario (1).png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 70, 70));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 540, 100));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Resuleve la Imágen:");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 360, 34));

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
*/
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

    }//GEN-LAST:event_btnAceptarActionPerformed
        
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
            java.util.logging.Logger.getLogger(PuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PuzzleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
