import time
from time import sleep 

speed = 0.0
# slow print is completed with the help of stack overflow 
def slow_print(the, speed):
    for i in the:
        print(i, end= "", flush = True)   
        time.sleep(speed) 
    print("\n")

slow_print("Loading .........",0.15)

long_mes ="Today you become an honorable Officer serving New Seattle State Police Dapartment. If you want to (just a reminder) serving the people of New Seattle is also an option."
slow_print(long_mes,0.05)

user_name= input("What is your name? Officer\n")
print("\nWelcome, Officer",user_name + ".")
print("\nOfficer",user_name,", your age is 21. Not that it really matters, but this is the legal age to drink for certain country.\n")

print("May I ask, Officer, What is your gender?")
print("1. Binary \n2. Female\n3. Male\n4. others")
print("\nChose your answer or just a random number from 1 to 4. \n(If you input any other number or whatever, your gender is going to be not human. For that the coder of this game currently do not have the skills to censor users. Do not add any space.)")
choice = input("Input your choice: ")

if choice == "1":
    gender = "Binary"
elif choice =="2":
    gender = "Female"
elif choice =="3":
    gender = "Male"
else:
    gender = "Not Human"

print("Officer", user_name, "Whenever your gender is refered in this program. You would be a", gender, "Officer! (If you change your mind, restart the program.)")
