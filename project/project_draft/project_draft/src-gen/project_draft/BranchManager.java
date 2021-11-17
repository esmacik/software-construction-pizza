/**
 */
package project_draft;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.BranchManager#getConfigures <em>Configures</em>}</li>
 *   <li>{@link project_draft.BranchManager#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getBranchManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='setTitle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot setTitle='self.title = \'Branch Manager\''"
 * @generated
 */
public interface BranchManager extends Employee {
	/**
	 * Returns the value of the '<em><b>Configures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configures</em>' reference.
	 * @see #setConfigures(Menu)
	 * @see project_draft.Project_draftPackage#getBranchManager_Configures()
	 * @model
	 * @generated
	 */
	Menu getConfigures();

	/**
	 * Sets the value of the '{@link project_draft.BranchManager#getConfigures <em>Configures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configures</em>' reference.
	 * @see #getConfigures()
	 * @generated
	 */
	void setConfigures(Menu value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Store#getBranchmanager <em>Branchmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(Store)
	 * @see project_draft.Project_draftPackage#getBranchManager_Store()
	 * @see project_draft.Store#getBranchmanager
	 * @model opposite="branchmanager"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link project_draft.BranchManager#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

} // BranchManager
