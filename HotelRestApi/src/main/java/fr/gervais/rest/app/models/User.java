package fr.gervais.rest.app.models;

import java.util.ArrayList;

public class User {
	
	//Attributes - Id, Login, Password, Name, Mail, Phone, ReservationList.
	private int Id;
	private String Login;
	private String Password;
	private String Name;
	private String Mail;
	private String Phone;
	
	private ArrayList<Reservation> ReservationList;
	
	/**
	 * Constructor - Builds a User Object.
	 * @param id [int] - The designated id for a user. (no user should have the same id).
	 * @param login [String] - The login credential of the user.
	 * @param password [String] - The password credential of the user.
	 * @param name [String] - The name of the user.
	 * @param mail [String] - The mail address of the user.
	 * @param phone [String] - The phone number of the user.
	 */
	public User(int id, String login, String password, String name, String mail, String phone) {
		this.setId(id);
		this.setLogin(login);
		this.setPassword(password);
		this.setName(name);
		this.setMail(mail);
		this.setPhone(phone);
		this.ReservationList = new ArrayList<Reservation>();
	}
	
	//Get'er and Set'er Methods.

	public int getId() {
		return Id;
	}


	private void setId(int id) {
		Id = id;
	}


	public String getLogin() {
		return Login;
	}


	private void setLogin(String login) {
		Login = login;
	}


	public String getPassword() {
		return Password;
	}


	private void setPassword(String password) {
		Password = password;
	}


	public String getName() {
		return Name;
	}


	private void setName(String name) {
		Name = name;
	}


	public String getMail() {
		return Mail;
	}


	private void setMail(String mail) {
		Mail = mail;
	}


	public String getPhone() {
		return Phone;
	}


	private void setPhone(String phone) {
		Phone = phone;
	}


	public ArrayList<Reservation> getReservationList() {
		return ReservationList;
	}
	
	//Custom Method.
	
}
