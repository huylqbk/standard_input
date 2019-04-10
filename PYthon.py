print('Enter your reapeat times n: ')
n = int(input())


while n > 0 :
    print("Enter your number a & b: ")
    a = int(input())
    b = int(input())
    if b == 0:
        print("result a^b = 1  ")
    else:
        print("result a^b= ", a**b)
    n -= 1

