/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Durfen
 */
public class Compresionkhadija extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public Compresionkhadija() {
        initComponents();
        listener();
        setVisible(true);

    }

    public boolean respuestacorrecta() {
        String posiblenul;

        if (textnpadre.getText().equalsIgnoreCase("Ghoulbzouri") && textnmadre.getText().equalsIgnoreCase("Amara")
                && textprovincia.getText().equalsIgnoreCase("Kenitra") && textpais.getText().equalsIgnoreCase("Marruecos")
                && (posiblenul = textpasaporte.getText()) != null) {
            return true;

        } else {
            return false;
        }

    }

    private void listener() {
        //se limita la posibilidad de escribir a 200 caracteres0
        int limite = 200;
        textnpadre.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textnpadre.getText().length() == "Ghoulbzouri".length()) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textnmadre.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textnmadre.getText().length() == "Amara".length()) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textdni.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textdni.getText().length() == 1 || (e.getKeyChar() != 'x'&& e.getKeyChar() != 'X')) {
                    e.consume();  // ignorar el evento de teclado
                }else{
                    texttarjeta.setText("");
                    textpasaporte.setText("");
                }
            }
        });
        texttarjeta.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (texttarjeta.getText().length() == 1 || (e.getKeyChar() != 'x'&& e.getKeyChar() != 'X')) {
                    e.consume();  // ignorar el evento de teclado
                }else{
                    textdni.setText("");
                    textpasaporte.setText("");
                }
            }
        });
        textpasaporte.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textpasaporte.getText().length() == 2 || e.getKeyChar() != 'x'|| e.getKeyChar() != 'X') {
                    e.consume();  // ignorar el evento de teclado
                }else{
                    textdni.setText("");
                    texttarjeta.setText("");
                }
            }
        });
        textprovincia.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textprovincia.getText().length() == "Kenitra".length()) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        textpais.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (textpais.getText().length() == "Marruecos".length()) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textnpadre = new javax.swing.JTextField();
        textnmadre = new javax.swing.JTextField();
        labelnpadre = new javax.swing.JLabel();
        labelnmadre = new javax.swing.JLabel();
        textdni = new javax.swing.JTextField();
        texttarjeta = new javax.swing.JTextField();
        textpasaporte = new javax.swing.JTextField();
        labermarque = new javax.swing.JLabel();
        labeldni = new javax.swing.JLabel();
        labeltarjeta = new javax.swing.JLabel();
        labelpasaporte = new javax.swing.JLabel();
        textprovincia = new javax.swing.JTextField();
        labelprovincia = new javax.swing.JLabel();
        labelpais = new javax.swing.JLabel();
        textpais = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(571, 170));

        labelnpadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelnpadre.setText("Nombre del padre");

        labelnmadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelnmadre.setText("Nombre de la madre");

        textdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdniActionPerformed(evt);
            }
        });

        texttarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttarjetaActionPerformed(evt);
            }
        });

        textpasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpasaporteActionPerformed(evt);
            }
        });

        labermarque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labermarque.setText("Tipo de documento identificativo. Marque con una X.");

        labeldni.setText("DNI");

        labeltarjeta.setText("Tarjeta de extranjero");

        labelpasaporte.setText("Pasaporte");

        labelprovincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelprovincia.setText("Provincia de nacimiento");

        labelpais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelpais.setText("Pais de nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labeldni)
                .addGap(18, 18, 18)
                .addComponent(textdni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(labeltarjeta)
                .addGap(29, 29, 29)
                .addComponent(texttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(labelpasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textpasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textpais, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(labelpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labermarque, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelnpadre, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(textnpadre))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textnmadre)
                                    .addComponent(labelnmadre, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelnpadre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelnmadre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textnmadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textnpadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labermarque, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelpasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltarjeta)
                    .addComponent(textdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelpais, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdniActionPerformed

    private void texttarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttarjetaActionPerformed

    private void textpasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpasaporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpasaporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labeldni;
    private javax.swing.JLabel labelnmadre;
    private javax.swing.JLabel labelnpadre;
    private javax.swing.JLabel labelpais;
    private javax.swing.JLabel labelpasaporte;
    private javax.swing.JLabel labelprovincia;
    private javax.swing.JLabel labeltarjeta;
    private javax.swing.JLabel labermarque;
    private javax.swing.JTextField textdni;
    private javax.swing.JTextField textnmadre;
    private javax.swing.JTextField textnpadre;
    private javax.swing.JTextField textpais;
    private javax.swing.JTextField textpasaporte;
    private javax.swing.JTextField textprovincia;
    private javax.swing.JTextField texttarjeta;
    // End of variables declaration//GEN-END:variables
}