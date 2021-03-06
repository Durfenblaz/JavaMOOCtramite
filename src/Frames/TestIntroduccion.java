/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Funcionamiento.Conexion;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import recursograficoscom.Barras;
import recursograficoscom.Botones;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
public class TestIntroduccion extends javax.swing.JFrame {

    //declaracion elementos gráficos
    private Botones botonnext = new Botones();
    private Barras barrasupe = new Barras();
    private Fondo fondo = new Fondo();
    //array guardado de respuestas e id usuario 
    private String respuestas[] = new String[7];
    private int contador = 1;
    private int id;

    /**
     * Creates new form Testintroduccion
     */
    //constructor
    public TestIntroduccion(int id) {
        this.id = id;
        initComponents();
        setVisible(true);
        iniciarcomponentes();
        listener();
        

    }

    //metodo para añadir elementos de manera manual
    private void iniciarcomponentes() {
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        setResizable(false); 
        add(barrasupe);
        add(fondo);
        respuesta.setText("");
        respuesta.setLineWrap(true);
        barrasupe.setBounds(0, 0, 700, 20);
        fondo.setBounds(0, 0, 5888, 600);
        nextboton.setIcon(botonnext.Botonnext()); 
        this.setLocationRelativeTo(null);
        
        setResizable(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        respuesta = new javax.swing.JTextArea();
        nextboton = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        respuesta.setColumns(20);
        respuesta.setRows(5);
        jScrollPane1.setViewportView(respuesta);

        nextboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextbotonMouseClicked(evt);
            }
        });

        enunciado.setText("1. ¿Cómo puedes saber cuál es el centro de salud que te corresponde?");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enunciados/testeintroduccion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextboton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enunciado, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nextboton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbotonMouseClicked

        //Switch que organiza en que parte del text se encuentra. Se introduce la respuesta en un array
        switch (contador) {
            case 1:
                enunciado.setText("2. ¿Qué hay que hacer para pedir cita por internet?");
                respuestas[0] = respuesta.getText();
                respuesta.setText("");
                contador++;
                break;
            case 2:
                enunciado.setText("3. ¿Qué documentos necesitas para tener la tarjeta sanitaria?");
                respuestas[1] = respuesta.getText();
                respuesta.setText("");
                contador++;
                break;
            case 3:
                enunciado.setText("4. ¿Qué documento tienes que rellenar en la Seguridad Social?");
                respuestas[2] = respuesta.getText();
                respuesta.setText("");
                contador++;
                break;
            case 4:
                enunciado.setText("5. ¿Qué documento te dan en la Seguridad Social después de completar la solicitud?");
                respuestas[3] = respuesta.getText();
                respuesta.setText("");
                contador++;
                break;
            case 5:
                enunciado.setText("6. ¿Qué pasos hay que seguir para obtener la tarjeta sanitaria?");
                respuestas[4] = respuesta.getText();
                respuesta.setText("");
                contador++;
                break;
            case 6:
                enunciado.setText("7. ¿Para qué sirve el documento acreditativo del derecho a la asistencia?");
                respuestas[5] = respuesta.getText();
                respuesta.setText("");
                contador++;
                break;
            case 7:
                respuestas[6] = respuesta.getText();
                //se habre inicio y se mandan las respuestas en un segundo plano poniendo el setvisible false
                JOptionPane.showMessageDialog(null, "Respuestas enviadas.");
                Inicio inicio = new Inicio(id);
                setVisible(false);
                Conexion conexion = new Conexion();
                conexion.ejercicioIntroducion(id, respuestas);
                dispose();
        }
    }//GEN-LAST:event_nextbotonMouseClicked
    private void listener() {
        //se limita la posibilidad de escribir a 200 caracteres0
        int limite = 200;
        respuesta.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                // Verificar si la tecla pulsada no es un digito
                if (respuesta.getText().length() == limite) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
    }


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nextboton;
    private javax.swing.JTextArea respuesta;
    // End of variables declaration//GEN-END:variables
}
