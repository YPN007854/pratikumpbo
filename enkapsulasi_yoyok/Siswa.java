/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_yoyok;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Siswa {
    
     
    private String nama;
    private int nilai = 0;
    private String kelas;
    private int umur = 0;
    
    private void setValue(String nama, int nilai, String kelas, int umur){
        this.nama = nama;
        this.nilai = nilai;
        this.kelas = kelas;
        this.umur = umur;
    }
    
    private void cetak(){
        JOptionPane.showMessageDialog(null, "Nama    : " + nama + "\nNilai     : " + nilai + "\nKelas   : " + kelas + "\nUmur   : " + umur);
    }
    
    public void tampilMenu(){
        int selectMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan menu yang ingin di pilih: \n1. Input data siswa\n2. Keluar"));
        switch (selectMenu){
            case 1:
                String inputNama = JOptionPane.showInputDialog("Masukkan nama :");
                int inputNilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai :"));
                String inputKelas = JOptionPane.showInputDialog("Masukkan kelas :");
                int inputUmur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur :"));
                setValue(inputNama, inputNilai, inputKelas,inputUmur);
                cetak();
            default:
                JOptionPane.showMessageDialog(null, "谢谢Xièxiè");
                System.exit(0);
        }
    }
}
