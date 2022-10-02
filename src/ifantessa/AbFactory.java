/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifantessa;

/**
 *
 * @author LENOVO
 */
public abstract class AbFactory {
    abstract Kondisi getKondisi(String kondisi);
    abstract Uang getUang(String uang);
}
