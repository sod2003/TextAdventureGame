# Project Title

This is a text adventure game for Project 1 of the Skillstorm VET TEC Java course.

## Demo

All files are located within the *com.skillstorm.adventure* package. Execute Main to run.

## Organization of Code

### Classes
- **GameRunner** -  contains an instance of the Player, ScenarioHandler, and BattleHandler classes.

- **BattleHandler** - used for handling battle functionality, and tracks battle stats.

- **ScenarioHandler** - used for generating and interacting with Scenarios and their enemies.

- **Scenario** - used for representing a single Scene, to include its title, description and enemy.

- **Treasure** - used for representing pieces of treasure/inventory.

- **Actor** - super class to the Player and Enemy classes, carrying shared stats and methods.

- **Enemy** - used to represent a single enemy in the game.

- **Player** - used for representing the player's character in game.

- **CharacterCreation** - used to seperate the character creation logic from the other game elements.

### Structure
![UML diagram of software architecture]()

## Roadmap
- [ ] Finish the points calculation for scoring game session.
- [ ] Add more complex stats to the **Actor** class.
- [ ] With prior addition of more stats, make combat resolution more complicated.
- [ ] Add more potential scenes within the **ScenarioHandler**.
- [X] Add ability to randomly generate scenes for game.
- [ ] Add a UML diagram under the [**Structure**](#structure) title.

## Lessons Learned
Starting from scratch is hard. I definitely struggled with the idea of the finished product, which made building out this project a bit of a slow grind. I jumped into code first, having a slight idea of what I wanted and how to structure it. I quickly learned I made decisions early on that limited how I could implement the *good ideas* that popped into my head later on.

## Appendix

[My Markdown editor](https://readme.so/editor)

[Markdown cheat sheet](https://www.markdownguide.org/cheat-sheet/)