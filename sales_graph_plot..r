library(ggplot2)
library(patchwork)
library(plotly)
# Example data
set.seed(123)
data <- data.frame(
 Date = seq(as.Date("2023-01-01"), as.Date("2023-12-31"), by = "months"),
 Sales = cumsum(sample(5000:10000, 12, replace = TRUE)),
 Engagement = sample(1:10, 12, replace = TRUE),
 Category = rep(c("Electronics", "Clothing", "Books"), each = 4)
)
# Scatter plot
scatter_plot <- ggplot(data, aes(x = Sales, y = Engagement, color = Category)) +
 geom_point() +
 labs(title = "Sales vs. Customer Engagement", x = "Sales", y = "Engagement")
# Bar plot for sales by category
bar_plot <- ggplot(data, aes(x = Category, y = Sales, fill = Category)) +
 geom_bar(stat = "identity") +
 labs(title = "Sales by Category", x = "Category", y = "Sales") +
 theme(axis.text.x = element_text(angle = 45, hjust = 1))
# Line plot for sales over time
line_plot <- ggplot(data, aes(x = Date, y = Sales, color = Category)) +
 geom_line() +
 labs(title = "Sales Trend Over Time", x = "Date", y = "Sales")
# Histogram for customer engagement
histogram_plot <- ggplot(data, aes(Engagement)) +
 geom_histogram(binwidth = 1, fill = "green", color = "black") +
 labs(title = "Customer Engagement Distribution", x = "Engagement", y = "Frequency")
# Box plot for sales by category
box_plot <- ggplot(data, aes(Category, Sales, fill = Category)) +
 geom_boxplot() +
 labs(title = "Sales Distribution by Category", x = "Category", y = "Sales")
# Combine plots using patchwork
combined_plots <- scatter_plot +
 bar_plot +
 line_plot +
 histogram_plot +
 box_plot
# Display combined plots
print(combined_plots)
PIE chart in R:
# Load required libraries
library(ggplot2)
# Example data
data <- data.frame(
 Category = c("Electronics", "Clothing", "Books"),
 Sales = c(25000, 18000, 12000)
)
# Create a pie chart
pie_chart <- ggplot(data, aes(x = "", y = Sales, fill = Category)) +
 geom_bar(stat = "identity", width = 1) +
 coord_polar("y", start = 0) + # Convert to polar coordinates
 labs(title = "Pie Chart of Sales by Category") +
 theme_void() # Remove axes and labels
# Display the pie chart
print(pie_chart)
