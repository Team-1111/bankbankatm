# Group Project- ATM

## Lets finish this project step by step with timeline

First I want write everything in word file which is explanation or details of the diagram.

Cant we draw UML Diagram using Visual_Paradigm?

1. System analysis: study, understand, and define requirements for the system (model of the system's functional requirements) 
2. Defining the boundaries of the problem 
3. Use-case model 
4. Deployment view 
5. Sequence diagram and operation
6. Design to code (UML design diagram)

This is our final group project of Object Oriented Programming and Analysis subject. Our project is to build a bank ATM software system. In this document we will try to explain the requirements and functionality of the ATM system. In another word, we will analyse the system and try to make you to understand how we build the system and how it works for banks. It is obvious that ATM is part of bank so we will show the whole picture of Banking system but we will only focus on ATM system. Ofcause bank can operate without ATM but ATM is positive impact on bank and their income. Also, ATM will make easy for customers to make money transections. 

# 1. Introduction
Under indroduction we will explain the following areas. 
- Main Purpose of the project.
- Scope of the project
- Overview of whole system
- Definition of some of the important words we used in this documents and the system.

## 1.1 Purpose
This document mainly decribes the software requriements and functionality of the ATM machine. And we will build the software system for ATM. It is intended for the designer developer and maintainer of the ATM. Also if any bank which dont have ATM services we might be able to sell the software or work for them to build a ATM system. 

![](giphy.gif)
Example of how customers use this system
![](giphys.gif)

## 1.2 Scope
The function of the ATM is to support a computerized banking network.

## 1.3 Overview
The remainder of this document is organized as follows. There will be some definitions of important terms. Section 2 contains a general description of the ATM. Section 3 identies the specic functional requirements the external interfaces and performance requirements of the ATM.

## 1.4 Definitions
- ATM : An Automatic Teller Machine (ATM) is a computer based machine, connected to a network, that offers, as basic functions to users, access to bank account (balance, bank transfers) and retrieval of money.

- Cash Card : A card assigned to a bank customer that authorizes access to accounts using an ATM machine Each card contains a bank code and a card numbers, coded in accordance with national standards on credit cards and cash cards The bank code uniquely identities the bank within the consortium The card number determines the accounts that the card can access A card does not necessarily access all of a customer's accounts Each cash card is owned by a single customer, but multiple copies of it may exist, so the possibility of simultaneous use of the same card from different machines must be considered.

- Bank : An establishment authorized by a government to accept deposits, pay interest, clear checks, make loans, act as an intermediary in financial transactions, and provide other financial services to its customers.

- Bank computer : The computer owned by a bank that interfaces with the ATM network and the bank's own cashier stations. A bank may actually have its own internal network of computers to process accounts, but we are only concerned with the one that interacts with the network.

- Account: A single account in a bank against which transactions can be applied. Accounts may be of various types with at least checking and savings. A customer can hold more than one account.

- Customer: The holder of one or more accounts in a bank. A customer can consist of one or more persons or corporations, the correspondence is not relevant to this problem. The same person holding an account at a different bank is considered a different customer

- Transaction : (TB) can be defined as the set of instruments and services that a bank offers to trading partners to financially support their reciprocal exchanges of goods (e.g.trade), monetary flows (e.g., cash), or commercial papers (e.g., exchanges)

# 2. General Description

## 2.1 Product Perspective
The ATM network doesn't work independentlyIt has to work together with the computers software owned by banks. There are clearly defined interfaces for the different systems

## 2.2 Product Functions
The software should support a computerized banking network Each bank provides its own computer to maintain its own accounts and process transactions against them. Automatic teller machines communicate with the banks, computers. An automatic teller machine accepts a cash cards interacts with the users communicates with the bank computer to carry out the transactions dispenses cash and prints receipts. The system requires appropriate record keeping and security provisions. The system must handle concurrent access to the same account correctly. The banks will provide their own software for their own computers. The cost of the shared system will be apportioned to the banks according go the number of customers with cash cards.

## 2.3 User Characteristics
- Customer
The customer interacts with the ATM network via the ATM. It must be very easy for
them to use the ATM. They should be supported by the system in every possible way.

- Maintainer(IT Technician from Bank)
It should be easy to maintain the whole system. The maintainer should be the only
person that is allowed to connect a new ATM to the network.

# 3. Specic Requirements

## 3.1 Functional Requirements
The functional requirements are organized in two sections
- First requirements of the ATM
- Second requirements of the bank
## 3.1.1 Requirements of the ATM
The requirements for the ATM are organized in the following way: General requirements, requirements for authorization, requirements for a transaction.

## General
## Functional requirement 1
- Description
Initialize parameters t,k,m,n.  (t = Total fund in the ATM at start of day, k = Maximum withdrawal per day and account, m = mMximum withdrawal per transaction, n = Minimum cash in the ATM to permit a transaction)

- Input
ATM is initialized with t dollars k,m,n are entered.

- Processing
Storing the parameters.

- Output
Parameters are set.

## Functional requirement 2
- Description
If no cash card is in the ATM, the system should display initial display.

## Functional requirement 3
- Description
If ATM is running out of money, no card should be accepted. An error message is displayed.

- Input
A card is entered.

- Processing
The amount of cash is less than total fund in the ATM at start of day.

- Output
Display an error message Return cash card.

## Authorization
The authorization starts after a customer has entered his card in the ATM

## Functional requirement 4
- Description
The ATM has to check if the entered card is a valid cash-card.

- Input
Customer enters the cash card.

- Processing
Check if it is a valid cash card. It will be valid if
1) the information on the card can be read.
2) it is not expired.

- Output
Display error message and return cash card if it is invalid.

## Functional requirement 5
- Description
If the cash card is valid, the ATM should read the serial number and bank code.

- Input
Valid cash card.

- Processing
Read the serial number.

- Output
Initiate authorization dialog.

## Functional requirement 6
- Description
The serial number should be logged.

- Input
Serial number from cash card

- Processing
Log the number

- Output
Update to log file.

## Functional requirement 7
- Description
Authorization dialog : 
The user is requested to enter his password. The ATM verifies the bank code and password with the bank computer

- Input
Password from user, bank code from cash card.

- Processing
Send serial number and password to bank computer, receive response from bank.

- Output
Accept or reject authorization from bank.

