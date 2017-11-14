# College-Hustlers
CECS 343 Group Project Fall 2017

To run the game (for now), in Command Prompt, type "java bin.main.classes.GameView" (without quotations)

Team Members: Haydn Pang, Arjun Chawla

Changes from last push
- Added up to Cardm29

TO-DO List (Iteration 2)
- Player's Hand function 
    - Initialize with 5 cards 
- Deck is randomized (Done)
    - Reshuffled when deck runs out
- Card class
    - Override "play" method in child class (In progress)
    - Cardm09 needs Dialog to choose whether player wants to discard a card for an additional Learning Chip
    - Cardm12 needs to teleport to Lactation Lounge when success
    - Cardm13 needs to teleport to Lactation Lounge when success
    - Cardm16 needs to teleport to Room Of Retirement when fail
    - Cardm22 needs to teleport to Lactation Lounge when fail
    - Cardm23 needs Dialog to choose a Chip of Choice
    - Cardm25 needs Dialog to choose a Chip of Choice
    - Cardm27 needs Dialog to choose a Chip of Choice
    - Cardm28 needs Dialog to choose a Chip of Choice
    - Cardm29 needs to teleport to Student Parking when fail
- Information Panel
    - Dimensions: 2/3 right width, 2/3 top height
    - Displays each player's info
        - Name
        - Chip count for each type
            - Learning
            - Craft
            - Integrity
        - Cards in deck: remaining cards in deck
        - Discards out of play: cards played
        - Who the human player is and room the player is currently in
- Current Play Panel
    - Dimensions: 2/3 right width, 1/3 top height
    - Displays the following after each played card
        - [Player] "played" [card name] ("for" [reward] | "failed")
- AI Player move and play card
- Dialog for discarding card
- Dialog for selecting Skill Chip
