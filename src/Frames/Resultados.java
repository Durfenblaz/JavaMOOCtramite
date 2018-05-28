/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Funcionamiento.Conexion;
import javax.swing.ImageIcon;
import recursograficoscom.Barras;
import recursograficoscom.Botones;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
    //Clase muestra resultados
public class Resultados extends javax.swing.JFrame {
    //elementos gráficos
    private Barras barrasupe = new Barras();
    private Botones imgbotonext = new Botones();
    private Fondo fondo = new Fondo();
    //elementos lógicos
    private Integer correctas = 0;
    private Integer incorrectas = 0;
    //contenedor resultados
    private static boolean[] resultados;
    // 0 suspenso 1 aprobado. Se utiliza byte en vez de boolean por la BBDD
    private byte resultado =  1;
    private int id;
    private int ideejercicio;

    /**
     * Creates new form Resultados
     */
    public Resultados(boolean[] resultado,int id,int ideejercicio) {
        this.id=id;
        this.ideejercicio=ideejercicio;
        initComponents();
        iniciarcomponentes();
        //se introducen los resultaados
        resultados = resultado;
        mostrarresultado();
        setVisible(true);
        System.out.println(this.id+"2222");

    }

    private void iniciarcomponentes() {
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        add(barrasupe);
        add(fondo);
        barrasupe.setBounds(0,0,820,20);
        fondo.setBounds(0, 0, 5888, 600);
        botonnext.setIcon(imgbotonext.Botonnext());
        setLocationRelativeTo(null);
        setResizable(false); 
    }

    public void mostrarresultado() {
        //se recorre el array viendo las correctas e incorrectas
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i]) {
                correctas++;
                
            } else {
                incorrectas++;
            }
        }
        //condicion aprobado suspenso
        if(correctas<incorrectas){
            aprobado.setText("Suspenso");
            resultado=0;
        }  
        //se actualizan los datos en la BBDD
        Conexion conexion = new Conexion();
        numcorrecta.setText(correctas.toString());
        numincorrecta.setText(incorrectas.toString());
        conexion.Test(id, resultado,correctas,ideejercicio);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numcorrecta = new javax.swing.JLabel();
        numincorrecta = new javax.swing.JLabel();
        botonnext = new javax.swing.JLabel();
        aprobado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RESULTADOS");

        jLabel2.setText("Correctas:");

        jLabel3.setText("Incorrectas:");

        botonnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnextMouseClicked(evt);
            }
        });

        aprobado.setText("Aprobado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numcorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aprobado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(numincorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(botonnext, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numincorrecta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(numcorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(aprobado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(botonnext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnextMouseClicked
    
        Inicio inicio = new Inicio(id);
        dispose();
    }//GEN-LAST:event_botonnextMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aprobado;
    private javax.swing.JLabel botonnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel numcorrecta;
    private javax.swing.JLabel numincorrecta;
    // End of variables declaration//GEN-END:variables
}