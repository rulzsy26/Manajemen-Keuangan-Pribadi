/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import com.mysql.cj.xdevapi.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;

public class HomPage extends javax.swing.JFrame {

    /**
     * Creates new form HomPage
     */
    public HomPage() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\ACER\\Downloads\\ManKeuanganFix\\src\\img\\cover.png");
        JLabel imageLabel = new JLabel(icon);

        jPanel3.setLayout(new GridBagLayout()); // Layout untuk memusatkan gambar
        jPanel3.add(imageLabel); // Tambahkan label gambar ke jPanel3

        // Refresh jPanel3
        jPanel3.revalidate();
        jPanel3.repaint();

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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(100, 149, 237));

        jButton1.setText("Data Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText(" Kalkulasi Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Laporan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gambar (1) (2).png"))); // NOI18N

        jButton2.setText("Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 660, 370));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Selamat Datang di KeuanganApp");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 670, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showTotalCalculation(JTextField todayField, JTextField monthField, JTextField yearField, JTextField overallField, JTextField pengeluaranTodayField, JTextField pengeluaranMonthField, JTextField pengeluaranYearField, JTextField pengeluaranOverallField) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        double totalToday = 0;
        double totalMonth = 0;
        double totalYear = 0;
        double totalOverall = 0;

        try {
            conn = DbConnection.getConnection();

            // Query untuk total hari ini
            String sqlToday = "SELECT SUM(jumlah) AS totalJumlah FROM transaksi WHERE DATE(tanggal) = CURDATE()";
            pstmt = conn.prepareStatement(sqlToday);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                totalToday = rs.getDouble("totalJumlah");
            }

            // Query untuk total bulan ini
            String sqlMonth = "SELECT SUM(jumlah) AS totalJumlah FROM transaksi WHERE MONTH(tanggal) = MONTH(CURDATE()) AND YEAR(tanggal) = YEAR(CURDATE())";
            pstmt = conn.prepareStatement(sqlMonth);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                totalMonth = rs.getDouble("totalJumlah");
            }

            // Query untuk total tahun ini
            String sqlYear = "SELECT SUM(jumlah) AS totalJumlah FROM transaksi WHERE YEAR(tanggal) = YEAR(CURDATE())";
            pstmt = conn.prepareStatement(sqlYear);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                totalYear = rs.getDouble("totalJumlah");
            }

            // Query untuk total keseluruhan
            String sqlOverall = "SELECT SUM(jumlah) AS totalJumlah FROM transaksi";
            pstmt = conn.prepareStatement(sqlOverall);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                totalOverall = rs.getDouble("totalJumlah");
            }

            // Mengisi hasil kalkulasi ke JTextField yang dikirim dari jButton3ActionPerformed
            todayField.setText(String.format("%.2f", totalToday));
            monthField.setText(String.format("%.2f", totalMonth));
            yearField.setText(String.format("%.2f", totalYear));
            overallField.setText(String.format("%.2f", totalOverall));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel3, "Gagal mengambil data dari database.\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Menutup ResultSet, PreparedStatement, dan Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void simpanKeDatabase(String tanggal, String kategori, double jumlah, String deskripsi) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Mendapatkan koneksi dari DatabaseConnection
            conn = DbConnection.getConnection();

            // Query SQL untuk menambahkan data ke tabel
            String sql = "INSERT INTO transaksi (tanggal, kategori, jumlah, deskripsi) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Mengatur parameter pada query
            pstmt.setString(1, tanggal);
            pstmt.setString(2, kategori);
            pstmt.setDouble(3, jumlah);
            pstmt.setString(4, deskripsi);

            // Menjalankan perintah SQL
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(jPanel3, "Data berhasil ditambahkan ke database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel3, "Gagal menyimpan data ke database.\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Menutup PreparedStatement dan Connection
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Fungsi untuk memperbarui data di database
    private void updateDatabase(String oldTanggal, String oldKategori, double oldJumlah, String oldDeskripsi,
            String newTanggal, String newKategori, double newJumlah, String newDeskripsi) {
        String sql = "UPDATE transaksi SET tanggal = ?, kategori = ?, jumlah = ?, deskripsi = ? WHERE tanggal = ? AND kategori = ? AND jumlah = ? AND deskripsi = ?";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Set parameter untuk data baru
            pstmt.setString(1, newTanggal);
            pstmt.setString(2, newKategori);
            pstmt.setDouble(3, newJumlah);
            pstmt.setString(4, newDeskripsi);

            // Set parameter untuk data lama
            pstmt.setString(5, oldTanggal);
            pstmt.setString(6, oldKategori);
            pstmt.setDouble(7, oldJumlah);
            pstmt.setString(8, oldDeskripsi);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(jPanel3, "Data berhasil diperbarui di database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel3, "Gagal memperbarui data di database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Fungsi untuk memuat data dari database
    private void loadDataFromDatabase(DefaultTableModel tableModel) {
        String sql = "SELECT * FROM transaksi";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            // Menghapus semua baris sebelumnya dari tabel
            tableModel.setRowCount(0);

            while (rs.next()) {
                String tanggal = rs.getString("tanggal");
                String kategori = rs.getString("kategori");
                double jumlah = rs.getDouble("jumlah");
                String deskripsi = rs.getString("deskripsi");
                tableModel.addRow(new Object[]{tanggal, kategori, jumlah, deskripsi});
            }

            JOptionPane.showMessageDialog(jPanel3, "Data berhasil dimuat dari database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel3, "Gagal memuat data dari database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hapusDariDatabase(String tanggal, String kategori, double jumlah, String deskripsi) {
        String sql = "DELETE FROM transaksi WHERE tanggal = ? AND kategori = ? AND jumlah = ? AND deskripsi = ?";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tanggal);
            pstmt.setString(2, kategori);
            pstmt.setDouble(3, jumlah);
            pstmt.setString(4, deskripsi);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(jPanel3, "Data berhasil dihapus dari database.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel3, "Gagal menghapus data dari database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Mengubah teks JTextField sesuai dengan tombol yang ditekan
        jTextField1.setText("Kalkulasi Total");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // Variabel untuk menyimpan total pemasukan dan pengeluaran
        double totalPemasukanHariIni = 0;
        double totalPengeluaranHariIni = 0;
        double totalPemasukanBulanIni = 0;
        double totalPengeluaranBulanIni = 0;
        double totalPemasukanTahunIni = 0;
        double totalPengeluaranTahunIni = 0;
        double totalPemasukanKeseluruhan = 0;
        double totalPengeluaranKeseluruhan = 0;

        try {
            conn = DbConnection.getConnection();

            // Query untuk hari ini
            String sqlToday = "SELECT kategori, SUM(jumlah) AS totalJumlah FROM transaksi WHERE DATE(tanggal) = CURDATE() GROUP BY kategori";
            pstmt = conn.prepareStatement(sqlToday);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String kategori = rs.getString("kategori");
                double jumlah = rs.getDouble("totalJumlah");
                if (kategori.equalsIgnoreCase("pemasukkan")) {
                    totalPemasukanHariIni += jumlah;
                } else if (kategori.equalsIgnoreCase("pengeluaran")) {
                    totalPengeluaranHariIni += jumlah;
                }
            }

            // Query untuk bulan ini
            String sqlMonth = "SELECT kategori, SUM(jumlah) AS totalJumlah FROM transaksi WHERE MONTH(tanggal) = MONTH(CURDATE()) AND YEAR(tanggal) = YEAR(CURDATE()) GROUP BY kategori";
            pstmt = conn.prepareStatement(sqlMonth);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String kategori = rs.getString("kategori");
                double jumlah = rs.getDouble("totalJumlah");
                if (kategori.equalsIgnoreCase("pemasukkan")) {
                    totalPemasukanBulanIni += jumlah;
                } else if (kategori.equalsIgnoreCase("pengeluaran")) {
                    totalPengeluaranBulanIni += jumlah;
                }
            }

            // Query untuk tahun ini
            String sqlYear = "SELECT kategori, SUM(jumlah) AS totalJumlah FROM transaksi WHERE YEAR(tanggal) = YEAR(CURDATE()) GROUP BY kategori";
            pstmt = conn.prepareStatement(sqlYear);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String kategori = rs.getString("kategori");
                double jumlah = rs.getDouble("totalJumlah");
                if (kategori.equalsIgnoreCase("pemasukkan")) {
                    totalPemasukanTahunIni += jumlah;
                } else if (kategori.equalsIgnoreCase("pengeluaran")) {
                    totalPengeluaranTahunIni += jumlah;
                }
            }

            // Query untuk keseluruhan
            String sqlOverall = "SELECT kategori, SUM(jumlah) AS totalJumlah FROM transaksi GROUP BY kategori";
            pstmt = conn.prepareStatement(sqlOverall);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String kategori = rs.getString("kategori");
                double jumlah = rs.getDouble("totalJumlah");
                if (kategori.equalsIgnoreCase("pemasukkan")) {
                    totalPemasukanKeseluruhan += jumlah;
                } else if (kategori.equalsIgnoreCase("pengeluaran")) {
                    totalPengeluaranKeseluruhan += jumlah;
                }
            }

            // Menghitung saldo untuk setiap kategori
            double saldoHariIni = totalPemasukanHariIni - totalPengeluaranHariIni;
            double saldoBulanIni = totalPemasukanBulanIni - totalPengeluaranBulanIni;
            double saldoTahunIni = totalPemasukanTahunIni - totalPengeluaranTahunIni;
            double saldoKeseluruhan = totalPemasukanKeseluruhan - totalPengeluaranKeseluruhan;

            // Membuat data untuk JTable
            Object[][] data = {
                {"Hari Ini", totalPemasukanHariIni, totalPengeluaranHariIni, saldoHariIni},
                {"Bulan Ini", totalPemasukanBulanIni, totalPengeluaranBulanIni, saldoBulanIni},
                {"Tahun Ini", totalPemasukanTahunIni, totalPengeluaranTahunIni, saldoTahunIni},
                {"Keseluruhan", totalPemasukanKeseluruhan, totalPengeluaranKeseluruhan, saldoKeseluruhan}
            };

            // Membuat nama kolom untuk JTable
            String[] columnNames = {"Kategori", "Pemasukan (IDR)", "Pengeluaran (IDR)", "Saldo (IDR)"};

            // Membuat JTable dengan data dan nama kolom
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            table.setFillsViewportHeight(true);

            // Menampilkan JTable di dalam jPanel3
            jPanel3.removeAll();
            jPanel3.setLayout(new BorderLayout());
            jPanel3.add(scrollPane, BorderLayout.CENTER);

            // Memperbarui tampilan jPanel3
            jPanel3.revalidate();
            jPanel3.repaint();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jPanel3, "Gagal mengambil data dari database.\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Menutup koneksi database, ResultSet, dan PreparedStatement
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jTextField1.setText("Laporan");

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Ganti dengan kredensial database Anda
        String url = "jdbc:mysql://localhost:3306/keuangan_pribadi";
        String user = "root"; // ganti dengan username database Anda
        String password = ""; // ganti dengan password database Anda

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Mengambil data pemasukan
            String queryPemasukan = "SELECT tanggal, jumlah FROM transaksi WHERE kategori = 'pemasukkan'";
            PreparedStatement pstmtPemasukan = connection.prepareStatement(queryPemasukan);
            var resultSetPemasukan = pstmtPemasukan.executeQuery();

            while (resultSetPemasukan.next()) {
                String bulan = resultSetPemasukan.getString("tanggal");
                double jumlah = resultSetPemasukan.getDouble("jumlah");
                dataset.addValue(jumlah, "Pemasukkan", bulan);
            }

            // Mengambil data pengeluaran
            String queryPengeluaran = "SELECT tanggal, jumlah FROM transaksi WHERE kategori = 'pengeluaran'";
            PreparedStatement pstmtPengeluaran = connection.prepareStatement(queryPengeluaran);
            var resultSetPengeluaran = pstmtPengeluaran.executeQuery();

            while (resultSetPengeluaran.next()) {
                String bulan = resultSetPengeluaran.getString("tanggal");
                double jumlah = resultSetPengeluaran.getDouble("jumlah");
                dataset.addValue(jumlah, "Pengeluaran", bulan);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Membuat grafik batang (bar chart)
        JFreeChart barChart = ChartFactory.createBarChart(
                "Grafik", // Judul
                "Tanggal", // Kategori sumbu X
                "Jumlah (IDR)", // Kategori sumbu Y
                dataset
        );

        // Menampilkan grafik di dalam ChartPanel
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270)); // Sesuaikan ukuran panel jika diperlukan

        // Bersihkan jPanel3 terlebih dahulu
        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout());

        // Tambahkan chartPanel ke jPanel3
        jPanel3.add(chartPanel, BorderLayout.CENTER);

        // Lakukan validasi dan render ulang jPanel3
        jPanel3.validate();
        jPanel3.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTextField1.setText("Data Transaksi");

        // Mengatur jPanel3 dengan BorderLayout dan menghapus komponen sebelumnya
        jPanel3.setLayout(new BorderLayout());
        jPanel3.removeAll();

        // Membuat DefaultTableModel dengan kolom Tanggal, Kategori, Jumlah (IDR), Deskripsi
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Tanggal", "Kategori", "Jumlah (IDR)", "Deskripsi"}, 0);

        // Membuat JTable dan JScrollPane
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        jPanel3.add(scrollPane, BorderLayout.CENTER);

        // Membuat panel untuk tombol-tombol CRUD
        JPanel tombolPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton tambahButton = new JButton("Tambah");
        JButton editButton = new JButton("Edit");
        JButton hapusButton = new JButton("Hapus");
        JButton muatDataButton = new JButton("Muat Data");

        tombolPanel.add(tambahButton);
        tombolPanel.add(editButton);
        tombolPanel.add(hapusButton);
        tombolPanel.add(muatDataButton);
        jPanel3.add(tombolPanel, BorderLayout.SOUTH);

        // Fungsi untuk tombol Tambah Data
        tambahButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDateChooser tanggalChooser = new JDateChooser();
                tanggalChooser.setDateFormatString("yyyy-MM-dd");
                JTextField jumlahField = new JTextField();
                JTextField deskripsiField = new JTextField();
                String[] kategoriOptions = {"pemasukkan", "pengeluaran"};
                JComboBox<String> kategoriComboBox = new JComboBox<>(kategoriOptions);

                Object[] message = {
                    "Tanggal (YYYY-MM-DD):", tanggalChooser,
                    "Kategori:", kategoriComboBox,
                    "Jumlah (IDR):", jumlahField,
                    "Deskripsi:", deskripsiField
                };

                int option = JOptionPane.showConfirmDialog(jPanel3, message, "Tambah Data Transaksi", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    String tanggal = ((JTextField) tanggalChooser.getDateEditor().getUiComponent()).getText().trim();
                    String kategori = (String) kategoriComboBox.getSelectedItem();
                    String jumlahStr = jumlahField.getText().trim();
                    String deskripsi = deskripsiField.getText().trim();

                    if (tanggal.isEmpty() || kategori.isEmpty() || jumlahStr.isEmpty()) {
                        JOptionPane.showMessageDialog(jPanel3, "Harap lengkapi semua field yang diperlukan.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double jumlah;
                    try {
                        jumlah = Double.parseDouble(jumlahStr);
                        if (jumlah < 0) {
                            JOptionPane.showMessageDialog(jPanel3, "Jumlah tidak boleh negatif.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(jPanel3, "Jumlah harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    tableModel.addRow(new Object[]{tanggal, kategori, jumlah, deskripsi});
                    simpanKeDatabase(tanggal, kategori, jumlah, deskripsi);
                }
            }
        });

        // Fungsi untuk tombol Muat Data
        muatDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadDataFromDatabase(tableModel);
            }
        });

        // Fungsi untuk tombol Edit Data
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    String oldTanggal = tableModel.getValueAt(selectedRow, 0).toString();
                    String oldKategori = tableModel.getValueAt(selectedRow, 1).toString();
                    double oldJumlah = Double.parseDouble(tableModel.getValueAt(selectedRow, 2).toString());
                    String oldDeskripsi = tableModel.getValueAt(selectedRow, 3).toString();

                    JDateChooser tanggalChooser = new JDateChooser();
                    tanggalChooser.setDateFormatString("yyyy-MM-dd");
                    try {
                        Date oldDate = new SimpleDateFormat("yyyy-MM-dd").parse(oldTanggal);
                        tanggalChooser.setDate(oldDate);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                    JTextField jumlahField = new JTextField(String.valueOf(oldJumlah));
                    JTextField deskripsiField = new JTextField(oldDeskripsi);
                    JTextField kategoriField = new JTextField(oldKategori);

                    Object[] message = {
                        "Tanggal (YYYY-MM-DD):", tanggalChooser,
                        "Kategori:", kategoriField,
                        "Jumlah (IDR):", jumlahField,
                        "Deskripsi:", deskripsiField
                    };

                    int option = JOptionPane.showConfirmDialog(jPanel3, message, "Edit Data Transaksi", JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        String newTanggal = ((JTextField) tanggalChooser.getDateEditor().getUiComponent()).getText().trim();
                        String newKategori = kategoriField.getText().trim();
                        double newJumlah;
                        try {
                            newJumlah = Double.parseDouble(jumlahField.getText().trim());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(jPanel3, "Jumlah harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        String newDeskripsi = deskripsiField.getText().trim();

                        tableModel.setValueAt(newTanggal, selectedRow, 0);
                        tableModel.setValueAt(newKategori, selectedRow, 1);
                        tableModel.setValueAt(newJumlah, selectedRow, 2);
                        tableModel.setValueAt(newDeskripsi, selectedRow, 3);

                        updateDatabase(oldTanggal, oldKategori, oldJumlah, oldDeskripsi, newTanggal, newKategori, newJumlah, newDeskripsi);
                    }
                } else {
                    JOptionPane.showMessageDialog(jPanel3, "Pilih baris yang ingin diedit.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Fungsi untuk tombol Hapus Data
        hapusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int confirm = JOptionPane.showConfirmDialog(jPanel3, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        String tanggal = tableModel.getValueAt(selectedRow, 0).toString();
                        String kategori = tableModel.getValueAt(selectedRow, 1).toString();
                        double jumlah = Double.parseDouble(tableModel.getValueAt(selectedRow, 2).toString());
                        String deskripsi = tableModel.getValueAt(selectedRow, 3).toString();

                        hapusDariDatabase(tanggal, kategori, jumlah, deskripsi);
                        tableModel.removeRow(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(jPanel3, "Pilih baris yang ingin dihapus.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Memperbarui tampilan jPanel3
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public JPanel getJPanel3() {
        return jPanel3; // Getter untuk jPanel3
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        HomPage dashboard = new HomPage();

        dashboard.setVisible(true);
        // Menutup jendela saat ini
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menggunakan EventQueue untuk membuat instance dari HomPage
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek dari HomPage dan menampilkannya
                new HomPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
