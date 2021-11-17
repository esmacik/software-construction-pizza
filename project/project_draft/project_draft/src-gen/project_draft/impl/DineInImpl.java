/**
 */
package project_draft.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import project_draft.DineIn;
import project_draft.Project_draftPackage;
import project_draft.TeamMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dine In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.DineInImpl#getTeammember <em>Teammember</em>}</li>
 *   <li>{@link project_draft.impl.DineInImpl#getTableNumer <em>Table Numer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DineInImpl extends OrderImpl implements DineIn {
	/**
	 * The cached value of the '{@link #getTeammember() <em>Teammember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeammember()
	 * @generated
	 * @ordered
	 */
	protected TeamMember teammember;

	/**
	 * The default value of the '{@link #getTableNumer() <em>Table Numer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNumer()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NUMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableNumer() <em>Table Numer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNumer()
	 * @generated
	 * @ordered
	 */
	protected String tableNumer = TABLE_NUMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DineInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.DINE_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember getTeammember() {
		if (teammember != null && teammember.eIsProxy()) {
			InternalEObject oldTeammember = (InternalEObject) teammember;
			teammember = (TeamMember) eResolveProxy(oldTeammember);
			if (teammember != oldTeammember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.DINE_IN__TEAMMEMBER,
							oldTeammember, teammember));
			}
		}
		return teammember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember basicGetTeammember() {
		return teammember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeammember(TeamMember newTeammember, NotificationChain msgs) {
		TeamMember oldTeammember = teammember;
		teammember = newTeammember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project_draftPackage.DINE_IN__TEAMMEMBER, oldTeammember, newTeammember);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeammember(TeamMember newTeammember) {
		if (newTeammember != teammember) {
			NotificationChain msgs = null;
			if (teammember != null)
				msgs = ((InternalEObject) teammember).eInverseRemove(this, Project_draftPackage.TEAM_MEMBER__DINEIN,
						TeamMember.class, msgs);
			if (newTeammember != null)
				msgs = ((InternalEObject) newTeammember).eInverseAdd(this, Project_draftPackage.TEAM_MEMBER__DINEIN,
						TeamMember.class, msgs);
			msgs = basicSetTeammember(newTeammember, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.DINE_IN__TEAMMEMBER,
					newTeammember, newTeammember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableNumer() {
		return tableNumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableNumer(String newTableNumer) {
		String oldTableNumer = tableNumer;
		tableNumer = newTableNumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.DINE_IN__TABLE_NUMER,
					oldTableNumer, tableNumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project_draftPackage.DINE_IN__TEAMMEMBER:
			if (teammember != null)
				msgs = ((InternalEObject) teammember).eInverseRemove(this, Project_draftPackage.TEAM_MEMBER__DINEIN,
						TeamMember.class, msgs);
			return basicSetTeammember((TeamMember) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project_draftPackage.DINE_IN__TEAMMEMBER:
			return basicSetTeammember(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Project_draftPackage.DINE_IN__TEAMMEMBER:
			if (resolve)
				return getTeammember();
			return basicGetTeammember();
		case Project_draftPackage.DINE_IN__TABLE_NUMER:
			return getTableNumer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Project_draftPackage.DINE_IN__TEAMMEMBER:
			setTeammember((TeamMember) newValue);
			return;
		case Project_draftPackage.DINE_IN__TABLE_NUMER:
			setTableNumer((String) newValue);
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
		case Project_draftPackage.DINE_IN__TEAMMEMBER:
			setTeammember((TeamMember) null);
			return;
		case Project_draftPackage.DINE_IN__TABLE_NUMER:
			setTableNumer(TABLE_NUMER_EDEFAULT);
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
		case Project_draftPackage.DINE_IN__TEAMMEMBER:
			return teammember != null;
		case Project_draftPackage.DINE_IN__TABLE_NUMER:
			return TABLE_NUMER_EDEFAULT == null ? tableNumer != null : !TABLE_NUMER_EDEFAULT.equals(tableNumer);
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
		result.append(" (tableNumer: ");
		result.append(tableNumer);
		result.append(')');
		return result.toString();
	}

} //DineInImpl
