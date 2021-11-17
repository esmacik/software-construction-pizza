/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Menu#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see project_draft.Project_draftPackage#getMenu_Items()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Item> getItems();

} // Menu
