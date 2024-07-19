def get_grade(mark):
    if 91 <= mark <= 100:
        return 'S Grade'
    elif 81 <= mark <= 90:
        return 'A Grade'
    elif 71 <= mark <= 80:
        return 'B Grade'
    elif 61 <= mark <= 70:
        return 'C Grade'
    elif 51 <= mark <= 60:
        return 'D Grade'
    elif 41 <= mark <= 50:
        return 'E Grade'
    else:
        return 'F Grade'

# Read marks for 4 subjects
marks = [int(input(f"Enter marks for subject {i+1}: ")) for i in range(4)]

# Display the grades
for i, mark in enumerate(marks, start=1):
    print(f"Subject {i}: {get_grade(mark)}")
