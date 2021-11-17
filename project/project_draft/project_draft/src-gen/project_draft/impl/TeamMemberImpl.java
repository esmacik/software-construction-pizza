/**
 */
package project_draft.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import project_draft.DineIn;
import project_draft.Project_draftPackage;
import project_draft.Store;
import project_draft.TeamMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.TeamMemberImpl#getCurrenetDuty <em>Currenet Duty</em>}</li>
 *   <li>{@link project_draft.impl.TeamMemberImpl#getDinein <em>Dinein</em>}</li>
 *   <li>{@link project_draft.impl.TeamMemberImpl#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamMemberImpl extends EmployeeImpl implements TeamMember {
	/**
	 * The default value of the '{@link #getCurrenetDuty() <em>Currenet Duty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrenetDuty()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENET_DUTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrenetDuty() <em>Currenet Duty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrenetDuty()
	 * @generated
	 * @ordered
	 */
	protected String currenetDuty = CURRENET_DUTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDinein() <em>Dinein</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDinein()
	 * @generated
	 * @ordered
	 */
	protected EList<DineIn> dinein;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected Store store;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.TEAM_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrenetDuty() {
		return currenetDuty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrenetDuty(String newCurrenetDuty) {
		String oldCurrenetDuty = currenetDuty;
		currenetDuty = newCurrenetDuty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.TEAM_MEMBER__CURRENET_DUTY,
					oldCurrenetDuty, currenetDuty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DineIn> getDinein() {
		if (dinein == null) {
			dinein = new EObjectWithInverseResolvingEList<DineIn>(DineIn.class, this,
					Project_draftPackage.TEAM_MEMBER__DINEIN, Project_draftPackage.DINE_IN__TEAMMEMBER);
		}
		return dinein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store getStore() {
		if (store != null && store.eIsProxy()) {
			InternalEObject oldStore = (InternalEObject) store;
			store = (Store) eResolveProxy(oldStore);
			if (store != oldStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.TEAM_MEMBER__STORE,
							oldStore, store));
			}
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store basicGetStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStore(Store newStore, NotificationChain msgs) {
		Store oldStore = store;
		store = newStore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project_draftPackage.TEAM_MEMBER__STORE, oldStore, newStore);
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
	public void setStore(Store newStore) {
		if (newStore != store) {
			NotificationChain msgs = null;
			if (store != null)
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__TEAMMEMBER,
						Store.class, msgs);
			if (newStore != null)
				msgs = ((InternalEObject) newStore).eInverseAdd(this, Project_draftPackage.STORE__TEAMMEMBER,
						Store.class, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.TEAM_MEMBER__STORE, newStore,
					newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project_draftPackage.TEAM_MEMBER__DINEIN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDinein()).basicAdd(otherEnd, msgs);
		case Project_draftPackage.TEAM_MEMBER__STORE:
			if (store != null)
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__TEAMMEMBER,
						Store.class, msgs);
			return basicSetStore((Store) otherEnd, msgs);
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
		case Project_draftPackage.TEAM_MEMBER__DINEIN:
			return ((InternalEList<?>) getDinein()).basicRemove(otherEnd, msgs);
		case Project_draftPackage.TEAM_MEMBER__STORE:
			return basicSetStore(null, msgs);
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
		case Project_draftPackage.TEAM_MEMBER__CURRENET_DUTY:
			return getCurrenetDuty();
		case Project_draftPackage.TEAM_MEMBER__DINEIN:
			return getDinein();
		case Project_draftPackage.TEAM_MEMBER__STORE:
			if (resolve)
				return getStore();
			return basicGetStore();
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
		case Project_draftPackage.TEAM_MEMBER__CURRENET_DUTY:
			setCurrenetDuty((String) newValue);
			return;
		case Project_draftPackage.TEAM_MEMBER__DINEIN:
			getDinein().clear();
			getDinein().addAll((Collection<? extends DineIn>) newValue);
			return;
		case Project_draftPackage.TEAM_MEMBER__STORE:
			setStore((Store) newValue);
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
		case Project_draftPackage.TEAM_MEMBER__CURRENET_DUTY:
			setCurrenetDuty(CURRENET_DUTY_EDEFAULT);
			return;
		case Project_draftPackage.TEAM_MEMBER__DINEIN:
			getDinein().clear();
			return;
		case Project_draftPackage.TEAM_MEMBER__STORE:
			setStore((Store) null);
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
		case Project_draftPackage.TEAM_MEMBER__CURRENET_DUTY:
			return CURRENET_DUTY_EDEFAULT == null ? currenetDuty != null : !CURRENET_DUTY_EDEFAULT.equals(currenetDuty);
		case Project_draftPackage.TEAM_MEMBER__DINEIN:
			return dinein != null && !dinein.isEmpty();
		case Project_draftPackage.TEAM_MEMBER__STORE:
			return store != null;
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
		result.append(" (currenetDuty: ");
		result.append(currenetDuty);
		result.append(')');
		return result.toString();
	}

} //TeamMemberImpl
