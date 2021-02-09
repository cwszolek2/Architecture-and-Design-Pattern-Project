# Software Architecture and Design Pattern Project
### Gas Pump Application

*Note - Weird naming conventions encouraged by professor - this is not endorsed by me - CW*

*This represents an early version, and could use additional exception handling, testing, and bug fixes*
For University class project:  
Chris Wszolek
Compiled in Java 12.0.1

This application represents an application of several design architectures and patterns,  
where the goal was to apply their usage to a working application.

Design Patterns and Architectures used:
- Model Drive Architecture - Extended Finite State Machine  
- Abstract Factory Pattern
- State Pattern
- Strategy Pattern

The working application resembled two different forms of gas pump software with different characteristics  
They used the same architecture, based on the extended finite state machine, where they offered different  
services and characteristics.  This is why there is children inheriting parents, where the childs are  
named 1 and 2 (for the two different types of gas pumps).  
Further details of each gas pump will be found in the supporting documents (in the '/report' folder).  
The project.exe file is the executable that will run each gas pump.  Please note the execution is slightly  
weird (per the professors desires) where each action has to be individually selected, and doesn't  
flow into one another as one may expect.  Further testing needs to be done full completion of this project.  



