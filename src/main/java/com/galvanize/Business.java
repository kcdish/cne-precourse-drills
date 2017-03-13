package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {

	private final String name;
	private final List<Address> addresses = new ArrayList<Address>();
	
	public Business (String name){
		this.name = name;
	}
	
	/*-------------------------------------|
	 * 			                           |
	 * 	  --- Getters and Setters ---      |
	 *                                     |
	 *-----------------------------------*/
	public String getName () { return name; }
	@Override
	public List<Address> getAddresses() { return addresses; }
	@Override 
	public void addAddress(Address new_address) { addresses.add(new_address);}

}
