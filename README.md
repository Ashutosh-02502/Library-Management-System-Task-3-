# 📚 Library Management System (OOP - Java)

### 🎯 Objective
A mini **Library Management System** built in Java using Object-Oriented Programming.  
It helps manage books and users with features to **issue** and **return books**.

### 🛠 Tools & Setup
- **Language**: Java  
- **IDE/Editor**: VS Code / Terminal  
- **Java Version**: JDK 17+ recommended  

### 📂 Classes Implemented
1. **Book** → Holds book details (ID, Title, Author, Issued status).  
2. **User** → Stores user details (User ID, Name).  
3. **Library** → Core logic to manage books, users, issue & return system.  
4. **Main** → CLI menu-driven application.  

### 🚀 Features
- Add books & users (sample data included).  
- View all books with status (**Available / Issued**).  
- Issue a book (changes its status).  
- Return a book (makes it available again).  
- Simple CLI menu navigation.  

### ▶️ Run Program
```bash
javac LibraryManagement.java Library.java Book.java User.java
java LibraryManagement

:- Sample Output
--- Library Menu ---
1. View Books
2. Issue Book
3. Return Book
4. Exit
Enter choice:
