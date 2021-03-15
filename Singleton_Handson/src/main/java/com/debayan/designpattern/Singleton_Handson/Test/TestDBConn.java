/**
 * 
 */
package com.debayan.designpattern.Singleton_Handson.Test;

import com.debayan.designpattern.Singleton_Handson.DBConn;

import jdk.jfr.internal.Logger;

/**
 * @author DEBAYAN
 *
 */
public class TestDBConn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int instance1 = DBConn.getInstance().hashCode();
		System.out.println(instance1);

		int instance2 = DBConn.getInstance().hashCode();
		System.out.println(instance2);

		if (instance1 == instance1) {
			System.out.println("SingleTon Design Principal is applied");
		}

	}

}
