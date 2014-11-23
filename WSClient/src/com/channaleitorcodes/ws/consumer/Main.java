package com.channaleitorcodes.ws.consumer;

import java.rmi.RemoteException;

import com.channaleitorcodes.ws.Service.ImplLogin;
import com.channaleitorcodes.ws.Service.ImplLoginProxy;
import com.channaleitorcodes.ws.bean.BeanLogin;

public class Main {

	public static void main(String[] args) {
		ImplLogin iface = new ImplLoginProxy("http://localhost:8080/ValidaCredenciales/services/ImplLogin");
		BeanLogin obj = new BeanLogin();
		
		obj.setUsuario("jorge");
		obj.setPassword("test123");
		
		try {
			obj = iface.validaLogin(obj);
			if (obj.getStatus()) {
				System.out.println("Welcome User . . .");
			} else {
				System.out.println(obj.getMensaje());
			}
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}
}