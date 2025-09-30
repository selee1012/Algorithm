import sys

n = int(sys.stdin.readline().rstrip())

count = n//5
check = n%5
while ((check%3 != 0) and (check <= n)):
    check += 5
    count -= 1

if (check > n):
    print(-1)
elif (check%3==0):
    print(count + check//3)
