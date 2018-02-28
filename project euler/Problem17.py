#0 ~ 9
l0 = [0,3,3,5,4,4,3,5,5,4]
#10~ 19
l1 = [3,6,6,8,8,7,7,9,8,8]
#20~
#20 -> twenty = 6
#30 -> thirty = 6
l2 = [0,0,6,6,5,5,5,7,6,6]
#other
hd = 7
an = 3
thu = 8

#convert number to english
su = 0
for num in range(1,1000):
	#백의 자리
	n100 = int(num/100)
	#십의 자리 숫자
	n10 = num%100
	#십의 자리
	nten = int((num%100)/10)
	#일의 자리
	n1 = (num%100)%10
	#100 ,200, 300 ... 900
	if n100 is not 0 and n10 is 0:
		su +=  l0[n100] + hd
	else:
		# > 100 hundred + and = 10
		if n100 is not 0:
			su += hd + an
		
		if n10 < 10:
			su += l0[n100] + l0[n10]
		elif n10 >= 10 and n10 < 20:
			su += l0[n100] + l1[n10-10]
		else:
			su += l0[n100] + l2[nten] + l0[n1]
#1000더하기
su += thu + l0[1]
print(su)
