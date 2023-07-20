teamA = list(map(int,input().split()))
teamB = list(map(int,input().split()))

resultA = (teamA[0]*6) + (teamA[1]*3)+(teamA[2]*2)+(teamA[3]*1)+(teamA[4]*2)
resultB = (teamB[0]*6) + (teamB[1]*3)+(teamB[2]*2)+(teamB[3]*1)+(teamB[4]*2)

print(resultA, resultB)
