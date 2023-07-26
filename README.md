# Rock Paper Scissors Game

This is a simple console-based Java application that allows you to play the
classic Rock Paper Scissors game against the computer.

The rules of Rock Paper Scissors are simple:

- Rock beats Scissors
- Scissors beats Paper
- Paper beats Rock

```sh
____________________________
Options to choose from :
1.ROCK
2.PAPER
3.SCISSORS
____________________________
You can type either name or number of your choice. To quit type q or quit!

Please make your choice: 
```

The computer will randomly select its move, and the result of the round will be displayed.

After showing the result, the menu will reappear after a 3-second delay, allowing you to play again.

The game will keep running until you choose to quit by typing 'q' or 'quit'.

Once you made your choice you will see handshaking with a countdown and the result will be printed to the console.

Output for winner player

```sh
____________________________
Options to choose from :
1.ROCK
2.PAPER
3.SCISSORS
____________________________
You can type either name or number of your choice. To quit type q or quit!

Please make your choice: paper
HAND SHAKING...3...2...1...!

Computer decision is ROCK ✊, your choice was PAPER ✋🏻. You WON! 🎊 
```

Output for Tie

```sh
____________________________
Options to choose from :
1.ROCK
2.PAPER
3.SCISSORS
____________________________
You can type either name or number of your choice. To quit type q or quit!

Please make your choice: rock
HAND SHAKING...3...2...1...!

Computer decision is ROCK ✊, your choice was ROCK ✊. TIE! 🤝
```

Output for invalid input

```sh
____________________________
Options to choose from :
1.ROCK
2.PAPER
3.SCISSORS
____________________________
You can type either name or number of your choice. To quit type q or quit!

Please make your choice: baran
You type invalid input please choose a valid option from menu!
```

### How to Compile and Run

To compile the application, you need to have Java Development Kit (JDK) installed on your system.
If you clone from github, please follow below commands on terminal
<pre>
git clone https://github.com/baranozoglu/rockpaperscissors.git
cd rockpaperscissors/src
javac RockPaperScissors.java
java RockPaperScissors
</pre>

If you downloaded zip file, please follow below commands on terminal
<pre>
unzip rockpaperscissors.zip 
cd rockpaperscissors/src
javac RockPaperScissors.java
java RockPaperScissors
</pre>

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
