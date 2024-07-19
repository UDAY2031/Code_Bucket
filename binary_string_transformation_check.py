# Read the binary number D from the input
D = input("Enter the binary number containing only 0's and 1's: ")

# Count the number of '0's and '1's in the string
count_0 = D.count('0')
count_1 = D.count('1')

# Check if flipping exactly one digit can make all digits the same
if count_0 == 1 or count_1 == 1:
    print("YES")
else:
    print("NO")
