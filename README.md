# College-Hustlers
CECS 343 Group Project Fall 2017

To run the game (for now), in Command Prompt, type "java bin.main.classes.GameView" (without quotations)

Team Members: Haydn Pang, Arjun Chawla

Changes from last push
- Separated available room list in ControlView into its own method
- Added popup when a room isn't selected when move is clicked
- Merged all players and AI into PlayerModel[] array

TO-DO List (Iteration 2)
- Player's Hand function 
    - Display Player's Hand (done)
    - Initialize with 5 cards 
- Deck is randomized (Done)
    - Reshuffled when deck runs out
- Buttons
    - Draw Card (Done)
        - Move and Play Card button is grayed initially until Draw Card is clicked (Done)
        - Top card of deck is added to hand (Done)
        - Card display first card in hand (Done)
        - Button is grayed after card is drawn, enable Move and Play Card button (Done)
    - Play Card (Done)
        - Plays the card displayed (Done)
        - Change card displayed to the next card in hand 
        - Disabled after card played (Done)
    - Move Card (Done)
        - Disabled after 3 moves (Done)
- Card class
    - Each card is a child of a parent Card class (Done)
    - Override "play" method in child class (In progress)
    - Cardm09 needs Dialog to choose whether player wants to discard a card for an additional Learning Chip
    - Cardm12 needs to teleport to Lactation Lounge when success
    - Cardm13 needs to teleport to Lactation Lounge when success
    - Cardm16 needs to teleport to Room Of Retirement when fail
    - Cardm22 needs to teleport to Lactation Lougne when fail
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
