# IponTracker: A Personal Finance Tracker
Java OOP project by Real 3ggaz from Outer Space

**Description / Overview**

  The IPON Tracker is a console-based Java application designed to help users manage their personal finances with a Savings-First approach.

  The system prioritizes savings before any other financial activity, ensuring users develop strong saving habits before recording expenses or setting financial goals.

The program allows users to:

  *Create and manage multiple savings accounts

  *Record expenses under a specific savings account

  *Set goals related to each savings account

  *View a complete hierarchical summary showing savings as the top priority

  *This project demonstrates a clean and well-structured application of Object-Oriented Programming (OOP) concepts.

**OOP Concepts Applied**
  
1. Encapsulation

    *All class fields are declared private to protect the data.

    *Access is controlled using getters and setters.

    *Examples: balance, amount, goalAmount are private fields accessed safely through methods.

2. Inheritance

    *SavingsAccount, Expense, and Goal all inherit from the abstract superclass FinancialItem.

    *Common attributes (id, description, date) and behaviors are reused through inheritance.

2. Polymorphism

    *The displayDetails() method is defined abstractly in FinancialItem and overridden in each subclass.

    *When iterating through expenses or goals, the correct version of displayDetails() is automatically executed depending on the object’s type.

3. Abstraction

    *The FinancialItem class represents a general financial record.

    *It cannot be instantiated and serves only as a template for more specific financial item types.

4. Composition (Has-A Relationship)

    *A SavingsAccount has expenses and goals.

    *This makes Savings the core structure of the program, reinforcing the savings-priority system.

**Program Structure**
  
  *Main Classes*

1.FinancialItem (abstract)
  *Stores shared attributes: ID, description, date. Declares abstract displayDetails().

2.SavingsAccount (primary class)

  *Contains balance, interest rate.

  *Contains lists of Expense and Goal objects.

  *Provides methods for adding expenses, updating progress, and applying interest.

3.Expense
  *Represents spending transactions linked to a SavingsAccount.

4.Goal
  *Represents savings objectives, each belonging to a specific savings account.

5.FinancialTracker (Main Program)

  *Handles user menu

  *Manages Savings Accounts

  *Enforces the rule: Savings must be created first before expense/goal actions

**Class Relationship Diagram (Text-Based)**

                    +---------------------+
                    
                    |   FinancialItem     |
                    
                    |---------------------|
                    
                    | id                  |
                    
                    | description         |
                   
                    | date                |
                    
                    |---------------------|
                   
                    | +displayBasicInfo() |
                    
                    | +displayDetails()   |
                   
                    +---------+-----------+
                             
                              |
       
       -------------------------------------------------
       
       |                      |                        |

+-------------+     +----------------+        +----------------+

| SavingsAcct |     |    Expense     |        |      Goal      |

|-------------|     |----------------|        |----------------|

| balance     |     | amount         |        | goalAmount     |

| interest    |     | category       |        | currentProgress|

| expenses[]  |     +----------------+        +----------------+

| goals[]     |

+-------------+

**How to Run the Program**
Step 1 — Compile the Files

Make sure all .java files are in the same folder.
Then run:

javac *.java

Step 2 — Run the Program
java FinancialTracker

Requirements

Java 8 or higher

Console/terminal environment

**Sample Output**

=== IPON TRACKER (SAVINGS-PRIORITY) ===

[1] Add Savings Account (Required First)

[2] Add Expense to Savings

[3] Add Goal to Savings

[4] View Summary

[0] Exit

Enter choice: 1


Savings ID: SA01

Description: Main Savings

Balance: 5000

nterest Rate: 2.5

Savings account added successfully!


=== OVERALL SUMMARY (SAVINGS PRIORITY) ===


=== SAVINGS ACCOUNT (PRIORITY) ===

ID: SA01

Description: Main Savings

Date: 2025-11-27

Balance: ₱5000.0

Interest Rate: 2.5%


--- EXPENSES UNDER THIS SAVINGS ---

No expenses.

--- GOALS UNDER THIS SAVINGS ---

No goals.

-------------------------------------

7. Author and Acknowledgement

Author: [Your Name]

Course: Object-Oriented Programming
