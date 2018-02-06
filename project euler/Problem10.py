#소수 더하기
list1 = list(range(2000001))
#1은 제외
list1[1] = 0
for i in range(2,2000001):
	if list1[i] == 0:
		pass
	for j in range(i*i, 2000001, i):
		list1[j] = 0

print(sum(list(filter(lambda v: v!= 0,list1))))