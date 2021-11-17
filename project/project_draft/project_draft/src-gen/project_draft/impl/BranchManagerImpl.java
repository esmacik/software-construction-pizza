/**
 */
package project_draft.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import project_draft.BranchManager;
import project_draft.Menu;
import project_draft.Project_draftPackage;
import project_draft.Store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.BranchManagerImpl#getConfigures <em>Configures</em>}</li>
 *   <li>{@link project_draft.impl.BranchManagerImpl#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchManagerImpl extends EmployeeImpl implements BranchManager {
	/**
	 * The cached value of the '{@link #getConfigures() <em>Configures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigures()
	 * @generated
	 * @ordered
	 */
	protected Menu configures;

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
	protected BranchManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.BRANCH_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getConfigures() {
		if (configures != null && configures.eIsProxy()) {
			InternalEObject oldConfigures = (InternalEObject) configures;
			configures = (Menu) eResolveProxy(oldConfigures);
			if (configures != oldConfigures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Project_draftPackage.BRANCH_MANAGER__CONFIGURES, oldConfigures, configures));
			}
		}
		return configures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetConfigures() {
		return configures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigures(Menu newConfigures) {
		Menu oldConfigures = configures;
		configures = newConfigures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.BRANCH_MANAGER__CONFIGURES,
					oldConfigures, configures));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Project_draftPackage.BRANCH_MANAGER__STORE, oldStore, store));
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
					Project_draftPackage.BRANCH_MANAGER__STORE, oldStore, newStore);
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
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__BRANCHMANAGER,
						Store.class, msgs);
			if (newStore != null)
				msgs = ((InternalEObject) newStore).eInverseAdd(this, Project_draftPackage.STORE__BRANCHMANAGER,
						Store.class, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.BRANCH_MANAGER__STORE, newStore,
					newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project_draftPackage.BRANCH_MANAGER__STORE:
			if (store != null)
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__BRANCHMANAGER,
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
		case Project_draftPackage.BRANCH_MANAGER__STORE:
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
		case Project_draftPackage.BRANCH_MANAGER__CONFIGURES:
			if (resolve)
				return getConfigures();
			return basicGetConfigures();
		case Project_draftPackage.BRANCH_MANAGER__STORE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Project_draftPackage.BRANCH_MANAGER__CONFIGURES:
			setConfigures((Menu) newValue);
			return;
		case Project_draftPackage.BRANCH_MANAGER__STORE:
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
		case Project_draftPackage.BRANCH_MANAGER__CONFIGURES:
			setConfigures((Menu) null);
			return;
		case Project_draftPackage.BRANCH_MANAGER__STORE:
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
		case Project_draftPackage.BRANCH_MANAGER__CONFIGURES:
			return configures != null;
		case Project_draftPackage.BRANCH_MANAGER__STORE:
			return store != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchManagerImpl
