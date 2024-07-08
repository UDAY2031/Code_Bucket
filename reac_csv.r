library(readr)
library(dplyr)
library(ggplot2)

# Task 1: Load the Dataset
purchase_data <- read_csv("D:/R Lab 2024/customer_purchases.csv")

# Task 2: Data Summary
total_records <- nrow(purchase_data)
total_customers <- n_distinct(purchase_data$CustomerID)
cat("Total Number of Records:", total_records, "\n")
cat("Total Number of Unique Customers:", total_customers, "\n")

# Task 3: Calculate Statistical Measures
mean_purchase <- mean(purchase_data$PurchaseAmount)
median_purchase <- median(purchase_data$PurchaseAmount)
sd_purchase <- sd(purchase_data$PurchaseAmount)
cat("Mean Purchase Amount:", mean_purchase, "\n")
cat("Median Purchase Amount:", median_purchase, "\n")
cat("Standard Deviation of Purchase Amounts:", sd_purchase, "\n")

# Task 4: Customer Segmentation (Based on Quartiles)
q1_purchase <- quantile(purchase_data$PurchaseAmount, probs = 0.25)
q3_purchase <- quantile(purchase_data$PurchaseAmount, probs = 0.75)

purchase_data <- purchase_data %>%
  mutate(Segment = case_when(
    PurchaseAmount < q1_purchase ~ "Low Spender",
    PurchaseAmount >= q1_purchase & PurchaseAmount < q3_purchase ~ "Medium Spender",
    PurchaseAmount >= q3_purchase ~ "High Spender"
  ))

# Task 5: Visualize Data (Histogram)
histogram_plot <- ggplot(purchase_data, aes(x = PurchaseAmount)) +
  geom_histogram(binwidth = 50, fill = "blue", color = "black") +
  labs(title = "Distribution of Purchase Amounts", x = "Purchase Amount", y = "Frequency")

# Print histogram plot
print(histogram_plot)

# Task 6: Visualize Relationship (Scatter Plot)
scatter_plot <- ggplot(purchase_data, aes(x = CustomerID, y = PurchaseAmount)) +
  geom_point(color = "green") +
  labs(title = "Customer Purchase Amounts", x = "Customer ID", y = "Purchase Amount")

# Print scatter plot
print(scatter_plot)

