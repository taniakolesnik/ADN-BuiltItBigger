package uk.co.taniakolesnik.jokegeneratorjavalibrary;
import java.util.ArrayList;

public class JokeGenerator {

    public String getJoke(){

        // Jokes were borrowed from http://pun.me/pages/funny-jokes.php
        String joke;
        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("Today at the bank, an old lady asked me to help check her balance. So I pushed her over.");
        jokes.add("I bought some shoes from a drug dealer. I don't know what he laced them with, but I've been tripping all day.");
        jokes.add("I told my girlfriend she drew her eyebrows too high. She seemed surprised.");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");
        jokes.add("I'm so good at sleeping. I can do it with my eyes closed.");
        jokes.add("My boss told me to have a good day.. so I went home.");
        jokes.add("Why is Peter Pan always flying? He neverlands.");
        jokes.add("Why do blind people hate skydiving? It scares the hell out of their dogs.");
        jokes.add("When you look really closely, all mirrors look like eyeballs.");
        jokes.add("My friend says to me: &quot;What rhymes with orange&quot; I said: &quot;No it doesn't&quot;");
        jokes.add("What do you call a guy with a rubber toe? Roberto.");
        jokes.add("What did the pirate say when he turned 80 years old? Aye matey.");
        jokes.add("My wife told me I had to stop acting like a flamingo. So I had to put my foot down.");
        jokes.add("I couldn't figure out why the baseball kept getting larger. Then it hit me.");
        jokes.add("Why did the old man fall in the well? Because he couldn't see that well.");
        jokes.add("I ate a clock yesterday, it was very time consuming.");
        jokes.add("Whatdya call a frenchman wearing sandals? Phillipe Phillope.");

        int lowJokeId = 0;
        int upperJokeId = jokes.size() - 1;
        int randomJokeId = (int) (Math.random() * (upperJokeId - lowJokeId)) + lowJokeId ;
        return jokes.get(randomJokeId);
    }
}
