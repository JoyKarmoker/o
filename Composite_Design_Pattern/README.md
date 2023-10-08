# Composite Design Pattern Assignment

## Overview

This Java program demonstrates the implementation of the Composite Design Pattern using an example of a building composed of generic housing structures. The assignment consists of three main components:

1. **IStructure Interface**: An interface that defines the overall type for both composite and leaf classes. It supports polymorphism by providing common methods and properties.

2. **Housing Class (Composite)**: Represents composite housing structures (e.g., buildings, floors) and manages their components.

3. **Room Class (Leaf)**: Represents individual housing structures (e.g., rooms) and implements the properties and behavior specific to leaf structures.

The program also includes functionality to calculate the area and volume of each housing structure, demonstrating the versatility and extensibility of the Composite Design Pattern.

## Components

### IStructure Interface

The `IStructure` interface defines the following methods and properties for both composite and leaf classes:

#### Methods

- `void enter()`: Represents entering the structure.
- `void exit()`: Represents exiting the structure.
- `void location()`: Displays the location details of the structure.
- `String getName()`: Retrieves the name of the structure.
- `double getArea()`: Calculates and returns the area of the structure.
- `double getVolume()`: Calculates and returns the volume of the structure.

### Housing Class (Composite)

The `Housing` class represents a composite housing structure (e.g., a building or floor) and manages its components using a collection. It implements the `IStructure` interface and provides methods for adding, retrieving, and calculating the area and volume of its components.

#### Properties

- `List<IStructure> structures`: A collection to store the components (composite or leaf) of the structure.
- `String address`: A string representing the address or name of the structure.

#### Methods

- `Housing(String address)`: Constructor for creating a new `Housing` object with a specified address.
- `int addStructure(IStructure component)`: Adds a component (composite or leaf) to the structure and returns its index.
- `IStructure getStructure(int componentNumber)`: Retrieves a specific component by its index.
- `void location()`: Overrides the `location` method to print location details of the structure and its components.
- `void enter()`: Overrides the `enter` method to print entering details of the structure.
- `void exit()`: Overrides the `exit` method to print exiting details of the structure.
- `double getArea()`: Calculates and returns the total area of the structure and its components.
- `double getVolume()`: Calculates and returns the total volume of the structure and its components.

### Room Class (Leaf)

The `Room` class represents a leaf housing structure (e.g., an individual room) and implements the properties and behavior specific to leaf structures. It also implements the `IStructure` interface.

#### Properties

- `String name`: A string representing the name of the room.
- `double area`: A double representing the area of the room.
- `double volume`: A double representing the volume of the room.

#### Methods

- `Room(String name, double area, double volume)`: Constructor for creating a new `Room` object with a specified name, area, and volume.
- `String getName()`: Overrides the `getName` method to get the name of the room.
- `void enter()`: Overrides the `enter` method to print entering details of the room.
- `void exit()`: Overrides the `exit` method to print exiting details of the room.
- `void location()`: Overrides the `location` method to print location details of the room.
- `double getArea()`: Returns the area of the room.
- `double getVolume()`: Returns the volume of the room.

### Main Class

The `Main` class demonstrates the use of composite and leaf structures to model a building. It creates a building with one floor containing a common room and two washrooms. The program then simulates entering and exiting various structures and calculates the total area and volume of the building and its components.

#### Methods

- `public static void main(String[] args)`: The main method creates housing structures, rooms, and demonstrates the use of the Composite Design Pattern to represent a building. It simulates entering and exiting structures and calculates the total area and volume of the building.

## Implementation

To implement the building using the Composite Design Pattern, structures are created and organized hierarchically. The building contains floors, floors contain rooms, and so on. The `Housing` class acts as a composite and can contain both other composite structures and leaf structures. The `Room` class represents leaf structures with specific properties like area and volume.

In the provided example, a building is created with one floor that contains a common room and two washrooms. The program demonstrates entering and exiting different structures and calculates the total area and volume of the building and its components.

The Composite Design Pattern allows for flexible and extensible composition of complex structures, making it suitable for modeling hierarchical relationships in various domains. This assignment showcases how the pattern enables the construction of a building from smaller housing structures while maintaining a consistent interface for both composite and leaf elements.

## Conclusion

The Composite Design Pattern is a powerful tool for creating structured, hierarchical representations of objects. It simplifies the management of complex structures, enhances code reusability, and allows for the seamless addition of new components. This assignment demonstrates its application in modeling housing structures, but its utility extends to a wide range of real-world scenarios where objects can be organized into composite structures.