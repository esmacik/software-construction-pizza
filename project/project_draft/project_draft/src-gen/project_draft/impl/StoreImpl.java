/**
 */
package project_draft.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import project_draft.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.StoreImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getContactinformation <em>Contactinformation</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getClosingTime <em>Closing Time</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getBranchmanager <em>Branchmanager</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getTeammember <em>Teammember</em>}</li>
 *   <li>{@link project_draft.impl.StoreImpl#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store {
	/**
	 * The cached setting delegate for the '{@link #getOrder() <em>Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ORDER__ESETTING_DELEGATE = ((EStructuralFeature.Internal) Project_draftPackage.Literals.STORE__ORDER)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedback;

	/**
	 * The cached setting delegate for the '{@link #getContactinformation() <em>Contactinformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactinformation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTACTINFORMATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal) Project_draftPackage.Literals.STORE__CONTACTINFORMATION)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected EList<String> startTime;

	/**
	 * The cached value of the '{@link #getClosingTime() <em>Closing Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingTime()
	 * @generated
	 * @ordered
	 */
	protected EList<String> closingTime;

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
	 * The default value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final double REVENUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected double revenue = REVENUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu menu;

	/**
	 * The cached setting delegate for the '{@link #getBranchmanager() <em>Branchmanager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchmanager()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BRANCHMANAGER__ESETTING_DELEGATE = ((EStructuralFeature.Internal) Project_draftPackage.Literals.STORE__BRANCHMANAGER)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getTeammember() <em>Teammember</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeammember()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> teammember;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> driver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Order> getOrder() {
		return (EList<Order>) ORDER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectWithInverseResolvingEList<Feedback>(Feedback.class, this,
					Project_draftPackage.STORE__FEEDBACK, Project_draftPackage.FEEDBACK__STORE);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ContactInformation> getContactinformation() {
		return (EList<ContactInformation>) CONTACTINFORMATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject) location;
			location = (Location) eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.STORE__LOCATION,
							oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Project_draftPackage.STORE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this, Project_draftPackage.LOCATION__STORE,
						Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this, Project_draftPackage.LOCATION__STORE,
						Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.STORE__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStartTime() {
		if (startTime == null) {
			startTime = new EDataTypeUniqueEList<String>(String.class, this, Project_draftPackage.STORE__START_TIME);
		}
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClosingTime() {
		if (closingTime == null) {
			closingTime = new EDataTypeUniqueEList<String>(String.class, this,
					Project_draftPackage.STORE__CLOSING_TIME);
		}
		return closingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		getOrder().forEach(
				order -> order.getItem().forEach(item -> cost += item.getCost()));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.STORE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRevenue() {
		getOrder().forEach(
				order -> order.getItem().forEach(
						item -> revenue += item.getCost() + 3.0));
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(double newRevenue) {
		double oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.STORE__REVENUE, oldRevenue,
					revenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getMenu() {
		if (menu != null && menu.eIsProxy()) {
			InternalEObject oldMenu = (InternalEObject) menu;
			menu = (Menu) eResolveProxy(oldMenu);
			if (menu != oldMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.STORE__MENU, oldMenu,
							menu));
			}
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(Menu newMenu) {
		Menu oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.STORE__MENU, oldMenu, menu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BranchManager> getBranchmanager() {
		return (EList<BranchManager>) BRANCHMANAGER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TeamMember> getTeammember() {
		if (teammember == null) {
			teammember = new EObjectWithInverseResolvingEList<TeamMember>(TeamMember.class, this,
					Project_draftPackage.STORE__TEAMMEMBER, Project_draftPackage.TEAM_MEMBER__STORE);
		}
		return teammember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Driver> getDriver() {
		if (driver == null) {
			driver = new EObjectWithInverseResolvingEList<Driver>(Driver.class, this,
					Project_draftPackage.STORE__DRIVER, Project_draftPackage.DRIVER__STORE);
		}
		return driver;
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
		case Project_draftPackage.STORE__FEEDBACK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeedback()).basicAdd(otherEnd, msgs);
		case Project_draftPackage.STORE__CONTACTINFORMATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContactinformation()).basicAdd(otherEnd,
					msgs);
		case Project_draftPackage.STORE__LOCATION:
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this, Project_draftPackage.LOCATION__STORE,
						Location.class, msgs);
			return basicSetLocation((Location) otherEnd, msgs);
		case Project_draftPackage.STORE__BRANCHMANAGER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBranchmanager()).basicAdd(otherEnd, msgs);
		case Project_draftPackage.STORE__TEAMMEMBER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTeammember()).basicAdd(otherEnd, msgs);
		case Project_draftPackage.STORE__DRIVER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDriver()).basicAdd(otherEnd, msgs);
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
		case Project_draftPackage.STORE__FEEDBACK:
			return ((InternalEList<?>) getFeedback()).basicRemove(otherEnd, msgs);
		case Project_draftPackage.STORE__CONTACTINFORMATION:
			return ((InternalEList<?>) getContactinformation()).basicRemove(otherEnd, msgs);
		case Project_draftPackage.STORE__LOCATION:
			return basicSetLocation(null, msgs);
		case Project_draftPackage.STORE__BRANCHMANAGER:
			return ((InternalEList<?>) getBranchmanager()).basicRemove(otherEnd, msgs);
		case Project_draftPackage.STORE__TEAMMEMBER:
			return ((InternalEList<?>) getTeammember()).basicRemove(otherEnd, msgs);
		case Project_draftPackage.STORE__DRIVER:
			return ((InternalEList<?>) getDriver()).basicRemove(otherEnd, msgs);
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
		case Project_draftPackage.STORE__ORDER:
			return getOrder();
		case Project_draftPackage.STORE__FEEDBACK:
			return getFeedback();
		case Project_draftPackage.STORE__CONTACTINFORMATION:
			return getContactinformation();
		case Project_draftPackage.STORE__LOCATION:
			if (resolve)
				return getLocation();
			return basicGetLocation();
		case Project_draftPackage.STORE__START_TIME:
			return getStartTime();
		case Project_draftPackage.STORE__CLOSING_TIME:
			return getClosingTime();
		case Project_draftPackage.STORE__COST:
			return getCost();
		case Project_draftPackage.STORE__REVENUE:
			return getRevenue();
		case Project_draftPackage.STORE__MENU:
			if (resolve)
				return getMenu();
			return basicGetMenu();
		case Project_draftPackage.STORE__BRANCHMANAGER:
			return getBranchmanager();
		case Project_draftPackage.STORE__TEAMMEMBER:
			return getTeammember();
		case Project_draftPackage.STORE__DRIVER:
			return getDriver();
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
		case Project_draftPackage.STORE__ORDER:
			getOrder().clear();
			getOrder().addAll((Collection<? extends Order>) newValue);
			return;
		case Project_draftPackage.STORE__FEEDBACK:
			getFeedback().clear();
			getFeedback().addAll((Collection<? extends Feedback>) newValue);
			return;
		case Project_draftPackage.STORE__CONTACTINFORMATION:
			getContactinformation().clear();
			getContactinformation().addAll((Collection<? extends ContactInformation>) newValue);
			return;
		case Project_draftPackage.STORE__LOCATION:
			setLocation((Location) newValue);
			return;
		case Project_draftPackage.STORE__START_TIME:
			getStartTime().clear();
			getStartTime().addAll((Collection<? extends String>) newValue);
			return;
		case Project_draftPackage.STORE__CLOSING_TIME:
			getClosingTime().clear();
			getClosingTime().addAll((Collection<? extends String>) newValue);
			return;
		case Project_draftPackage.STORE__COST:
			setCost((Double) newValue);
			return;
		case Project_draftPackage.STORE__REVENUE:
			setRevenue((Double) newValue);
			return;
		case Project_draftPackage.STORE__MENU:
			setMenu((Menu) newValue);
			return;
		case Project_draftPackage.STORE__BRANCHMANAGER:
			getBranchmanager().clear();
			getBranchmanager().addAll((Collection<? extends BranchManager>) newValue);
			return;
		case Project_draftPackage.STORE__TEAMMEMBER:
			getTeammember().clear();
			getTeammember().addAll((Collection<? extends TeamMember>) newValue);
			return;
		case Project_draftPackage.STORE__DRIVER:
			getDriver().clear();
			getDriver().addAll((Collection<? extends Driver>) newValue);
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
		case Project_draftPackage.STORE__ORDER:
			getOrder().clear();
			return;
		case Project_draftPackage.STORE__FEEDBACK:
			getFeedback().clear();
			return;
		case Project_draftPackage.STORE__CONTACTINFORMATION:
			getContactinformation().clear();
			return;
		case Project_draftPackage.STORE__LOCATION:
			setLocation((Location) null);
			return;
		case Project_draftPackage.STORE__START_TIME:
			getStartTime().clear();
			return;
		case Project_draftPackage.STORE__CLOSING_TIME:
			getClosingTime().clear();
			return;
		case Project_draftPackage.STORE__COST:
			setCost(COST_EDEFAULT);
			return;
		case Project_draftPackage.STORE__REVENUE:
			setRevenue(REVENUE_EDEFAULT);
			return;
		case Project_draftPackage.STORE__MENU:
			setMenu((Menu) null);
			return;
		case Project_draftPackage.STORE__BRANCHMANAGER:
			getBranchmanager().clear();
			return;
		case Project_draftPackage.STORE__TEAMMEMBER:
			getTeammember().clear();
			return;
		case Project_draftPackage.STORE__DRIVER:
			getDriver().clear();
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
		case Project_draftPackage.STORE__ORDER:
			return ORDER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case Project_draftPackage.STORE__FEEDBACK:
			return feedback != null && !feedback.isEmpty();
		case Project_draftPackage.STORE__CONTACTINFORMATION:
			return CONTACTINFORMATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case Project_draftPackage.STORE__LOCATION:
			return location != null;
		case Project_draftPackage.STORE__START_TIME:
			return startTime != null && !startTime.isEmpty();
		case Project_draftPackage.STORE__CLOSING_TIME:
			return closingTime != null && !closingTime.isEmpty();
		case Project_draftPackage.STORE__COST:
			return cost != COST_EDEFAULT;
		case Project_draftPackage.STORE__REVENUE:
			return revenue != REVENUE_EDEFAULT;
		case Project_draftPackage.STORE__MENU:
			return menu != null;
		case Project_draftPackage.STORE__BRANCHMANAGER:
			return BRANCHMANAGER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case Project_draftPackage.STORE__TEAMMEMBER:
			return teammember != null && !teammember.isEmpty();
		case Project_draftPackage.STORE__DRIVER:
			return driver != null && !driver.isEmpty();
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", closingTime: ");
		result.append(closingTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", revenue: ");
		result.append(revenue);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
