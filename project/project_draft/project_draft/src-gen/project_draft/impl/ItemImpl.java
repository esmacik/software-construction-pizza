/**
 */
package project_draft.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import project_draft.Item;
import project_draft.Order;
import project_draft.Project_draftPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.ItemImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link project_draft.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link project_draft.impl.ItemImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link project_draft.impl.ItemImpl#isIncludedByManager <em>Included By Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludedByManager() <em>Included By Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludedByManager()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDED_BY_MANAGER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludedByManager() <em>Included By Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludedByManager()
	 * @generated
	 * @ordered
	 */
	protected boolean includedByManager = INCLUDED_BY_MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		if (order != null && order.eIsProxy()) {
			InternalEObject oldOrder = (InternalEObject) order;
			order = (Order) eResolveProxy(oldOrder);
			if (order != oldOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.ITEM__ORDER,
							oldOrder, order));
			}
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order basicGetOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project_draftPackage.ITEM__ORDER, oldOrder, newOrder);
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
	public void setOrder(Order newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject) order).eInverseRemove(this, Project_draftPackage.ORDER__ITEM, Order.class,
						msgs);
			if (newOrder != null)
				msgs = ((InternalEObject) newOrder).eInverseAdd(this, Project_draftPackage.ORDER__ITEM, Order.class,
						msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ITEM__ORDER, newOrder,
					newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ITEM__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludedByManager() {
		return includedByManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludedByManager(boolean newIncludedByManager) {
		boolean oldIncludedByManager = includedByManager;
		includedByManager = newIncludedByManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ITEM__INCLUDED_BY_MANAGER,
					oldIncludedByManager, includedByManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project_draftPackage.ITEM__ORDER:
			if (order != null)
				msgs = ((InternalEObject) order).eInverseRemove(this, Project_draftPackage.ORDER__ITEM, Order.class,
						msgs);
			return basicSetOrder((Order) otherEnd, msgs);
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
		case Project_draftPackage.ITEM__ORDER:
			return basicSetOrder(null, msgs);
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
		case Project_draftPackage.ITEM__ORDER:
			if (resolve)
				return getOrder();
			return basicGetOrder();
		case Project_draftPackage.ITEM__NAME:
			return getName();
		case Project_draftPackage.ITEM__COST:
			return getCost();
		case Project_draftPackage.ITEM__INCLUDED_BY_MANAGER:
			return isIncludedByManager();
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
		case Project_draftPackage.ITEM__ORDER:
			setOrder((Order) newValue);
			return;
		case Project_draftPackage.ITEM__NAME:
			setName((String) newValue);
			return;
		case Project_draftPackage.ITEM__COST:
			setCost((Double) newValue);
			return;
		case Project_draftPackage.ITEM__INCLUDED_BY_MANAGER:
			setIncludedByManager((Boolean) newValue);
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
		case Project_draftPackage.ITEM__ORDER:
			setOrder((Order) null);
			return;
		case Project_draftPackage.ITEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Project_draftPackage.ITEM__COST:
			setCost(COST_EDEFAULT);
			return;
		case Project_draftPackage.ITEM__INCLUDED_BY_MANAGER:
			setIncludedByManager(INCLUDED_BY_MANAGER_EDEFAULT);
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
		case Project_draftPackage.ITEM__ORDER:
			return order != null;
		case Project_draftPackage.ITEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Project_draftPackage.ITEM__COST:
			return cost != COST_EDEFAULT;
		case Project_draftPackage.ITEM__INCLUDED_BY_MANAGER:
			return includedByManager != INCLUDED_BY_MANAGER_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", cost: ");
		result.append(cost);
		result.append(", includedByManager: ");
		result.append(includedByManager);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
