# Homework, Week 1: Make Change

## Make Change Project

### Overview

This script simulates a very odd store where a cashier types in a total bill and how much money the customer has given them to pay it. It checks that this amount is at least as much as the total price of what's being bought (warning the cashier if it is not), and if the amount provided is not exact change tells the cashier what change to give to the customer.

### Topics
* Taking User Input
  - A scanner is created to take keyboard input. It gets two variables from the user and is closed at the end of the script.
* Casting
  - The user *can* enter a price to more than two decimal places, but everything smaller than hundredths of a dollar will be ignored when making change, because while the prices are collected as floating-point numbers they're cast to integers so that the calculation of what change to give (and what change components to not list in the output string) can be simplified using integer division.
* Methods
  - After the user has provided the required input, if it's determined that change has to be given, the separate method `calculateChange()` is called to determine what it is. The project doesn't require this, and there's no real need for it since it's only called once each time the script executes, but it does make the main method easier to read.
### How to Run

1. Compile the `MakeChange.java` class file with `javac` or load it in Eclipse or another IDE.
2. Run the file from the command line with `java MakeChange`, or with your IDE's run tools.
3. Enter the inputs requested by the program.
4. ~~PROFIT!~~ Look at console output for the answers you seek.
