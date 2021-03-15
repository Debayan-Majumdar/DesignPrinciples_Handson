/**
 * 
 */
package com.debayan.designpattern.Singleton_Handson;

/**
 * @author DEBAYAN
 *
 */
public class DBConn {

	/**
	 * create an private static object of DBConn
	 */
	private static DBConn instance = new DBConn();

	/**
	 * make the constructor private so that this class can't be instantiated
	 */
	private DBConn() {
	}

	/*
	 * Get the only object available
	 */
	public static DBConn getInstance() {
		return instance;

	}

}
