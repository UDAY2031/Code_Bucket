num_students <- 5
num_courses <- 5
student_names <- c("naruto", "sasuke", "ino", "hinata", "sakura")
course_marks <- matrix(c(
    99, 99, 99, 99, 99,
    99, 99, 99, 99, 99,
    99, 99, 99, 99, 99,
    99, 99, 99, 99, 99,
    99, 99, 99, 99, 99
), nrow = num_students, byrow = TRUE)

student_records <- list()

for (i in 1:num_students) {
    total_marks <- sum(course_marks[i, ])
    average_marks <- total_marks / num_courses
    grade <- ifelse(average_marks >= 90, "A",
                    ifelse(average_marks >= 80, "B",
                           ifelse(average_marks >= 70, "C",
                                  ifelse(average_marks >= 60, "D", "F"))))
    student_records[[i]] <- list(
        name = student_names[i],
        total_marks = total_marks,
        average = average_marks,
        grade = grade
    )
}

cat("\nStudent Grade Report:\n")
for (record in student_records) {
    cat(sprintf("Name: %s\nTotal marks: %d\nAverage: %.2f\nGrade: %s\n",
                record$name, record$total_marks, record$average, record$grade))
}

