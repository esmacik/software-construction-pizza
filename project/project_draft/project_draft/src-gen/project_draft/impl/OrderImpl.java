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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import project_draft.Feedback;
import project_draft.Item;
import project_draft.Order;
import project_draft.Project_draftPackage;
import state_machine.PizzaOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.OrderImpl#getItem <em>Item</em>}</li>
 *   <li>{@link project_draft.impl.OrderImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link project_draft.impl.OrderImpl#getName <em>Name</em>}</li>
 *   <li>{@link project_draft.impl.OrderImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link project_draft.impl.OrderImpl#getOrderDate <em>Order Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected Feedback feedback = null;

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

	protected PizzaOrder orderProcess;

	/**
	 * The default value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected double totalPrice = TOTAL_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected String orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectWithInverseResolvingEList<Item>(Item.class, this, Project_draftPackage.ORDER__ITEM,
					Project_draftPackage.ITEM__ORDER);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback getFeedback() {
		if (feedback != null && feedback.eIsProxy()) {
			InternalEObject oldFeedback = (InternalEObject) feedback;
			feedback = (Feedback) eResolveProxy(oldFeedback);
			if (feedback != oldFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.ORDER__FEEDBACK,
							oldFeedback, feedback));
			}
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback basicGetFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(Feedback newFeedback) {
		Feedback oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ORDER__FEEDBACK, oldFeedback,
					feedback));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ORDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalPrice() {
		totalPrice = 0;
		item.forEach(i -> totalPrice += i.getCost());
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPrice(double newTotalPrice) {
		double oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ORDER__TOTAL_PRICE,
					oldTotalPrice, totalPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDate(String newOrderDate) {
		String oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.ORDER__ORDER_DATE, oldOrderDate,
					orderDate));
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
		case Project_draftPackage.ORDER__ITEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getItem()).basicAdd(otherEnd, msgs);
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
		case Project_draftPackage.ORDER__ITEM:
			return ((InternalEList<?>) getItem()).basicRemove(otherEnd, msgs);
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
		case Project_draftPackage.ORDER__ITEM:
			return getItem();
		case Project_draftPackage.ORDER__FEEDBACK:
			if (resolve)
				return getFeedback();
			return basicGetFeedback();
		case Project_draftPackage.ORDER__NAME:
			return getName();
		case Project_draftPackage.ORDER__TOTAL_PRICE:
			return getTotalPrice();
		case Project_draftPackage.ORDER__ORDER_DATE:
			return getOrderDate();
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
		case Project_draftPackage.ORDER__ITEM:
			getItem().clear();
			getItem().addAll((Collection<? extends Item>) newValue);
			return;
		case Project_draftPackage.ORDER__FEEDBACK:
			setFeedback((Feedback) newValue);
			return;
		case Project_draftPackage.ORDER__NAME:
			setName((String) newValue);
			return;
		case Project_draftPackage.ORDER__TOTAL_PRICE:
			setTotalPrice((Double) newValue);
			return;
		case Project_draftPackage.ORDER__ORDER_DATE:
			setOrderDate((String) newValue);
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
		case Project_draftPackage.ORDER__ITEM:
			getItem().clear();
			return;
		case Project_draftPackage.ORDER__FEEDBACK:
			setFeedback((Feedback) null);
			return;
		case Project_draftPackage.ORDER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Project_draftPackage.ORDER__TOTAL_PRICE:
			setTotalPrice(TOTAL_PRICE_EDEFAULT);
			return;
		case Project_draftPackage.ORDER__ORDER_DATE:
			setOrderDate(ORDER_DATE_EDEFAULT);
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
		case Project_draftPackage.ORDER__ITEM:
			return item != null && !item.isEmpty();
		case Project_draftPackage.ORDER__FEEDBACK:
			return feedback != null;
		case Project_draftPackage.ORDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Project_draftPackage.ORDER__TOTAL_PRICE:
			return totalPrice != TOTAL_PRICE_EDEFAULT;
		case Project_draftPackage.ORDER__ORDER_DATE:
			return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
		}
		return super.eIsSet(featureID);
	}

	@Override
	public PizzaOrder getPizzaOrder() {
		return this.orderProcess;
	}

	@Override
	public void setPizzaOrder(PizzaOrder order) {
		this.orderProcess = order;
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
		result.append(", totalPrice: ");
		result.append(totalPrice);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
