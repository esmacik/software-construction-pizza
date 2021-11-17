/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Driver#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link project_draft.Driver#getCarMake <em>Car Make</em>}</li>
 *   <li>{@link project_draft.Driver#getCarModel <em>Car Model</em>}</li>
 *   <li>{@link project_draft.Driver#getNumOrders <em>Num Orders</em>}</li>
 *   <li>{@link project_draft.Driver#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getDriver()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='setTitle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot setTitle='self.title = \'Driver\''"
 * @generated
 */
public interface Driver extends Employee {
	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Delivery}.
	 * It is bidirectional and its opposite is '{@link project_draft.Delivery#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' reference list.
	 * @see project_draft.Project_draftPackage#getDriver_Delivery()
	 * @see project_draft.Delivery#getDriver
	 * @model opposite="driver" ordered="false"
	 * @generated
	 */
	EList<Delivery> getDelivery();

	/**
	 * Returns the value of the '<em><b>Car Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Make</em>' attribute.
	 * @see #setCarMake(String)
	 * @see project_draft.Project_draftPackage#getDriver_CarMake()
	 * @model
	 * @generated
	 */
	String getCarMake();

	/**
	 * Sets the value of the '{@link project_draft.Driver#getCarMake <em>Car Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Make</em>' attribute.
	 * @see #getCarMake()
	 * @generated
	 */
	void setCarMake(String value);

	/**
	 * Returns the value of the '<em><b>Car Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Model</em>' attribute.
	 * @see #setCarModel(String)
	 * @see project_draft.Project_draftPackage#getDriver_CarModel()
	 * @model
	 * @generated
	 */
	String getCarModel();

	/**
	 * Sets the value of the '{@link project_draft.Driver#getCarModel <em>Car Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Model</em>' attribute.
	 * @see #getCarModel()
	 * @generated
	 */
	void setCarModel(String value);

	/**
	 * Returns the value of the '<em><b>Num Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Orders</em>' attribute.
	 * @see #setNumOrders(int)
	 * @see project_draft.Project_draftPackage#getDriver_NumOrders()
	 * @model required="true"
	 * @generated
	 */
	int getNumOrders();

	/**
	 * Sets the value of the '{@link project_draft.Driver#getNumOrders <em>Num Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Orders</em>' attribute.
	 * @see #getNumOrders()
	 * @generated
	 */
	void setNumOrders(int value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Store#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(Store)
	 * @see project_draft.Project_draftPackage#getDriver_Store()
	 * @see project_draft.Store#getDriver
	 * @model opposite="driver"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link project_draft.Driver#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

} // Driver
