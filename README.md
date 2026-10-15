# Java Library Management System (Bibliothek)

An object-oriented Java application implementing a comprehensive library management and lending system based on a robust UML class diagram architecture.

## 🚀 Key Features
* **Inventory Management:** Tracks various media types including books (`Buch`), magazines (`Zeitschrift`), and electronic books (`EBook`), complete with details like publishers (`Verlag`), binding types (`Einband`), authors, and ISBNs[cite: 4].
* **Lending Operations (`Verleihvorgang`):** Manages loans between borrowers (`Person`), lenders, and library items, recording lending timestamps, return dates, and active transaction records[cite: 4].
* **Custom Date & Time Handling:** Implements specialized classes for handling dates (`Datum`), time (`Zeit`), and combined timestamps (`DatumZeit`)[cite: 4].
* **Search & Comparison Interfaces:** Implements the `Vergleichbar` interface to support item comparisons by ISBN or title[cite: 4].
* **Persistence Support:** Includes features for loading and saving library system states via file input/output handling[cite: 4].

## 🛠️ Tech Stack & Architecture
* **Language:** Java
* **Design Patterns & Principles:** 
  * Object-Oriented Programming (OOP) principles including inheritance, encapsulation, and composition.
  * Abstract classes (`Medium`) and interfaces (`Vergleichbar`)[cite: 4].
  * Enumerated types (`Einband`) for standardized categories like LEINEN, HALBLEINEN, PAPPBANDE, and KARTON[cite: 4].

## 💻 Class Diagram Overview
The system architecture models the following core relationships:
* **`Bibliothek`** acts as the central aggregator containing arrays of media inventory (`Medium[]`) and lending transactions (`Verleihvorgang[]`)[cite: 4].
* **`Medium`** serves as the abstract base class inherited by **`Buch`**, **`Zeitschrift`**, and **`EBook`**[cite: 4].
* **`Person`** and **`Adresse`** handle user profiles and location details associated with publishing and borrowing[cite: 4].
