# College-Hustlers
CECS 343 Group Project Fall 2017

To run the game (for now), in Command Prompt, type "java bin.main.classes.GameView" (without quotations)

Team Members: Haydn Pang, Arjun Chawla

Changes from last push
- Separated available room list in ControlView into its own method
- Added popup when a room isn't selected when move is clicked
- Merged all players and AI into PlayerModel[] array
TO-DO List (Iteration 2)
- Card Hand function (for player)
    - Initialize with 5 cards
- Deck is randomized
    - Reshuffled when deck runs out
- Buttons
    - Draw Card
        - Move and Play Card button is grayed initially until Draw Card is clicked
        - Top card of deck is added to hand
        - Card display first card in hand
        - Button is grayed after card is drawn, enable Move and Play Card button
    - Play Card
        - Plays the card displayed
        - Disabled after card played
    - Move Card
        - Disabled after 3 moves
- Card class
    - Each card is a child of a parent Card class
    - Override "play" method in child class
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
