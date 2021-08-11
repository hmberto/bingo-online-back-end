# Sec4you's Bingo Online - Java API. Maven Jetty plugin

Backend to generate and record the cards for Bingo Online.

## How it Works
Before each game, the player chooses how many cards he wants to use (maximum 4) simultaneously. When the game starts the numbers are drawn one by one and the player must check if they are on his card.

## Resources
* **GET**: This request is capable of generating an ID and a set of 24 random numbers between 1 and 75 to load the game. These numbers are stored in a database along with the game ID.

### Variables:
In **./properties/data.properties** correctly fill your SQL database connection data.

### Database:
~~~
CREATE DATABASE bingo_sec;

CREATE TABLE bingo(
id int(6) NOT NULL,
jogo varchar(100) NOT NULL,
PRIMARY KEY (id)
);
~~~

### Run:
~~~
mvn package jetty:run
~~~

## Why? 
Bingo Online was created for recreational purposes for use among friends during an online June party. The game consists of the production of cards with 24 numbers between 1 and 75 and the subsequent drawing of these.

## Built With
* [Java](https://www.java.com/) - v1.8
* [Maven Jetty Plugin](https://wiki.eclipse.org/Jetty/Feature/Jetty_Maven_Plugin) - v6.1.26
