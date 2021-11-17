/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.ContactInformation#getOrder <em>Order</em>}</li>
 *   <li>{@link project_draft.ContactInformation#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link project_draft.ContactInformation#getStore <em>Store</em>}</li>
 *   <li>{@link project_draft.ContactInformation#getFirstName <em>First Name</em>}</li>
 *   <li>{@link project_draft.ContactInformation#getLastName <em>Last Name</em>}</li>
 *   <li>{@link project_draft.ContactInformation#getAddress <em>Address</em>}</li>
 *   <li>{@link project_draft.ContactInformation#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getContactInformation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkPhoneNumberLength checkPhoneNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkPhoneNumberLength='self.phoneNumber-&gt;size() = 11' checkPhoneNumber='self.phoneNumber-&gt;forAll(p | p = \'\\\\D\')'"
 * @generated
 */
public interface ContactInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see project_draft.Project_draftPackage#getContactInformation_Order()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Order> getOrder();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference.
	 * @see #setFeedback(Feedback)
	 * @see project_draft.Project_draftPackage#getContactInformation_Feedback()
	 * @model
	 * @generated
	 */
	Feedback getFeedback();

	/**
	 * Sets the value of the '{@link project_draft.ContactInformation#getFeedback <em>Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' reference.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(Feedback value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Store}.
	 * It is bidirectional and its opposite is '{@link project_draft.Store#getContactinformation <em>Contactinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference list.
	 * @see project_draft.Project_draftPackage#getContactInformation_Store()
	 * @see project_draft.Store#getContactinformation
	 * @model opposite="contactinformation" ordered="false"
	 * @generated
	 */
	EList<Store> getStore();

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see project_draft.Project_draftPackage#getContactInformation_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link project_draft.ContactInformation#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see project_draft.Project_draftPackage#getContactInformation_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link project_draft.ContactInformation#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see project_draft.Project_draftPackage#getContactInformation_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link project_draft.ContactInformation#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see project_draft.Project_draftPackage#getContactInformation_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link project_draft.ContactInformation#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

} // ContactInformation
