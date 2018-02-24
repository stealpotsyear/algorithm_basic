
#n = int(input("양의 정수 n 입력 :"))

#횟수
def countHailStone(n):
	cnt =1
	while n!=1:
		if n%2==0:
			n/=2
		else:
			n = n*3+1
		cnt+=1
	return cnt
#숫자
def whatNumber():
	maxNum = 2
	maxScore=0
	for num in range(2,1000001):
		tmpScore = countHailStone(num)
		if num%100000==0:
			print(num,": ", tmpScore)
		if maxScore < tmpScore:
			maxScore = tmpScore
			maxNum = num
	return maxNum
print(whatNumber())
