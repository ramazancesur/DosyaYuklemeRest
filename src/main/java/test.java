import java.rmi.RemoteException;

import org.tempuri.IBANBICSoap;
import org.tempuri.IBANBICSoapProxy;

public class test {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		IBANBICSoap soap=new IBANBICSoapProxy();
		System.out.println(soap.controleIBAN("test verisi"));
	}

}
