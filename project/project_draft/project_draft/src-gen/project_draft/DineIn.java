/**
 */
package project_draft;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dine In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.DineIn#getTeammember <em>Teammember</em>}</li>
 *   <li>{@link project_draft.DineIn#getTableNumer <em>Table Numer</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getDineIn()
 * @model
 * @generated
 */
public interface DineIn extends Order {
	/**
	 * Returns the value of the '<em><b>Teammember</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.TeamMember#getDinein <em>Dinein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teammember</em>' reference.
	 * @see #setTeammember(TeamMember)
	 * @see project_draft.Project_draftPackage#getDineIn_Teammember()
	 * @see project_draft.TeamMember#getDinein
	 * @model opposite="dinein"
	 * @generated
	 */
	TeamMember getTeammember();

	/**
	 * Sets the value of the '{@link project_draft.DineIn#getTeammember <em>Teammember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teammember</em>' reference.
	 * @see #getTeammember()
	 * @generated
	 */
	void setTeammember(TeamMember value);

	/**
	 * Returns the value of the '<em><b>Table Numer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Numer</em>' attribute.
	 * @see #setTableNumer(String)
	 * @see project_draft.Project_draftPackage#getDineIn_TableNumer()
	 * @model
	 * @generated
	 */
	String getTableNumer();

	/**
	 * Sets the value of the '{@link project_draft.DineIn#getTableNumer <em>Table Numer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Numer</em>' attribute.
	 * @see #getTableNumer()
	 * @generated
	 */
	void setTableNumer(String value);

} // DineIn
