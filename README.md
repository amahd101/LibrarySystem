# Library System (Java Project)

## Project Description

This project is a simple Library Management System built in Java.
It allows users to add books, register users, and manage borrowing and returning of books through a menu-driven interface.

The purpose of this project is to demonstrate:

* Object-Oriented Programming (OOP)
* Use of multiple classes
* Use of data structures such as `ArrayList`
* Basic user interaction through a console interface

---

## Features

* Add new users
* Add new books
* View all books in the system
* Borrow a book
* Return a book
* View registered users

---

## Project Structure (Classes)

### Main.java

* Entry point of the program
* Displays menu and handles user input
* Connects user actions to system functionality

### LibraryManager.java

* Core logic of the system
* Manages lists of users and books
* Handles borrowing and returning operations

### User.java

* Represents a user in the system
* Stores user name and borrowed books
* Allows borrowing and returning of books

### Book.java

* Represents a book
* Stores title, author, and availability status
* Tracks whether a book is borrowed or available

---

## Data Structures Used

* `ArrayList<User>` to store users
* `ArrayList<Book>` to store books

---

## How to Run

1. Open the project in NetBeans (or any Java IDE)
2. Run the `Main.java` file
3. Use the menu to interact with the system

---

## Testing

The program was tested by:

* Adding multiple users and books
* Borrowing and returning books
* Verifying book availability updates correctly

---

## Screenshots

Screenshots of the running application are included in the `/media` folder.

---

## Contributors

* Amahd Helms – Implemented core functionality and system integration

---

## Notes

* This project uses a console-based interface
* The system can be extended with additional features such as:

  * Search functionality
  * Borrow limits
  * A graphical user interface

---

## Resources

* Java Documentation
* Course materials and lectures
* Online references for ArrayList and object-oriented programming

---
