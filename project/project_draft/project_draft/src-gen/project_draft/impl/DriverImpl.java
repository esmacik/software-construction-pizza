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

import project_draft.Delivery;
import project_draft.Driver;
import project_draft.Project_draftPackage;
import project_draft.Store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.DriverImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link project_draft.impl.DriverImpl#getCarMake <em>Car Make</em>}</li>
 *   <li>{@link project_draft.impl.DriverImpl#getCarModel <em>Car Model</em>}</li>
 *   <li>{@link project_draft.impl.DriverImpl#getNumOrders <em>Num Orders</em>}</li>
 *   <li>{@link project_draft.impl.DriverImpl#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends EmployeeImpl implements Driver {
	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected EList<Delivery> delivery;

	/**
	 * The default value of the '{@link #getCarMake() <em>Car Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarMake()
	 * @generated
	 * @ordered
	 */
	protected static final String CAR_MAKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarMake() <em>Car Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarMake()
	 * @generated
	 * @ordered
	 */
	protected String carMake = CAR_MAKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarModel() <em>Car Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarModel()
	 * @generated
	 * @ordered
	 */
	protected static final String CAR_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarModel() <em>Car Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarModel()
	 * @generated
	 * @ordered
	 */
	protected String carModel = CAR_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOrders() <em>Num Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOrders()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_ORDERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOrders() <em>Num Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOrders()
	 * @generated
	 * @ordered
	 */
	protected int numOrders = NUM_ORDERS_EDEFAULT;

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
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delivery> getDelivery() {
		if (delivery == null) {
			delivery = new EObjectWithInverseResolvingEList<Delivery>(Delivery.class, this,
					Project_draftPackage.DRIVER__DELIVERY, Project_draftPackage.DELIVERY__DRIVER);
		}
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarMake() {
		return carMake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarMake(String newCarMake) {
		String oldCarMake = carMake;
		carMake = newCarMake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.DRIVER__CAR_MAKE, oldCarMake,
					carMake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarModel(String newCarModel) {
		String oldCarModel = carModel;
		carModel = newCarModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.DRIVER__CAR_MODEL, oldCarModel,
					carModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOrders() {
		return numOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOrders(int newNumOrders) {
		int oldNumOrders = numOrders;
		numOrders = newNumOrders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.DRIVER__NUM_ORDERS, oldNumOrders,
					numOrders));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.DRIVER__STORE,
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
					Project_draftPackage.DRIVER__STORE, oldStore, newStore);
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
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__DRIVER, Store.class,
						msgs);
			if (newStore != null)
				msgs = ((InternalEObject) newStore).eInverseAdd(this, Project_draftPackage.STORE__DRIVER, Store.class,
						msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.DRIVER__STORE, newStore,
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
		case Project_draftPackage.DRIVER__DELIVERY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDelivery()).basicAdd(otherEnd, msgs);
		case Project_draftPackage.DRIVER__STORE:
			if (store != null)
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__DRIVER, Store.class,
						msgs);
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
		case Project_draftPackage.DRIVER__DELIVERY:
			return ((InternalEList<?>) getDelivery()).basicRemove(otherEnd, msgs);
		case Project_draftPackage.DRIVER__STORE:
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
		case Project_draftPackage.DRIVER__DELIVERY:
			return getDelivery();
		case Project_draftPackage.DRIVER__CAR_MAKE:
			return getCarMake();
		case Project_draftPackage.DRIVER__CAR_MODEL:
			return getCarModel();
		case Project_draftPackage.DRIVER__NUM_ORDERS:
			return getNumOrders();
		case Project_draftPackage.DRIVER__STORE:
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
		case Project_draftPackage.DRIVER__DELIVERY:
			getDelivery().clear();
			getDelivery().addAll((Collection<? extends Delivery>) newValue);
			return;
		case Project_draftPackage.DRIVER__CAR_MAKE:
			setCarMake((String) newValue);
			return;
		case Project_draftPackage.DRIVER__CAR_MODEL:
			setCarModel((String) newValue);
			return;
		case Project_draftPackage.DRIVER__NUM_ORDERS:
			setNumOrders((Integer) newValue);
			return;
		case Project_draftPackage.DRIVER__STORE:
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
		case Project_draftPackage.DRIVER__DELIVERY:
			getDelivery().clear();
			return;
		case Project_draftPackage.DRIVER__CAR_MAKE:
			setCarMake(CAR_MAKE_EDEFAULT);
			return;
		case Project_draftPackage.DRIVER__CAR_MODEL:
			setCarModel(CAR_MODEL_EDEFAULT);
			return;
		case Project_draftPackage.DRIVER__NUM_ORDERS:
			setNumOrders(NUM_ORDERS_EDEFAULT);
			return;
		case Project_draftPackage.DRIVER__STORE:
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
		case Project_draftPackage.DRIVER__DELIVERY:
			return delivery != null && !delivery.isEmpty();
		case Project_draftPackage.DRIVER__CAR_MAKE:
			return CAR_MAKE_EDEFAULT == null ? carMake != null : !CAR_MAKE_EDEFAULT.equals(carMake);
		case Project_draftPackage.DRIVER__CAR_MODEL:
			return CAR_MODEL_EDEFAULT == null ? carModel != null : !CAR_MODEL_EDEFAULT.equals(carModel);
		case Project_draftPackage.DRIVER__NUM_ORDERS:
			return numOrders != NUM_ORDERS_EDEFAULT;
		case Project_draftPackage.DRIVER__STORE:
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
		result.append(" (carMake: ");
		result.append(carMake);
		result.append(", carModel: ");
		result.append(carModel);
		result.append(", numOrders: ");
		result.append(numOrders);
		result.append(')');
		return result.toString();
	}

} //DriverImpl
