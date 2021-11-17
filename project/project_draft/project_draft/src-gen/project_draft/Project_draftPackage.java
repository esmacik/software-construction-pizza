/**
 */
package project_draft;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see project_draft.Project_draftFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Project_draftPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project_draft";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/project_draft";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "project_draft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Project_draftPackage eINSTANCE = project_draft.impl.Project_draftPackageImpl.init();

	/**
	 * The meta object id for the '{@link project_draft.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.LocationImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STORE = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STATE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.ScheduleImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Clock In Times</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__CLOCK_IN_TIMES = 0;

	/**
	 * The feature id for the '<em><b>Clock Out Times</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__CLOCK_OUT_TIMES = 1;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.StoreImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Contactinformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CONTACTINFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__START_TIME = 4;

	/**
	 * The feature id for the '<em><b>Closing Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CLOSING_TIME = 5;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__COST = 6;

	/**
	 * The feature id for the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__REVENUE = 7;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__MENU = 8;

	/**
	 * The feature id for the '<em><b>Branchmanager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__BRANCHMANAGER = 9;

	/**
	 * The feature id for the '<em><b>Teammember</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__TEAMMEMBER = 10;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__DRIVER = 11;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.FeedbackImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__STORE = 0;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__RATING = 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DETAILS = 2;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.OrderImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 4;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOTAL_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_DATE = 4;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.DeliveryImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 5;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ITEM = ORDER__ITEM;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__FEEDBACK = ORDER__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__NAME = ORDER__NAME;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__TOTAL_PRICE = ORDER__TOTAL_PRICE;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ORDER_DATE = ORDER__ORDER_DATE;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__DRIVER = ORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ADDRESS = ORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = ORDER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.DineInImpl <em>Dine In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.DineInImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getDineIn()
	 * @generated
	 */
	int DINE_IN = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__ITEM = ORDER__ITEM;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__FEEDBACK = ORDER__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__NAME = ORDER__NAME;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__TOTAL_PRICE = ORDER__TOTAL_PRICE;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__ORDER_DATE = ORDER__ORDER_DATE;

	/**
	 * The feature id for the '<em><b>Teammember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__TEAMMEMBER = ORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Numer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN__TABLE_NUMER = ORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dine In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN_FEATURE_COUNT = ORDER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dine In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINE_IN_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.CarryOutImpl <em>Carry Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.CarryOutImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getCarryOut()
	 * @generated
	 */
	int CARRY_OUT = 7;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT__ITEM = ORDER__ITEM;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT__FEEDBACK = ORDER__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT__NAME = ORDER__NAME;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT__TOTAL_PRICE = ORDER__TOTAL_PRICE;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT__ORDER_DATE = ORDER__ORDER_DATE;

	/**
	 * The number of structural features of the '<em>Carry Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carry Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRY_OUT_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.ContactInformationImpl <em>Contact Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.ContactInformationImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getContactInformation()
	 * @generated
	 */
	int CONTACT_INFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__STORE = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__FIRST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__LAST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__PHONE_NUMBER = 6;

	/**
	 * The number of structural features of the '<em>Contact Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Contact Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.ItemImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COST = 2;

	/**
	 * The feature id for the '<em><b>Included By Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INCLUDED_BY_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.EmployeeImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 10;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALARY = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.DriverImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 11;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SCHEDULE = EMPLOYEE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SALARY = EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__TITLE = EMPLOYEE__TITLE;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DELIVERY = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Car Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__CAR_MAKE = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Car Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__CAR_MODEL = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NUM_ORDERS = EMPLOYEE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__STORE = EMPLOYEE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.BranchManagerImpl <em>Branch Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.BranchManagerImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getBranchManager()
	 * @generated
	 */
	int BRANCH_MANAGER = 12;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER__SCHEDULE = EMPLOYEE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER__SALARY = EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER__TITLE = EMPLOYEE__TITLE;

	/**
	 * The feature id for the '<em><b>Configures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER__CONFIGURES = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER__STORE = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Branch Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Branch Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_MANAGER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.TeamMemberImpl <em>Team Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.TeamMemberImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getTeamMember()
	 * @generated
	 */
	int TEAM_MEMBER = 13;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__SCHEDULE = EMPLOYEE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__SALARY = EMPLOYEE__SALARY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__TITLE = EMPLOYEE__TITLE;

	/**
	 * The feature id for the '<em><b>Currenet Duty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__CURRENET_DUTY = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dinein</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__DINEIN = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER__STORE = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Team Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Team Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_MEMBER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link project_draft.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project_draft.impl.MenuImpl
	 * @see project_draft.impl.Project_draftPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 14;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link project_draft.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see project_draft.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Location#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store</em>'.
	 * @see project_draft.Location#getStore()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Store();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see project_draft.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Location#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see project_draft.Location#getState()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_State();

	/**
	 * Returns the meta object for class '{@link project_draft.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see project_draft.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute list '{@link project_draft.Schedule#getClockInTimes <em>Clock In Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Clock In Times</em>'.
	 * @see project_draft.Schedule#getClockInTimes()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_ClockInTimes();

	/**
	 * Returns the meta object for the attribute list '{@link project_draft.Schedule#getClockOutTimes <em>Clock Out Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Clock Out Times</em>'.
	 * @see project_draft.Schedule#getClockOutTimes()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_ClockOutTimes();

	/**
	 * Returns the meta object for class '{@link project_draft.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see project_draft.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Store#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order</em>'.
	 * @see project_draft.Store#getOrder()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Order();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Store#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see project_draft.Store#getFeedback()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Feedback();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Store#getContactinformation <em>Contactinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contactinformation</em>'.
	 * @see project_draft.Store#getContactinformation()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Contactinformation();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Store#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see project_draft.Store#getLocation()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Location();

	/**
	 * Returns the meta object for the attribute list '{@link project_draft.Store#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Start Time</em>'.
	 * @see project_draft.Store#getStartTime()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_StartTime();

	/**
	 * Returns the meta object for the attribute list '{@link project_draft.Store#getClosingTime <em>Closing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Closing Time</em>'.
	 * @see project_draft.Store#getClosingTime()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_ClosingTime();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Store#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see project_draft.Store#getCost()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Cost();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Store#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue</em>'.
	 * @see project_draft.Store#getRevenue()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Revenue();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Store#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu</em>'.
	 * @see project_draft.Store#getMenu()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Menu();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Store#getBranchmanager <em>Branchmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branchmanager</em>'.
	 * @see project_draft.Store#getBranchmanager()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Branchmanager();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Store#getTeammember <em>Teammember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teammember</em>'.
	 * @see project_draft.Store#getTeammember()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Teammember();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Store#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Driver</em>'.
	 * @see project_draft.Store#getDriver()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Driver();

	/**
	 * Returns the meta object for class '{@link project_draft.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see project_draft.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Feedback#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see project_draft.Feedback#getStore()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_Store();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Feedback#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see project_draft.Feedback#getRating()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Rating();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Feedback#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see project_draft.Feedback#getDetails()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Details();

	/**
	 * Returns the meta object for class '{@link project_draft.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see project_draft.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Order#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see project_draft.Order#getItem()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Item();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Order#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback</em>'.
	 * @see project_draft.Order#getFeedback()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Order#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project_draft.Order#getName()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Name();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Order#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see project_draft.Order#getTotalPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TotalPrice();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Order#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see project_draft.Order#getOrderDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderDate();

	/**
	 * Returns the meta object for class '{@link project_draft.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see project_draft.Delivery
	 * @generated
	 */
	EClass getDelivery();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Delivery#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driver</em>'.
	 * @see project_draft.Delivery#getDriver()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_Driver();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Delivery#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see project_draft.Delivery#getAddress()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Address();

	/**
	 * Returns the meta object for class '{@link project_draft.DineIn <em>Dine In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dine In</em>'.
	 * @see project_draft.DineIn
	 * @generated
	 */
	EClass getDineIn();

	/**
	 * Returns the meta object for the reference '{@link project_draft.DineIn#getTeammember <em>Teammember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teammember</em>'.
	 * @see project_draft.DineIn#getTeammember()
	 * @see #getDineIn()
	 * @generated
	 */
	EReference getDineIn_Teammember();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.DineIn#getTableNumer <em>Table Numer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Numer</em>'.
	 * @see project_draft.DineIn#getTableNumer()
	 * @see #getDineIn()
	 * @generated
	 */
	EAttribute getDineIn_TableNumer();

	/**
	 * Returns the meta object for class '{@link project_draft.CarryOut <em>Carry Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carry Out</em>'.
	 * @see project_draft.CarryOut
	 * @generated
	 */
	EClass getCarryOut();

	/**
	 * Returns the meta object for class '{@link project_draft.ContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Information</em>'.
	 * @see project_draft.ContactInformation
	 * @generated
	 */
	EClass getContactInformation();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.ContactInformation#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order</em>'.
	 * @see project_draft.ContactInformation#getOrder()
	 * @see #getContactInformation()
	 * @generated
	 */
	EReference getContactInformation_Order();

	/**
	 * Returns the meta object for the reference '{@link project_draft.ContactInformation#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback</em>'.
	 * @see project_draft.ContactInformation#getFeedback()
	 * @see #getContactInformation()
	 * @generated
	 */
	EReference getContactInformation_Feedback();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.ContactInformation#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Store</em>'.
	 * @see project_draft.ContactInformation#getStore()
	 * @see #getContactInformation()
	 * @generated
	 */
	EReference getContactInformation_Store();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.ContactInformation#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see project_draft.ContactInformation#getFirstName()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.ContactInformation#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see project_draft.ContactInformation#getLastName()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_LastName();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.ContactInformation#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see project_draft.ContactInformation#getAddress()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_Address();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.ContactInformation#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see project_draft.ContactInformation#getPhoneNumber()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_PhoneNumber();

	/**
	 * Returns the meta object for class '{@link project_draft.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see project_draft.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Item#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see project_draft.Item#getOrder()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Order();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project_draft.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Item#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see project_draft.Item#getCost()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Cost();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Item#isIncludedByManager <em>Included By Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Included By Manager</em>'.
	 * @see project_draft.Item#isIncludedByManager()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IncludedByManager();

	/**
	 * Returns the meta object for class '{@link project_draft.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see project_draft.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Employee#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule</em>'.
	 * @see project_draft.Employee#getSchedule()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Schedule();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Employee#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see project_draft.Employee#getSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Salary();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Employee#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see project_draft.Employee#getTitle()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Title();

	/**
	 * Returns the meta object for class '{@link project_draft.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see project_draft.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Driver#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivery</em>'.
	 * @see project_draft.Driver#getDelivery()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Delivery();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Driver#getCarMake <em>Car Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Car Make</em>'.
	 * @see project_draft.Driver#getCarMake()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_CarMake();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Driver#getCarModel <em>Car Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Car Model</em>'.
	 * @see project_draft.Driver#getCarModel()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_CarModel();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.Driver#getNumOrders <em>Num Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Orders</em>'.
	 * @see project_draft.Driver#getNumOrders()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_NumOrders();

	/**
	 * Returns the meta object for the reference '{@link project_draft.Driver#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see project_draft.Driver#getStore()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Store();

	/**
	 * Returns the meta object for class '{@link project_draft.BranchManager <em>Branch Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Manager</em>'.
	 * @see project_draft.BranchManager
	 * @generated
	 */
	EClass getBranchManager();

	/**
	 * Returns the meta object for the reference '{@link project_draft.BranchManager#getConfigures <em>Configures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configures</em>'.
	 * @see project_draft.BranchManager#getConfigures()
	 * @see #getBranchManager()
	 * @generated
	 */
	EReference getBranchManager_Configures();

	/**
	 * Returns the meta object for the reference '{@link project_draft.BranchManager#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see project_draft.BranchManager#getStore()
	 * @see #getBranchManager()
	 * @generated
	 */
	EReference getBranchManager_Store();

	/**
	 * Returns the meta object for class '{@link project_draft.TeamMember <em>Team Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Member</em>'.
	 * @see project_draft.TeamMember
	 * @generated
	 */
	EClass getTeamMember();

	/**
	 * Returns the meta object for the attribute '{@link project_draft.TeamMember#getCurrenetDuty <em>Currenet Duty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currenet Duty</em>'.
	 * @see project_draft.TeamMember#getCurrenetDuty()
	 * @see #getTeamMember()
	 * @generated
	 */
	EAttribute getTeamMember_CurrenetDuty();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.TeamMember#getDinein <em>Dinein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dinein</em>'.
	 * @see project_draft.TeamMember#getDinein()
	 * @see #getTeamMember()
	 * @generated
	 */
	EReference getTeamMember_Dinein();

	/**
	 * Returns the meta object for the reference '{@link project_draft.TeamMember#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see project_draft.TeamMember#getStore()
	 * @see #getTeamMember()
	 * @generated
	 */
	EReference getTeamMember_Store();

	/**
	 * Returns the meta object for class '{@link project_draft.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see project_draft.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the reference list '{@link project_draft.Menu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see project_draft.Menu#getItems()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Items();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Project_draftFactory getProject_draftFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link project_draft.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.LocationImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__STORE = eINSTANCE.getLocation_Store();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__STATE = eINSTANCE.getLocation_State();

		/**
		 * The meta object literal for the '{@link project_draft.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.ScheduleImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Clock In Times</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__CLOCK_IN_TIMES = eINSTANCE.getSchedule_ClockInTimes();

		/**
		 * The meta object literal for the '<em><b>Clock Out Times</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__CLOCK_OUT_TIMES = eINSTANCE.getSchedule_ClockOutTimes();

		/**
		 * The meta object literal for the '{@link project_draft.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.StoreImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__ORDER = eINSTANCE.getStore_Order();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__FEEDBACK = eINSTANCE.getStore_Feedback();

		/**
		 * The meta object literal for the '<em><b>Contactinformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__CONTACTINFORMATION = eINSTANCE.getStore_Contactinformation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__LOCATION = eINSTANCE.getStore_Location();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__START_TIME = eINSTANCE.getStore_StartTime();

		/**
		 * The meta object literal for the '<em><b>Closing Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__CLOSING_TIME = eINSTANCE.getStore_ClosingTime();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__COST = eINSTANCE.getStore_Cost();

		/**
		 * The meta object literal for the '<em><b>Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__REVENUE = eINSTANCE.getStore_Revenue();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__MENU = eINSTANCE.getStore_Menu();

		/**
		 * The meta object literal for the '<em><b>Branchmanager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__BRANCHMANAGER = eINSTANCE.getStore_Branchmanager();

		/**
		 * The meta object literal for the '<em><b>Teammember</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__TEAMMEMBER = eINSTANCE.getStore_Teammember();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__DRIVER = eINSTANCE.getStore_Driver();

		/**
		 * The meta object literal for the '{@link project_draft.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.FeedbackImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__STORE = eINSTANCE.getFeedback_Store();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__RATING = eINSTANCE.getFeedback_Rating();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__DETAILS = eINSTANCE.getFeedback_Details();

		/**
		 * The meta object literal for the '{@link project_draft.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.OrderImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ITEM = eINSTANCE.getOrder_Item();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__FEEDBACK = eINSTANCE.getOrder_Feedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NAME = eINSTANCE.getOrder_Name();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TOTAL_PRICE = eINSTANCE.getOrder_TotalPrice();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_DATE = eINSTANCE.getOrder_OrderDate();

		/**
		 * The meta object literal for the '{@link project_draft.impl.DeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.DeliveryImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getDelivery()
		 * @generated
		 */
		EClass DELIVERY = eINSTANCE.getDelivery();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__DRIVER = eINSTANCE.getDelivery_Driver();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ADDRESS = eINSTANCE.getDelivery_Address();

		/**
		 * The meta object literal for the '{@link project_draft.impl.DineInImpl <em>Dine In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.DineInImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getDineIn()
		 * @generated
		 */
		EClass DINE_IN = eINSTANCE.getDineIn();

		/**
		 * The meta object literal for the '<em><b>Teammember</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINE_IN__TEAMMEMBER = eINSTANCE.getDineIn_Teammember();

		/**
		 * The meta object literal for the '<em><b>Table Numer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINE_IN__TABLE_NUMER = eINSTANCE.getDineIn_TableNumer();

		/**
		 * The meta object literal for the '{@link project_draft.impl.CarryOutImpl <em>Carry Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.CarryOutImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getCarryOut()
		 * @generated
		 */
		EClass CARRY_OUT = eINSTANCE.getCarryOut();

		/**
		 * The meta object literal for the '{@link project_draft.impl.ContactInformationImpl <em>Contact Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.ContactInformationImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getContactInformation()
		 * @generated
		 */
		EClass CONTACT_INFORMATION = eINSTANCE.getContactInformation();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_INFORMATION__ORDER = eINSTANCE.getContactInformation_Order();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_INFORMATION__FEEDBACK = eINSTANCE.getContactInformation_Feedback();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_INFORMATION__STORE = eINSTANCE.getContactInformation_Store();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__FIRST_NAME = eINSTANCE.getContactInformation_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__LAST_NAME = eINSTANCE.getContactInformation_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__ADDRESS = eINSTANCE.getContactInformation_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__PHONE_NUMBER = eINSTANCE.getContactInformation_PhoneNumber();

		/**
		 * The meta object literal for the '{@link project_draft.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.ItemImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ORDER = eINSTANCE.getItem_Order();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COST = eINSTANCE.getItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Included By Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__INCLUDED_BY_MANAGER = eINSTANCE.getItem_IncludedByManager();

		/**
		 * The meta object literal for the '{@link project_draft.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.EmployeeImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__SCHEDULE = eINSTANCE.getEmployee_Schedule();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SALARY = eINSTANCE.getEmployee_Salary();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__TITLE = eINSTANCE.getEmployee_Title();

		/**
		 * The meta object literal for the '{@link project_draft.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.DriverImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__DELIVERY = eINSTANCE.getDriver_Delivery();

		/**
		 * The meta object literal for the '<em><b>Car Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__CAR_MAKE = eINSTANCE.getDriver_CarMake();

		/**
		 * The meta object literal for the '<em><b>Car Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__CAR_MODEL = eINSTANCE.getDriver_CarModel();

		/**
		 * The meta object literal for the '<em><b>Num Orders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__NUM_ORDERS = eINSTANCE.getDriver_NumOrders();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__STORE = eINSTANCE.getDriver_Store();

		/**
		 * The meta object literal for the '{@link project_draft.impl.BranchManagerImpl <em>Branch Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.BranchManagerImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getBranchManager()
		 * @generated
		 */
		EClass BRANCH_MANAGER = eINSTANCE.getBranchManager();

		/**
		 * The meta object literal for the '<em><b>Configures</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_MANAGER__CONFIGURES = eINSTANCE.getBranchManager_Configures();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_MANAGER__STORE = eINSTANCE.getBranchManager_Store();

		/**
		 * The meta object literal for the '{@link project_draft.impl.TeamMemberImpl <em>Team Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.TeamMemberImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getTeamMember()
		 * @generated
		 */
		EClass TEAM_MEMBER = eINSTANCE.getTeamMember();

		/**
		 * The meta object literal for the '<em><b>Currenet Duty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_MEMBER__CURRENET_DUTY = eINSTANCE.getTeamMember_CurrenetDuty();

		/**
		 * The meta object literal for the '<em><b>Dinein</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MEMBER__DINEIN = eINSTANCE.getTeamMember_Dinein();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_MEMBER__STORE = eINSTANCE.getTeamMember_Store();

		/**
		 * The meta object literal for the '{@link project_draft.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project_draft.impl.MenuImpl
		 * @see project_draft.impl.Project_draftPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ITEMS = eINSTANCE.getMenu_Items();

	}

} //Project_draftPackage
