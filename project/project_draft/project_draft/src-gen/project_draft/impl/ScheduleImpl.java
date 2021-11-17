/**
 */
package project_draft.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import project_draft.Project_draftPackage;
import project_draft.Schedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.ScheduleImpl#getClockInTimes <em>Clock In Times</em>}</li>
 *   <li>{@link project_draft.impl.ScheduleImpl#getClockOutTimes <em>Clock Out Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
	/**
	 * The cached value of the '{@link #getClockInTimes() <em>Clock In Times</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> clockInTimes;

	/**
	 * The cached value of the '{@link #getClockOutTimes() <em>Clock Out Times</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockOutTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> clockOutTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClockInTimes() {
		if (clockInTimes == null) {
			clockInTimes = new EDataTypeUniqueEList<String>(String.class, this,
					Project_draftPackage.SCHEDULE__CLOCK_IN_TIMES);
		}
		return clockInTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClockOutTimes() {
		if (clockOutTimes == null) {
			clockOutTimes = new EDataTypeUniqueEList<String>(String.class, this,
					Project_draftPackage.SCHEDULE__CLOCK_OUT_TIMES);
		}
		return clockOutTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Project_draftPackage.SCHEDULE__CLOCK_IN_TIMES:
			return getClockInTimes();
		case Project_draftPackage.SCHEDULE__CLOCK_OUT_TIMES:
			return getClockOutTimes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Project_draftPackage.SCHEDULE__CLOCK_IN_TIMES:
			getClockInTimes().clear();
			getClockInTimes().addAll((Collection<? extends String>) newValue);
			return;
		case Project_draftPackage.SCHEDULE__CLOCK_OUT_TIMES:
			getClockOutTimes().clear();
			getClockOutTimes().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Project_draftPackage.SCHEDULE__CLOCK_IN_TIMES:
			getClockInTimes().clear();
			return;
		case Project_draftPackage.SCHEDULE__CLOCK_OUT_TIMES:
			getClockOutTimes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Project_draftPackage.SCHEDULE__CLOCK_IN_TIMES:
			return clockInTimes != null && !clockInTimes.isEmpty();
		case Project_draftPackage.SCHEDULE__CLOCK_OUT_TIMES:
			return clockOutTimes != null && !clockOutTimes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (clockInTimes: ");
		result.append(clockInTimes);
		result.append(", clockOutTimes: ");
		result.append(clockOutTimes);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
