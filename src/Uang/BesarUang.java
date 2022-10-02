/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uang;
import ifantessa.Uang;
/**
 *
 * @author LENOVO
 */
public class BesarUang implements Uang{
    @Override
    public void draw(float wang) {
        System.out.println("Jumlah setoran Anda sebesar : "+wang);    
    }
}
