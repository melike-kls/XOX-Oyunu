
import javax.swing.JOptionPane;


public class XOX extends javax.swing.JFrame {

    String[] hucre = new String[9];
    String[] skorlardata = new String[10];
    int i=0;
    String ad ="";
    int oyuncu_skor= 0;
    int bilgisayar_skor = 0;
    

    public XOX() {
        initComponents();
        pnl_oyun_alani.setVisible(false);
        pnl_durum.setVisible(false);
        pnl_skorlar.setVisible(false);
        btn_sifirla.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_oyuncu_bilgisi = new javax.swing.JPanel();
        lbl_oyuncuad = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        btn_basla = new javax.swing.JButton();
        pnl_oyun_alani = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        pnl_durum = new javax.swing.JPanel();
        lbl_oyuncu = new javax.swing.JLabel();
        lbl_bilgisayar = new javax.swing.JLabel();
        lbl_oyuncu_sonuc = new javax.swing.JLabel();
        lbl_bilgisayar_sonuc = new javax.swing.JLabel();
        btn_yeniden_oyna = new javax.swing.JButton();
        btn_sifirla = new javax.swing.JButton();
        pnl_skorlar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_skor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_oyuncu_bilgisi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        pnl_oyuncu_bilgisi.setToolTipText("");

        lbl_oyuncuad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_oyuncuad.setForeground(new java.awt.Color(0, 51, 51));
        lbl_oyuncuad.setText("Oyuncu Adı:");

        btn_basla.setBackground(new java.awt.Color(204, 204, 255));
        btn_basla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_basla.setForeground(new java.awt.Color(0, 102, 153));
        btn_basla.setText("Başla");
        btn_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_oyuncu_bilgisiLayout = new javax.swing.GroupLayout(pnl_oyuncu_bilgisi);
        pnl_oyuncu_bilgisi.setLayout(pnl_oyuncu_bilgisiLayout);
        pnl_oyuncu_bilgisiLayout.setHorizontalGroup(
            pnl_oyuncu_bilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyuncu_bilgisiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_oyuncuad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_oyuncu_bilgisiLayout.setVerticalGroup(
            pnl_oyuncu_bilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyuncu_bilgisiLayout.createSequentialGroup()
                .addGroup(pnl_oyuncu_bilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_oyuncu_bilgisiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_oyuncu_bilgisiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_oyuncu_bilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_oyuncuad)
                            .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnl_oyun_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(204, 204, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg"))); // NOI18N
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_oyun_alaniLayout = new javax.swing.GroupLayout(pnl_oyun_alani);
        pnl_oyun_alani.setLayout(pnl_oyun_alaniLayout);
        pnl_oyun_alaniLayout.setHorizontalGroup(
            pnl_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyun_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnl_oyun_alaniLayout.setVerticalGroup(
            pnl_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyun_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnl_durum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Durum", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        lbl_oyuncu.setText("Oyuncu:");

        lbl_bilgisayar.setText("Bilgisayar:");

        lbl_oyuncu_sonuc.setText("0");

        lbl_bilgisayar_sonuc.setText("0");

        btn_yeniden_oyna.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_yeniden_oyna.setForeground(new java.awt.Color(0, 102, 153));
        btn_yeniden_oyna.setText("Yeniden Oyna");
        btn_yeniden_oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yeniden_oynaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_durumLayout = new javax.swing.GroupLayout(pnl_durum);
        pnl_durum.setLayout(pnl_durumLayout);
        pnl_durumLayout.setHorizontalGroup(
            pnl_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_durumLayout.createSequentialGroup()
                .addGroup(pnl_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_durumLayout.createSequentialGroup()
                        .addComponent(lbl_oyuncu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_oyuncu_sonuc))
                    .addGroup(pnl_durumLayout.createSequentialGroup()
                        .addComponent(lbl_bilgisayar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_bilgisayar_sonuc)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_yeniden_oyna, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_durumLayout.setVerticalGroup(
            pnl_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_oyuncu)
                    .addComponent(lbl_oyuncu_sonuc))
                .addGap(18, 18, 18)
                .addGroup(pnl_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bilgisayar)
                    .addComponent(lbl_bilgisayar_sonuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_yeniden_oyna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_sifirla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sifirla.setForeground(new java.awt.Color(102, 0, 0));
        btn_sifirla.setText("Oyunu Sıfırla");
        btn_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifirlaActionPerformed(evt);
            }
        });

        pnl_skorlar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jScrollPane1.setViewportView(lst_skor);

        javax.swing.GroupLayout pnl_skorlarLayout = new javax.swing.GroupLayout(pnl_skorlar);
        pnl_skorlar.setLayout(pnl_skorlarLayout);
        pnl_skorlarLayout.setHorizontalGroup(
            pnl_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_skorlarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_skorlarLayout.setVerticalGroup(
            pnl_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_skorlarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_oyuncu_bilgisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_oyun_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_durum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sifirla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_skorlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_skorlar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_oyuncu_bilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_oyun_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int say=0;

    private void btn_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baslaActionPerformed
       ad = txt_ad.getText();
       pnl_oyun_alani.setVisible(true);
       pnl_oyuncu_bilgisi.setEnabled(false);
       txt_ad.setEnabled(false);
       btn_basla.setEnabled(false);
       pnl_skorlar.setVisible(false);
       bilgisayar_skor = 0;
       oyuncu_skor = 0;
       say=0;
        for (int i = 0; i < 9; i++) 
            hucre [i] = "";
            oyun_durum = true;
    }//GEN-LAST:event_btn_baslaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn1.setEnabled(false);
        hucre[0]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn2.setEnabled(false);
        hucre[1]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn3.setEnabled(false);
        hucre[2]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn4.setEnabled(false);
        hucre[3]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn5.setEnabled(false);
        hucre[4]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn6.setEnabled(false);
        hucre[5]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn7.setEnabled(false);
        hucre[6]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn8.setEnabled(false);
        hucre[7]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.jpg")));
        btn9.setEnabled(false);
        hucre[8]="x";
        say++;
        kontrol();
        bilgisayar_oyna();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifirlaActionPerformed
        butonsifirlama();
        degerleri_sifirla();
        skorlardata[i]= ad+ "-" + oyuncu_skor;
        i++;
        pnl_skorlar.setVisible(true);
        pnl_durum.setVisible(false);
        pnl_oyun_alani.setVisible(false);
        pnl_oyuncu_bilgisi.setVisible(true);
        txt_ad.setEnabled(true);
        btn_basla.setEnabled(true);
        lst_skor.setListData(skorlardata);
        btn_sifirla.setVisible(false);
        
    }//GEN-LAST:event_btn_sifirlaActionPerformed

    private void btn_yeniden_oynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yeniden_oynaActionPerformed
        pnl_oyun_alani.setVisible(true);
        butonsifirlama();
        degerleri_sifirla();
    }//GEN-LAST:event_btn_yeniden_oynaActionPerformed
      public void butonsifirlama(){
           btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b.jpg")));
           btn1.setEnabled(true);
           btn2.setEnabled(true);
           btn3.setEnabled(true);
           btn4.setEnabled(true);
           btn5.setEnabled(true);
           btn6.setEnabled(true);
           btn7.setEnabled(true);
           btn8.setEnabled(true);
           btn9.setEnabled(true);
      }
    
    public void degerleri_sifirla(){
        for (int j = 0; j < 9; j++) {
            hucre[j] = "";
            say=0;
        }
        oyun_durum=true;
    }
    
    
    
    
    boolean oyun_durum = false;
        
        public void kontrol(){
           XOX f = new XOX();
            if (say < 9) {
                if (hucre[0] =="x"& hucre[3] =="x" & hucre[6] == "x"
                        || hucre[1] =="x"& hucre[4] =="x" & hucre[7] == "x"
                        || hucre[2] =="x"& hucre[5] =="x" & hucre[8] == "x"
                        || hucre[0] =="x"& hucre[1] =="x" & hucre[2] == "x"
                        || hucre[3] =="x"& hucre[4] =="x" & hucre[5] == "x"
                        || hucre[6] =="x"& hucre[7] =="x" & hucre[8] == "x"){
                    JOptionPane.showMessageDialog(f, "Oyuncu Kazandı");
                    oyuncu_skor++;
                    oyun_durum = false;
                    lbl_oyuncu.setText(String.valueOf(oyuncu_skor));                    
                }else if (hucre[0] =="o"& hucre[3] =="o" & hucre[6] == "o"
                        || hucre[1] =="o"& hucre[4] =="o" & hucre[7] == "o"
                        || hucre[2] =="o"& hucre[5] =="o" & hucre[8] == "o"
                        || hucre[0] =="o"& hucre[1] =="o" & hucre[2] == "o"
                        || hucre[3] =="o"& hucre[4] =="o" & hucre[5] == "o"
                        || hucre[6] =="o"& hucre[7] =="o" & hucre[8] == "o"){
                    JOptionPane.showMessageDialog(f, "Bilgisayar Kazandı");
                    bilgisayar_skor++;
                    oyun_durum = false;
                    lbl_bilgisayar.setText(String.valueOf(bilgisayar_skor));  
                    
                }else if (say==9) {
                    JOptionPane.showMessageDialog(f, "Kazanan Yoktur");                
                    oyun_durum = false;
                }
                if (oyun_durum == false) {
                    pnl_durum.setVisible(true);
                    pnl_oyun_alani.setVisible(false);
                    btn_sifirla.setVisible(true);
                }
                
            }
        }
        
    public void bilgisayar_oyna(){
        if (oyun_durum == true) {
            int h= -1;
            boolean durum = false;
            do {
                h = (int) (Math.random() * 9);
                if (hucre[h]=="x") {
                    durum = false;
                    
                }else if(hucre[h]=="o"){
                    durum = false;
                }else{
                    durum = true;
                }
            } while (durum==false);
            
            
            hucre[h] = "o";
            say++;
            if (h==0) {
                btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn1.setEnabled(false);
            }else if (h==1) {
                btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn2.setEnabled(false);
            }else if (h==2) {
                btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn3.setEnabled(false);
            }else if (h==3) {
                btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn4.setEnabled(false);
            }else if (h==4) {
                btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn5.setEnabled(false);
            }else if (h==5) {
                btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn6.setEnabled(false);
            }else if (h==6) {
                btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn7.setEnabled(false);
            }else if (h==7) {
                btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn8.setEnabled(false);
            }else if (h==8) {
                btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.jpg")));
                btn9.setEnabled(false);
            }
            kontrol();
        }
    }    
        
        
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(XOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XOX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new XOX().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_basla;
    private javax.swing.JButton btn_sifirla;
    private javax.swing.JButton btn_yeniden_oyna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bilgisayar;
    private javax.swing.JLabel lbl_bilgisayar_sonuc;
    private javax.swing.JLabel lbl_oyuncu;
    private javax.swing.JLabel lbl_oyuncu_sonuc;
    private javax.swing.JLabel lbl_oyuncuad;
    private javax.swing.JList<String> lst_skor;
    private javax.swing.JPanel pnl_durum;
    private javax.swing.JPanel pnl_oyun_alani;
    private javax.swing.JPanel pnl_oyuncu_bilgisi;
    private javax.swing.JPanel pnl_skorlar;
    private javax.swing.JTextField txt_ad;
    // End of variables declaration//GEN-END:variables
}
