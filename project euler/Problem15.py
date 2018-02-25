import math

width = int(input("가로 입력: " ))
height = int(input("세로 입력: "))

total = width+height

n = 1
for tmp in range(total, width,-1):
	n *= tmp
c = math.factorial(width)
print(int(n/c))
