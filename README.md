# CodeSmash-Hackaton-2023

The CodeSmash-Hackaton-2023 repository is created for the 2023 CodeSmash Hackathon event. The repository contains code for a solution to a problem provided by the Hackathon organizers to enter the event. The solution code is written in Java.

### Problem statement
A company is running a promotion in which buyers receive prizes for purchasing a secret combination of
fruits. The combination will change each day, and the team running the promotion wants to use a code
list to make it easy to change the combination. The code list contains groups of fruits. Both the order of
the groups within the code list and the order of the fruits within the groups matter. However, between
the groups of fruits, any number, and type of fruit is allowable. The term "anything" is used to allow for
any type of fruit to appear in that location within the group.

Consider the following secret code list: [[apple, apple], [banana, anything, banana]]

Based on the above secret code list, a buyer who made either of the following purchases would win the
prize: orange, apple, apple, banana, orange, banana apple, apple, orange, orange, banana, apple,
banana, banana

Write an algorithm to output 1 if the buyer is a winner else output 0.

- **Input** - The input to the function/method consists of two arguments: codeList, a string array of
space-separated values representing the order and grouping of specific fruits that must be
purchased in order to win the prize for the day. shoppingCart, a list representing the order in
which a buyer purchases fruit.

- **Output** - Return an integer 1 if the buyer is a winner else return 0.

Note "anything" in the codeList represents that any fruit can be ordered in place of "anything" in the
group. "anything" has to be something, it cannot be "nothing". "anything" must represent one and only
one fruit. If the secret code list is empty then it is assumed that the buyer is a winner.

Please provide written explanation of your approach.

##### BONUS
Provide time and space complexity of your approach.

### Approach Explanation
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
### Example input 
```java
2  // number of codes
banana apple orange // first code
kiwi // second code
apple apple banana apple orange orange kiwi orange // shopping cart
```

### Space and time complexity
For space and time complexity of the solution check this [link](https://github.com/EmreArapcicUevak/CodeSmash-Hackaton-2023/issues/3).
