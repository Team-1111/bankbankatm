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

## Introduction
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
