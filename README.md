# Experiment 5 - Java Programming (PBL)

This repository contains Java programs demonstrating various concepts including exception handling, collections, and object serialization.

## Contents

- **partA.java** - Integer Sum Calculator with Exception Handling
- **partB.java** - Object Serialization and Deserialization Demo
- **partC.java** - Employee Management System with File Persistence

---

## Part A: Integer Sum Calculator

A Java program that demonstrates:
- Use of ArrayList for dynamic data storage
- Exception handling with try-catch blocks
- User input validation using Scanner
- NumberFormatException handling

### Features
- Accepts multiple integers as input
- Validates input and handles invalid entries gracefully
- Calculates and displays the sum of all entered integers
- Allows user to finish input by typing "done"

### How to Run

```bash
# Compile
javac partA.java

# Run
java partA
```

### Example Usage

```
Enter integers separated by space (type 'done' and press enter to finish):
10
20
abc
Invalid input. Please enter an integer.
30
done
Sum of entered integers: 60
```

---

## Part B: Object Serialization Demo

A Java program demonstrating:
- Object serialization and deserialization
- Use of ObjectOutputStream and ObjectInputStream
- Implementing Serializable interface
- File I/O operations with try-with-resources

### Features
- Creates a Student object with ID, name, and grade
- Serializes the object to a file (`student.dat`)
- Deserializes the object from the file
- Displays the deserialized object

### How to Run

```bash
# Compile
javac partB.java

# Run
java partB
```

### Example Output

```
Student object serialized successfully!
Deserialized Student: Student ID: 101, Name: Harbansh, Grade: 8.4
```

---

## Part C: Employee Management System

A comprehensive employee management system demonstrating:
- Interactive menu-driven console application
- Object serialization for data persistence
- Custom ObjectOutputStream for appending to files
- CRUD operations (Create, Read)

### Features
- Add new employee records (ID, Name, Designation, Salary)
- Display all employee records from file
- Persistent storage using serialization
- Custom `AppendingObjectOutputStream` to append objects to existing file

### How to Run

```bash
# Compile
javac partC.java

# Run
java partC
```

### Example Usage

```
--- Employee Management System ---
1. Add Employee
2. Display All Employees
3. Exit
Enter your choice: 1
Enter Employee ID: 101
Enter Employee Name: John Doe
Enter Designation: Software Engineer
Enter Salary: 75000
Employee added successfully!

--- Employee Management System ---
1. Add Employee
2. Display All Employees
3. Exit
Enter your choice: 2

--- Employee Records ---
ID: 101, Name: John Doe, Designation: Software Engineer, Salary: 75000.0
```

---

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command-line terminal or IDE with Java support

## Compilation

To compile all programs at once:

```bash
javac partA.java partB.java partC.java
```

## Key Concepts Covered

1. **Exception Handling**: Proper use of try-catch blocks, NumberFormatException, IOException, ClassNotFoundException, EOFException
2. **Collections Framework**: ArrayList for dynamic data storage
3. **Object Serialization**: Implementing Serializable, ObjectOutputStream, ObjectInputStream
4. **File I/O**: File handling, FileInputStream, FileOutputStream
5. **OOP Concepts**: Classes, objects, encapsulation
6. **Scanner Class**: User input handling
7. **Custom Streams**: Extending ObjectOutputStream for custom behavior

## Notes

- The `student.dat` and `employees.dat` files are created in the current directory when running the respective programs
- These `.dat` files are binary files containing serialized objects
- The `AppendingObjectOutputStream` class in partC allows multiple objects to be appended to the same file without corrupting the stream header

## Author

Developed as part of Problem-Based Learning (PBL) Java Programming coursework.
