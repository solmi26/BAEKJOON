import math

n1, n2 = map(int, input().split())
print(math.gcd(n1,n2))
print(math.lcm(n1,n2))

#최대공약수
def gcd(a,b):
    while b!=0:
        r=a%b
        a=b
        b=r
    return a

#최소공배수
# a*b // gcd(a,b)
