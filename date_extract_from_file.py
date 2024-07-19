import re

# Function to extract and sum numbers
def extract_and_sum_numbers(filename):
    with open(filename, 'r') as file:
        content = file.read()
    numbers = re.findall(r'\b\d+\b', content)
    total_sum = sum(int(num) for num in numbers)
    return total_sum

# Function to extract dates (in DD/MM/YYYY format)
def extract_dates(filename):
    with open(filename, 'r') as file:
        content = file.read()
    dates = re.findall(r'\b\d{2}/\d{2}/\d{4}\b', content)
    return dates

def main():
    filename = 'content.txt'
    
    # Extract and sum numbers
    total_sum = extract_and_sum_numbers(filename)
    print(f"Sum of all numbers: {total_sum}")
    
    # Extract and display dates
    dates = extract_dates(filename)
    print("Extracted dates:")
    for date in dates:
        print(date)

if __name__ == "__main__":
    main()
