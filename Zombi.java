package american;
import chn.util.*;

public class Zombi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	public Zombi(){}
	public void Game(){
		ConsoleIO user= new ConsoleIO();
		int placement=1;
		while(placement<=27){
			if(placement==0){
				System.out.println("GAME OVER!");
				placement=10000;
			}
			if(placement==1){
				System.out.println("You are taking the place of Beenak Stavros. It is 7 AM and you are asleep in your bed. Do you wake up?");
				System.out.println("1- Yes, 2-No");
				int answer =user.readInt();
				switch(answer){
				case(1):System.out.println("You get out of bed");
				placement=2;
				break;
				case(2):System.out.println("You die in your sleep.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==2){
				System.out.println("You are now awake. You get up and about, and get dressed and hit the bathroom. What shall you do now in your apartment?");
				System.out.println("1-Eat breakfast,2-Watch TV,3-Leave the apartment and head downstairs,4-Jump out the window");
				int answer2= user.readInt();
				switch(answer2){
				case(1):System.out.println("You head over to yoyr kitchen.");
				placement=26;
				break;
				case(2):System.out.println("You automatically see reports advising citizens to evacuate and leave.");
				placement=3;
				break;
				case(3):System.out.println("You head down the stairs and hear some odd mashing and grunting sounds.");
				placement=4;
				break;
				case(4): System.out.println("Wow. You're an idiot! You are now a 'splat' on the ground.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			
			}
			if(placement==3){
				System.out.println("You turn off the TV  after seeing the horrifying reports.You immediately remember your brother and you must save him. What shal you do?");
				System.out.println("1-Leave the apartment and head downstairs,2-Jump out the window");
				int answer3=user.readInt();
				switch(answer3){
				case(1):System.out.println("You head down the stairs and hear some odd mashing and grunting sounds.");
				placement=4;
				break;
				case(2): System.out.println("Wow. You're an idiot! You are now a splat on the ground.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
				
					
			}
			if (placement==4){
				System.out.println("You immediately encounter a human, though with missing skin and several limbs. Said human is eating another dead man's brains.What shall you do?");
				System.out.println("1-Hug the zombie,2-Join in and eat the brains,3-Tiptoe around the zombie");
				int answer4=user.readInt();
				switch(answer4){
				case(1):System.out.println("You are immediately bitten and turn into a zombie");
				placement=0;
				break;
				case(2):System.out.println("The zombie is very selfish and eats you so that he doesn't have to share.");
				placement=0;
				break;
				case(3):System.out.println("The zombie doesn't notice you and you arrive at the lobby of your apartment complex.");
				placement=5;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==5){
				System.out.println("Arriving at the lobby you must now find a way to your brother's place. The front doors are locked and barricaded however. How shall you do this?");
				System.out.println("1-Scrounge around for something to break the doors open,2-Head back to find other exits,3-Ram the doors");
				int answer5=user.readInt();
				switch(answer5){
				case(1):System.out.println("You break into the security office.You encounter the dead body of the secretary, who shot himself in the head.");
				placement=6;
				break;
				case(2):System.out.println("As you walk around you find another survivor, Amanda.");
				placement=7;
				break;
				case(3):System.out.println("You immediately set off the alarms as you break through the glass.");
				placement=8;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
				
				
			}
			if (placement==6){
				System.out.println("There are several items to choose from in the room.What shall you do?");
				System.out.println("1-Search the body of the secretary,2-Look for some weapons,3-Leave");
				int answer6=user.readInt();
				switch(answer6){
				case(1):System.out.println("The secretary suddenly rises and bites you, infecting you with the zombie virus.");
				placement=0;
				break;
				case(2):System.out.println("You don't happen to find any real weapons but you do encounter some key cards to open the doors.");
				placement=9;
				break;
				case(3):System.out.println("As your back is turned, the zombified secretary bites you and feasts on your flesh.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
			}
			}
			if(placement==7){
				System.out.println("She pleads with you to help her husband, who she lost in the ensuing panic from the zombies. What shall you do?");
				System.out.println("1-Run Away,2-Follow her");
				int answer7=user.readInt();
				switch(answer7){
				case(1):System.out.println("You trip and immediately bash your head in.");
				placement=0;
				break;
				case(2):System.out.println("You follow along and actually find her husband,knocked out on the floor but not dead.");
				placement=10;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==8){
				System.out.println("All the zombies in the area swarm to you. what shall you do?");
				System.out.println("1-Run,2-Hide,3-Pray");
				int answer8=user.readInt();
				switch(answer8){
				case(1):System.out.println("You immediately trip and the zombies dine on your entrails as you try to get up.");
				placement=0;
				break;
				case(2):System.out.println("You immediately break into your car. You slam the doors shut.");
				placement=11;
				break;
				case(3):System.out.println("Because you are actually quite the sinner, God smites thee with furious vengeance.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
				
			}
			if(placement==9){
				System.out.println("You use the key cards to open the doors of the lobby and walk out onto the street. The street is not empty, there are a few zombies here and there but not swarming at you. How shall you proceed?");
				System.out.println("1-Get into your car,2-Walk over to your brother's place,3-Cover yourself in entrails");
				int answer9=user.readInt();
				switch(answer9){
				case(1):System.out.println("You open the car and get in, however when you rev up the engine zombies hear the noise");
				placement=12;
				break;
				case(2):System.out.println("On the way to your brother's place, you encouinter a zombie horde in an alley shortcut and are immediately cornered in and consumed");
				placement=0;
				break;
				case(3):System.out.println("It begins to rain, the effects entrails dmiminishes and the zombies eat you.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
				
			}
			if(placement==10){
				System.out.println("You notice that the husband has bled a little. What shall you do?");
				System.out.println("1-Inspect the body,2-Run away,3-Bust his head");
				int answer10=user.readInt();
				switch(answer10){
				case(1):System.out.println("You immediately notice a bite on his underside.");
				placement=13;
				break;
				case(2):System.out.println("As true to your bumbling nature, you trip and break your head open");
				placement=0;
				break;
				case(3):System.out.println("You pick up a nearby stone and complete said task, but then Amanda killas you for killing her husband.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==11){
				System.out.println("The zombie horde constantly beats on your doors and windows while you are in the car on the sidewalk. What shall you do?");
				System.out.println("1-Rev up the engine and drive off,2-Rev the engine and reverse,3-Wait for rescue");
				int answer11= user.readInt();
				switch(answer11){
				case(1):System.out.println("You immediately bust through the zombie hordes and drive on from downtown to the center of town");
				placement=14;
				break;
				case(2):System.out.println("Your car gets stuck on a zombie you hit in the back. The zombies break in and eat you.");
				placement=0;
				break;
				case(3):System.out.println("The thing is people give up, but zombies don't got the mind to. They eventually break into the car and eat you.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==12){
				System.out.println("There is a relatively small group of zombies, so where shall you drive?");
				System.out.println("1-Uptown,2-Center,3-Outskirts of town");
				int answer12=user.readInt();
				switch(answer12){
				case(1):System.out.println("Turns out uptown is filled with an insane amount of zombies. They stop your car in its tracks and they break in to gorge on your guts.");
				placement=0;
				break;
				case(2):System.out.println("You drive up to your brother's block");
				placement=15;
				break;
				case(3):System.out.println("You encounter a camp of survivors from the recent carpet bombing.");
				placement=16;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==13){
				System.out.println("Amanda's husband begins to awake. What shall you do?");
				System.out.println("1-Beat his head in,2-Let him wake up,3-Run away");
				int answer13=user.readInt();
				switch(answer13){
				case(1):System.out.println("After killing her husband , you explain to her the recent zombification of many but she still runs off crying.");
				placement=18;
				break;
				case(2):System.out.println("As he wakes up he explains to you about how a random dog bit him.");
				placement=17;
				break;
				case(3):System.out.println("As true to your bumbling nature, you trip and break your head open");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==14){
				System.out.println("You get out of the car and walk into your brother's apartment complex");
				System.out.println("1-Immediately run up to his apartment,2-Buzz up to his room,3-Leave a note");
				int answer14=user.readInt();
				switch(answer14){
				case(1):System.out.println("True to being a klutz, you trip on the stiars and fall all the way down, killing yourslef from the multiple wounds and fractures.");
				placement=0;
				break;
				case(2):System.out.println("As you get behind the secretary's desk, you find a whole series of notes left by all of the apartment's tenants to their loved ones");
				placement=19;
				break;
				case(3):System.out.println("As you reach for some paper in a back room, a zombie of a tenant sneaks up and bites you.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
			}
			
			}
			if(placement==15){
				System.out.println("You enter through the back entrance of your brother's apartment building. Youi are now inside, what shall you do now?");
				System.out.println("1-Run up the stairs,2-Run to the lobby,3-Leave a note");
				int answer15=user.readInt();
				switch(answer15){
				case(1):System.out.println("You trip and while you try to get up, one the tenants takes quite an interest in your brains");
				placement=0;
				break;
				case(2):System.out.println("As you get behind the secretary's desk, you find a whole series of notes left by all of the apartment's tenants to their loved ones");
				placement=19;
				break;
				case(3):System.out.println("As you reach for some paper in a back room, a zombie of a tenant sneaks up and bites you.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==16){
				System.out.println("Some of the survivors look at you suspiciously, some kindly. What shall you do?");
				System.out.println("1-Enter the camp,2-Leave to find your brother in the city,3-Head off into the countryside");
				int answer16=user.readInt();
				switch(answer16){
				case(1):System.out.println("You immediately find your brother, who had found his way out of the city");
				placement=25;
				break;
				case(2):System.out.println("You immediately run out of gas in the city and zombies finally catch up to you and eat you");
				placement=0;
				break;
				case(3):System.out.println("You run out of gas in the middle of nowhere.When winter comes, you freeze to death");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==17){
				System.out.println("After getting her husband,Carl, up and patched up, Anna leads you out through an alternate exit in the building. What shall you do now?");
				System.out.println("1-Get into your car,2-Move as a group on foot,3-Use the two as zombie fodder ");
				int answer17=user.readInt();
				switch(answer17){
				case(1):System.out.println("You say your goodbyes to Amanda and Carl as they head off in search of their son, you head over to your car. When you rev up your engine, the zombie horde is immediately alerted to your presence and begin to swarm.");
				placement=20;
				break;
				case(2):System.out.println("Your group gets trapped in a cunning pincer movement by the zombies in an alley and you are all eaten.");
				placement=0;
				break;
				case(3):System.out.println("You push the two in front of the zombies and they are eaten, but Amanda makes sure to drag you back with them with her dying breath.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==18){
				System.out.println("You find an alternate exit from the building.What do you do now?");
				System.out.println("1-Get into your car,2-Walk on through the city");
				int answer18=user.readInt();
				switch(answer18){
				case(1):System.out.println("When you rev up your engine, the zombie horde is immediately alerted to your presence and begin to swarm.");
				placement=20;
				break;
				case(2):System.out.println("You get trapped in a cunning pincer movement by the zombies in an alley and you are eaten.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
				
			}
			if(placement==19){
				System.out.println("One note is addressed to you from your brother, telling you to meet him outside. Sirens immediately sound out.");
				System.out.println("1-Just stand there,2-Run to your car,3-Go up the staircase");
				int answer19=user.readInt();
				switch(answer19){
				case(1):System.out.println("You enter the other world from Silent Hill and Pyramid head kills you.");
				placement=0;
				break;
				case(2):System.out.println("You get into your car and speed on out.");
				placement=21;
				break;
				case(3):System.out.println("You trip and break your head open");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==20){
				System.out.println("With zombies beating on your door. What shall you do?");
				System.out.println("1-Drive to your brother's apartment,2-Ditch town,3-Sit there");
				int answer20=user.readInt();
				switch(answer20){
				case(1):System.out.println("On your way sirens ring out.");
				placement=22;
				break;
				case(2):System.out.println("You don't have enough gas and are stuck as the whole town is carpet bombed.");
				placement=0;
				break;
				case(3):System.out.println("You suddenly are killed by the carpet bombing for the quarantine.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==21){
				System.out.println("As you are racing out, the airforce begins to carpet-bomb the town. How shall you drive?");
				System.out.println("1-Take a shortcut,2-Take the normal route,3-Go reverse");
				int answer21=user.readInt();
				switch(answer21){
				case(1):System.out.println("The alley your shortcut goes through is filled with zombies and they stop you from proceeding. You die in the carpet-bombing.");
				placement=0;
				break;
				case(2):System.out.println("You reach the outskirts of the town.");
				placement=23;
				break;
				case(3):System.out.println("Wh-For what reas-....You reverse back into the carpet bombing and die. Great job Einstein!");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==22){
				System.out.println("You arrive at your brother's apartment as the carpet bombing is about to commence. What shall you do?");
				System.out.println("1-Head on in,2-Keep going out of town,3-Head to the diner");
				int answer22=user.readInt();
				switch(answer22){
				case(1):System.out.println("You go in and you head on up to your brother's apartment. You bust through the door but you're too late, the carpet-bombing reaches you.");
				placement=0;
				break;
				case(2):System.out.println("You escape the carpet bombing and arrive on the outskirts of the town.");
				placement=23;
				break;
				case(3):System.out.println("You arrive and find amenu filled a delectable amount of dishes.");
				placement=27;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==23){
				System.out.println("You arrive at a refugee camp of survivors. What shall you do?");
				System.out.println("1-Search the camp, 2- Go to the countryside,3-Go back to town");
				int answer23=user.readInt();
				switch(answer23){
				case(1):System.out.println("You talk to the survivors and they tell you that your brother left, giving you directions on how to find him.");
				placement=24;
				break;
				case(2):System.out.println("You run out of gas and are stranded in the middle of nowhere as you die of starvation.");
				placement=0;
				break;
				case(3):System.out.println("You hit a piece of rubble and crash out of your car, dead.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==24){
				System.out.println("What shall you do now?");
				System.out.println("1-Follow the directions,2-Burn the directions");
				int answer24=user.readInt();
				switch(answer24){
				case(1):System.out.println("The search for your brother shall be continued in: ZOMBI 2-Revengeance");
				System.out.println("YOU WIN!");
				placement=33;
				break;
				case(2):System.out.println("You accidentally set yourslef on fire as well as the camp");
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==25){
				System.out.println("What shall you do?");
				System.out.println("1-Run away,2-Stay");
				int answer25=user.readInt();
				switch(answer25){
				case(1):System.out.println("You trip and smah your head open.");
				placement=0;
				break;
				case(2):System.out.println("You both reunite and come to lead the survivors on in this era of a zombie apocalypse as the zombi virus spreads out  of the city.");
				System.out.println(".....to be continued in ZOMBI 2: REVENGEANCE");
				System.out.println("YOU WIN!");
				placement=28;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==26){
				System.out.println("You have quite a variety of foods to choose from. What shall you eat?");
				System.out.println("1-Lemon cake with a fine cup of black coffee,2-A big bowl of cereal with banana,3-A stack of pancakeas with fine pear syrup and orange juice");
				int answer26=user.readInt();
				switch(answer26){
				case(1):System.out.println("Lemon cake is filled with cyanide, as you bite in you seal your fate to that of oblivion.");
				placement=0;
				break;
				case(2):System.out.println("You fall in and drown in the bowl of cereal sdue to your lack of swimming skills.");
				placement=0;
				break;
				case(3):System.out.println("You hear a ticking sound and realize that your pancakes are hollowed out. The bomb inside them explodes and kills you.");
				placement=0;
				break;
				default:System.out.println("I find that choice befuddling!");
				}
			}
			if(placement==27){
				System.out.println("The zombified waitress is ready to take your order. What shall you order?");
				System.out.println("1-Some nice powdered french toast with a good helping of maple syrup and coffee,2-An American hamburger with a coke and fries,3-A hard drink");
				int answer27=user.readInt();
				switch(answer27){
				case(1):System.out.println("You realize the french toast is powdered with anthrax and you have been poisoned.");
				placement=0;
				break;
				case(2):System.out.println("You bite into the patty and it tastes odd. You open up the burger and encounter human brains and, in shock, you choke to death on your last meal.");
				placement=0;
				break;
				case(3):System.out.println("One drink turns into many. You wake up the next day with a bite on your neck and the zombie waitress beside you. Now you will have to live out your days in your new life as a zombie husband.");
				placement=66;
				System.out.println("YOU WIN?");
				System.out.println(".....to be continued in ZOMBI 2:REVENGEANCE");
				break;
				}
			}
		}
		System.out.println("Credits");
		System.out.println("Co-writer & Head Programmer-Sidhanth Tuli");
		System.out.println("Co-writer & High Lord of Meals-Martin Yepes");
		
	}

}

