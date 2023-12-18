package Question05;

import java.util.*;
import java.util.Map.Entry;

public class JavacollectionsListsSetsandMaps {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        ListManager listManager = new ListManager();
		        SetManager setManager = new SetManager();
		        MapManager mapManager = new MapManager();

		        while (true) {
		            System.out.println("Select a collection type:");
		            System.out.println("1. List");
		            System.out.println("2. Set");
		            System.out.println("3. Map");
		            System.out.println("4. Exit");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    handleListOperations(scanner, listManager);
		                    break;
		                case 2:
		                    handleSetOperations(scanner, setManager);
		                    break;
		                case 3:
		                    handleMapOperations(scanner, mapManager);
		                    break;
		                case 4:
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
		            }
		        }
		    }

		    private static void handleListOperations(Scanner scanner, ListManager listManager) {
		        while (true) {
		            System.out.println("List Operations:");
		            System.out.println("1. Add an element");
		            System.out.println("2. Remove an element");
		            System.out.println("3. Display all elements");
		            System.out.println("4. Back to main menu");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter an element to add: ");
		                    String elementToAdd = scanner.nextLine();
		                    listManager.addElement(elementToAdd);
		                    break;
		                case 2:
		                    System.out.print("Enter an element to remove: ");
		                    String elementToRemove = scanner.nextLine();
		                    listManager.removeElement(elementToRemove);
		                    break;
		                case 3:
		                    listManager.displayElements();
		                    break;
		                case 4:
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
		            }
		        }
		    }

		    private static void handleSetOperations(Scanner scanner, SetManager setManager) {
		        while (true) {
		            System.out.println("Set Operations:");
		            System.out.println("1. Add an element");
		            System.out.println("2. Remove an element");
		            System.out.println("3. Display all elements");
		            System.out.println("4. Back to main menu");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter an element to add: ");
		                    String elementToAdd = scanner.nextLine();
		                    setManager.addElement(elementToAdd);
		                    break;
		                case 2:
		                    System.out.print("Enter an element to remove: ");
		                    String elementToRemove = scanner.nextLine();
		                    setManager.removeElement(elementToRemove);
		                    break;
		                case 3:
		                    setManager.displayElements();
		                    break;
		                case 4:
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
		            }
		        }
		    }

		    private static void handleMapOperations(Scanner scanner, MapManager mapManager) {
		        while (true) {
		            System.out.println("Map Operations:");
		            System.out.println("1. Add a key-value pair");
		            System.out.println("2. Remove a key-value pair");
		            System.out.println("3. Display all key-value pairs");
		            System.out.println("4. Back to main menu");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter a key: ");
		                    String key = scanner.nextLine();
		                    System.out.print("Enter a value: ");
		                    String value = scanner.nextLine();
		                    mapManager.addKeyValuePair(key, value);
		                    break;
		                case 2:
		                    System.out.print("Enter a key to remove: ");
		                    String keyToRemove = scanner.nextLine();
		                    mapManager.removeKeyValuePair(keyToRemove);
		                    break;
		                case 3:
		                    mapManager.displayKeyValuePairs();
		                    break;
		                case 4:
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
		            }
		        }
		    }
		}

		class ListManager {
		    private List<String> list = new ArrayList<>();

		    public void addElement(String element) {
		        list.add(element);
		        System.out.println("Element added: " + element);
		    }

		    public void removeElement(String element) {
		        if (list.remove(element)) {
		            System.out.println("Element removed: " + element);
		        } else {
		            System.out.println("Element not found: " + element);
		        }
		    }

		    public void displayElements() {
		        System.out.println("List elements:");
		        for (String element : list) {
		            System.out.println(element);
		        }
		    }
		}

		class SetManager {
		    private Set<String> set = new HashSet<>();

		    public void addElement(String element) {
		        if (set.add(element)) {
		            System.out.println("Element added: " + element);
		        } else {
		            System.out.println("Element already exists: " + element);
		        }
		    }

		    public void removeElement(String element) {
		        if (set.remove(element)) {
		            System.out.println("Element removed: " + element);
		        } else {
		            System.out.println("Element not found: " + element);
		        }
		    }

		    public void displayElements() {
		        System.out.println("Set elements:");
		        for (String element : set) {
		            System.out.println(element);
		        }
		    }
		}

		class MapManager {
		    private Map<String, String> map = new HashMap<>();

		    public void addKeyValuePair(String key, String value) {
		        if (map.put(key, value) == null) {
		            System.out.println("Key-value pair added: Key=" + key + ", Value=" + value);
		        } else {
		            System.out.println("Key already exists: " + key);
		        }
		    }

		    public void removeKeyValuePair(String key) {
		        if (map.remove(key) != null) {
		            System.out.println("Key-value pair removed: Key=" + key);
		        } else {
		            System.out.println("Key not found: " + key);
		        }
		    }

		    public void displayKeyValuePairs() {
		        System.out.println("Map key-value pairs:");
		        for (Entry<String, String> entry : map.entrySet()) {
		            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
		        }
		    }
	}

