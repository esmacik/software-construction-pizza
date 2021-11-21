/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import state_machine.PizzaOrder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Order#getItem <em>Item</em>}</li>
 *   <li>{@link project_draft.Order#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link project_draft.Order#getName <em>Name</em>}</li>
 *   <li>{@link project_draft.Order#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link project_draft.Order#getOrderDate <em>Order Date</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Item}.
	 * It is bidirectional and its opposite is '{@link project_draft.Item#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see project_draft.Project_draftPackage#getOrder_Item()
	 * @see project_draft.Item#getOrder
	 * @model opposite="order" ordered="false"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference.
	 * @see #setFeedback(Feedback)
	 * @see project_draft.Project_draftPackage#getOrder_Feedback()
	 * @model
	 * @generated
	 */
	Feedback getFeedback();

	/**
	 * Sets the value of the '{@link project_draft.Order#getFeedback <em>Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' reference.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(Feedback value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see project_draft.Project_draftPackage#getOrder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link project_draft.Order#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(double)
	 * @see project_draft.Project_draftPackage#getOrder_TotalPrice()
	 * @model required="true"
	 * @generated
	 */
	double getTotalPrice();

	/**
	 * Sets the value of the '{@link project_draft.Order#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(double value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(String)
	 * @see project_draft.Project_draftPackage#getOrder_OrderDate()
	 * @model
	 * @generated
	 */
	String getOrderDate();

	/**
	 * Sets the value of the '{@link project_draft.Order#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(String value);

	PizzaOrder getPizzaOrder();

	void setPizzaOrder(PizzaOrder order);

} // Order
