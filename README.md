# Data-Structures-Java

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


