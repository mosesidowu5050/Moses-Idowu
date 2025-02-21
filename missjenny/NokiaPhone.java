import java.util.Scanner;
	public class NokiaPhone{
	public static void main(String[] args){

Scanner connect = new Scanner(System.in);

System.out.println("""

			LIST OF MENU FUNCTIONS


1. PHONE BOOK

2. MESSAGES

3. CHAT

4. CALL REGISTER

5. TONES

6. SETTINGS

7. CALL DIVERT

8. GAMES

9. CALCULATOR

10. REMINDERS

11. CLOCK

12. PROFILES

13. SIM Services



""");

int reader = connect.nextInt();
switch(reader){

case 1: System.out.println("""

	1. Search
	
	2. Service Number
	
	3. Add Name

	4. Erase

	5. Edit

	6. Assign Tone

	7. Send b'card

	8. Options
		
	9. Speed Dials
	
	10. Voice Tags	
""");

int reader1 = connect.nextInt();
switch(reader1){

case 1:System.out.println("""

	1. Write what you want to search...

	2. Press the search button...
""");
	break;

case 2:System.out.println("""

	1. Proxy 
""");
	break;

case 3:System.out.println("""

	1. Create contact

	2. Enter Name
""");

	break;

case 4:System.out.println("""

	1. Picture Erase

	2. SMS Erase

	3. Video Erase
""");
	break;

case 5:System.out.println("""

	1. Edit your message...

	2. Edit background username...
""");
	break;


case 6:System.out.println("""

	1. SMS Ring tones

	2. Alarm Ring tones

	3. Phone Call Ring tones
""");
	break;


case 7:System.out.println("""

	1. Business Card...

	2. Send MMS...
""");
	break;

case 8:System.out.println("""

	1. Type of view

	2. Memory Status
""");
	break;


case 9:System.out.println("""

	1. Enter speed dial number...

	2. Choose speed dial number...
""");
	break;


case 10:System.out.println("""

	1. Tag Voice...
""");

}
	break;



case 2: System.out.println("""

	1. Write messages
	
	2. Inbox

	3. Outbox

	4. Picture Messages

	5. Templates

	6. Smileys

	7. Message Settings

	8. Info Service

	9. Voice Mailbox Number

	10. Service Command Editor
""");

int option = connect.nextInt();
switch(option){

case 1:System.out.println("""

	1. Press button to write message...

	2. Send message...
""");
	break;

case 2:System.out.println("""

	1. Open inbox...

	2. Exit inbox...
""");
	break;

case 3:System.out.println("""

	1. Press button to outbox...

	2. Exit outbox...
""");
	break;

case 4:System.out.println("""

	1. View picture message...

	2. Delete picture message...
""");
	break;

case 5:System.out.println("""

	1. View template...

	2. Use template...
""");
	break;

case 6:System.out.println("""

	1. Emojis...

	2. Stickers...
""");
	break;

case 7:System.out.println("""

	1. Message centre number

	2. Message sent as...

	3. Message validity...

	4. Delivery report

	5. Reply Via same centre

	6. Character support

""");
	break;

case 8:System.out.println("""

	1. Voicemail...

	2. Customer Care Service...
""");
	break;

case 9:System.out.println("""

	1. Call voicemail number: 03472924720...

""");
	break;

case 10:System.out.println("""

	1. Command editor...

""");
}
	break;
	

case 3: System.out.println("""

	1. Facebook

	2. WeChat
""");

	break;


case 4: System.out.println("""

	1. Missed Calls

	2. Received Calls

	3. Dialled Numbers

	4. Erase Recent Call Lists

	5. Show Call Duration

	6. Show Call Costs

	7. Call Cost Settings

	8. Prepaid Credit
""");


int username = connect.nextInt();
switch(username){

case 5: System.out.println("""

	1. Last Call Duration

	2. All Calls Duration

	3. Received Calls Duration

	4. Dialed Calls Duration

	5. Clear Timers
""");

	break;

case 6: System.out.println("""

	1. Last Call Cost

	2. All Calls Cost

	3. Clear Counters
""");

	break;

case 7: System.out.println("""

	1. Call Cost limit

	2. Show Costs in
""");

}
	break;


case 5: System.out.println("""

	1. Ringing Tone

	2. Ringing Volume

	3. Incoming Call Alert

	4. Composer

	5. Message Alert Tone

	6. Keypad Tones

	7. Warning and Game Tones

	8. Vibrating Alert

	9. Screen saver
""");
	break;



case 6: System.out.println("""

	1. Call Settings

	2. Phone Settings

	3. Security Settings

	4. Restore Factory Settings
""");

	
int username1 = connect.nextInt();
switch(username1){
  
case 1:System.out.println("""

	1. Authomatic Redial

	2. Speed Dialing
	
	3. Call waiting sending

	4. Own number sending

	5. Phone line in use

	6. Authomatic answer

""");
	break;

case 2:System.out.println("""

	1. Language

	2. Cell info display

	3. Welcome note

	4. Network selection

	5. Light

	6. Confirm SIM Service Actions
""");
	break;

case 3:System.out.println("""

	1. Pin Code Request

	2. Ca;; barring service

	3. Fixed Dialing

	4. Closed user group

	5. Phone Security

	6. Change Access Codes
""");
}	
	break;


case 7: System.out.println("""

	1. Divert Call

	2. Ignore Call
""");

	break;


case 8: System.out.println("""

	1. Snake Game

	2. Puzzle Game
""");

	break;


case 9: System.out.println("""

	1. Scientisfic Calculator

	2. Phone Calculator
""");

	break;


case 10: System.out.println("""

	1. Event Reminder

	2. Birthday Reminder
""");

	break;

case 11: System.out.println("""

	1. Alarm Clock

	2. Clock Settings

	3. Date Settings

	4. Stopwatch 

	5. Countdown Timer

	6. Auto Update of Date and Time
""");

	break;


case 12: System.out.println("""

	1. General

	2. Vibrate

	3. Silent
""");

	break;

case 13: System.out.println("""

	1. Network Connectivity

	2. Subscriber Identification

	3. Contact and SMS Settings

	4. SIM Toolkit (STK)
""");

	break;

}


	}
}