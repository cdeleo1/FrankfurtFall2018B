/**
 * Driver.java
 * Created: 18 October 2018
 * Author: Cristi DeLeo
 * Purpose: Store bus driver data (id, name, and phone) in the system.
 */

package main.java.memoranda;

import main.java.memoranda.util.Local;
import main.java.memoranda.util.Util;
import java.lang.*;

public class Driver 
{
	private int id;			// 5-digit bus driver ID
	private String name;	// Bus driver's first name
	private int phone;		// 10-digit bus driver phone number
	
	/**
	 * Constructor for Driver Class
	 * @param id
	 * @param name
	 * @param phone
	 */
	public Driver(int id, String name, int phone)
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public int getDriverID()
	{
		return id;
	}
	
	public String getDriverName()
	{
		return name;
	}
	
	public int getDriverPhone()
	{
		return phone;
	}
}
