# Rock Paper Scissors Game

Welcome to the Rock Paper Scissors game! This is a simple console-based Java application that allows you to play the
classic Rock Paper Scissors game against the computer.

#### Gameplay Rules

The rules of Rock Paper Scissors are simple:

- Rock beats Scissors
- Scissors beats Paper
- Paper beats Rock

### Rock Paper Scissors

![](/Users/baranozoglu/Documents/projects/git/RockPaperScissors/resources/Screenshot 2023-07-26 at 18.22.38.png)
The computer will randomly select its move, and the result of the round will be displayed.

After showing the result, the menu will reappear after a 3-second delay, allowing you to play again.

The game will keep running until you choose to quit by typing 'q' or 'quit'.

Once you made your choice you will see handshaking with a countdown and the result will be printed to the console.
![](/Users/baranozoglu/Documents/projects/git/RockPaperScissors/resources/Screenshot 2023-07-26 at 18.23.06.png)

### Design Pattern

I have chosen a design pattern as Factory Design Pattern to be able to easily extend the game if we want in the future.

- Encapsulation of Creation Logic: The Factory Design Pattern helps us encapsulate the logic for creating gestures
  within a separate factory class (GestureFactory). This centralizes the decision-making process for gesture creation,
  making the code easier to manage.

- Interface with 'beats' Method: The Gesture interface enforces the implementation of the beats method in all gesture
  classes (Rock, Paper, Scissors). This method is crucial for determining the game's winner.

- Extensibility: Using the Factory Design Pattern allows us to add new gestures easily by creating new classes that
  implement the Gesture interface. This approach ensures that the main game logic remains loosely coupled with the
  concrete gesture classes, promoting scalability and maintainability.

In summary, the Factory Design Pattern simplifies gesture creation, ensures the presence of the necessary beats method
in all gestures, and makes the game easily extensible for future additions or changes.

### How to Compile

To compile the application, you need to have Java Development Kit (JDK) installed on your system. Follow the steps below
to compile the code:

Open a terminal or command prompt.
Navigate to the directory where the 'RockPaperScissors.java' file is located.
Use the javac command to compile the source code:

- javac RockPaperScissors.java

The compilation will generate the 'RockPaperScissors.class' file.

### How to Run

Once the application is compiled, you can run it using the following steps:

In the same terminal or command prompt, enter the following command:

- java RockPaperScissors

The game will start, and you will see the following menu:
markdown