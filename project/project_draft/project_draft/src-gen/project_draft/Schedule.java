/**
 */
package project_draft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project_draft.Schedule#getClockInTimes <em>Clock In Times</em>}</li>
 *   <li>{@link project_draft.Schedule#getClockOutTimes <em>Clock Out Times</em>}</li>
 * </ul>
 *
 * @see project_draft.Project_draftPackage#getSchedule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lengthOfClockInTime lengthOfClockOutTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot lengthOfClockInTime='self.clockInTimes-&gt;size() &lt; 8' lengthOfClockOutTime='self.clockOutTimes-&gt;size() &lt; 8'"
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock In Times</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock In Times</em>' attribute list.
	 * @see project_draft.Project_draftPackage#getSchedule_ClockInTimes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getClockInTimes();

	/**
	 * Returns the value of the '<em><b>Clock Out Times</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Out Times</em>' attribute list.
	 * @see project_draft.Project_draftPackage#getSchedule_ClockOutTimes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getClockOutTimes();

} // Schedule
