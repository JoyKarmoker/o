# Object-Oriented Design Pattern Project: Banking Service with Facade Pattern

## Table of Contents
1. [Introduction](#introduction)
2. [Project Overview](#project-overview)
3. [Class and Interface Details](#class-and-interface-details)
    - [IAccount Interface](#iaccount-interface)
    - [Chequing Class](#chequing-class)
    - [Saving Class](#saving-class)
    - [Investment Class](#investment-class)
    - [BankService Class](#bankservice-class)
    - [Customer Class](#customer-class)
4. [Implementation Details](#implementation-details)
    - [Facade Design Pattern](#facade-design-pattern)
5. [UML Diagram](#uml-diagram)
6. [How to Use](#how-to-use)
7. [Conclusion](#conclusion)

## 1. Introduction <a name="introduction"></a>
This README provides a detailed explanation of the Object-Oriented Design Pattern project for a Banking Service with the implementation of the Facade design pattern. The project consists of multiple classes and interfaces that work together to manage various bank accounts, including checking, saving, and investment accounts.

## 2. Project Overview <a name="project-overview"></a>
In this project, we have implemented a simplified banking system using Object-Oriented Design principles and the Facade design pattern. The primary goal is to provide a clean and easy-to-use interface for customers to interact with their bank accounts while encapsulating the complexity of the underlying account types.

## 3. Class and Interface Details <a name="class-and-interface-details"></a>

### IAccount Interface <a name="iaccount-interface"></a>
The `IAccount` interface defines the common operations that can be performed on any bank account. It includes the following methods:

- `void deposit(BigDecimal amount)`: Deposits the specified amount into the account.
- `void withdraw(BigDecimal amount)`: Withdraws the specified amount from the account.
- `void transfer(IAccount toAccount, BigDecimal amount)`: Transfers the specified amount to another account.
- `int getAccountNumber()`: Returns the account number.
- `BigDecimal showBalance()`: Returns the current account balance.

### Chequing Class <a name="chequing-class"></a>
The `Chequing` class represents a checking account and implements the `IAccount` interface. It includes the following methods and variables:

**Methods:**
- `void deposit(BigDecimal amount)`: Deposits the specified amount into the checking account.
- `void withdraw(BigDecimal amount)`: Withdraws the specified amount from the checking account.
- `void transfer(IAccount toAccount, BigDecimal amount)`: Transfers the specified amount to another account.
- `int getAccountNumber()`: Returns the account number associated with the checking account.
- `BigDecimal showBalance()`: Returns the current balance of the checking account.

**Variables:**
- `private final int accountNumber`: Stores the unique account number.
- `private BigDecimal balance`: Stores the current balance of the checking account.

### Saving Class <a name="saving-class"></a>
The `Saving` class represents a savings account and also implements the `IAccount` interface. It includes the following methods and variables:

**Methods:**
- `void deposit(BigDecimal amount)`: Deposits the specified amount into the savings account.
- `void withdraw(BigDecimal amount)`: Withdraws the specified amount from the savings account.
- `void transfer(IAccount toAccount, BigDecimal amount)`: Transfers the specified amount to another account.
- `int getAccountNumber()`: Returns the account number associated with the savings account.
- `BigDecimal showBalance()`: Returns the current balance of the savings account.

**Variables:**
- `private final int accountNumber`: Stores the unique account number.
- `private BigDecimal balance`: Stores the current balance of the savings account.

### Investment Class <a name="investment-class"></a>
The `Investment` class represents an investment account and implements the `IAccount` interface. It includes the following methods and variables:

**Methods:**
- `void deposit(BigDecimal amount)`: Deposits the specified amount into the investment account.
- `void withdraw(BigDecimal amount)`: Withdraws the specified amount from the investment account.
- `void transfer(IAccount toAccount, BigDecimal amount)`: Transfers the specified amount to another account.
- `int getAccountNumber()`: Returns the account number associated with the investment account.
- `BigDecimal showBalance()`: Returns the current balance of the investment account.

**Variables:**
- `private final int accountNumber`: Stores the unique account number.
- `private BigDecimal balance`: Stores the current balance of the investment account.

### BankService Class <a name="bankservice-class"></a>
The `BankService` class acts as a Facade for the different account types (Chequing, Saving, Investment). It includes the following methods and variables:

**Methods:**
- `int createNewAccount(String type, BigDecimal initAmount)`: Creates a new account of the specified type (chequing, saving, or investment) with an initial balance.
- `void transferMoney(int to, int from, BigDecimal amount)`: Transfers a specified amount from one account to another.
- Other utility methods for account management.

**Variables:**
- `private Hashtable<Integer, IAccount> bankAccounts`: A hashtable that stores accounts with their respective account numbers.

### Customer Class <a name="customer-class"></a>
The `Customer` class contains the `main` method, where the interaction with the bank accounts takes place. Here's what it does step by step:

1. **Create an instance of BankService:** It starts by creating an instance of the `BankService` class, which acts as the Facade.

2. **Create Bank Accounts:** The `Customer` class uses the `createNewAccount` method of the `BankService` to create two different accounts for a customer (a savings account and an investment account) and initializes them with specified initial balances.

3. **Check Account Balances:** It uses the `showBalance` method of the `BankService` to retrieve and display the balances of the created accounts. This demonstrates how customers can check their account balances through the Facade.

4. **Transfer Money:** The `Customer` class then uses the `transferMoney` method of the `BankService` to transfer money from the investment account to the savings account. This shows how customers can perform transfers between their accounts.

5. **Deposit Money:** Finally, it uses the `deposit` method of the `BankService` to deposit money into the savings account and displays the updated balance. This demonstrates how customers can make deposits into their accounts.

## 4. Implementation Details <a name="implementation-details"></a>

### Facade Design Pattern <a name="facade-design-pattern"></a>
The Facade design pattern is implemented in the `BankService` class. It provides a simplified and unified interface to interact with various types of bank accounts. By encapsulating the creation and management of different account types, the facade pattern abstracts the complexities from the customer.


## 5. UML Diagram <a name= "uml-diagram"></a>
![UML Diagram](/uml_diagram.png)

## 6. How to Use <a name="how-to-use"></a>
To use this project, follow these steps:
1. Compile all the Java files.
2. Run the `Customer` class, which demonstrates the use of the `BankService` facade to create accounts, perform transactions, and check balances.

## 7. Conclusion <a name="conclusion"></a>
This project showcases the implementation of the Facade design pattern in a banking system with multiple account types. It provides an organized and simplified interface for customers to manage their accounts, making it easier to extend and maintain the system in the future. The use of interfaces and classes adheres to Object-Oriented Design principles, promoting modularity and code reusability.
