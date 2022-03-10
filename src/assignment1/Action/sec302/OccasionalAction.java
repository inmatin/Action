package assignment1.Action.sec302;

/**
 * In this file you will provide the code solution for Part 2. You are required
 * to create a subclass named OccasionalAction. These are activities that occur
 * on the same day of every month specified.
 */

/**
 * File Name: OccasionalAction.java<br>
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
 * Class OccassionalAction is another subclass of the superclass Action.<br>
 * 
 * This class outputs activities that occurs on the same day of every month
 * specified.<br>
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
 * 
 *      OccasionalAction class, only the day of the month is required.
 * 
 *      OccasionalAction that happens once a month, your code must ensure that
 *      the day of the month matches.
 *
 */
public class OccasionalAction extends Action {

	/**
	 * passes the description of the action.<br>
	 * using constructor OccassionalAction to set object description.<br>
	 * 
	 * 
	 * @param description task to be completed.
	 */
	public OccasionalAction(String description) {
		super();
		this.setDescription(description);
	}

	/**
	 * override the occursOn method.
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {

		if ((day >= 15) && (year >= 2020)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * override the toString method.<br>
	 * gets object description from the superclass Action.<br>
	 */
	@Override
	public String toString() {

		return super.toString();
	}

}
