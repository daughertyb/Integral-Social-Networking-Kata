Integral Social Networking Kata

Summary: 

Contains core logic for a social networking application similar to twitter. Features include publishing a message to a personal timeline, viewing other timelines by user and viewing other timelines based on users followed (future). 

How to View:

Developed using Java. 
Code can be found in java > src > main/java/kata and in java > src > test/java/kata. 
Features can be demonstrated by running the 7 tests in KataTest.java as JUnit Test. 

Approach: 

Used OOP and MVC principles to architect applicatiion code. You will find 3 main packages illustrating this: App, Model, Services. In Services you will find a class called MockDatabase. This class is meant to provide a source for data to demonstrate the features. This was done to minimize steps required for the evaluator to see feature logic. A database would have been used if this were a real world scenario with a larger timeframe. 

There were 2 main object blueprints used: Timeline.java and User.java. As well as 2 main services: Publish.java and ManageTimeline.java which were broken out by functionality. Demonstrating as much functionality as possible while following TDD was prioritized over user interface. You will also notice the 3rd feature - View Timeline based on users followed was not completed. This was left unfinished to stay true to the 2 hour limit. I'd love to discuss how I would have approached the UI as well as the final feature given more time. 

