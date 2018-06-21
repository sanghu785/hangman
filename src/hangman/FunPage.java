package hangman;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.lang.StringBuffer;
import java.net.URL;
public class FunPage extends javax.swing.JFrame {
    public FunPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newgame = new javax.swing.JButton();
        w = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        v = new javax.swing.JButton();
        p = new javax.swing.JButton();
        r = new javax.swing.JButton();
        n = new javax.swing.JButton();
        o = new javax.swing.JButton();
        g = new javax.swing.JButton();
        x = new javax.swing.JButton();
        q = new javax.swing.JButton();
        y = new javax.swing.JButton();
        m = new javax.swing.JButton();
        z = new javax.swing.JButton();
        f = new javax.swing.JButton();
        l = new javax.swing.JButton();
        e = new javax.swing.JButton();
        k = new javax.swing.JButton();
        d = new javax.swing.JButton();
        j = new javax.swing.JButton();
        c = new javax.swing.JButton();
        i = new javax.swing.JButton();
        b = new javax.swing.JButton();
        h = new javax.swing.JButton();
        a = new javax.swing.JButton();
        u = new javax.swing.JButton();
        s = new javax.swing.JButton();
        t = new javax.swing.JButton();
        h0 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        Sco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        newgame.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        newgame.setForeground(new java.awt.Color(255, 255, 153));
        newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        newgame.setText("New Game");
        newgame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        jPanel1.add(newgame);
        newgame.setBounds(0, 0, 140, 40);

        w.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        w.setForeground(new java.awt.Color(255, 255, 204));
        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        w.setText("W");
        w.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        jPanel1.add(w);
        w.setBounds(70, 380, 55, 50);

