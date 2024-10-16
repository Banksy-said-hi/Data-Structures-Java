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
