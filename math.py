import math

N = int(input("Enter the size :"))
numbers = []
for i in range(N):
    number = float(input(f"Enter the number {i+1}:"))
    numbers.append(number)

mean = sum(numbers)/N
print(f"Mean :{mean}")
variance = sum((x-mean)**2 for x in numbers)/N
print(f"Variance :{variance}")
SD = math.sqrt(variance)
print(f"Standard_deviation :{SD}")
