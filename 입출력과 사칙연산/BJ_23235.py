i = 0
while True :
    i+=1
    num = list(map(int, input().split()))
    if(sum(num)==0):
        break
    print("Case %d: Sorting... done!" %i)