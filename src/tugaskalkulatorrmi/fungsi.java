/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskalkulatorrmi;

import java.rmi.*;
/**
 *
 * @author asus
 */
public interface fungsi extends Remote{
    public int Tambah(int a, int b)throws RemoteException;
    
    public int Kurang(int a, int b)throws RemoteException;
    
    public int Kali(int a, int b)throws RemoteException;
    
    public int Bagi(int a, int b)throws RemoteException;
    
}