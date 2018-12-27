/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskalkulatorrmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;

/**
 *
 * @author asus
 */
public class client_2 {
    
    int a,b;
    String tanya;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void menu()throws IOException, NotBoundException{
        fungsi f= (fungsi)Naming.lookup("rmi://localhost:1099/data");
        System.out.println("Kalkulator RMI");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.print("Pilih Angka Operasi(1-4):");
        int pilih= Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("Masukkan Bilangan Pertama:");
                a= Integer.parseInt(br.readLine());
                System.out.println("Masukkan Bilangan Kedua:");
                b= Integer.parseInt(br.readLine());
                System.out.println("Hasilnya Adalah:"+f.Tambah(a, b));
                new client_2().keluar();
                break;
                
            case 2:
                System.out.println("Masukkan Bilangan Pertama:");
                a= Integer.parseInt(br.readLine());
                System.out.println("Masukkan Bilangan Kedua:");
                b= Integer.parseInt(br.readLine());
                System.out.println("Hasilnya Adalah:"+f.Kurang(a, b));
                new client_2().keluar();
                break;
                
            case 3:
                System.out.println("Masukkan Bilangan Pertama:");
                a= Integer.parseInt(br.readLine());
                System.out.println("Masukkan Bilangan Kedua:");
                b= Integer.parseInt(br.readLine());
                System.out.println("Hasilnya Adalah:"+f.Kali(a, b));
                new client_2().keluar();
                break;
                
            case 4:
                System.out.println("Masukkan Bilangan Pertama:");
                a= Integer.parseInt(br.readLine());
                System.out.println("Masukkan Bilangan Kedua:");
                b= Integer.parseInt(br.readLine());
                System.out.println("Hasilnya Adalah:"+f.Bagi(a, b));
                new client_2().keluar();
                break;
        }
        if(pilih>4){
            System.out.println("Pilihan Operasi Tidak Ada");
            menu();
        }
                 
    }

    private void keluar()throws IOException, NotBoundException{
        System.out.println("Apakah Anda Ingin Melakukan Perhitungan Lagi? Y atau T ");
        tanya= br.readLine();
        if(tanya.equals("Y")){
            new client_2().menu();
        }else if(tanya.equals("T")){
            System.exit(0);
        }
    }
    public static void main(String[] args)throws IOException, NotBoundException{
        client_2 c= new client_2();
        c.menu();
        
    }
}
