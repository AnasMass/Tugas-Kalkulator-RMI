/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskalkulatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author asus
 */
public class operasi extends UnicastRemoteObject implements fungsi{
    
    int hasil;
    
    public operasi()throws RemoteException{
        
    }
    @Override
    public int Tambah(int a, int b) throws RemoteException {
      hasil= a+b;
      return hasil;
    }

    @Override
    public int Kurang(int a, int b) throws RemoteException {
      hasil= a-b;
      return hasil;
    }

    @Override
    public int Kali(int a, int b) throws RemoteException {
      hasil= a*b;
      return hasil;
    }

    @Override
    public int Bagi(int a, int b) throws RemoteException {
      hasil= a/b;
      return hasil;
    }  
    
}
