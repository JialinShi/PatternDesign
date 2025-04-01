# PatternDesign
OOD - Design Patterns

# 🎯 Head First Design Patterns – Java Implementation (Project Overview)

This repository contains clean, chapter-by-chapter Java implementations of all major design patterns covered in *Head First Design Patterns*.  
Each pattern is organized into its own package for easy access, quick reference, and hands-on learning.

Ideal for:

- Reviewing OOP design principles
- Interview preparation
- Applying patterns in real-world projects

---

## 📁 Project Structure: Patterns & Packages

| Package Name | Pattern | Type | Description |
|--------------|---------|------|-------------|
| `strategy` | Strategy | Behavioral | Encapsulates interchangeable behaviors and uses delegation to decide which one to use at runtime (e.g., Duck flying/quacking behavior). |
| `observer` | Observer | Behavioral | One-to-many notification system—when one object changes state, all dependents are updated (e.g., Weather Station). |
| `decorator` | Decorator | Structural | Adds responsibilities to objects dynamically without altering their structure (e.g., coffee + condiments). |
| `factory` | Factory Method & Simple Factory | Creational | Delegates object creation to subclasses or helper classes (e.g., Pizza Store). |
| `singleton` | Singleton | Creational | Ensures a class has only one instance and provides global access to it (e.g., Config Manager). |
| `command` | Command | Behavioral | Encapsulates a request as an object, allowing for parameterization, queuing, and undoable operations (e.g., Remote Control). |
| `adapter` | Adapter | Structural | Translates one interface into another to make incompatible interfaces compatible. |
| `facade` | Facade | Structural | Provides a simplified interface to a complex subsystem (e.g., Home Theater system). |
| `template` | Template Method | Behavioral | Defines the skeleton of an algorithm, letting subclasses fill in the blanks. |
| `iterator` | Iterator | Behavioral | Provides a way to access elements of a collection sequentially without exposing the underlying structure. |
| `composite` | Composite | Structural | Composes objects into tree structures to represent part-whole hierarchies (e.g., menus with submenus). |
| `state` | State | Behavioral | Allows an object to alter its behavior when its internal state changes (e.g., Gumball Machine). |
| `proxy` | Proxy | Structural | Provides a surrogate or placeholder for another object to control access to it (e.g., remote object access). |
| `compound` | Compound (MVC, Observer, Composite, etc.) | Mixed | Combines multiple patterns into a unified system—used in the final chapter to build a flexible Duck Simulator. |

---

## 🛠 How to Use

- Open the project in IntelliJ IDEA or any Java IDE.
- Browse the `src/` folder → select the desired pattern package.
- Each pattern contains:
    - Core interfaces & classes
    - Realistic examples
    - Console outputs for behavior illustration

---

## 📚 Reference

All implementations are based on examples and principles from:  
**Head First Design Patterns, 2nd Edition** – by Eric Freeman, Elisabeth Robson, et al.

---

## 🙌 Credits

Built as a learning project and reference toolkit for mastering design patterns with Java.  
Feel free to explore, fork, or enhance!


