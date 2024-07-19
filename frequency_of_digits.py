# Read a multi-digit number as a string from the console
number = input("Enter a multi-digit number: ")

# Initialize a dictionary to store the frequency of each digit
frequency = {}

# Calculate the frequency of each digit
for digit in number:
    if digit in frequency:
        frequency[digit] += 1
    else:
        frequency[digit] = 1

# Print the frequency of each digit with a suitable message
print("Frequency of each digit:")
for digit, count in frequency.items():
    print(f"Digit {digit}: {count} time(s)")
