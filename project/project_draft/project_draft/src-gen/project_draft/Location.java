/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Location#getStore <em>Store</em>}</li>
 *   <li>{@link project_draft.Location#getCity <em>City</em>}</li>
 *   <li>{@link project_draft.Location#getState <em>State</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference list.
	 * The list contents are of type {@link project_draft.Store}.
	 * It is bidirectional and its opposite is '{@link project_draft.Store#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference list.
	 * @see project_draft.Project_draftPackage#getLocation_Store()
	 * @see project_draft.Store#getLocation
	 * @model opposite="location" ordered="false"
	 * @generated
	 */
	EList<Store> getStore();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see project_draft.Project_draftPackage#getLocation_City()
	 * @model default=""
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link project_draft.Location#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see project_draft.Project_draftPackage#getLocation_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link project_draft.Location#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // Location
