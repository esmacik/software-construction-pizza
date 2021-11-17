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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import project_draft.ContactInformation;
import project_draft.Feedback;
import project_draft.Order;
import project_draft.Project_draftPackage;
import project_draft.Store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getStore <em>Store</em>}</li>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link project_draft.impl.ContactInformationImpl#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactInformationImpl extends MinimalEObjectImpl.Container implements ContactInformation {
	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> order;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected Feedback feedback;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected EList<Store> store;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.CONTACT_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrder() {
		if (order == null) {
			order = new EObjectResolvingEList<Order>(Order.class, this,
					Project_draftPackage.CONTACT_INFORMATION__ORDER);
		}
		return order;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Project_draftPackage.CONTACT_INFORMATION__FEEDBACK, oldFeedback, feedback));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.CONTACT_INFORMATION__FEEDBACK,
					oldFeedback, feedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Store> getStore() {
		if (store == null) {
			store = new EObjectWithInverseResolvingEList.ManyInverse<Store>(Store.class, this,
					Project_draftPackage.CONTACT_INFORMATION__STORE, Project_draftPackage.STORE__CONTACTINFORMATION);
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.CONTACT_INFORMATION__FIRST_NAME,
					oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.CONTACT_INFORMATION__LAST_NAME,
					oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.CONTACT_INFORMATION__ADDRESS,
					oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Project_draftPackage.CONTACT_INFORMATION__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
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
		case Project_draftPackage.CONTACT_INFORMATION__STORE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStore()).basicAdd(otherEnd, msgs);
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
		case Project_draftPackage.CONTACT_INFORMATION__STORE:
			return ((InternalEList<?>) getStore()).basicRemove(otherEnd, msgs);
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
		case Project_draftPackage.CONTACT_INFORMATION__ORDER:
			return getOrder();
		case Project_draftPackage.CONTACT_INFORMATION__FEEDBACK:
			if (resolve)
				return getFeedback();
			return basicGetFeedback();
		case Project_draftPackage.CONTACT_INFORMATION__STORE:
			return getStore();
		case Project_draftPackage.CONTACT_INFORMATION__FIRST_NAME:
			return getFirstName();
		case Project_draftPackage.CONTACT_INFORMATION__LAST_NAME:
			return getLastName();
		case Project_draftPackage.CONTACT_INFORMATION__ADDRESS:
			return getAddress();
		case Project_draftPackage.CONTACT_INFORMATION__PHONE_NUMBER:
			return getPhoneNumber();
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
		case Project_draftPackage.CONTACT_INFORMATION__ORDER:
			getOrder().clear();
			getOrder().addAll((Collection<? extends Order>) newValue);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__FEEDBACK:
			setFeedback((Feedback) newValue);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__STORE:
			getStore().clear();
			getStore().addAll((Collection<? extends Store>) newValue);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__LAST_NAME:
			setLastName((String) newValue);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__ADDRESS:
			setAddress((String) newValue);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__PHONE_NUMBER:
			setPhoneNumber((String) newValue);
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
		case Project_draftPackage.CONTACT_INFORMATION__ORDER:
			getOrder().clear();
			return;
		case Project_draftPackage.CONTACT_INFORMATION__FEEDBACK:
			setFeedback((Feedback) null);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__STORE:
			getStore().clear();
			return;
		case Project_draftPackage.CONTACT_INFORMATION__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__LAST_NAME:
			setLastName(LAST_NAME_EDEFAULT);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case Project_draftPackage.CONTACT_INFORMATION__PHONE_NUMBER:
			setPhoneNumber(PHONE_NUMBER_EDEFAULT);
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
		case Project_draftPackage.CONTACT_INFORMATION__ORDER:
			return order != null && !order.isEmpty();
		case Project_draftPackage.CONTACT_INFORMATION__FEEDBACK:
			return feedback != null;
		case Project_draftPackage.CONTACT_INFORMATION__STORE:
			return store != null && !store.isEmpty();
		case Project_draftPackage.CONTACT_INFORMATION__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
		case Project_draftPackage.CONTACT_INFORMATION__LAST_NAME:
			return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
		case Project_draftPackage.CONTACT_INFORMATION__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case Project_draftPackage.CONTACT_INFORMATION__PHONE_NUMBER:
			return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", address: ");
		result.append(address);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(')');
		return result.toString();
	}

} //ContactInformationImpl
