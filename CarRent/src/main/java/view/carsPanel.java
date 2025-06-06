/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import com.mycompany.carrent.dto.CarDto;
import javax.swing.JOptionPane;
import com.mycompany.carrent.controller.CarController;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uthsara Basnayake
 */
public class carsPanel extends javax.swing.JPanel {
CarController carcontroller;
    /**
     * Creates new form carsPanel
     */
    public carsPanel() {
      carcontroller =new CarController();
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        header = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        numberplate = new javax.swing.JLabel();
        brandText = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        yearbox = new javax.swing.JComboBox<>();
        noofcars = new javax.swing.JLabel();
        noofcarsText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        numberPlatetext = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        catLabel = new javax.swing.JLabel();
        catText = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(204, 0, 255));

        header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(51, 0, 102));
        header.setText("Cars");

        brand.setText("Brand");

        model.setText("Model");

        year.setText("Manufactured Year");

        numberplate.setText("Reg. No");

        modelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextActionPerformed(evt);
            }
        });

        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));

        noofcars.setText("No.of Cars");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carTableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(carTable);

        catLabel.setText("Category");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(26, 26, 26)
                .addComponent(deleteButton)
                .addGap(71, 71, 71))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(catLabel)
                            .addComponent(model)
                            .addComponent(brand)
                            .addComponent(year)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noofcars)
                                .addComponent(numberplate)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numberPlatetext, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brandText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noofcarsText, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(catText))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catLabel)
                    .addComponent(catText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberPlatetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberplate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noofcarsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noofcars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(addButton))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
addCar();        
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
updateCar();        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
deleteCar();        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void carTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseEntered
loadAllCars();        
    }//GEN-LAST:event_carTableMouseEntered

    private void modelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel brand;
    private javax.swing.JTextField brandText;
    private javax.swing.JTable carTable;
    private javax.swing.JLabel catLabel;
    private javax.swing.JTextField catText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel model;
    private javax.swing.JTextField modelText;
    private javax.swing.JLabel noofcars;
    private javax.swing.JTextField noofcarsText;
    private javax.swing.JTextField numberPlatetext;
    private javax.swing.JLabel numberplate;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel year;
    private javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables

    private void addCar() {
    try {
        CarDto cd= new CarDto(catText.getText(),brandText.getText(),
                modelText.getText(), numberPlatetext.getText(),
                (String)yearbox.getSelectedItem(), (int)Double.parseDouble(noofcarsText.getText())
        );
        
        String result = carcontroller.addCar(cd);
        JOptionPane.showMessageDialog(this, result);
        loadAllCars();
        clear();
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } catch (Exception ex) {
        Logger.getLogger(carsPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    
        private void clear() {
        
        brandText.setText("");
        modelText.setText("");
         numberPlatetext.setText("");
         noofcarsText.setText("");
    }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    private void updateCar() {
    try {
        CarDto cd= new CarDto(catText.getText(),brandText.getText(),
                modelText.getText(), numberPlatetext.getText(),
                (String)yearbox.getSelectedItem(), (int)Double.parseDouble(noofcarsText.getText())
        );
        String result=carcontroller.updateCar(cd);
        try {
            result = carcontroller.updateCar(cd);
        } catch (Exception ex) {
            Logger.getLogger(carsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCars();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } catch (Exception ex) {
        Logger.getLogger(carsPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void loadAllCars() {
    try {
        String[] collumns = { "Category","Brand", "Model", "RegNo", "Mf.Year","No.ofCars"};
        DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        carTable.setModel(dtm);
        
        ArrayList<CarDto> cars = carcontroller.getAllCars();
        
        for (CarDto car : cars) {
            Object[] rowData = {car.getCategory(),car.getBrand() , car.getModel(), car.getRegNo(),car.getMfyear(),car.getNoOfCars()};
            dtm.addRow(rowData);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } catch (Exception ex) {
        Logger.getLogger(carsPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void deleteCar() {
    try {
        String result = carcontroller.deleteCar(numberPlatetext.getText());
        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCars();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } catch (Exception ex) {
        Logger.getLogger(carsPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
}
