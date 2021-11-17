/**
 */
package project_draft.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import project_draft.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Project_draftFactoryImpl extends EFactoryImpl implements Project_draftFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Project_draftFactory init() {
		try {
			Project_draftFactory theProject_draftFactory = (Project_draftFactory) EPackage.Registry.INSTANCE
					.getEFactory(Project_draftPackage.eNS_URI);
			if (theProject_draftFactory != null) {
				return theProject_draftFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Project_draftFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project_draftFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Project_draftPackage.LOCATION:
			return createLocation();
		case Project_draftPackage.SCHEDULE:
			return createSchedule();
		case Project_draftPackage.STORE:
			return createStore();
		case Project_draftPackage.FEEDBACK:
			return createFeedback();
		case Project_draftPackage.ORDER:
			return createOrder();
		case Project_draftPackage.DELIVERY:
			return createDelivery();
		case Project_draftPackage.DINE_IN:
			return createDineIn();
		case Project_draftPackage.CARRY_OUT:
			return createCarryOut();
		case Project_draftPackage.CONTACT_INFORMATION:
			return createContactInformation();
		case Project_draftPackage.ITEM:
			return createItem();
		case Project_draftPackage.EMPLOYEE:
			return createEmployee();
		case Project_draftPackage.DRIVER:
			return createDriver();
		case Project_draftPackage.BRANCH_MANAGER:
			return createBranchManager();
		case Project_draftPackage.TEAM_MEMBER:
			return createTeamMember();
		case Project_draftPackage.MENU:
			return createMenu();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delivery createDelivery() {
		DeliveryImpl delivery = new DeliveryImpl();
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DineIn createDineIn() {
		DineInImpl dineIn = new DineInImpl();
		return dineIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarryOut createCarryOut() {
		CarryOutImpl carryOut = new CarryOutImpl();
		return carryOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformation createContactInformation() {
		ContactInformationImpl contactInformation = new ContactInformationImpl();
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchManager createBranchManager() {
		BranchManagerImpl branchManager = new BranchManagerImpl();
		return branchManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamMember createTeamMember() {
		TeamMemberImpl teamMember = new TeamMemberImpl();
		return teamMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project_draftPackage getProject_draftPackage() {
		return (Project_draftPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Project_draftPackage getPackage() {
		return Project_draftPackage.eINSTANCE;
	}

} //Project_draftFactoryImpl
