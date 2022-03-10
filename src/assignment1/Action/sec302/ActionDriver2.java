package assignment1.Action.sec302;

import java.lang.reflect.Field;

/**
 * File Name: ActionDriver2.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Assignment 01<br>
 * Date: Mar 7, 2022<br>
 * <p>
 */

/**
 * Purpose:<br>
 * This assignment focuses on the concept of inheritance, abstraction,
 * arrays.<br>
 * 
 * Class SalesAgent show a Sales Agent with a name and age.<br>
 * 
 * <p>
 * Class List: {@link Action}, {@link RegularAction}, {@link OccasionalAction},
 * {@link RareAction}, {@link ActionDriver}, {@link ActionDriver2},
 * {@link AllActionTest}
 * 
 * <p>
 * 
 * @author Ishtiaque Matin, ID# 041042199
 * @version Modified: Mar 7, 2022
 * @since JDK 1.8
 * @see Action
 * @see RegularAction
 * @see OccasionalAction
 * @see RareAction
 * @see ActionDriver
 * @see ActionDriver2
 * @see AllActionTest
 * @see Class
 * @see Field
 */
public class ActionDriver2 {

	/**
	 * Start the execution of the program.<br>
	 * 
	 * @param args command-line arguments.
	 * 
	 */
	public static void main(String[] args) {

		System.out.print("\nPART 2 \n\r");

		System.out.print("OccasionalAction is just a subclass of Action:");

		Class<?> occasional = OccasionalAction.class;
		Class<?> rare = RareAction.class;
		Class<?> action = Action.class;

		/**
		 * examining the class testing class OccasionalAction is a subclass of Action
		 * superclass.
		 */

		if (occasional.getSuperclass() == action) {
			System.out.println(true);
		}

		System.out.println("Expected: true");

		/**
		 * examining the class testing class RareAction is a subclass of Action
		 * superclass.
		 */
		System.out.print("\nRareAction is just a subclass of Action:");

		if (rare.getSuperclass() == action) {
			System.out.println(true);
		}
		System.out.println("Expected: true");

		/**
		 * examining the fields. testing field length to establish there are no fields.
		 */
		System.out.print("\nOccasionalAction activities have no extra fields:");

		Field field1[] = occasional.getDeclaredFields();
		if (field1.length == 0) {
			System.out.println(true);

		}
		System.out.println("Expected: true");

		/**
		 * examining the fields. testing field length to establish there are no fields.
		 */
		System.out.print("\nRareAction activities have no extra fields:");

		Field field2[] = rare.getDeclaredFields();
		if (field2.length == 0) {
			System.out.println(true);

		}
		System.out.println("Expected: true");
	}

}
