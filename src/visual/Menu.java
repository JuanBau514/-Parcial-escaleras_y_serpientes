/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;
import modelo.*;
/**
 *
 * @author juanpbaucl514
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    public String menuPrincipal() {
        new Menu().setVisible(true);
        return "1";
    }

    public void menuJugar() {
        new CajasMensaje();
        CajasMensaje jugar = new CajasMensaje("Escaleras y Serpientes", "Jugar");
        jugar.mostrar("Jugar");
        
        this.dispose();

    }

    public void menuInstrucciones() {
        this.setVisible(false);
        CajasMensaje instrucciones = new CajasMensaje("Instrucciones", "Instrucciones");
        instrucciones.mostrar("Instrucciones");
        this.setVisible(true);
        this.dispose();
    }

    public void menuCreditos() {
        this.setVisible(false);
        CajasMensaje creditos = new CajasMensaje("Creditos", "Juan Pablo Bautista clavijo");
        creditos.mostrar("Juan Pablo Bautista clavijo");
        this.setVisible(true);
        this.dispose();
        
    }

    public void menuSalir() {
        this.setVisible(false);
        System.exit(0);
    }

    public void menuError() {
        this.setVisible(false);
        CajasMensaje error = new CajasMensaje("Error", "Opcion no valida");
        error.mostrar("Opcion no valida");
        this.setVisible(true);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 217, 178));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serpienteyescaleras.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 340, 510));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(225, 41, 65));
        jLabel1.setText("Dados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel3.setText("Escaleras y Serpientes :D");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("Bienvenido, configure las generalizades para su inicio de juego");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(225, 41, 65));
        jLabel5.setText("Jugadores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 20));

        jComboBox1.setBackground(new java.awt.Color(195, 219, 71));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 230, 100, -1));

        jComboBox2.setBackground(new java.awt.Color(195, 219, 71));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 230, 100, -1));

        jButton1.setBackground(new java.awt.Color(195, 219, 71));
        jButton1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jButton1.setText("Empieza a jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            // cuando se presione el boton empieza a jugar se ejecutara el metodo menuJugar
                menuJugar();
                            
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// Este es el boton que iniciara el juego y mostrara la interfaz del juego del tablero 
        int jugadores = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        int dados = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        Tablero tablero = new Tablero();
        tablero.crearTablero();
        tablero.mostrarTablero();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
