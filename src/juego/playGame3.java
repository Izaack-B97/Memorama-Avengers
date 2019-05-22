/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import files.logica3;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Fernando Cota
 */
public class playGame3 extends javax.swing.JFrame {

    
  //  private VFondo fondo;
    private logica3 log = new logica3();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    private AudioClip bonusSound = java.applet.Applet.newAudioClip(getClass().getResource("/musica/bonus.wav"));
    private AudioClip errorSound = java.applet.Applet.newAudioClip(getClass().getResource("/musica/perder.wav"));
    
    
    
    /**
     * Creates new form playGame
     */
    public playGame3() {
        initComponents();
        this.setLocationRelativeTo(null);
        setCards();
        btnNext.setEnabled(false);
        txtScore.setEnabled(false);
    }

    
    private void setCards() {
        int[] numbers = log.getCardNumbers3();
        
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[0]+".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[1]+".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[2]+".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[3]+".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[4]+".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[5]+".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[6]+".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[7]+".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[8]+".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[9]+".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[10]+".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[11]+".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[12]+".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[13]+".png")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[14]+".png")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[15]+".png")));
        btnC17.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[16]+".png")));
        btnC18.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[17]+".png")));
        btnC19.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[18]+".png")));
        btnC20.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes3/c"+numbers[19]+".png")));
    }    
    
    
    private void btnEnabled(JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            //puntaje += 20;
            String puntajeS=Integer.toString(puntaje);
                //txtScore.setText(puntajeS);
            pregwin();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                errorSound.play();
                if(puntaje > 10 ) {
                    puntaje --;
                }
                //String puntajeS=Integer.toString(puntaje);
                //txtScore.setText(puntajeS);
            }else{
                puntaje += 20;
                txtScore.setText(Integer.toString(puntaje));
                bonusSound.play();
            }
            caraUp = false;
        }
    }
    private void pregwin() {
        if(!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled() && 
                !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled() && 
                !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled()&&
                !btnC17.isEnabled() && !btnC18.isEnabled() && !btnC19.isEnabled() && !btnC20.isEnabled()) {
            btnNext.setEnabled(true);
        }
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
        jPanel1 = new javax.swing.JPanel();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnC17 = new javax.swing.JButton();
        btnC18 = new javax.swing.JButton();
        btnC19 = new javax.swing.JButton();
        btnC20 = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setText("The Avengers");

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setFocusable(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setFocusable(false);
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setFocusable(false);
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setFocusable(false);
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setFocusable(false);
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setFocusable(false);
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setFocusable(false);
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setFocusable(false);
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setFocusable(false);
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setFocusable(false);
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setFocusable(false);
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setFocusable(false);
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setFocusable(false);
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setFocusable(false);
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC15.setBorder(null);
        btnC15.setBorderPainted(false);
        btnC15.setContentAreaFilled(false);
        btnC15.setFocusable(false);
        btnC15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC15MouseExited(evt);
            }
        });
        btnC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC15ActionPerformed(evt);
            }
        });

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC16.setBorder(null);
        btnC16.setBorderPainted(false);
        btnC16.setContentAreaFilled(false);
        btnC16.setFocusable(false);
        btnC16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC16MouseExited(evt);
            }
        });
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });

        btnC17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC17.setBorder(null);
        btnC17.setBorderPainted(false);
        btnC17.setContentAreaFilled(false);
        btnC17.setFocusable(false);
        btnC17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC17MouseExited(evt);
            }
        });
        btnC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC17ActionPerformed(evt);
            }
        });

        btnC18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC18.setBorder(null);
        btnC18.setBorderPainted(false);
        btnC18.setContentAreaFilled(false);
        btnC18.setFocusable(false);
        btnC18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC18MouseExited(evt);
            }
        });
        btnC18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC18ActionPerformed(evt);
            }
        });

        btnC19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC19.setBorder(null);
        btnC19.setBorderPainted(false);
        btnC19.setContentAreaFilled(false);
        btnC19.setFocusable(false);
        btnC19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC19MouseExited(evt);
            }
        });
        btnC19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC19ActionPerformed(evt);
            }
        });

        btnC20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC20.setBorder(null);
        btnC20.setBorderPainted(false);
        btnC20.setContentAreaFilled(false);
        btnC20.setFocusable(false);
        btnC20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC20MouseExited(evt);
            }
        });
        btnC20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addGap(18, 18, 18)
                        .addComponent(btnC2)
                        .addGap(18, 18, 18)
                        .addComponent(btnC3)
                        .addGap(18, 18, 18)
                        .addComponent(btnC4)
                        .addGap(18, 18, 18)
                        .addComponent(btnC5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC6)
                            .addComponent(btnC11)
                            .addComponent(btnC16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnC12)
                                    .addComponent(btnC7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnC8)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnC9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnC13)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnC14))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnC17)
                                .addGap(18, 18, 18)
                                .addComponent(btnC18)
                                .addGap(18, 18, 18)
                                .addComponent(btnC19)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnC20)
                            .addComponent(btnC15)
                            .addComponent(btnC10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC4)
                    .addComponent(btnC2)
                    .addComponent(btnC3)
                    .addComponent(btnC1)
                    .addComponent(btnC5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC9)
                    .addComponent(btnC10)
                    .addComponent(btnC8)
                    .addComponent(btnC7)
                    .addComponent(btnC6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC12)
                    .addComponent(btnC11)
                    .addComponent(btnC13)
                    .addComponent(btnC14)
                    .addComponent(btnC15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC17)
                    .addComponent(btnC16)
                    .addComponent(btnC18)
                    .addComponent(btnC19)
                    .addComponent(btnC20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNext.setText("Bonus extra");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel2.setText("Score:");

        txtScore.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99)))
                .addComponent(btnNext)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNext)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC11);
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC12);
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC13);
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC14);
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC15);
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC16);
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        // TODO add your handling code here:
         compare();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        preguntas bonus = new preguntas();
        bonus.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnC17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC17MouseExited
        // TODO add your handling code here:
        compare();
         
    }//GEN-LAST:event_btnC17MouseExited

    private void btnC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC17ActionPerformed
        // TODO add your handling code here:
         btnEnabled(btnC17);
    }//GEN-LAST:event_btnC17ActionPerformed

    private void btnC18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC18MouseExited
        // TODO add your handling code here:
        compare();
          
    }//GEN-LAST:event_btnC18MouseExited

    private void btnC18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC18ActionPerformed
        // TODO add your handling code here:
        btnEnabled(btnC18);
    }//GEN-LAST:event_btnC18ActionPerformed

    private void btnC19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC19MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC19MouseExited

    private void btnC19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC19ActionPerformed
        // TODO add your handling code here:
          btnEnabled(btnC19);
    }//GEN-LAST:event_btnC19ActionPerformed

    private void btnC20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC20MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC20MouseExited

    private void btnC20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC20ActionPerformed
        // TODO add your handling code here:
          btnEnabled(btnC20);
    }//GEN-LAST:event_btnC20ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(playGame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(playGame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(playGame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(playGame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new playGame3().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC17;
    private javax.swing.JButton btnC18;
    private javax.swing.JButton btnC19;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC20;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
