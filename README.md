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

- Linkedlists are more efficient for operations that involve frequent additions or removals at both ends because they do not require shifting elements like arrays do

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

- The ```set()``` method is an in-built method that allows you to replace an existing element at a specific position in the list. When you use the set method, you’re telling the LinkedList, so change the clue in position 1 to something more specific." The set() method takes care of locating the exact position in the list and updating the element with the new value you provide.

- This built-in ```get()``` function allows you to access any element in your LinkedList by specifying its position, making it easy to review or display particular clues whenever you need to.

## Doubly LinkedList
Choose a singly linked list for better memory efficiency, but opt for a doubly linked list if speed and operational efficiency are more important.

- **Memory Usage**:

	•	Singly Linked List: Uses less memory as each node only holds a reference to the next node. Ideal when you want to keep memory usage low, especially in cases with a large number of nodes.

	•	Doubly Linked List: Each node stores references to both the previous and next nodes. This extra reference doubles the memory usage per node, so it’s more costly in terms of memory.

- **Performance**:

	•	Singly Linked List: Limited in operation flexibility, particularly when traversing in reverse or performing complex operations. Insertions and deletions are simple but less efficient for backtracking or complex operations.

	•	Doubly Linked List: Allows two-way traversal, making operations like deletions, insertions, and reverse traversals more efficient in terms of time because it doesn’t require starting over from the head or tail. This is useful for applications where both directions of traversal are common or required for optimal performance.

- **Add After**:
```
public void addAfter(Node prevNode, int data) {
      if (prevNode == null) {	// check if the previous node is null
          return;			// if it is, then return
      }
      Node newNode = new Node(data);	// create a new node
      newNode.next = prevNode.next;	// set the next of new node to next of prev node
      prevNode.next = newNode;	// set the next of prev node to new node
      newNode.prev = prevNode;	// set the previous of new node to prev node
      if (newNode.next != null) {	// check if the new node is not the last node
          newNode.next.prev = newNode;	// set the next node's prev to the new node
      } else {				// if the new node is the last node
          tail = newNode;		// set the tail to the new node
      }
  }
```

- **Forward Traversal**:
```
public void traverseForward() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
```

- **Backward Traversal**:
```
public void traverseBackward() {
      Node current = tail;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.prev;
      }
      System.out.println();
}
```

- **Removing the Tail Node**:
```
public void removeEnd() {
    if (tail == null) {
        return; // List is already empty
    }
    tail = tail.prev;
    if (tail != null) {
        tail.next = null;
    } else {
// If the tail is now null, it means the list had only one node, which has been removed.
// Set head to null to indicate that the list is completely empty.
        head = null; 
    }
}
```

- **Removing the Head Node**:
```
public void removeFront() {
    if (head == null) {		// check if the head is null
        return; // if it is, return because there is nothing to remove. The list is already empty
    }
    head = head.next;	// set the head to the next node
    if (head != null) {		// check if the head is not null
        head.prev = null;	// set the previous of the head to null
    } else {	
// If the head is null, there were no other nodes on the list except for the one you removed.
// The list is now empty, so you must also set the tail to null.
        tail = null;
    }
}
```

- **Removing a Node in the Middle**:
```
public void removeNode(Node node) {
    if (node == null) {
        return;
    }
    if (node == head) {
        removeFront();
        return;
    }
    if (node == tail) {
        removeEnd();
        return;
    }
    // Update the previous node's next pointer
    node.prev.next = node.next;
    // Update the next node's previous pointer
    node.next.prev = node.prev;
}
```

<img width="1009" alt="Screenshot 2024-10-25 at 8 53 31 AM" src="https://github.com/user-attachments/assets/e13d52bb-fa36-44a8-be22-f5a6290e996d">

## ListIterator
Java’s ListIterator is an interface from the java.util package, designed specifically for traversing list implementations, including LinkedList. Since it is part of the Java Collections Framework, you need to import it separately using import java.util.ListIterator; when using it in your code.

What makes ListIterator especially useful in the context of a doubly linked list is its ability to traverse the list forwards and backwards, giving you complete control over the navigation of the list.


- ```next()```: **Moves the iterator to the next element in the list and returns that element**. The ListIterator keeps track of its current position internally, so each call to next() automatically moves it forward by one step. Since it changes the iterator's position, it’s essential to ensure a 'next' element is available.

- ```hasNext()```: Checks if there is an element ahead in the list, allowing you to move forward safely. Before using the next() method, you should call hasNext(), which This method returns true if there are more elements to traverse, and false if you've reached the end of the list.

- ```previous()```: **Moves the iterator to the previous element and returns that element.** The ListIterator keeps track of its current position internally, so each call to previous() automatically moves it backward by one step. Since it changes the iterator's position, it’s essential to ensure a 'previous' element is available.

- ```hasPrevious()```: Checks if there is an element behind the current position, enabling backward traversal. If hasPrevious() returns true, you can safely use the previous() method to move the iterator backward and access the previous element.
```
import java.util.LinkedList;
import java.util.ListIterator;

public class Recipe {
    public static void main(String[] args) {
        // Using ListIterator to traverse the list
        ListIterator<String> iterator = recipeSteps.listIterator();

        // Forward traversal
        System.out.println("Traversing forward through the recipe:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward traversal
        System.out.println("\nTraversing backward through the recipe:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
```

<img width="1500" alt="Screenshot 2024-10-20 at 11 20 41 AM" src="https://github.com/user-attachments/assets/273e945d-039b-47d7-aadb-e993a17b3f8b">

## Difference between Arrays & Linkedlist when it comes to **deletion**
- Array (Seating in a Row)
Imagine you have a row of seats filled with people in a theater. If you need to remove someone from a seat in the middle, you can’t just pull them out and leave the seat empty. Instead:

	1.	You have to ask everyone sitting to the right of that person to shift one seat to the left.
	2.	This takes time, especially if it’s a crowded theater, because everyone has to move.

So, with an array, deleting an element means shifting elements to fill the gap, which is time-consuming, especially with larger arrays.

- Linked List (Connected Chairs with Notes):
Now imagine a similar row of chairs, but each chair is connected by a small string to the next chair. If you want to remove someone from a chair in the middle:

	1.	You simply cut the string before and after that chair and tie those two ends together, bypassing the empty chair.
	2.	No one else has to move—just a quick adjustment of the connections.

With a linked list, deleting an element is as simple as “retying” the links, which is much faster and more efficient than shifting elements around. This is especially useful when managing large amounts of data or frequently deleting elements from anywhere in the list.

## Stacks
A stack is a simple data structure that follows the Last In, First Out (LIFO) principle. It’s useful for tasks that need temporary data storage, tracking the history of actions, and backtracking in code. Often used for undo functionality, history tracking, and backtracking.

- LIFO Principle: Stack works on the Last In, First Out (LIFO) concept, the most recently added (last) item is the first one removed.

- Common Operations:
  
	**Push**: Adds an element to the top of the stack.
  
	**Pop**: Removes the top element from the stack.

	**Peek**: Views the top element without removing it.

- Real-Life Examples:
	Browsing history (back button) where you move back to the last page visited. Navigating through a series of states or actions, such as nested function calls in recursion.
