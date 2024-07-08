library(ggplot2)
library(reshape2)

# Define matrices
m1 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8, 9), nrow = 3, ncol = 3, byrow = TRUE)
m2 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8, 9), nrow = 3, ncol = 3, byrow = TRUE)

# Create heatmap of matrix m1
heat_data <- melt(m1)
heat_plot <- ggplot(heat_data, aes(x = Var1, y = Var2, fill = value)) +
  geom_tile() +
  scale_fill_gradient(low = "white", high = "blue") +
  labs(title = "Heatmap of Matrix m1", x = "Column", y = "Row")

# Create bar plot of row sums in matrix m2
row_sum <- rowSums(m2)
row_names <- paste("Row", 1:3)
bar_data <- data.frame(
  ROW = row_names,
  SUM = row_sum
)
bar_plot <- ggplot(bar_data, aes(x = ROW, y = SUM)) +
  geom_bar(stat = "identity", fill = "green") +
  labs(title = "Bar Plot of Row Sums in Matrix m2", x = "Row", y = "Sum")

# Display the plots
print(heat_plot)
print(bar_plot)

