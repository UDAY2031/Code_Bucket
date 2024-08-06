library(dplyr)

student_data <- data.frame(
  Name = character(0),
  Math_Score = numeric(0),
  Science_Score = numeric(0),
  History_Score = numeric(0),
  Attendance = numeric(0)
)

add_student <- function(name, math_score, science_score, history_score, attendance) {
  new_student <- data.frame(
    Name = name,
    Math_Score = math_score,
    Science_Score = science_score,
    History_Score = history_score,
    Attendance = attendance
  )
  student_data <<- bind_rows(student_data, new_student)
  cat("Student information added.\n")
}

calculate_average_scores <- function() {
  avg_scores <- student_data %>%
    mutate(Average_Score = (Math_Score + Science_Score + History_Score) / 3) %>%
    select(Name, Average_Score)
  return(avg_scores)
}

identify_low_attendance <- function(threshold = 70) {
  low_attendance <- student_data %>%
    filter(Attendance < threshold) %>%
    select(Name, Attendance)
  return(low_attendance)
}

generate_report <- function() {
  avg_scores <- calculate_average_scores()
  low_attendance <- identify_low_attendance()
  
  cat("Performance Report:\n")
  print(avg_scores)
  
  if (nrow(low_attendance) == 0) {
    cat("\nNo students with attendance less than 70.\n")
  } else {
    cat("\nStudents with Attendance Less Than 70:\n")
    print(low_attendance)
  }
}

while (TRUE) {
  cat("\n1. Add Student\n2. Generate Report\n3. Exit\n")
  choice <- as.integer(readline("Enter your choice: "))
  
  if (choice == 1) {
    name <- readline("Enter student name: ")
    math_score <- as.numeric(readline("Enter math score: "))
    science_score <- as.numeric(readline("Enter science score: "))
    history_score <- as.numeric(readline("Enter history score: "))
    attendance <- as.numeric(readline("Enter attendance percentage: "))
    add_student(name, math_score, science_score, history_score, attendance)
  } else if (choice == 2) {
    generate_report()
  } else if (choice == 3) {
    cat("Exiting the program. Goodbye!\n")
    break
  } else {
    cat("Invalid choice. Please try again.\n")
  }
}
