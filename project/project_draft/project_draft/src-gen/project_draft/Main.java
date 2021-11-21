package project_draft;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import project_draft.Location;
import project_draft.impl.LocationImpl;
import project_draft.impl.Project_draftFactoryImpl;
import project_draft.impl.StoreImpl;
import state_machine.PizzaOrder;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Edd1e234
 * @version 1.0
 * @since 11/17/21
 *
 * Demo of the code...
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("NOTE: This is a basic demo, bad inputs are not " +
                "handled well...");
        System.out.println("Welcome to the global Pizza");
        // Location location = getSampleStoreData1(getDefaultMenu());
        Location location1 = Project_draftFactoryImpl.init().createLocation();
        location1.setCity("El Paso");
        location1.setState("Texas");
        location1.getStore().addAll(getSampleStoreData1(getDefaultMenu()));

        Location location2 = Project_draftFactoryImpl.init().createLocation();
        location2.setState("Texas");
        location2.setCity("Austin");
        location2.getStore().addAll(getSampleStoreData1(getDefaultMenu()));

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(location1);
        locations.add(location2);
        while (true) {
            System.out.println("Select: \n 1- View locations \n 2- Add location " +
                    "\n 3- exit");
            Scanner scanner = new Scanner(System.in);
            int instructions = scanner.nextInt();
            if (instructions == 1) {
                locations(locations);
            }
            if (instructions == 2) {
                addLocations(locations);
            }
            if (instructions == 3) return;
        }
    }

    public static void locations(List<Location> locations) {
        int value = 0;
        System.out.println("Select location:\nType -1 to exit");
        for (Location location : locations) {
            System.out.println("Location:" + value + "\nState:"
                    + location.getState() + "\nCity:" +location.getCity());
            value++;
        }
        Scanner scanner = new Scanner(System.in);
        int instruction = scanner.nextInt();
        if (instruction == -1) return;
        viewStores(locations.get(instruction).getStore());
    }

    public static void viewStores(List<Store> stores) {
        int value = 0;
        System.out.println("Select location:\nType -1 to exit");
        for (Store store : stores) {
            System.out.println("Store:" + value);
            value++;
        }
        Scanner scanner = new Scanner(System.in);
        int instruction = scanner.nextInt();
        if (instruction == -1) return;
        viewStore(stores.get(instruction), instruction);
    }

    /* TODO: Lets put the branch manager salary
    *           The amount of drivers/Team Memebers
    *           The amount of orders processing
    *           Closing time & Opening time
    *           View feedback*/
    public static void viewStore(Store store, int storeNumber) {
        System.out.println("Store:" + storeNumber + "\nRevenue: " + store.getRevenue()  +
                "\nCost" +
                ": " + store.getCost() + "\nNumber of employees: " +
                (store.getTeammember().size()+store.getDriver().size()));
        System.out.println("Store Hours");
        for (int i = 0; i < store.getClosingTime().size(); i++) {
            System.out.println(store.getStartTime().get(i) +"---"+store.getClosingTime().get(i));
        }
        System.out.println("Menu: ");
        for (Item item : store.getMenu().getItems()) {
            System.out.println(item.getName());
            System.out.println("Price: " + item.getCost());
        }
        // Orders processing
        System.out.println("Customer Feedback");
        for (Feedback feedback : store.getFeedback()) {
            System.out.println(feedback.getDetails());
            System.out.println("Store Feedback: " + feedback.getRating());
        }
    }

    public static void addLocations(List<Location> locations) {}

    public static List<Store> getSampleStoreData1(Menu menu) {

        Store store1 = Project_draftFactoryImpl.init().createStore();
        store1.setMenu(menu);



        Store store2 = Project_draftFactoryImpl.init().createStore();
        store2.setMenu(menu);

        return Arrays.asList(new Store[] {store1, store2});
    }

    public static Menu getDefaultMenu() {
        Menu menu = Project_draftFactoryImpl.init().createMenu();
        menu.getItems().addAll(List.of(
                Project_draftFactoryImpl.init().createItem("Cheese Pizza", 4.5),
                Project_draftFactoryImpl.init().createItem("Pizza", 4.0),
                Project_draftFactoryImpl.init().createItem("Bread Sticks",
                        3.5),
                Project_draftFactoryImpl.init().createItem("Meat Loveres",
                        5.0)));
        return menu;
    }
}
