package rest.Model.Util;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.istack.logging.Logger;

public class ServiceMail {
	private String asunto;
	private String mensaje;
	
	
	
	public ServiceMail() {
		super();
	}

	public ServiceMail(String asunto, String mensaje) {
		super();
		this.asunto = asunto;
		this.mensaje = mensaje;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean sendMail(ServiceMail sm,String correo)
	{
		Properties propiedad=new Properties();
		//Propiedades para inicializar el envio del correo
		propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
		propiedad.setProperty("mail.smtp.starttls.enable","true");
		propiedad.setProperty("mail.smtp.port","587");
		propiedad.setProperty("mail.smtp.auth","true");
		
		Session sesion = Session.getDefaultInstance(propiedad);
		//Propiedades para la construcción del mensaje 
		String from = "rquirogag@ucentral.edu.co";
		String contrasena= "Trollface2012";
		String to = correo;
		String asunto = sm.getAsunto();
		String mensaje = sm.getMensaje();
		
		MimeMessage mail = new MimeMessage(sesion);
		
		try 
		{
			mail.setFrom(new InternetAddress(from));//Indica Correo Emisor
			mail.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
			mail.setSubject(asunto);
			mail.setText(mensaje);
			
			Transport transporte = sesion.getTransport("smtp");
			
			transporte.connect(from,contrasena);
			transporte.sendMessage(mail, mail.getRecipients(javax.mail.Message.RecipientType.TO));
			transporte.close();
			
			System.out.print("Correo Envíado");
			
			return true;
		} 
		catch (AddressException ex)
		{
			ex.printStackTrace();
			return false;
		}
		catch (MessagingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public ServiceMail Message(String tipo, String nombre, String idusuario)
	{
		ServiceMail sm=null;
		String asunto="";
		String mensaje="";
		switch (tipo)
		{
			case "registro":
				asunto = "Completa tu Registro";
				mensaje = "Hola "+nombre +"!\n\n Gracias por preferirnos como tu camino al conocimiento, Ya puedes ingresar a la plataforma.\n\n Te asignamos el usuario : "+idusuario+" \n Por favor ingresa tu número Móvil como contraseña.\n\n Cordialmente.\n\nCursosUcentral";
				sm=new ServiceMail(asunto, mensaje);
			break;
			case "contrasena":
				asunto = "Recupera tu contraseña";
				mensaje= "Hola "+nombre+"!\n\n Ingresa tu número de móvil como contraseña.\n\n Por tu seguridad, Renuevala inmediatamente!\n\n Cordialmente.\n\nCursosUcentral";
				sm=new ServiceMail(asunto, mensaje);
			break;
			case "curso":
				asunto = "Hay un nuevo Curso por Alimentar";
				mensaje= "Hola "+nombre+"! El departamento de Coordinación te ha dado un nuevo curso por Alimentar; Ingresa en la plataforma para Diligenciarlo.!\n\n Cordialmente.\n\nCursosUcentral";
				sm=new ServiceMail(asunto, mensaje);
			break;
		}
		
		return sm;
	}
		
}
