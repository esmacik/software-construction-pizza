/**
 */
package project_draft.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import project_draft.BranchManager;
import project_draft.CarryOut;
import project_draft.ContactInformation;
import project_draft.Delivery;
import project_draft.DineIn;
import project_draft.Driver;
import project_draft.Employee;
import project_draft.Feedback;
import project_draft.Item;
import project_draft.Location;
import project_draft.Menu;
import project_draft.Order;
import project_draft.Project_draftFactory;
import project_draft.Project_draftPackage;
import project_draft.Schedule;
import project_draft.Store;
import project_draft.TeamMember;

import project_draft.util.Project_draftValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Project_draftPackageImpl extends EPackageImpl implements Project_draftPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dineInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carryOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see project_draft.Project_draftPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Project_draftPackageImpl() {
		super(eNS_URI, Project_draftFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Project_draftPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Project_draftPackage init() {
		if (isInited)
			return (Project_draftPackage) EPackage.Registry.INSTANCE.getEPackage(Project_draftPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProject_draftPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Project_draftPackageImpl theProject_draftPackage = registeredProject_draftPackage instanceof Project_draftPackageImpl
				? (Project_draftPackageImpl) registeredProject_draftPackage
				: new Project_draftPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProject_draftPackage.createPackageContents();

		// Initialize created meta-data
		theProject_draftPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theProject_draftPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Project_draftValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theProject_draftPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Project_draftPackage.eNS_URI, theProject_draftPackage);
		return theProject_draftPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Store() {
		return (EReference) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_City() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_State() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_ClockInTimes() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_ClockOutTimes() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Order() {
		return (EReference) storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Feedback() {
		return (EReference) storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Contactinformation() {
		return (EReference) storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Location() {
		return (EReference) storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_StartTime() {
		return (EAttribute) storeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_ClosingTime() {
		return (EAttribute) storeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Cost() {
		return (EAttribute) storeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Revenue() {
		return (EAttribute) storeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Menu() {
		return (EReference) storeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Branchmanager() {
		return (EReference) storeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Teammember() {
		return (EReference) storeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Driver() {
		return (EReference) storeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedback() {
		return feedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedback_Store() {
		return (EReference) feedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_Rating() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_Details() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Item() {
		return (EReference) orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Feedback() {
		return (EReference) orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_Name() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_TotalPrice() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrder_OrderDate() {
		return (EAttribute) orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelivery() {
		return deliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelivery_Driver() {
		return (EReference) deliveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelivery_Address() {
		return (EAttribute) deliveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDineIn() {
		return dineInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDineIn_Teammember() {
		return (EReference) dineInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDineIn_TableNumer() {
		return (EAttribute) dineInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarryOut() {
		return carryOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactInformation() {
		return contactInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformation_Order() {
		return (EReference) contactInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformation_Feedback() {
		return (EReference) contactInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactInformation_Store() {
		return (EReference) contactInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_FirstName() {
		return (EAttribute) contactInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_LastName() {
		return (EAttribute) contactInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_Address() {
		return (EAttribute) contactInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_PhoneNumber() {
		return (EAttribute) contactInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Order() {
		return (EReference) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Name() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Cost() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_IncludedByManager() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_Schedule() {
		return (EReference) employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Salary() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Title() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_Delivery() {
		return (EReference) driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriver_CarMake() {
		return (EAttribute) driverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriver_CarModel() {
		return (EAttribute) driverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriver_NumOrders() {
		return (EAttribute) driverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_Store() {
		return (EReference) driverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchManager() {
		return branchManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchManager_Configures() {
		return (EReference) branchManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchManager_Store() {
		return (EReference) branchManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamMember() {
		return teamMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamMember_CurrenetDuty() {
		return (EAttribute) teamMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMember_Dinein() {
		return (EReference) teamMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamMember_Store() {
		return (EReference) teamMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Items() {
		return (EReference) menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project_draftFactory getProject_draftFactory() {
		return (Project_draftFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__STORE);
		createEAttribute(locationEClass, LOCATION__CITY);
		createEAttribute(locationEClass, LOCATION__STATE);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__CLOCK_IN_TIMES);
		createEAttribute(scheduleEClass, SCHEDULE__CLOCK_OUT_TIMES);

		storeEClass = createEClass(STORE);
		createEReference(storeEClass, STORE__ORDER);
		createEReference(storeEClass, STORE__FEEDBACK);
		createEReference(storeEClass, STORE__CONTACTINFORMATION);
		createEReference(storeEClass, STORE__LOCATION);
		createEAttribute(storeEClass, STORE__START_TIME);
		createEAttribute(storeEClass, STORE__CLOSING_TIME);
		createEAttribute(storeEClass, STORE__COST);
		createEAttribute(storeEClass, STORE__REVENUE);
		createEReference(storeEClass, STORE__MENU);
		createEReference(storeEClass, STORE__BRANCHMANAGER);
		createEReference(storeEClass, STORE__TEAMMEMBER);
		createEReference(storeEClass, STORE__DRIVER);

		feedbackEClass = createEClass(FEEDBACK);
		createEReference(feedbackEClass, FEEDBACK__STORE);
		createEAttribute(feedbackEClass, FEEDBACK__RATING);
		createEAttribute(feedbackEClass, FEEDBACK__DETAILS);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__ITEM);
		createEReference(orderEClass, ORDER__FEEDBACK);
		createEAttribute(orderEClass, ORDER__NAME);
		createEAttribute(orderEClass, ORDER__TOTAL_PRICE);
		createEAttribute(orderEClass, ORDER__ORDER_DATE);

		deliveryEClass = createEClass(DELIVERY);
		createEReference(deliveryEClass, DELIVERY__DRIVER);
		createEAttribute(deliveryEClass, DELIVERY__ADDRESS);

		dineInEClass = createEClass(DINE_IN);
		createEReference(dineInEClass, DINE_IN__TEAMMEMBER);
		createEAttribute(dineInEClass, DINE_IN__TABLE_NUMER);

		carryOutEClass = createEClass(CARRY_OUT);

		contactInformationEClass = createEClass(CONTACT_INFORMATION);
		createEReference(contactInformationEClass, CONTACT_INFORMATION__ORDER);
		createEReference(contactInformationEClass, CONTACT_INFORMATION__FEEDBACK);
		createEReference(contactInformationEClass, CONTACT_INFORMATION__STORE);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__FIRST_NAME);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__LAST_NAME);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__ADDRESS);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__PHONE_NUMBER);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__ORDER);
		createEAttribute(itemEClass, ITEM__NAME);
		createEAttribute(itemEClass, ITEM__COST);
		createEAttribute(itemEClass, ITEM__INCLUDED_BY_MANAGER);

		employeeEClass = createEClass(EMPLOYEE);
		createEReference(employeeEClass, EMPLOYEE__SCHEDULE);
		createEAttribute(employeeEClass, EMPLOYEE__SALARY);
		createEAttribute(employeeEClass, EMPLOYEE__TITLE);

		driverEClass = createEClass(DRIVER);
		createEReference(driverEClass, DRIVER__DELIVERY);
		createEAttribute(driverEClass, DRIVER__CAR_MAKE);
		createEAttribute(driverEClass, DRIVER__CAR_MODEL);
		createEAttribute(driverEClass, DRIVER__NUM_ORDERS);
		createEReference(driverEClass, DRIVER__STORE);

		branchManagerEClass = createEClass(BRANCH_MANAGER);
		createEReference(branchManagerEClass, BRANCH_MANAGER__CONFIGURES);
		createEReference(branchManagerEClass, BRANCH_MANAGER__STORE);

		teamMemberEClass = createEClass(TEAM_MEMBER);
		createEAttribute(teamMemberEClass, TEAM_MEMBER__CURRENET_DUTY);
		createEReference(teamMemberEClass, TEAM_MEMBER__DINEIN);
		createEReference(teamMemberEClass, TEAM_MEMBER__STORE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ITEMS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deliveryEClass.getESuperTypes().add(this.getOrder());
		dineInEClass.getESuperTypes().add(this.getOrder());
		carryOutEClass.getESuperTypes().add(this.getOrder());
		driverEClass.getESuperTypes().add(this.getEmployee());
		branchManagerEClass.getESuperTypes().add(this.getEmployee());
		teamMemberEClass.getESuperTypes().add(this.getEmployee());

		// Initialize classes, features, and operations; add parameters
		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Store(), this.getStore(), this.getStore_Location(), "store", null, 0, -1,
				Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocation_City(), ecorePackage.getEString(), "city", "", 0, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_State(), ecorePackage.getEString(), "state", null, 0, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_ClockInTimes(), ecorePackage.getEString(), "clockInTimes", null, 0, -1,
				Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchedule_ClockOutTimes(), ecorePackage.getEString(), "clockOutTimes", null, 0, -1,
				Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStore_Order(), this.getOrder(), null, "order", null, 0, -1, Store.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getStore_Feedback(), this.getFeedback(), this.getFeedback_Store(), "feedback", null, 0, -1,
				Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Contactinformation(), this.getContactInformation(), this.getContactInformation_Store(),
				"contactinformation", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Location(), this.getLocation(), this.getLocation_Store(), "location", null, 0, 1,
				Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_StartTime(), ecorePackage.getEString(), "startTime", null, 0, -1, Store.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getStore_ClosingTime(), ecorePackage.getEString(), "closingTime", null, 0, -1, Store.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getStore_Cost(), ecorePackage.getEDouble(), "cost", null, 1, 1, Store.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Revenue(), ecorePackage.getEDouble(), "revenue", null, 1, 1, Store.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_Menu(), this.getMenu(), null, "menu", null, 0, 1, Store.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStore_Branchmanager(), this.getBranchManager(), this.getBranchManager_Store(),
				"branchmanager", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Teammember(), this.getTeamMember(), this.getTeamMember_Store(), "teammember", null, 0,
				-1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Driver(), this.getDriver(), this.getDriver_Store(), "driver", null, 0, -1, Store.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedback_Store(), this.getStore(), this.getStore_Feedback(), "store", null, 0, 1,
				Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedback_Rating(), ecorePackage.getEInt(), "rating", null, 1, 1, Feedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedback_Details(), ecorePackage.getEString(), "details", null, 0, 1, Feedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Item(), this.getItem(), this.getItem_Order(), "item", null, 0, -1, Order.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrder_Feedback(), this.getFeedback(), null, "feedback", null, 0, 1, Order.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Name(), ecorePackage.getEString(), "name", null, 0, 1, Order.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_TotalPrice(), ecorePackage.getEDouble(), "totalPrice", null, 1, 1, Order.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OrderDate(), ecorePackage.getEString(), "orderDate", null, 0, 1, Order.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelivery_Driver(), this.getDriver(), this.getDriver_Delivery(), "driver", null, 0, 1,
				Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_Address(), ecorePackage.getEString(), "address", null, 0, 1, Delivery.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dineInEClass, DineIn.class, "DineIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDineIn_Teammember(), this.getTeamMember(), this.getTeamMember_Dinein(), "teammember", null, 0,
				1, DineIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDineIn_TableNumer(), ecorePackage.getEString(), "tableNumer", null, 0, 1, DineIn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carryOutEClass, CarryOut.class, "CarryOut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactInformationEClass, ContactInformation.class, "ContactInformation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactInformation_Order(), this.getOrder(), null, "order", null, 0, -1,
				ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContactInformation_Feedback(), this.getFeedback(), null, "feedback", null, 0, 1,
				ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactInformation_Store(), this.getStore(), this.getStore_Contactinformation(), "store",
				null, 0, -1, ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactInformation_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1,
				ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformation_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1,
				ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformation_Address(), ecorePackage.getEString(), "address", null, 0, 1,
				ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformation_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 0, 1,
				ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Order(), this.getOrder(), this.getOrder_Item(), "order", null, 0, 1, Item.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Cost(), ecorePackage.getEDouble(), "cost", null, 1, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_IncludedByManager(), ecorePackage.getEBoolean(), "includedByManager", null, 1, 1,
				Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployee_Schedule(), this.getSchedule(), null, "schedule", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Salary(), ecorePackage.getEDouble(), "salary", null, 1, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Title(), ecorePackage.getEString(), "title", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDriver_Delivery(), this.getDelivery(), this.getDelivery_Driver(), "delivery", null, 0, -1,
				Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDriver_CarMake(), ecorePackage.getEString(), "carMake", null, 0, 1, Driver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriver_CarModel(), ecorePackage.getEString(), "carModel", null, 0, 1, Driver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriver_NumOrders(), ecorePackage.getEInt(), "numOrders", null, 1, 1, Driver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriver_Store(), this.getStore(), this.getStore_Driver(), "store", null, 0, 1, Driver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchManagerEClass, BranchManager.class, "BranchManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranchManager_Configures(), this.getMenu(), null, "configures", null, 0, 1,
				BranchManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchManager_Store(), this.getStore(), this.getStore_Branchmanager(), "store", null, 0, 1,
				BranchManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamMemberEClass, TeamMember.class, "TeamMember", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeamMember_CurrenetDuty(), ecorePackage.getEString(), "currenetDuty", null, 0, 1,
				TeamMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTeamMember_Dinein(), this.getDineIn(), this.getDineIn_Teammember(), "dinein", null, 0, -1,
				TeamMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTeamMember_Store(), this.getStore(), this.getStore_Teammember(), "store", null, 0, 1,
				TeamMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Items(), this.getItem(), null, "items", null, 0, -1, Menu.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(scheduleEClass, source,
				new String[] { "constraints", "lengthOfClockInTime lengthOfClockOutTime" });
		addAnnotation(storeEClass, source, new String[] { "constraints", "lengthOfStartTime lengthOfClosingTime" });
		addAnnotation(feedbackEClass, source, new String[] { "constraints", "noLongerThan" });
		addAnnotation(contactInformationEClass, source,
				new String[] { "constraints", "checkPhoneNumberLength checkPhoneNumber" });
		addAnnotation(employeeEClass, source, new String[] { "constraints", "mustHaveSalary mustHaveTitle" });
		addAnnotation(driverEClass, source, new String[] { "constraints", "setTitle" });
		addAnnotation(branchManagerEClass, source, new String[] { "constraints", "setTitle" });
		addAnnotation(teamMemberEClass, source, new String[] { "constraints", "setTitle" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(scheduleEClass, source, new String[] { "lengthOfClockInTime", "self.clockInTimes->size() < 8",
				"lengthOfClockOutTime", "self.clockOutTimes->size() < 8" });
		addAnnotation(storeEClass, source, new String[] { "lengthOfStartTime", "self.startTime->size() < 8",
				"lengthOfClosingTime", "self.closingTime->size() < 8" });
		addAnnotation(getStore_Order(), source,
				new String[] { "derivation", "self.order->select(self.menu.items->includes(self.order.item))" });
		addAnnotation(getStore_Contactinformation(), source, new String[] { "derivation",
				"self.contactinformation->select(c | self.feedback->includes(c.feedback))" });
		addAnnotation(getStore_Branchmanager(), source,
				new String[] { "derivation", "self.branchmanager->select(menu = self.menu)" });
		addAnnotation(feedbackEClass, source, new String[] { "noLongerThan", "self.details.size() < 500" });
		addAnnotation(contactInformationEClass, source, new String[] { "checkPhoneNumberLength",
				"self.phoneNumber->size() = 11", "checkPhoneNumber", "self.phoneNumber->forAll(p | p = \'\\\\D\')" });
		addAnnotation(employeeEClass, source, new String[] { "mustHaveSalary", "not salary.oclIsUndefined()",
				"mustHaveTitle", "not title.oclIsUndefined()" });
		addAnnotation(driverEClass, source, new String[] { "setTitle", "self.title = \'Driver\'" });
		addAnnotation(branchManagerEClass, source, new String[] { "setTitle", "self.title = \'Branch Manager\'" });
		addAnnotation(teamMemberEClass, source, new String[] { "setTitle", "self.title = \'Team Member\'" });
	}

} //Project_draftPackageImpl
