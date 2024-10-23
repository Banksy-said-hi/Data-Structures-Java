# Data-Structures-Java
## Arrays
- Inserting or deleting elements in the midddle of an array requires extra memory

- Deleting and replacing elements with null values can waste memory because the array size remains unchanged

- Null Pointer Exception??

- Initializing an array static means allocating memory and setting initial values for each element optionally. Depending on your use case, you can initialize an array in Java in **static** or **dynamic** ways.
```
  public class Main {
      public static void main(String[] args) {
          String[] daysOfWeek = {"Sunday", "Monday", "Tuesday",”Wednesday”, “Thursday”};
          for (String day : daysOfWeek) {
              System.out.println(day);
          }
      }
  }
```

- **Initialization syntax**: Initializing arrays with {...} without using the new keyword is only allowed at the point of declaration. In other words, you can only use the shorthand {...} syntax directly when you declare the array. Doing otherwise will cause a compilation error.
```
int[] numbers = {1, 2, 3, 4, 5}; // This works because it is at the point of declaration.
```

- **Passing arrays to methods**: When passing arrays to methods, using the new keyword might be necessary to explicitly define the array and its values, ensuring the array is correctly recognized and handled by the method.
```
public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.println(num);
    }
}

public static void main(String[] args) {
    // Passing an array directly using the new keyword
    printArray(new int[] {10, 20, 30, 40, 50});
}
```

- **Using predefined Java methods**:
```
import java.util.Arrays; 
Public class Main{
  Public static void main(String[] args) {
     // Initialize an array with 30 seats 
    int[] seats = new int[30];
     // Fill indices 0 to 5 with 1 (Balcony class)
    Arrays.fill(seats, 0, 5, 1);
    // Fill indices 5 to 15 with 2 (Middle class)
     Arrays.fill(seats, 5, 15, 2); // Fill indices 15 to 30 with 3 (Lower class) 
    Arrays.fill(seats, 15, 30, 3);
  }
}
```

- You must use the new keyword when assigning an array after the declaration. Java expects the new keyword when assigning an array after declaration because the array must be dynamically created in memory. Without new, Java wouldn’t know where or how to allocate memory for the new array values.

**Example of direct initialization (no new)**
```
  int[] arr = {1, 2, 3}; // Memory is allocated automatically
```
**Example of assignment after declaration (requires new)**
```
  int[] arr;
  arr = new int[]{1, 2, 3}; // Memory is allocated explicitly with `new`
```

## ArrayList 
- An ArrayList is a resizable array implenentation within the Java Collections Framework, Effective dynamic resizing, adding, and removing

- ArrayList dynamically resizes to accommodate more or fewer elements as needed

- ArrayList can only hold objects, not primitvie data types

- ArrayList can grow or shrink as needed

- ArrayList has ```.size( )```, whereas Array only has Length attribute
```
public class Main {
  public static void main(String[] args) {
    // Example with ArrayList
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    System.out.println("ArrayList size: " + arrayList.size());

    // Example with Array
    String[] array = {"Dog", "Cat", "Bird"};
    System.out.println("Array length: " + array.length);
  }
}
```
  
- **ArrayList** Basic Declaration:
```
public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList(); // Declaring an ArrayList without specifying a type
        lst.add("ArrayList declaration");  // Adding a String
        lst.add(123); // Adding an Integer
        System.out.println("Basic ArrayList: " + lst);
    }
}
```

- **Generic** Declaration:
```
public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(); // ArrayList for storing Strings only
        stringList.add("Generic List");
        // stringList.add(123); // This line would cause a compile-time error
        System.out.println("Generic ArrayList: " + stringList);
    }
}
```

- The ArrayList class offers two valuable methods for adding elements:
  - **add(E element)**: Adds the element to the end of the list.
  
  - **add(int index, E element)**: Inserts the element at a specified position, moving the existing elements accordingly.
 
- Java provides several methods to handle this:
  - **remove(int index)**: Remove the element at the specified position.
    
  - **remove(Object obj)**: Removes the first occurrence of the specified element from the list if it exists.
    
  - **clear()**: The clear method removes all elements from the ArrayList, leaving it empty.
 
- get(), indexOf()

- ArrayList for **DYNAMIC DATA ( adjusting & flexiblity )** whereas Array for **STATIC DATA ( fixed and efficiency )**

## LinkedList
- A Linked List is a data structure that allows you to store a sequence of elements called **nodes**. Each node holds two critical pieces of information: the **data** itself and a **reference** (or link) to the next node in the sequence. This setup forms a chain-like structure, where each node knows how to find the next one.

- A linked list allows you to insert the items at any specified position such as the beginning of the list, the end of the list (as shown above), or after or before any particular node

- A data strcuture where elements are structured in a linear sequence, memory allocation is done only when a new node is added, each node has two main components **data ( the stored value )** & **next ( pointer to another node )**, first node is called **head**
  
- **Singly Linked List**: Only moving forward, each node only has pointers to next node, this structure is efficient for scenarios where you primarily need to move forward through the list, such as managing a dynamic queue of customers.

- Removing a customer: 
```
// Method to remove a specific customer from the waitlist
void removeCustomer(String customerName) {
    if (head == null) return;  // If the waitlist is empty, there's nothing to remove
    // If the customer to remove is at the head of the list
    if (head.name.equals(customerName)) {
        head = head.next;  // Move the head to the next customer
        return;
    }
    Node current = head;
    while (current.next != null && !current.next.name.equals(customerName)) {
        current = current.next;
    }
    if (current.next != null) {
        current.next = current.next.next;  // Bypass the node to remove the customer
    }
}
```

- Updating a customer's details
```
// Method to update a customer's details
void updateCustomer(String customerName, String newDetails) {
    Node current = head;
    while (current != null) {
        if (current.name.equals(customerName)) {
            current.details = newDetails;  // Update the customer’s details
            return;
        }
        current = current.next;
    }
}
```

- Adding elements to a LinkedList is like writing down each new clue in your notepad. The ```add()``` method is like a built-in helper that makes it easy to insert new elements into your list. When you use the add method, Java’s LinkedList locates the correct placement in the sequence and inserts it for you. This method adds the new element to the end of the list by default, making it the next step in your sequence.

