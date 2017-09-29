/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author SMK TELKOM
 */
class pembayaran {
    public int hitunganGaji(pegawai peg){
    int uang=peg.gaji();
    if(peg instanceof direktur)
        uang+=((direktur)peg).tunjangan();
    if(peg instanceof staf)
        uang+=((staf)peg).bonus();
    return uang;
    }
    public static void main(String []args){
    pembayaran pg=new pembayaran();
    staf ali=new staf();
    direktur tony=new direktur();
    System.out.println("Gaji untuk Staff = "+pg.hitunganGaji(ali));
    System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitunganGaji(tony));
    
    }
}
