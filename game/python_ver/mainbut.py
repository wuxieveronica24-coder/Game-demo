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

long_mes ="Today you become an honorable Officer serving for New Seattle State Police Dapartment. If you want to, serving the people of New Seattle is also an option."
slow_print(long_mes,0.05)

user_name= input("What is your name? Officer\n")
print("\nWelcome, Officer",user_name + ".")


