/**
 * 
 */
package com.sreeluck.string;

/**
 * @author sxm147
 *
 */
public class StringJoinExample {
	public static void main(String[] args) {
		String date = String.join("/", "25", "06", "2018");
		System.out.print(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(" " + time);
	}
}
