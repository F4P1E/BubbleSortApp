# BubbleSortApp

This is a simple Java application demonstrating the bubble sort algorithm as part of the *Software Engineering Process and Tools* course.

---

## 📋 Project Overview

- **Application Name**: BubbleSortApp  
- **Purpose**: Implement and demonstrate the bubble sort algorithm on multiple arrays of integers.  
- **Technology Stack**:  
  - Java (JDK 17)  
  - Maven  
- **Structure**:  
  - `src/main/java/com/example/BubbleSort.java` — Contains the sorting logic.  
  - `src/main/java/com/example/App.java` — Contains the `main()` method which runs the application.  
  - `pom.xml` — Maven project descriptor.  
  - `.gitignore` — Ignored files for Git (IDE files, build output).  
  - `LICENSE` — MIT License.

---

## 🚀 How to Build & Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/F4P1E/BubbleSortApp.git
   cd BubbleSortApp
````

2. **Build with Maven**

   ```bash
   mvn clean compile
   ```

3. **Run the application**

   ```bash
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

   Or, if you packaged the jar:

   ```bash
   mvn package
   java -cp target/BubbleSortApp-1.0-SNAPSHOT.jar com.example.App
   ```

4. **Expected Output**
   The application sorts several integer arrays and prints the sorted results.

---

## 🧮 About Bubble Sort

Bubble sort is one of the simplest sorting algorithms. It works by repeatedly stepping through the list, comparing adjacent elements and swapping them if they are in the wrong order. The process repeats until the list is sorted.

Although not efficient for large datasets (average and worst-case time complexity of O(n²)), it’s useful for educational purposes and small arrays.

---

## ✅ License

This project is licensed under the [MIT License](LICENSE).
© 2025 Duong Phu Dong.

---

## 👥 Contributing

Feel free to submit issues or pull requests if you find bugs or want to add improvements (for example: additional sorting algorithms, performance benchmarks, unit tests, etc.).

---

## 🎓 Course Info

This project is part of the *Software Engineering Process and Tools* course, demonstrating version control, build automation and simple algorithm implementation.
