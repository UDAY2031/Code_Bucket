# Read a string from the user
input_string = input("Enter a string: ")

# Define vowels
vowels = "aeiouAEIOU"

# Create a new string with only vowels and non-alphabetic characters
result_string = ''.join(char for char in input_string if char in vowels or not char.isalpha())

# Print the resulting string
print("Output:", result_string)
