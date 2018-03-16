f = open("triangle18.txt",'r')
tr = f.readlines()

for i in range(len(tr)):
	#list화
	tr[i] = tr[i][:-1].split(" ")
	for j in range(len(tr[i])):
		tr[i][j] = int(tr[i][j])
#뒤집기 - 저장 할 필요 없다.
tr = tr[::-1]
#내려가면서 계산
for i in range(1,len(tr)):
	for j in range(len(tr[i])):
		if tr[i-1][j] > tr[i-1][j+1]:
		 	tr[i][j] += tr[i-1][j]
		else:
			tr[i][j] += tr[i-1][j+1]
print(tr[-1][-1])

