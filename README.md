# 1.2-Exceptions-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercise:

### Exercise 1
1. Create a class `Product` with attributes `name` and `price`.
2. Create a class `Sale` with:
   - A collection of products.
   - An attribute `totalPrice`.
   - A method `calculateTotal()`:
     - If the list of products is empty, it must throw a custom exception `EmptySaleException` with the message:
       `"To make a sale you must first add products"`.
     - If there are products, it must calculate and store the total price of all products.
3. Create the custom exception class `EmptySaleException`:
   - It must extend `Exception`.
   - Its constructor must receive the message.
   - When captured, the message is displayed using `getMessage()`.
4. Write the necessary code to **generate and capture** a standard `IndexOutOfBoundsException`.

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.2-Exceptions-Level1.git
cd 1.2-Exceptions-Level1
```

---

## ▶️ Execution
1. Open Main.java in the Exercise1 package.
2. Run the main() method.

Expected console output:

```sh
To make a sale you must first add products
20.0
IndexOutOfBoundsException: Index 5 out of bounds for length 2
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
