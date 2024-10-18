#Print a Fibonacci series of numbers starting from 2 go until 100
#0,1,1,2,3,5,8,13,21,34,…
#basic formula 0+1 = 1, 1+1=2, 2+1=3, 3+2=5, 5+3=8
num = 2
num1 = 1
while num <= 100:
    print(num,end=" ")
    num ,num1 = (num1+num), num
