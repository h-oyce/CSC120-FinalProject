# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
 - What **new thing(s)** did you learn / figure out in completing this project?
 - Is there anything that you wish you had **implemented differently**?
 - If you had **unlimited time**, what additional features would you implement?
 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.

I honestly learned a lot while working on this project. It was both fun and a lot of hard work. We initially designed our game to be too complex for our time limit, wanting the game to have multiple playable characters and multiple tools these players could use. We soon realized if we made all these options, we'd have almost 100 different paths and options's we'd have to code (4 rooms, 3 interactable objects, 3 tools, and 2 playable characters). We really learned the lesson of starting small and expanding from there as we had a lot of code we removed as we realized we wouldn'd have time to actually implement them. We should've started with a simplier model and made it more complex as we continued on. The best piece of feedback, which I wish I had listened to, was from one of the peer feedback classes. They had told me, "Wow, that's super cool, but you might want to reel it back before you get too complex." It was helpful, but I was too stubborn to really take it to heart. 

If I had unlimited time, I wouldve liked to expand the images. Currently we only have one image that prints at the beginning of the game. I think this is really cool, but we decided against adding more since the window that pops up can't be interacted with. It simply becomes a window the player must move or completely close before continuing. I would've liked to make the image pop up in the console so the player can still interact with the game in the terminal. I also would've like to make better use of the classes. We realized a lot of our code in the GameLoop would be shorter and more concise had we used the seperate classes more. I think the HauntedHouse knowing it's own rooms and the Rooms knowing their own objects would've made some things easier. There are definitly better ways we could have written the GameLoop to make it more concise and therefore easier to expand in the future. 

One design choice I want to justify is the action() method under the Object class. I think when in the context of the rest of our code, it would make sense for it to be in the GameLoop class as that is the class with almost every other print statement related to our story. We initially had it this way, however, after writing the first one, we realized we would have to copy the entire 20 line code chunk for all 12 objects. This is way too long and complicated. We decided to move it into the object class as a method that could be called in the GameLoop rather than living there. 

Our overall approach was to make our diagram pretty detailed so we'd have a pretty good idea on how the code should work. Our group had weekly meetings where we'd bring any notes of issues we ran into, especially logical ones. We would spend about 40 minutes discussing what work we did and helping each other, then the last 20 minutes we would assign ourselves tasks for the next week. We also reguarly texted and had a giant worklog which really helped. The worklog included notes from meetings and any notes people wanted to tell themselves or each other. Additionally, texting helped make sure we did not code over each other in the github by telling each other when pushes had been made. We only had 1 merge conflict which was really good. The group dynmaic really helped the project. We have all worked before we had an easier time as it was never awkward, and we know each other's coding style. It really helps me when I can sit down and ask if my approach makes sense, because often times I am making things more complicated than needed. 

A piece of advice I have for past me: Take the peer feedback sessions more seriously! They are genuinely so helpful. Also, a working project is better than an non-functional one. Perfect shouldn't be your goal! 


