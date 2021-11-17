/**
 */
package project_draft;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Feedback#getStore <em>Store</em>}</li>
 *   <li>{@link project_draft.Feedback#getRating <em>Rating</em>}</li>
 *   <li>{@link project_draft.Feedback#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getFeedback()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noLongerThan'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noLongerThan='self.details.size() &lt; 500'"
 * @generated
 */
public interface Feedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link project_draft.Store#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(Store)
	 * @see project_draft.Project_draftPackage#getFeedback_Store()
	 * @see project_draft.Store#getFeedback
	 * @model opposite="feedback"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link project_draft.Feedback#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(int)
	 * @see project_draft.Project_draftPackage#getFeedback_Rating()
	 * @model required="true"
	 * @generated
	 */
	int getRating();

	/**
	 * Sets the value of the '{@link project_draft.Feedback#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(int value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see project_draft.Project_draftPackage#getFeedback_Details()
	 * @model
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link project_draft.Feedback#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

} // Feedback
