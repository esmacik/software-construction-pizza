/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.TeamMember#getCurrenetDuty <em>Currenet Duty</em>}</li>
 *   <li>{@link project_draft.TeamMember#getDinein <em>Dinein</em>}</li>
 *   <li>{@link project_draft.TeamMember#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getTeamMember()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='setTitle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot setTitle='self.title = \'Team Member\''"
 * @generated
 */
public interface TeamMember extends Employee {
	/**
	 * Returns the value of the '<em><b>Currenet Duty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currenet Duty</em>' attribute.
	 * @see #setCurrenetDuty(String)
	 * @see project_draft.Project_draftPackage#getTeamMember_CurrenetDuty()
	 * @model
	 * @generated
	 */
	String getCurrenetDuty();

	/**
	 * Sets the value of the '{@link project_draft.TeamMember#getCurrenetDuty <em>Currenet Duty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currenet Duty</em>' attribute.
	 * @see #getCurrenetDuty()
	 * @generated
	 */
	void setCurrenetDuty(String value);

	/**
	 * Returns the value of the '<em><b>Dinein</b></em>' reference list.
	 * The list contents are of type {@link project_draft.DineIn}.
	 * It is bidirectional and its opposite is '{@link project_draft.DineIn#getTeammember <em>Teammember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dinein</em>' reference list.
	 * @see project_draft.Project_draftPackage#getTeamMember_Dinein()
	 * @see project_draft.DineIn#getTeammember
	 * @model opposite="teammember" ordered="false"
	 * @generated
	 */
	EList<DineIn> getDinein();

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Store#getTeammember <em>Teammember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(Store)
	 * @see project_draft.Project_draftPackage#getTeamMember_Store()
	 * @see project_draft.Store#getTeammember
	 * @model opposite="teammember"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link project_draft.TeamMember#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

} // TeamMember
