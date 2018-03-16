def d(num):
	return sum(n for n in range(1,int(num)) if int(num)%int(n) is 0)
	
#n = input("입력하세요: ")
#print(d(n))

su =0
for a in range(2,10001):
	b = d(a)
	if a == d(b) and a != b:
		su += a
		print(a,b,d(a),d(b))
print(su)

