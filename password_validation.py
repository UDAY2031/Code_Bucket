import re
# Function to check password validity
def is_valid_password(password):
    if len(password) < 6 or len(password) > 12:
        return False
# Regular expressions to check required criteria
    if not re.search("[a-z]", password):
        return False
    if not re.search("[A-Z]", password):
        return False
    if not re.search("[0-9]", password):
        return False
    if not re.search("[$#@]", password):
        return False
    return True
# Ask user for the password
password = input("Enter the password: ")
# Check if the password is valid and print the result
if is_valid_password(password):
    print("Password is valid")
else:
    print("Password is invalid")
