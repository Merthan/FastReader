package com.gmail.me2development.fastreader.ui.model

object LargeText {
    var originalText:String=""
    set(value){
        field=value
        //wordList= value.split(regex=Regex("\\P{L}+"))//value.split("\\P{L}+")
        wordList=value.split(Regex(" "))
    }
    //change if original changes
    var wordList:List<String> = emptyList()

    init {
        originalText=


                    "Hey are all words shown here?"//futuramaEpisode1
                    .trimIndent()
                    .replace("\\s+".toRegex(), " ")
                    .replace("-","")
    }





}


const val futuramaEpisode1="""Space: it seems to go on and on forever.
But at the end, a gorilla throws barrels at you.
- That's how you play the game.
- You stink, loser.
Fry! Pizza going out.
Come on! Michelle! Baby! Where you going? It's not working out, Fry.
I put your stuff out on the sidewalk! I hate my life.
I hate my life.
Happy New Year! Hello? Pizza delivery for "I.
C.
Wiener.
" Oh, crud! I always thought I'd be the one making the crank calls.
Here's to another lousy millennium.
Ten! One! What the-? My God.
It's the future.
My parents, my co-workers, my girlfriend.
I'll never see any of them again.
Yahoo! Space Pilot 3000 Welcome to the world of tomorrow! Why do you always say it that way? Haven't you ever heard of showmanship? Come, your destiny awaits! Have a nice future.
Cool, just like in Star Trek.
Ow! Good afternoon, sir.
Hmmmmm! - Name? - Fry.
I'm Leela.
It's New Year's Eve so I'd like to decide your fate and leave.
- Can I ask you a question? - If it's not about my eye.
- Is it about my eye? - Sort of.
- Ask the question.
- What's with the eye? I'm an alien.
Let's drop the subject.
Cool! An alien! Has your race taken Earth? No, I just work here.
Wait a minute.
Is that blimp accurate? Yep.
It's December 31 st, 2999.
My God! A million years! I'm sure this must be upsetting for you.
You know, it should be, but actually, I'm glad.
I had nothing to live for before.
I was broke I had a humiliating job and I think my girlfriend was cheating on me.
Here you'll be treated with dignity.
Strip naked and get on the probulator.
Interesting.
Your DNA test shows one living relative.
He's your great-great-great- great-great-nephew.
Great! What's the little guy's name? Professor Hubert Farnsworth.
Ugh! I'm the luckiest guy in the whole future.
I've got a second chance, and this time I won't be a total loser.
- What's that? - Your career assignment.
Delivery boy? No! Not again! - Anything else.
- Take your hands off me! Everyone is given the job they're best at.
- What if I refuse? - You're fired.
- Fine.
- Out of a cannon into the sun.
I don't like being a delivery boy! Tough.
Most people don't like their jobs, but we do them anyway.
You gotta do what you gotta do.
Hold out your hand.
I'll implant your career chip.
It'll label you a delivery boy.
Keep that away from me! Hold still! I don't have good depth perception.
You've got till five to let me out of here.
One- See you in a thousand years.
Oh! You owe me one.
Whoa! Radio City Mutant Hall.
Cool! Cross-town express? Woo hoo! Ha, ha, ha! Tourist.
A phone booth.
I can call my nephew.
Whoa! A real live robot.
Or is that a cheesy New Year's costume? Bite my shiny metal ass.
- It doesn't look shiny.
- Shinier than yours, meat bag.
Listen, I'm in a hurry.
Let's try for a twofer.
Please select mode of death.
"Quick and Painless" or "Slow and Horrible.
" I'd like to place a collect call.
You have selected Slow and Horrible.
Good choice! Bring it on, baby! Come on! Come on! Kill me already! - My name's Bender.
- Help! What's happening? You are dead.
Thanks for using Stop and Drop.
America's favorite suicide booth since 2008.
Lousy, stinking rip-off.
I didn't have any other plans.
Let's go get drunk! two, three- Hey! Welcome to the world of tomorrow! Shut up, Terry.
This is unacceptable, Leela.
You must find Mr.
Fry and install his chip.
He doesn't want to be a delivery boy.
I'd rather not force him.
That's your job, like it or not.
It's my job to make you do your job, like it or not.
Which I do! Very much! Now get to work.
Life is good.
- Why would a robot need to drink? - I don't need to.
I can quit any time I want.
So they made you a delivery boy? That's as bad as my job.
- What do you do? - I'm a bender.
I'm programmed to bend girders.
- You any good at it? - You kidding? I was a star.
I could bend a girder to any angle.
You name it.
31 But I couldn't go on once I found out what they were for.
- What? - Suicide booths.
Fry, it was a pleasure meeting you.
- I'm gonna kill myself.
- Wait! You're my only friend.
- You really want a robot for a friend? - Ever since I was six.
Okay, but I don't want people thinking we're robosexuals.
So if anyone asks, you're my debugger.
Oh, no.
It's the cyclops.
- Don't look! Don't look! - I'm not looking.
- Officer 1 B-Dl, requesting backup.
- We'll be there in five minutes.
We can hide in here! It's free on Tuesdays! Welcome to the Head Museum.
I'm Leonard Nimoy.
Spock?! Do the thing.
- I don't do that anymore.
- This is unbelievable! What do you do all day? We share our wisdom with those who seek it.
It's a life of quiet dignity.
Feeding time! I'm sorry, but I have to install your chip.
Why do it if you're sorry? It's my job.
You gotta do what you gotta do.
Whoa! Watch it! That's it.
You just made my list! Down boy! Bad president! All right, buddy.
Step away from the head.
I'm gonna get 24th-century on his ass.
Please, officers! There's no need to use force.
Let us handle this, weirdy.
Come on.
He's just a poor kid from the Stupid Ages.
- Keep your big nose out, Eyeball.
- No one makes fun of my nose.
Yee-ah! - Damn.
- You guys were totally out of control.
That's our job.
We're peace officers.
You know the law.
"You gotta do what you gotta do.
" Oh! We're trapped! Wait! You're a bender, right? We can get out if you bend the bars.
Dream on, skin-tube! I'm programmed to bend for constructive purposes.
- Do I look like a de-bender? - Who cares about your program? If programmed, would you jump off a bridge? I'll have to check my program.
Yep! Open up! - Come on, Bender.
Make your own decisions.
It separates people and robots from animals - and animal-robots.
- You're full of crap, Fry! You make a persuasive argument, Fry.
Come on, Bender! You can do it! Can't.
I can't do it! Yes! You were right.
From now on, I'm going to bend what I want when I want, who I want.
I'm unstoppable! I don't know how you did that.
- Wait! - No thanks! Looks like one of us will have to bend this grate.
Aw! Good Lord! What is this? It's the decaying ruins of old New York.
Welcome home, pal.
It's my old neighborhood.
Man, this brings back memories.
Keep them to yourself.
This is where I brought my girlfriend on our first date.
My God! She's gone.
Everyone I ever knew or cared about is gone.
There's someone you know.
Can't you leave me alone? I'm miserable enough already.
I know it's not much consolation, but I understand how you feel.
- You don't.
I've no home, no family.
- No friends.
My whole world is gone.
You can't understand what it feels like to be so alone.
I understand.
I'm the only one-eyed alien on this whole planet.
My parents abandoned me.
I don't even know what galaxy they were from.
I know how it feels to be alone.
Leela, I don't understand this world, but you obviously do.
So I give up.
If you really think I should be a delivery boy, I'll do it.
Your chip! - What are you doing? - Quitting.
- Why? - Because I've always wanted to.
I never realized it until I met you.
What is the matter with you? - I wanted to be part of the moment.
- He stole my ring! Sorry.
Well, that solves the mystery of the missing ring.
This calls for a drink.
I don't want to spoil it, but we're all job-deserters now.
- Unemployed and nowhere to go.
- Correction: Unemployed but we have an old relative to mooch off of.
Hi, I'm Dick Clark's head.
Welcome to a special year 3000 edition of New Year's Rockin' Eve! - Who are you? - I'm your dear old Uncle Fry.
- I don't have an Uncle Fry.
- You do now! By God, I am your nephew! This is absolutely incredible! - Can we have some money? - Oh, my, no.
Let me show you around.
That's my lab table and this is my work stool.
That's my intergalactic spaceship.
And here's where I keep assorted lengths of wire.
- A real live spaceship! - I designed it myself.
Let me show you the different lengths of wire I used.
Attention, job-deserters! Exit with your hands up! - We have you partially surrounded! - No! Get those bums.
- We're boned.
- Can't we get away in the ship? I suppose it is technically possible.
Though I am already in my pajamas.
I'll get us out.
- Can anyone drive stick? - I can.
As long as I don't have to parallel park.
If they try to take off, give them an assful of laser.
Prepare for liftoff! - Ten.
- Nine! Seven! Five! Four.
- Three.
- Two.
- One! - Blastoff! Fire! Fire! Can't see nothing.
Pretty, though.
I guess without jobs we'll be fugitives forever.
Not necessarily.
Are you, by any chance, interested in becoming my new spaceship crew? New crew? What happened to the old crew? Those poor sons of- That's not important.
What's important is I need a crew.
- Anyone interested? - Yes! Yes! It's what I've always wanted! Thanks for the offer, but we don't have the proper career chips.
That's not a problem.
As luck would have it, I saved the chips from my previous crew.
Awesome! Are we gonna fight space monsters and teach alien women to love? If by that you mean transporting cargo, yes.
It's a business I started to fund my research.
Cool! What's my job gonna be? You'd be responsible for ensuring that the cargo reaches its destination.
- So I'll be a delivery boy? - Exactly! All right! I'm a delivery boy!

Read more: https://www.springfieldspringfield.co.uk/view_episode_scripts.php?tv-show=futurama&episode=s01e01"""