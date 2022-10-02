/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifantessa;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class IfanTessa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        float saldo = 500000;
        Scanner input = new Scanner(System.in);
        
        do{
        System.out.println();
        System.out.println("1. Cek saldo");
        System.out.println("2. Tarik tunai");
        System.out.println("3. Setor tunai");
        System.out.print("Pilih = ");
        pilih = input.nextInt();
        System.out.println();
        
        // TODO code application logic here
        if(pilih==1){
        Singleton_Ceksaldo object = Singleton_Ceksaldo.getInstance();
        object.showSaldo(saldo);
        }
        else if (pilih==2){
        ShapeFactory shapeFactory = new ShapeFactory();
            System.out.print("Nominal Tarik : ");
            float tarik = input.nextFloat();
            if(saldo-tarik<100000){
                Shape shape = shapeFactory.getShape("GAGAL");
                shape.draw();
            }else{
                saldo-=tarik;
                Shape shape = shapeFactory.getShape("BERHASIL");
                shape.draw();
            }
        }
        else if (pilih==3){
        AbFactory uangFactory = FactoryProducer.getFactory("UANG");
        AbFactory kondisiFactory = FactoryProducer.getFactory("KONDISI");
        
        System.out.print("Nominal Setor : ");
        float setor = input.nextFloat();
        
        if(setor%50000!=0){
            Uang uang1 = uangFactory.getUang("UANG");
            uang1.draw(setor);
            Kondisi kondisi1 = kondisiFactory.getKondisi("GAGAL");
            kondisi1.fill();
        }else{
            saldo+=setor;
            Uang uang1 = uangFactory.getUang("UANG");
            uang1.draw(setor);
            Kondisi kondisi1 = kondisiFactory.getKondisi("BERHASIL");
            kondisi1.fill();
        }
        }
        else if (pilih==4){
        Singleton_Ceksaldo object = Singleton_Ceksaldo.getInstance();
        object.showSaldo(saldo);
        }
        else{
            System.out.println("Pilih menu!");
        }
        }while(pilih!=4);
    }
    
}
