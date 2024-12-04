
package uaspbo;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Main Menu");
            mainFrame.setSize(300, 250);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(null);

            JButton btnPelanggan = new JButton("CRUD Pelanggan");
            btnPelanggan.setBounds(50, 30, 200, 30);
            mainFrame.add(btnPelanggan);

            JButton btnMobil = new JButton("CRUD Mobil");
            btnMobil.setBounds(50, 80, 200, 30);
            mainFrame.add(btnMobil);

            JButton btnPenjualan = new JButton("CRUD Penjualan");
            btnPenjualan.setBounds(50, 130, 200, 30);
            mainFrame.add(btnPenjualan);

            btnPelanggan.addActionListener(e -> new PelangganFrame().setVisible(true));
            btnMobil.addActionListener(e -> new MobilFrame().setVisible(true));
            btnPenjualan.addActionListener(e -> new PenjualanFrame().setVisible(true));

            mainFrame.setVisible(true);
        });
    }
}