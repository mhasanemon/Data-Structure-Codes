# The equation is ax^2+bx+c
import math

a = int(input('Enter the Coefficient of a :'))
b = int(input('Enter the Coefficient of b :'))
c = int(input('Enter the Coefficient of c :'))

D = b**2 - (4*a*c)

if(D==0):
    solution = -b/(2*a)
    print (solution)
elif(D>0):
    solution1 = (-b + math.sqrt(D))/2*a
    solution2 = (-b - math.sqrt(D)) / 2 * a

    print("Two solutions are :"+solution1+" "+solution2)

else:
    print("There are no solution.")

import as