import sys as s

count = int(s.stdin.readline())
for i in range(count):
    a, b = map(int,s.stdin.readline().split())
    print(a+b)