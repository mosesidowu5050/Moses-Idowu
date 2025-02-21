/*
4.39 (Enforcing Privacy with Cryptography) The explosive growth of 
Internet communications and data storage on Internet-connected computers 
has greatly increased privacy concerns. The field of cryptography is concerned 
with coding data to make it difficult (and hopefully—with the most advanced 
schemes—impossible) for unauthorized users to read. In this exercise you’ll 
investigate a simple scheme for encrypting and decrypting data. A company 
that wants to send data over the Internet has asked you to write a program 
that will encrypt it so that it may be transmitted more securely. All the data is 
transmitted as four-digit integers.

Your application should read a four-digit integer entered by the user and 
encrypt it as follows: Replace each digit with the result of adding 7 to the 
digit and getting the remainder after dividing the new value by 10. 
Then swap the first digit with the third, and swap the second digit with the fourth. 
Then print the encrypted integer. 

Write a separate application that inputs an encrypted four-digit integer and 
decrypts it (by reversing the encryption scheme) to form the original number. 
[Optional reading project: Research “public key cryptography” in general and 
the PGP (Pretty Good Privacy) specific public key scheme. You may also want to 
investigate the RSA scheme, which is widely used in industrial-strength 
applications.]
*/

import java.util.Scanner;

class EnforcingPrivacyWithCryptography {
   public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int read = 1;
int encryptNumber = 0;
int addingSeven = 0;
int remainderResult = 0;

System.out.print("Enter first digit number to be encrypted: ");
int encryptNumber1 = scan.nextInt();
int addingSeven1 = encryptNumber1 + 7; 
int remainderResult1 = addingSeven1 / 10; 

System.out.print("Enter second digit number to be encrypted: ");
int encryptNumber2 = scan.nextInt();
int addingSeven2 = encryptNumber2 + 7;
int remainderResult2 = addingSeven2 / 10;

System.out.print("Enter third digit number to be encrypted: ");
int encryptNumber3 = scan.nextInt();
int addingSeven3 = encryptNumber3 + 7;
int remainderResult3 = addingSeven3 / 10;

System.out.print("Enter fourth digit number to be encrypted: ");
int encryptNumber4 = scan.nextInt();
int addingSeven4 = encryptNumber4 + 7;
int remainderResult4 = addingSeven4 / 10;

if (remainderResult1 != remainderResult3 && remainderResult2 != remainderResult4){
	int temp1 = remainderResult3;
	int temp2 = remainderResult1;
	remainderResult3 = temp2;
	remainderResult1 = temp1;

	int temp3 = remainderResult4;
	int temp4 = remainderResult2;
	remainderResult4 = temp4;
	remainderResult2 = temp3;

System.out.println(remainderResult1 + " " + remainderResult3 + " ");
System.out.println(remainderResult2 + " " + remainderResult4 + " ");

}
	System.out.println("Your encrypt number...");

   }
}