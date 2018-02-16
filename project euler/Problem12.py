import time

def manyT(num):
	sqrt = int(num ** 0.5)
	yaksu = 0
	for i in range(1, sqrt+1):
		if num % i == 0:
			yaksu += 1

	yaksu *= 2
	if sqrt*sqrt == num:
		yaksu -= 1
	return yaksu

def whatT(number):
	a = 1
	add = 2
	while True:
		a += add
		n = manyT(a)
		if number < n:
			return a
		add += 1

t0 = time.time()
print(whatT(int(input("num: "))))
t1 = time.time()
print("time:",t1-t0)
