/**
 */
package project_draft.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import project_draft.Feedback;
import project_draft.Project_draftPackage;
import project_draft.Store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project_draft.impl.FeedbackImpl#getStore <em>Store</em>}</li>
 *   <li>{@link project_draft.impl.FeedbackImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link project_draft.impl.FeedbackImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends MinimalEObjectImpl.Container implements Feedback {
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
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final int RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected int rating = RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Project_draftPackage.Literals.FEEDBACK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Project_draftPackage.FEEDBACK__STORE,
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
					Project_draftPackage.FEEDBACK__STORE, oldStore, newStore);
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
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__FEEDBACK, Store.class,
						msgs);
			if (newStore != null)
				msgs = ((InternalEObject) newStore).eInverseAdd(this, Project_draftPackage.STORE__FEEDBACK, Store.class,
						msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.FEEDBACK__STORE, newStore,
					newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating(int newRating) {
		int oldRating = rating;
		rating = newRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.FEEDBACK__RATING, oldRating,
					rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Project_draftPackage.FEEDBACK__DETAILS, oldDetails,
					details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Project_draftPackage.FEEDBACK__STORE:
			if (store != null)
				msgs = ((InternalEObject) store).eInverseRemove(this, Project_draftPackage.STORE__FEEDBACK, Store.class,
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
		case Project_draftPackage.FEEDBACK__STORE:
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
		case Project_draftPackage.FEEDBACK__STORE:
			if (resolve)
				return getStore();
			return basicGetStore();
		case Project_draftPackage.FEEDBACK__RATING:
			return getRating();
		case Project_draftPackage.FEEDBACK__DETAILS:
			return getDetails();
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
		case Project_draftPackage.FEEDBACK__STORE:
			setStore((Store) newValue);
			return;
		case Project_draftPackage.FEEDBACK__RATING:
			setRating((Integer) newValue);
			return;
		case Project_draftPackage.FEEDBACK__DETAILS:
			setDetails((String) newValue);
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
		case Project_draftPackage.FEEDBACK__STORE:
			setStore((Store) null);
			return;
		case Project_draftPackage.FEEDBACK__RATING:
			setRating(RATING_EDEFAULT);
			return;
		case Project_draftPackage.FEEDBACK__DETAILS:
			setDetails(DETAILS_EDEFAULT);
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
		case Project_draftPackage.FEEDBACK__STORE:
			return store != null;
		case Project_draftPackage.FEEDBACK__RATING:
			return rating != RATING_EDEFAULT;
		case Project_draftPackage.FEEDBACK__DETAILS:
			return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
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
		result.append(" (rating: ");
		result.append(rating);
		result.append(", details: ");
		result.append(details);
		result.append(')');
		return result.toString();
	}

} //FeedbackImpl
