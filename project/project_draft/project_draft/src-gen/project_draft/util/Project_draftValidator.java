/**
 */
package project_draft.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import project_draft.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see project_draft.Project_draftPackage
 * @generated
 */
public class Project_draftValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Project_draftValidator INSTANCE = new Project_draftValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "project_draft";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project_draftValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Project_draftPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Project_draftPackage.LOCATION:
			return validateLocation((Location) value, diagnostics, context);
		case Project_draftPackage.SCHEDULE:
			return validateSchedule((Schedule) value, diagnostics, context);
		case Project_draftPackage.STORE:
			return validateStore((Store) value, diagnostics, context);
		case Project_draftPackage.FEEDBACK:
			return validateFeedback((Feedback) value, diagnostics, context);
		case Project_draftPackage.ORDER:
			return validateOrder((Order) value, diagnostics, context);
		case Project_draftPackage.DELIVERY:
			return validateDelivery((Delivery) value, diagnostics, context);
		case Project_draftPackage.DINE_IN:
			return validateDineIn((DineIn) value, diagnostics, context);
		case Project_draftPackage.CARRY_OUT:
			return validateCarryOut((CarryOut) value, diagnostics, context);
		case Project_draftPackage.CONTACT_INFORMATION:
			return validateContactInformation((ContactInformation) value, diagnostics, context);
		case Project_draftPackage.ITEM:
			return validateItem((Item) value, diagnostics, context);
		case Project_draftPackage.EMPLOYEE:
			return validateEmployee((Employee) value, diagnostics, context);
		case Project_draftPackage.DRIVER:
			return validateDriver((Driver) value, diagnostics, context);
		case Project_draftPackage.BRANCH_MANAGER:
			return validateBranchManager((BranchManager) value, diagnostics, context);
		case Project_draftPackage.TEAM_MEMBER:
			return validateTeamMember((TeamMember) value, diagnostics, context);
		case Project_draftPackage.MENU:
			return validateMenu((Menu) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedule, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSchedule_lengthOfClockInTime(schedule, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSchedule_lengthOfClockOutTime(schedule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lengthOfClockInTime constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCHEDULE__LENGTH_OF_CLOCK_IN_TIME__EEXPRESSION = "self.clockInTimes->size() < 8";

	/**
	 * Validates the lengthOfClockInTime constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule_lengthOfClockInTime(Schedule schedule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.SCHEDULE, schedule, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "lengthOfClockInTime",
				SCHEDULE__LENGTH_OF_CLOCK_IN_TIME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the lengthOfClockOutTime constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCHEDULE__LENGTH_OF_CLOCK_OUT_TIME__EEXPRESSION = "self.clockOutTimes->size() < 8";

	/**
	 * Validates the lengthOfClockOutTime constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule_lengthOfClockOutTime(Schedule schedule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.SCHEDULE, schedule, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "lengthOfClockOutTime",
				SCHEDULE__LENGTH_OF_CLOCK_OUT_TIME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(store, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStore_lengthOfStartTime(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStore_lengthOfClosingTime(store, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lengthOfStartTime constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORE__LENGTH_OF_START_TIME__EEXPRESSION = "self.startTime->size() < 8";

	/**
	 * Validates the lengthOfStartTime constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore_lengthOfStartTime(Store store, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.STORE, store, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "lengthOfStartTime",
				STORE__LENGTH_OF_START_TIME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the lengthOfClosingTime constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORE__LENGTH_OF_CLOSING_TIME__EEXPRESSION = "self.closingTime->size() < 8";

	/**
	 * Validates the lengthOfClosingTime constraint of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore_lengthOfClosingTime(Store store, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.STORE, store, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "lengthOfClosingTime",
				STORE__LENGTH_OF_CLOSING_TIME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeedback(Feedback feedback, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feedback, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(feedback, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFeedback_noLongerThan(feedback, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noLongerThan constraint of '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEEDBACK__NO_LONGER_THAN__EEXPRESSION = "self.details.size() < 500";

	/**
	 * Validates the noLongerThan constraint of '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeedback_noLongerThan(Feedback feedback, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.FEEDBACK, feedback, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "noLongerThan",
				FEEDBACK__NO_LONGER_THAN__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelivery(Delivery delivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDineIn(DineIn dineIn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dineIn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarryOut(CarryOut carryOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carryOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformation(ContactInformation contactInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contactInformation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContactInformation_checkPhoneNumberLength(contactInformation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContactInformation_checkPhoneNumber(contactInformation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkPhoneNumberLength constraint of '<em>Contact Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT_INFORMATION__CHECK_PHONE_NUMBER_LENGTH__EEXPRESSION = "self.phoneNumber->size() = 11";

	/**
	 * Validates the checkPhoneNumberLength constraint of '<em>Contact Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformation_checkPhoneNumberLength(ContactInformation contactInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.CONTACT_INFORMATION, contactInformation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "checkPhoneNumberLength",
				CONTACT_INFORMATION__CHECK_PHONE_NUMBER_LENGTH__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the checkPhoneNumber constraint of '<em>Contact Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT_INFORMATION__CHECK_PHONE_NUMBER__EEXPRESSION = "self.phoneNumber->forAll(p | p = '\\\\D')";

	/**
	 * Validates the checkPhoneNumber constraint of '<em>Contact Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformation_checkPhoneNumber(ContactInformation contactInformation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.CONTACT_INFORMATION, contactInformation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "checkPhoneNumber",
				CONTACT_INFORMATION__CHECK_PHONE_NUMBER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(employee, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveSalary(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveTitle(employee, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveSalary constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EMPLOYEE__MUST_HAVE_SALARY__EEXPRESSION = "not salary.oclIsUndefined()";

	/**
	 * Validates the mustHaveSalary constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee_mustHaveSalary(Employee employee, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.EMPLOYEE, employee, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveSalary",
				EMPLOYEE__MUST_HAVE_SALARY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveTitle constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EMPLOYEE__MUST_HAVE_TITLE__EEXPRESSION = "not title.oclIsUndefined()";

	/**
	 * Validates the mustHaveTitle constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee_mustHaveTitle(Employee employee, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.EMPLOYEE, employee, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveTitle",
				EMPLOYEE__MUST_HAVE_TITLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriver(Driver driver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(driver, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveSalary(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveTitle(driver, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDriver_setTitle(driver, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the setTitle constraint of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DRIVER__SET_TITLE__EEXPRESSION = "self.title = 'Driver'";

	/**
	 * Validates the setTitle constraint of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDriver_setTitle(Driver driver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.DRIVER, driver, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "setTitle", DRIVER__SET_TITLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchManager(BranchManager branchManager, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branchManager, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveSalary(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveTitle(branchManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBranchManager_setTitle(branchManager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the setTitle constraint of '<em>Branch Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRANCH_MANAGER__SET_TITLE__EEXPRESSION = "self.title = 'Branch Manager'";

	/**
	 * Validates the setTitle constraint of '<em>Branch Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchManager_setTitle(BranchManager branchManager, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.BRANCH_MANAGER, branchManager, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "setTitle", BRANCH_MANAGER__SET_TITLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeamMember(TeamMember teamMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(teamMember, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveSalary(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_mustHaveTitle(teamMember, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTeamMember_setTitle(teamMember, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the setTitle constraint of '<em>Team Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEAM_MEMBER__SET_TITLE__EEXPRESSION = "self.title = 'Team Member'";

	/**
	 * Validates the setTitle constraint of '<em>Team Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeamMember_setTitle(TeamMember teamMember, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Project_draftPackage.Literals.TEAM_MEMBER, teamMember, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "setTitle", TEAM_MEMBER__SET_TITLE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenu(Menu menu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menu, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Project_draftValidator
