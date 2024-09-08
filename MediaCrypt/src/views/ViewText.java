/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ViewText extends javax.swing.JFrame {
    private static ViewText instance;
    private static final Pattern NUM_PATTERN = Pattern.compile("\\d+");
    private ViewText() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /* Este es un patrón de diseño que permite tener una única instancia de una clase
       Es importante ya que al cambiar de ventanas en una aplicación, evitas crear más instancias
       de la misma ventana. Esto hazlo en cada ventana que hagas.
    */
    public static ViewText getInstanceText () {
        if (instance == null) {
           instance = new ViewText();
        }
        
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnRetroceder = new javax.swing.JButton();
        BtnCifrarTexto = new javax.swing.JButton();
        BtnDescifrarTexto = new javax.swing.JButton();
        LabelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRetroceder.setBackground(new java.awt.Color(37, 37, 37));
        BtnRetroceder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        BtnRetroceder.setText("Atrás");
        BtnRetroceder.setFocusable(false);
        BtnRetroceder.setMaximumSize(new java.awt.Dimension(100, 50));
        BtnRetroceder.setMinimumSize(new java.awt.Dimension(50, 50));
        BtnRetroceder.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetrocederActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        BtnCifrarTexto.setBackground(new java.awt.Color(0, 0, 0));
        BtnCifrarTexto.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BtnCifrarTexto.setForeground(new java.awt.Color(255, 255, 255));
        BtnCifrarTexto.setText("Cifrar Texto");
        BtnCifrarTexto.setBorder(null);
        BtnCifrarTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCifrarTexto.setFocusable(false);
        BtnCifrarTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCifrarTexto.setMargin(new java.awt.Insets(5, 14, 5, 14));
        BtnCifrarTexto.setMaximumSize(new java.awt.Dimension(100, 30));
        BtnCifrarTexto.setMinimumSize(new java.awt.Dimension(90, 30));
        BtnCifrarTexto.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnCifrarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCifrarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCifrarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 300, 50));

        BtnDescifrarTexto.setBackground(new java.awt.Color(0, 0, 0));
        BtnDescifrarTexto.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        BtnDescifrarTexto.setForeground(new java.awt.Color(255, 255, 255));
        BtnDescifrarTexto.setText("Descifrar Texto");
        BtnDescifrarTexto.setBorder(null);
        BtnDescifrarTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDescifrarTexto.setFocusable(false);
        BtnDescifrarTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDescifrarTexto.setMargin(new java.awt.Insets(5, 14, 5, 14));
        BtnDescifrarTexto.setMaximumSize(new java.awt.Dimension(100, 30));
        BtnDescifrarTexto.setMinimumSize(new java.awt.Dimension(90, 30));
        BtnDescifrarTexto.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnDescifrarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescifrarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDescifrarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 50));

        LabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgApp.jpg"))); // NOI18N
        LabelBg.setMaximumSize(new java.awt.Dimension(500, 500));
        LabelBg.setMinimumSize(new java.awt.Dimension(500, 500));
        LabelBg.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(LabelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetrocederActionPerformed
        Main mainInstance = Main.getIntanceMain();
        mainInstance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRetrocederActionPerformed

    private void BtnCifrarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCifrarTextoActionPerformed
        File selectedFile = getFile(); // Obtener archivo
        int shift = getShift();
        if (shift == -1) return;   
        processFile (selectedFile, shift, true);
    }//GEN-LAST:event_BtnCifrarTextoActionPerformed

    private void BtnDescifrarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescifrarTextoActionPerformed
        File selectedFile = getFile();
        int shift = getShift();
        if (shift == -1) return;
        processFile (selectedFile, shift, false);
    }//GEN-LAST:event_BtnDescifrarTextoActionPerformed
    
    private void processFile (File selectedFile, int shift, boolean isEncrypting) {
        if (selectedFile != null) {
            File outputFile = new File (getFileName (selectedFile) + (isEncrypting ? "-c" : "-d") + ".txt");
            
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
               BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
               
               int caracter; 
               while ((caracter = reader.read()) != -1) {
                   char c = isEncrypting ? cifrar((char) caracter, shift) : descifrar((char) caracter, shift);
                   writer.write(c);
               }
               
               writer.flush();
               JOptionPane.showMessageDialog(this, 
                       (isEncrypting? "Archivo cifrado" : "Archivo descifrado") + "guardado como: " + outputFile.getName(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
               
                // Regresar a la vista principal
               this.setVisible(false);
               Main.getIntanceMain().setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private int getShift () {
        String input = JOptionPane.showInputDialog(this, "Ingrese el desplazamiento:");
        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ingresó ningún desplazamiento", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        
        Matcher matcher = NUM_PATTERN.matcher(input);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido");
            return -1;
        }
        
        return Integer.parseInt(input);
    }
    
    private String getFileName (File selectedFile) {
        String filename = selectedFile.getName();
        int i = filename.lastIndexOf(".");
        if (i > 0) 
            filename = filename.substring(0, i);
        
        return filename;
    }
    
    private char cifrar (char c, int shift) {
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) ((c - base + shift + 26) % 26 + base);
        }
        
        return c;
    }
    
    private char descifrar (char c, int shift) {
        if (Character.isLetter(c)) {
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            return (char) ((c - base - shift + 26) % 26 + base);
        }
        
        return c;
    }
    
    private File getFile () {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto", "txt"));
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado" + selectedFile.getAbsolutePath());
            return selectedFile;
        }
        
        else {
            System.out.println("No se selecciono ningun archivo");
            return null;
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewText().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCifrarTexto;
    private javax.swing.JButton BtnDescifrarTexto;
    private javax.swing.JButton BtnRetroceder;
    private javax.swing.JLabel LabelBg;
    // End of variables declaration//GEN-END:variables
}
