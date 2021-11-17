/**
 */
package project_draft;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Delivery#getDriver <em>Driver</em>}</li>
 *   <li>{@link project_draft.Delivery#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getDelivery()
 * @model
 * @generated
 */
public interface Delivery extends Order {
	/**
	 * Returns the value of the '<em><b>Driver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Driver#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' reference.
	 * @see #setDriver(Driver)
	 * @see project_draft.Project_draftPackage#getDelivery_Driver()
	 * @see project_draft.Driver#getDelivery
	 * @model opposite="delivery"
	 * @generated
	 */
	Driver getDriver();

	/**
	 * Sets the value of the '{@link project_draft.Delivery#getDriver <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(Driver value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see project_draft.Project_draftPackage#getDelivery_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link project_draft.Delivery#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // Delivery
