/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_datar;

/**
 *
 * @author PERSONAL
 */
public class persegi_panjang {
    public static void main(String[] args) {

    PersegiPanjang ppl = new PersegiPanjang (3,20);
    ppl.hasiltampilan();
}
}


class PersegiPanjang{
    int panjang;
    int lebar;

public PersegiPanjang(){
}

public PersegiPanjang (int panjang,int lebar){
    this.panjang= panjang;
    this.lebar= lebar;
}

void setPanjang(int p){
    panjang = p;
}
void setLebar(int l){
    lebar = l;
}
int getPanjang (){
    return panjang;
}

int getLebar(){
    return lebar;
}
int getLuas (){
    return panjang*lebar;
}
int getKeliling (){
    return 2 * panjang + 2 * lebar ;
}
void hasiltampilan (){
    System.out.println ("panjang="+getPanjang());
    System.out.println ("lebar="+getLebar());
    System.out.println ("luas="+getLuas());
    System.out.println ("keliling="+getKeliling());
}
}


