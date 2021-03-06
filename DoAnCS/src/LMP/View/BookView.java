package LMP.View;

//import LMP.BussinessObject.Item;
import LMP.Model.Book;
import LMP.Control.BookAccess;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import java.util.*;
import javax.imageio.ImageIO;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableModel;

public class BookView extends javax.swing.JFrame {

    //CategoryDAO catDB=new CategoryDAO();    
    BookAccess bookDB = new BookAccess();

    Vector<String> header = new Vector<>();
    Vector data = new Vector();
    public String pathImageBook = null;

    public BookView() {
        initComponents();
        //Columns Headers
        header.add("Book ID");
        header.add("Title");
        header.add("Author");
        header.add("Category");
        header.add("Amount");
        //header.add("Imagebook");
        //Show all of Books (Table) 
        getBooks();
        //Show all of Categories (Combobox)
        getCategory();
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(getBooks());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablebox = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        jPanelEditBox = new javax.swing.JPanel();
        jLabelBookID = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        cbbCategory = new javax.swing.JComboBox<>();
        txtAmount = new javax.swing.JTextField();
        PanelImage = new javax.swing.JPanel();
        Imagebox = new javax.swing.JLabel();
        btnChangeImage = new javax.swing.JButton();
        btnDeleteImage = new javax.swing.JButton();
        LabelImagebook = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        PanelButton = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        PanelSearch = new javax.swing.JPanel();
        jLabelSearchBy = new javax.swing.JLabel();
        cbbSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book View");
        setResizable(false);

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        Tablebox.setViewportView(tblBook);

        jPanelEditBox.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelBookID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBookID.setText("Book ID");

        jLabelAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAuthor.setText("Author");

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTitle.setText("Title");

        jLabelCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCategory.setText("Category");

        jLabelAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAmount.setText("Amount");

        cbbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free Style", "Education", "Comic", "Novel" }));

        PanelImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Imagebox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMP/Image/NoImage/NoImage.png"))); // NOI18N
        Imagebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnChangeImage.setText("Change Image");
        btnChangeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeImageActionPerformed(evt);
            }
        });

        btnDeleteImage.setText("Delete Image");
        btnDeleteImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteImageActionPerformed(evt);
            }
        });

        LabelImagebook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelImagebook.setText("   Image Book");

        Error.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout PanelImageLayout = new javax.swing.GroupLayout(PanelImage);
        PanelImage.setLayout(PanelImageLayout);
        PanelImageLayout.setHorizontalGroup(
            PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangeImage, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(btnDeleteImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelImagebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelImageLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelImageLayout.setVerticalGroup(
            PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelImageLayout.createSequentialGroup()
                        .addComponent(LabelImagebook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnChangeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEditBoxLayout = new javax.swing.GroupLayout(jPanelEditBox);
        jPanelEditBox.setLayout(jPanelEditBoxLayout);
        jPanelEditBoxLayout.setHorizontalGroup(
            jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBookID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBookID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelEditBoxLayout.setVerticalGroup(
            jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditBoxLayout.createSequentialGroup()
                        .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEditBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnPrint.setText("View");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonLayout = new javax.swing.GroupLayout(PanelButton);
        PanelButton.setLayout(PanelButtonLayout);
        PanelButtonLayout.setHorizontalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnPrint)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap())
        );
        PanelButtonLayout.setVerticalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnExit)
                    .addComponent(btnPrint))
                .addContainerGap())
        );

        PanelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabelSearchBy.setText("Search by");

        cbbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Author", "Category", "Amount", "All" }));
        cbbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSearchLayout = new javax.swing.GroupLayout(PanelSearch);
        PanelSearch.setLayout(PanelSearchLayout);
        PanelSearchLayout.setHorizontalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSearchBy)
                .addGap(26, 26, 26)
                .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        PanelSearchLayout.setVerticalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSearchBy)
                    .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelEditBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tablebox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tablebox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEditBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setVisible(false);
        new LMP.View.LibraryFrame().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    //Books -> Table 
    private void getBooks() {
        //Get all of books 
        data = bookDB.getAllBooks();
        //All of books -> Table
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) this.tblBook.getModel();
        tblModel.setDataVector(data, header);
    }

    //Categories -> Combobox
    private void getCategory() {
        /*DefaultComboBoxModel mod = new DefaultComboBoxModel();
        ArrayList<Category> allCats=catDB.getAllCats_A();       
        for (Category e: allCats){  
            mod.addElement(new Item(e.getCatID(),e.getCatName()));
        } 
        this.cbbCategory.setModel(mod);*/
    }

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        String bookID = this.txtBookID.getText();
        String title = this.txtTitle.getText();
        String author = this.txtAuthor.getText();
        if (bookID == null || title == null || author == null) {
            JOptionPane.showMessageDialog(this, "Please enter full book information");
            return;
        }
        String category = this.cbbCategory.getSelectedItem().toString();
        int amount;
        try {
            amount = Integer.parseInt(this.txtAmount.getText());
        } catch (Exception e) {
            System.out.println("The value in txtAmount is not a number");
            JOptionPane.showMessageDialog(this, "the value in Amount is not a number");
            return;
        }
        String imagebook = pathImageBook;
        //Check duplicate key
        Book b = bookDB.getBook(bookID);
        if (b == null) {
            //Add book
            int n = bookDB.addNewBook(bookID, title, author, category, amount, imagebook);
            if (n == 1) {
                getBooks();
            } else {
                JOptionPane.showMessageDialog(this, "Add Book failure!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Duplicate key!");
        }

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String bookID = this.txtBookID.getText();
            if (bookID == null) {
                JOptionPane.showMessageDialog(this, "Please chosse book to delete ");
                return;
            }
            int n = bookDB.deleteBook(bookID);
            if (n == 1) {
                getBooks();
            } else {
                JOptionPane.showMessageDialog(this, "Delete Book failure!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (this.tblBook.getSelectedRow() == -1) {
            if (this.tblBook.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty!");
            } else {
                JOptionPane.showMessageDialog(this, "You must select a product");
            }
        } else {
            DefaultTableModel model = (DefaultTableModel) this.tblBook.getModel();
            String bookID = model.getValueAt(this.tblBook.getSelectedRow(), 0).toString();
            String title = this.txtTitle.getText();
            String author = this.txtAuthor.getText();
            if (bookID == null || title == null || author == null) {
                JOptionPane.showMessageDialog(this, "Please enter full book information");
                return;
            }
            String category = this.cbbCategory.getSelectedItem().toString();
            int amount;
            try {
                amount = Integer.parseInt(this.txtAmount.getText());
            } catch (Exception e) {
                System.out.println("The value in txtAmount is not a number");
                JOptionPane.showMessageDialog(this, "the value in Amount is not a number");
                return;
            }
            String imagebook = pathImageBook;
            int n = bookDB.updateBook(bookID, title, author, category, amount, imagebook);
            if (n == 1) {
                getBooks();
            } else {
                JOptionPane.showMessageDialog(this, "Update Book failure!");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    private int CheckCat(String aCat) {
        switch (aCat) {
            case "Free Style":
                return 0;
            case "Education":
                return 1;
            case "Comic":
                return 2;
            case "Novel":
                return 3;
        }
        return 0;
    }
    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
        int selectrow = tblBook.getSelectedRow();
        String tempImagePath;
        if (selectrow >= 0) {
            if (tblBook.getValueAt(selectrow, 0) != null) {
                txtBookID.setText(tblBook.getValueAt(selectrow, 0).toString());
                tempImagePath = bookDB.GetImageBook(txtBookID.getText());
            } else {
                txtBookID.setText("");
                tempImagePath = null;
            }
            if (tblBook.getValueAt(selectrow, 1) != null) {
                txtTitle.setText(tblBook.getValueAt(selectrow, 1).toString());
            } else {
                txtTitle.setText("");
            }
            if (tblBook.getValueAt(selectrow, 2) != null) {
                txtAuthor.setText(tblBook.getValueAt(selectrow, 2).toString());
            } else {
                txtAuthor.setText("");
            }
            if (tblBook.getValueAt(selectrow, 3) != null) {
                cbbCategory.setSelectedIndex(CheckCat(tblBook.getValueAt(selectrow, 3).toString()));
            } else {
                cbbCategory.setSelectedIndex(2);
            }
            if (tblBook.getValueAt(selectrow, 4) != null) {
                txtAmount.setText(tblBook.getValueAt(selectrow, 4).toString());
            } else {
                txtAmount.setText("");
            }

            if (tempImagePath == null || "null".equals(tempImagePath)) {
                Error.setText("No Image");
                Error.setForeground(Color.red);
                pathImageBook = null;
                Image bi;
                try {
                    bi = ImageIO.read(new File(getClass().getResource("/LMP/Image/NoImage/NoImage.png").getPath().replace("%20", " ")));
                    Imagebox.setIcon(new javax.swing.ImageIcon(bi.getScaledInstance(144, 173, Image.SCALE_SMOOTH)));
                    Imagebox.setIcon(new javax.swing.ImageIcon(ImageIO.read(new File(getClass().getResource("/LMP/Image/NoImage/NoImage.png").getPath().replace("%20", " "))).getScaledInstance(144, 173, Image.SCALE_SMOOTH)));
                } catch (IOException ex) {
                }
            } else {
                pathImageBook = tempImagePath;
                try {
                    BufferedImage bi = ImageIO.read(new File(pathImageBook));
                    Imagebox.setIcon(new javax.swing.ImageIcon(bi.getScaledInstance(144, 173, Image.SCALE_SMOOTH)));
                    Error.setText("");
                } catch (Exception e) {
                    Error.setText("Error Image Path");
                    Error.setForeground(Color.red);
                    pathImageBook = tempImagePath;
                    Image bi;
                    try {
                        bi = ImageIO.read(new File(getClass().getResource("/LMP/Image/NoImage/NoImage.png").getPath().replace("%20", " ")));
                        Imagebox.setIcon(new javax.swing.ImageIcon(bi.getScaledInstance(144, 173, Image.SCALE_SMOOTH)));
                    } catch (IOException ex) {
                    }
                }
            }
        }


    }//GEN-LAST:event_tblBookMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        setVisible(false);
        ViewView ww = new ViewView();
        ww.setVisible(true);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int pos = this.cbbSearch.getSelectedIndex();
        switch (pos) {
            case 0:
                data = bookDB.searchByTitle(this.txtSearch.getText());
                break;
            case 1:
                data = bookDB.searchByAuthor(this.txtSearch.getText());
                break;
            case 2:
                data = bookDB.searchByCategory(this.txtSearch.getText());
                break;
            case 3:
                data = bookDB.searchByAmount(Integer.parseInt(this.txtSearch.getText()));
                break;
            case 4:
                getBooks();
                break;
        }
        //Result -> Table
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) this.tblBook.getModel();
        tblModel.setDataVector(data, header);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        getBooks();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnChangeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeImageActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileFilter(new FileNameExtensionFilter("Image File", "png", "jpg"));
            jfc.showOpenDialog(null);
            File f = jfc.getSelectedFile();

            Image bi = ImageIO.read(f);
            Imagebox.setText("");
            Imagebox.setIcon(new javax.swing.ImageIcon(bi.getScaledInstance(140, 180, Image.SCALE_SMOOTH)));
            pathImageBook = f.getPath();
            //System.out.println("LMP.Test.BookView.btnChangeImageActionPerformed(): " + f.getPath());
        } catch (Exception e) {
            System.out.println("The image is not changed");
        }
    }//GEN-LAST:event_btnChangeImageActionPerformed

    private void btnDeleteImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteImageActionPerformed
        // TODO add your handling code here:
        //File tempPath = new File("/C:/Users/viett/OneDrive - 19272002/Documents/NetBeansProjects/DoAnCS/build/classes/LMP/Image/book-view-30965.png");
        Image bi;
        //System.out.println("\r"+getClass().getResource("/LMP/Image/book-view-30965.png").toString().replace("%20", " "));
        try {
            bi = ImageIO.read(new File(getClass().getResource("/LMP/Image/NoImage/NoImage.png").getPath().replace("%20", " ")));

            Imagebox.setIcon(new javax.swing.ImageIcon(bi.getScaledInstance(144, 173, Image.SCALE_SMOOTH)));
            pathImageBook = null;

        } catch (IOException ex) {
            //Logger.getLogger(BookView.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("The image is not deleted");
        }
        //Imagebox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMP/Image/book-view-30965.png")));
    }//GEN-LAST:event_btnDeleteImageActionPerformed

    private void cbbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSearchActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cbbSearchActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BookView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Error;
    private javax.swing.JLabel Imagebox;
    private javax.swing.JLabel LabelImagebook;
    private javax.swing.JPanel PanelButton;
    private javax.swing.JPanel PanelImage;
    private javax.swing.JPanel PanelSearch;
    private javax.swing.JScrollPane Tablebox;
    private javax.swing.JButton btnChangeImage;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteImage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbCategory;
    private javax.swing.JComboBox<String> cbbSearch;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelBookID;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelSearchBy;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelEditBox;
    private javax.swing.JTable tblBook;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
