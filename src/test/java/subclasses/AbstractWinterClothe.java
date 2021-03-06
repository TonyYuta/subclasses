/**
 *   File Name: AbstractWinterClothe.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 3, 2015
 *   
 */

package subclasses;

/**
 * AbstractWinterClothe //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public abstract class AbstractWinterClothe extends AbstractClothe {

	private String liningType;

	public AbstractWinterClothe(String fabricType, String name, double price, String[] resistance, String size,
			String liningType) {
		super(fabricType, name, price, resistance, size);
		this.liningType = liningType;
	}

	@Override
	public void displayClothes() {
		super.displayClothes();
		System.out.println("It sure is cold out!");
	}

	public void displayLiningType() {
		System.out.println("The lining type is " + this.getLiningType());
	}

	/**
	 * @return the liningType
	 */
	public String getLiningType() {
		return liningType;
	}

	/**
	 * @param liningType
	 *            the liningType to set
	 */
	public void setLiningType(String liningType) {
		this.liningType = liningType;
	}
}
