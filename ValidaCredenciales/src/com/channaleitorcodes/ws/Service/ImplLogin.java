package com.channaleitorcodes.ws.Service;

import com.channaleitorcodes.ws.bean.BeanLogin;

public class ImplLogin implements IFaceLogin{

	@Override
	public BeanLogin validaLogin(BeanLogin obj) {
		BeanLogin bean = new BeanLogin();
		if (obj.getUsuario().equals("jorge") && obj.getPassword().equals("test123")) {
			bean.setMensaje("Esta validación fue satisfactoria");
			bean.setStatus(true);
		}else{
			bean.setMensaje("Error en la validaci�n");
			bean.setStatus(false);
		}
		return bean;
	}
	
}