/**
 */
package project_draft;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Item#getOrder <em>Order</em>}</li>
 *   <li>{@link project_draft.Item#getName <em>Name</em>}</li>
 *   <li>{@link project_draft.Item#getCost <em>Cost</em>}</li>
 *   <li>{@link project_draft.Item#isIncludedByManager <em>Included By Manager</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Order#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(Order)
	 * @see project_draft.Project_draftPackage#getItem_Order()
	 * @see project_draft.Order#getItem
	 * @model opposite="item"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link project_draft.Item#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see project_draft.Project_draftPackage#getItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link project_draft.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see project_draft.Project_draftPackage#getItem_Cost()
	 * @model required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link project_draft.Item#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Included By Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included By Manager</em>' attribute.
	 * @see #setIncludedByManager(boolean)
	 * @see project_draft.Project_draftPackage#getItem_IncludedByManager()
	 * @model required="true"
	 * @generated
	 */
	boolean isIncludedByManager();

	/**
	 * Sets the value of the '{@link project_draft.Item#isIncludedByManager <em>Included By Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included By Manager</em>' attribute.
	 * @see #isIncludedByManager()
	 * @generated
	 */
	void setIncludedByManager(boolean value);

} // Item