        quit.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 255, 153));
        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        quit.setText("Quit");
        quit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quit.setMaximumSize(new java.awt.Dimension(373, 252));
        quit.setMinimumSize(new java.awt.Dimension(373, 252));
        quit.setPreferredSize(new java.awt.Dimension(373, 252));
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jPanel1.add(quit);
        quit.setBounds(310, 380, 117, 50);

        v.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        v.setForeground(new java.awt.Color(255, 255, 204));
        v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        v.setText("V");
        v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });
        jPanel1.add(v);
        v.setBounds(10, 380, 55, 50);

        p.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 204));
        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        p.setText("P");
        p.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        jPanel1.add(p);
        p.setBounds(70, 320, 55, 50);

        r.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        r.setForeground(new java.awt.Color(255, 255, 204));
        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        r.setText("R");
        r.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        jPanel1.add(r);
        r.setBounds(190, 320, 55, 50);

        n.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 204));
        n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        n.setText("N");
        n.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel1.add(n);
        n.setBounds(370, 260, 55, 50);

        o.setBackground(new java.awt.Color(255, 255, 204));
        o.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 204));
        o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        o.setText("O");
        o.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        jPanel1.add(o);
        o.setBounds(10, 320, 55, 50);

        g.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        g.setForeground(new java.awt.Color(255, 255, 204));
        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        g.setText("G");
        g.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        jPanel1.add(g);
        g.setBounds(370, 200, 55, 50);

        x.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 204));
        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        x.setText("X");
        x.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        jPanel1.add(x);
        x.setBounds(130, 380, 55, 50);

        q.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        q.setForeground(new java.awt.Color(255, 255, 204));
        q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        q.setText("Q");
        q.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        jPanel1.add(q);
        q.setBounds(130, 320, 55, 50);

        y.setBackground(new java.awt.Color(255, 255, 204));
        y.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        y.setForeground(new java.awt.Color(255, 255, 204));
        y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        y.setText("Y");
        y.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        jPanel1.add(y);
        y.setBounds(190, 380, 55, 50);

        m.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 204));
        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        m.setText("M");
        m.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel1.add(m);
        m.setBounds(310, 260, 55, 50);

        z.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        z.setForeground(new java.awt.Color(255, 255, 204));
        z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        z.setText("Z");
        z.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });
        jPanel1.add(z);
        z.setBounds(250, 380, 55, 50);

        f.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 204));
        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        f.setText("F");
        f.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        jPanel1.add(f);
        f.setBounds(310, 200, 55, 50);

        l.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        l.setForeground(new java.awt.Color(255, 255, 204));
        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        l.setText("L");
        l.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });
        jPanel1.add(l);
        l.setBounds(250, 260, 55, 50);

        e.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 204));
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        e.setText("E");
        e.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        jPanel1.add(e);
        e.setBounds(250, 200, 55, 50);

        k.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        k.setForeground(new java.awt.Color(255, 255, 204));
        k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        k.setText("K");
        k.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        jPanel1.add(k);
        k.setBounds(190, 260, 55, 50);

        d.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 204));
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        d.setText("D");
        d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel1.add(d);
        d.setBounds(190, 200, 55, 50);

        j.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 204));
        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        j.setText("J");
        j.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });
        jPanel1.add(j);
        j.setBounds(130, 260, 55, 50);

        c.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 204));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        c.setText("C");
        c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel1.add(c);
        c.setBounds(130, 200, 55, 50);

        i.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        i.setForeground(new java.awt.Color(255, 255, 204));
        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        i.setText("I");
        i.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        jPanel1.add(i);
        i.setBounds(70, 260, 55, 50);

        b.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 204));
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        b.setText("B");
        b.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel1.add(b);
        b.setBounds(70, 200, 55, 50);

        h.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        h.setForeground(new java.awt.Color(255, 255, 204));
        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        h.setText("H");
        h.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        jPanel1.add(h);
        h.setBounds(10, 260, 55, 50);

        a.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 204));
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        a.setText("A");
        a.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a);
        a.setBounds(10, 200, 55, 50);

        u.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        u.setForeground(new java.awt.Color(255, 255, 204));
        u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        u.setText("U");
        u.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        jPanel1.add(u);
        u.setBounds(370, 320, 55, 50);

        s.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 204));
        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        s.setText("S");
        s.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        jPanel1.add(s);
        s.setBounds(250, 320, 55, 50);

        t.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 204));
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898 (2).jpeg"))); // NOI18N
        t.setText("T");
        t.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        jPanel1.add(t);
        t.setBounds(310, 320, 55, 50);

        h0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Optimized-0.jpg"))); // NOI18N
        jPanel1.add(h0);
        h0.setBounds(570, 50, 210, 390);

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Optimized-1.jpg"))); // NOI18N
        h1.setMaximumSize(new java.awt.Dimension(210, 387));
        h1.setMinimumSize(new java.awt.Dimension(210, 387));
        h1.setPreferredSize(new java.awt.Dimension(210, 387));
        jPanel1.add(h1);
        h1.setBounds(570, 50, 210, 390);

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Optimized-2.jpg"))); // NOI18N
        jPanel1.add(h2);
        h2.setBounds(570, 50, 210, 390);

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Optimized-3.jpg"))); // NOI18N
        jPanel1.add(h3);
        h3.setBounds(570, 50, 210, 390);

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Optimized-4.jpg"))); // NOI18N
        jPanel1.add(h4);
        h4.setBounds(570, 50, 210, 390);

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/Optimized-5.jpg"))); // NOI18N
        jPanel1.add(h5);
        h5.setBounds(570, 50, 210, 390);

        Label.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 153));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Label);
        Label.setBounds(90, 100, 310, 50);

        Sco.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Sco.setForeground(new java.awt.Color(255, 255, 153));
        Sco.setText("0");
        jPanel1.add(Sco);
        Sco.setBounds(650, 10, 50, 30);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Score :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 10, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/wallpaper672898.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        e.setVisible(false);
        int q2=fun2('e');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_eActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        a.setVisible(false);
        int q2=fun2('a');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_aActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        v.setVisible(false);
        int q2=fun2('v');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_vActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        b.setVisible(false);
        int q2=fun2('b');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        c.setVisible(false);
        int q2=fun2('c');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        d.setVisible(false);
        int q2=fun2('d');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_dActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        f.setVisible(false);
        int q2=fun2('f');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        g.setVisible(false);
        int q2=fun2('g');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        h.setVisible(false);
        int q2=fun2('h');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_hActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        i.setVisible(false);
        int q2=fun2('i');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_iActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        j.setVisible(false);
        int q2=fun2('j');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_jActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        k.setVisible(false);
        int q2=fun2('k');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_kActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        l.setVisible(false);
        int q2=fun2('l');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_lActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        m.setVisible(false);
        int q2=fun2('m');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_mActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        n.setVisible(false);
        int q2=fun2('n');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_nActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        o.setVisible(false);
        int q2=fun2('o');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_oActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        p.setVisible(false);
        int q2=fun2('p');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_pActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        q.setVisible(false);
        int q2=fun2('q');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_qActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        r.setVisible(false);
        int q2=fun2('r');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_rActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        s.setVisible(false);
        int q2=fun2('s');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_sActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        t.setVisible(false);
        int q2=fun2('t');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_tActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        u.setVisible(false);
        int q2=fun2('u');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_uActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        w.setVisible(false);
        int q2=fun2('w');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_wActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        x.setVisible(false);
        int q2=fun2('x');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_xActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        y.setVisible(false);
        int q2=fun2('y');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_yActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        z.setVisible(false);
        int q2=fun2('z');
        if(q2>0){
            return;
        }
        counter--;
        fun3(counter);
    }//GEN-LAST:event_zActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        fun6();
    }//GEN-LAST:event_newgameActionPerformed

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
            java.util.logging.Logger.getLogger(FunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunPage().setVisible(true);
            }
        });
    }
    void fun6(){
        jj=rand.nextInt(ii);
        while(arr[jj]==1){
           jj=rand.nextInt(ii);
        }
        fun1(jj);
        counter=5;
        h5.setVisible(false);
        h4.setVisible(false);
        h3.setVisible(false);
        h2.setVisible(false);
        h1.setVisible(false);
        h0.setVisible(true);
        a.setVisible(true);
        b.setVisible(true);
        c.setVisible(true);
        d.setVisible(true);
        e.setVisible(true);
        f.setVisible(true);
        g.setVisible(true);
        h.setVisible(true);
        i.setVisible(true);
        j.setVisible(true);
        k.setVisible(true);
        l.setVisible(true);
        m.setVisible(true);
        n.setVisible(true);
        o.setVisible(true);
        p.setVisible(true);
        q.setVisible(true);
        r.setVisible(true);
        s.setVisible(true);
        t.setVisible(true);
        u.setVisible(true);
        v.setVisible(true);
        w.setVisible(true);
        x.setVisible(true);
        y.setVisible(true);
        z.setVisible(true);
    }

    
    void fun4(){
        String s1=Label.getText();
        int i1=s1.length();
        for(int j1=0;j1<i1;j1++){
            if(s1.charAt(j1)=='_'){
                return;
            }
        }
        score=Integer.parseInt(Sco.getText());
        score=score+ 5;
        Sco.setText(Integer.toString(score));
        WonGame won=new WonGame();
        won.fun(Integer.toString(score));
        won.setVisible(true);
        URL url;
        url = FunPage.class.getResource("won.wav");
        AudioClip clip2 = Applet.newAudioClip(url);
	clip2.play();
        fun6();
    }
    
    void fun3(int q1){
         if(q1==4){
            h0.setVisible(false);
            h1.setVisible(true);
         }
         if(q1==3){
            h1.setVisible(false);
            h2.setVisible(true);
         }
         if(q1==2){
            h2.setVisible(false);
            h3.setVisible(true);
         }
         if(q1==1){
            h3.setVisible(false);
            h4.setVisible(true);
         }
         if(q1==0){
            h4.setVisible(false);
            h5.setVisible(true);
            Lose lose=new Lose();
            lose.fun(str1,Integer.toString(score));
            lose.setVisible(true);
            URL url;
            url = FunPage.class.getResource("lost.wav");
            AudioClip clip1 = Applet.newAudioClip(url);
            clip1.play();
            }
    }

    int fun2(char a){
        String s1=Label.getText();
        StringBuffer stbuffer=new StringBuffer(s1);
        int q1,q2=0;
        for(q1=0;q1<str1.length();q1++){
        if(a==str1.charAt(q1)){
            q2++;
            stbuffer.setCharAt(2*q1,a);
            }
        }
        s1=stbuffer.toString(); 
        Label.setText(s1);
        if(q2>0){
            fun4();
        }
        return q2;   
    }
        
    void fun1(int op){
         String st;
         arr[op]=1;
         str1=word.str[op];
         st=str1;
         int i1,j1;
         i1=st.length();
         Label.setText("_");
         for(j1=1;j1<i1;j1++){
               Label.setText(Label.getText()+" ");
               Label.setText(Label.getText()+"_");
        }
    }
    Word word=new Word();
    int counter=5;
    int ii=word.str.length;
    int arr[]=new int[ii];
    Random rand=new Random();
    int jj,score=0;
    String str1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Sco;
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JLabel h0;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h5;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JButton n;
    private javax.swing.JButton newgame;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton quit;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton t;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables
}
