#find factorial of a number using while loop

def factorial(iNum):
    iFactorialRes = 1
    iCount = 1

    while iCount <= iNum:
        iFactorialRes = iFactorialRes*iCount
        iCount = iCount+1

    return iFactorialRes

if __name__ == '__main__':
    num = input("Enter Number to find the Factorial : ")
    factorialRes = factorial(int(num))
    print("Factorial of ",num," is = ",factorialRes)