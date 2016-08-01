/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuroimagingdataportal;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ashan
 */
public class InternalPanel1 extends javax.swing.JPanel {

    int count = 1;
    int slidervalue1;
    int slidervalue2;
    public String url;
    String selectedphotourl;

    public InternalPanel1() {
        initComponents();
        //this.setLocationRelativeTo(null);
        this.slidervalue1 = Slider1.getValue();
        this.slidervalue2 = Slider2.getValue();
        valuedisplay1.setText(Integer.toString(slidervalue1));
        valuedisplay2.setText(Integer.toString(slidervalue2));
        
        Slider1.addChangeListener(new javax.swing.event.ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent ce) {
                JSlider slide = (JSlider) ce.getSource();
                valuedisplay1.setText(Integer.toString(slide.getValue()));

            }

           
        });

        Slider2.addChangeListener(new javax.swing.event.ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent ce) {
                JSlider slide = (JSlider) ce.getSource();
                valuedisplay2.setText(Integer.toString(slide.getValue()));

            }
        });
    }

    public InternalPanel1(Object ref) {
        initComponents();
        //this.setLocationRelativeTo(null);
        this.slidervalue1 = Slider1.getValue();
        this.slidervalue2 = Slider2.getValue();
        valuedisplay1.setText(Integer.toString(slidervalue1));
        valuedisplay2.setText(Integer.toString(slidervalue2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        urlfield = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        Slider1 = new javax.swing.JSlider();
        Slider2 = new javax.swing.JSlider();
        originalLabel = new javax.swing.JLabel();
        edgeLabel = new javax.swing.JLabel();
        valuedisplay1 = new javax.swing.JLabel();
        valuedisplay2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEURO IMAGING GRID IMAGE CONSTRCTOR");

        urlfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlfieldActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Threshold1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Threshold2");

        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");

        Slider1.setMaximum(1000);
        Slider1.setValue(500);

        Slider2.setMaximum(1000);
        Slider2.setValue(250);

        originalLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        edgeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(urlfield, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Slider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Slider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valuedisplay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valuedisplay2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(originalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(edgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(urlfield)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valuedisplay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Slider1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valuedisplay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Slider2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(originalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void urlfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlfieldActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // this button set the path of files and images
        // we write this code inside the try catch to handle the exceptions !!!
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", "jpg","jpeg");
            chooser.addChoosableFileFilter(filter);
            chooser.showOpenDialog(null);
            File fpath = chooser.getSelectedFile();
            File f = chooser.getCurrentDirectory();
            urlfield.setText(fpath.getPath());
            selectedphotourl = fpath.getPath();
            //set to original label once we select image as original image to get canny image
            BufferedImage getimg = ImageIO.read(new File(selectedphotourl));
            // read image as bufferedImage. reason is to fit selected image size to Jlabel size
            BufferedImage img = new BufferedImage(originalLabel.getWidth(), originalLabel.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(getimg, 0, 0, originalLabel.getWidth(), originalLabel.getHeight(), null);
            g2.dispose();

            //here set image to the label
            ImageIcon II = new ImageIcon(img);
            originalLabel.setIcon(II);

            // tab here for set all images I think now I dont need these code parts
            //            Browse_Image_Table BIT = new Browse_Image_Table();
            //            BIT.getImageName(f.getPath(), fpath.getPath());
            //            BIT.setVisible(true);
            //            BIT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            /*String url = urlfield.getText();
             ImageIcon II = new ImageIcon(url);
             originalLabel.setIcon(II);
             */

 /*
             .....................
             in the following coding line ::
             using windowlistener I have tried to import the images to the main frame
             that we are going to use for canny edge detection.
             that case when the image is selected in table frame it will be displayed
             in this mainframe original image label.
             .....................
             */
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // when press the hold button
        // It set the original image to originalLabel and set edge detected image to edge label

        //originalLabel.setIcon(imwrite("F:\\Final Semester\\group project\\coverted.jpg",draw));
        //ImageIcon II = new ImageIcon(getClass().getResource("F:\\Final Semester\\group project\\len_std.jpg"));
        this.slidervalue1 = Slider1.getValue();
        this.slidervalue2 = Slider2.getValue();
        //String url = urlfield.getText();

        //JOptionPane.showMessageDialog(null, "Please select image to process", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        try {
            EdgedetectProcessing er = new EdgedetectProcessing(selectedphotourl, count);
            String savedUrl = er.process(slidervalue1, slidervalue2);
            System.out.println(slidervalue1 + "  " + slidervalue2);
            
            
            //set to original label once we select image as original image to get canny image
            BufferedImage getimg = ImageIO.read(new File(savedUrl));
            // read image as bufferedImage. reason is to fit selected image size to Jlabel size
            BufferedImage img = new BufferedImage(edgeLabel.getWidth(), edgeLabel.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(getimg, 0, 0, edgeLabel.getWidth(), edgeLabel.getHeight(), null);
            g2.dispose();
            ImageIcon II2 = new ImageIcon(img);
            edgeLabel.setIcon(II2);//
            System.out.println(" changed !!!");
            count++;

            // get the matrix to write whatever places that user wants !!!!
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please select image to process", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Slider1;
    private javax.swing.JSlider Slider2;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel edgeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel originalLabel;
    private javax.swing.JTextField urlfield;
    private javax.swing.JLabel valuedisplay1;
    private javax.swing.JLabel valuedisplay2;
    // End of variables declaration//GEN-END:variables
}
