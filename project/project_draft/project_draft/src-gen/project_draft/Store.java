/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Store#getOrder <em>Order</em>}</li>
 *   <li>{@link project_draft.Store#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link project_draft.Store#getContactinformation <em>Contactinformation</em>}</li>
 *   <li>{@link project_draft.Store#getLocation <em>Location</em>}</li>
 *   <li>{@link project_draft.Store#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link project_draft.Store#getClosingTime <em>Closing Time</em>}</li>
 *   <li>{@link project_draft.Store#getCost <em>Cost</em>}</li>
 *   <li>{@link project_draft.Store#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link project_draft.Store#getMenu <em>Menu</em>}</li>
 *   <li>{@link project_draft.Store#getBranchmanager <em>Branchmanager</em>}</li>
 *   <li>{@link project_draft.Store#getTeammember <em>Teammember</em>}</li>
 *   <li>{@link project_draft.Store#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getStore()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lengthOfStartTime lengthOfClosingTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot lengthOfStartTime='self.startTime-&gt;size() &lt; 8' lengthOfClosingTime='self.closingTime-&gt;size() &lt; 8'"
 * @generated
 */
public interface Store extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see project_draft.Project_draftPackage#getStore_Order()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.order-&gt;select(self.menu.items-&gt;includes(self.order.item))'"
	 * @generated
	 */
	EList<Order> getOrder();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Feedback}.
	 * It is bidirectional and its opposite is '{@link project_draft.Feedback#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference list.
	 * @see project_draft.Project_draftPackage#getStore_Feedback()
	 * @see project_draft.Feedback#getStore
	 * @model opposite="store" ordered="false"
	 * @generated
	 */
	EList<Feedback> getFeedback();

	/**
	 * Returns the value of the '<em><b>Contactinformation</b></em>' reference list.
	 * The list contents are of type {@link project_draft.ContactInformation}.
	 * It is bidirectional and its opposite is '{@link project_draft.ContactInformation#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contactinformation</em>' reference list.
	 * @see project_draft.Project_draftPackage#getStore_Contactinformation()
	 * @see project_draft.ContactInformation#getStore
	 * @model opposite="store" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.contactinformation-&gt;select(c | self.feedback-&gt;includes(c.feedback))'"
	 * @generated
	 */
	EList<ContactInformation> getContactinformation();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Location#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see project_draft.Project_draftPackage#getStore_Location()
	 * @see project_draft.Location#getStore
	 * @model opposite="store"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link project_draft.Store#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute list.
	 * @see project_draft.Project_draftPackage#getStore_StartTime()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getStartTime();

	/**
	 * Returns the value of the '<em><b>Closing Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Time</em>' attribute list.
	 * @see project_draft.Project_draftPackage#getStore_ClosingTime()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getClosingTime();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see project_draft.Project_draftPackage#getStore_Cost()
	 * @model required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link project_draft.Store#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #setRevenue(double)
	 * @see project_draft.Project_draftPackage#getStore_Revenue()
	 * @model required="true"
	 * @generated
	 */
	double getRevenue();

	/**
	 * Sets the value of the '{@link project_draft.Store#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' attribute.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(double value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' reference.
	 * @see #setMenu(Menu)
	 * @see project_draft.Project_draftPackage#getStore_Menu()
	 * @model
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link project_draft.Store#getMenu <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Branchmanager</b></em>' reference list.
	 * The list contents are of type {@link project_draft.BranchManager}.
	 * It is bidirectional and its opposite is '{@link project_draft.BranchManager#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branchmanager</em>' reference list.
	 * @see project_draft.Project_draftPackage#getStore_Branchmanager()
	 * @see project_draft.BranchManager#getStore
	 * @model opposite="store" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.branchmanager-&gt;select(menu = self.menu)'"
	 * @generated
	 */
	EList<BranchManager> getBranchmanager();

	/**
	 * Returns the value of the '<em><b>Teammember</b></em>' reference list.
	 * The list contents are of type {@link project_draft.TeamMember}.
	 * It is bidirectional and its opposite is '{@link project_draft.TeamMember#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teammember</em>' reference list.
	 * @see project_draft.Project_draftPackage#getStore_Teammember()
	 * @see project_draft.TeamMember#getStore
	 * @model opposite="store" ordered="false"
	 * @generated
	 */
	EList<TeamMember> getTeammember();

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Driver}.
	 * It is bidirectional and its opposite is '{@link project_draft.Driver#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' reference list.
	 * @see project_draft.Project_draftPackage#getStore_Driver()
	 * @see project_draft.Driver#getStore
	 * @model opposite="store" ordered="false"
	 * @generated
	 */
	EList<Driver> getDriver();

} // Store
