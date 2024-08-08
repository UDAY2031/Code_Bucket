def get_grade(mark):
    if mark >= 91:
        return 'S Grade'
    elif mark >= 81:
        return 'A Grade'
    elif mark >= 71:
        return 'B Grade'
    elif mark >= 61:
        return 'C Grade'
    elif mark >= 51:
        return 'D Grade'
    elif mark >= 41:
        return 'E Grade'
    else:
        return 'F Grade'

# Read marks for 4 subjects and display the grades
for i in range(1, 5):
    mark = int(input(f"Enter marks for subject {i}: "))
    print(f"Subject {i}: {get_grade(mark)}")
