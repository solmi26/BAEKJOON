count = int(input())
str = input()
aeiou = ['a','e','i','o','u']
sum = 0
for i in range(count):
    if str[i] in aeiou:
        sum+=1
print(sum)