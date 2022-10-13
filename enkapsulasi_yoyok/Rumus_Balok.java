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
public class Rumus_Balok {
    
    private int panjang = 0;
    private int lebar = 0;
    private int luas = 0;
    
    private void value(int panjang,int lebar){
      this.panjang = panjang;
      this.lebar = lebar;
      this.luas = luas;
    }
    private void Cetak (){
        luas = panjang*lebar;
        JOptionPane.showMessageDialog(null,"Luas persegi panjang tersebut adalah: "+ luas);
    }
    
    public void tampilMenu(){
        int selectMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan menu yang ingin di pilih: \n1.Rumus luas persegi panjang \n2. Keluar"));
        switch (selectMenu){
            case 1:
                int inputPanjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang :"));
                int inputLebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan luas :"));
                value(inputPanjang,inputLebar);
                Cetak();
            default:
                JOptionPane.showMessageDialog(null, "谢谢Xièxiè");
                System.exit(0);
        }
    }
    
}
