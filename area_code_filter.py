import re

# Define the regular expression pattern for phone numbers with a 3-digit area code
pattern = re.compile(r'^([A-Za-z]+)\s(\d{3}-\d{8})$')

# Open and read the input file
with open('input.txt', 'r') as file:
    lines = file.readlines()

# Find and print names with a 3-digit area code
for line in lines:
    match = pattern.match(line.strip())
    if match:
        print(match.group(1))
