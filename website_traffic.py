import pandas as pd
import matplotlib.pyplot as plt

# Load the data into a pandas DataFrame
# Assuming the data has columns: 'Date', 'Visitors', 'Source'
data = {
    'Date': ['2023-07-01', '2023-07-02', '2023-07-03', '2023-07-04', '2023-07-05', '2023-07-06', '2023-07-07'],
    'Visitors': [100, 150, 200, 250, 300, 350, 400],
    'Source': ['Direct', 'Search Engine', 'Social Media', 'Direct', 'Search Engine', 'Social Media', 'Direct']
}
df = pd.DataFrame(data)

# Convert 'Date' to datetime
df['Date'] = pd.to_datetime(df['Date'])

# Create a 'DayOfWeek' column
df['DayOfWeek'] = df['Date'].dt.day_name()

# Line plot showing the daily number of visitors
plt.figure(figsize=(10, 5))
plt.plot(df['Date'], df['Visitors'], marker='o', linestyle='-', color='b')
plt.title('Daily Number of Visitors')
plt.xlabel('Date')
plt.ylabel('Number of Visitors')
plt.grid(True)
plt.show()

# Bar plot comparing the number of visitors on weekdays versus weekends
df['Weekend'] = df['DayOfWeek'].isin(['Saturday', 'Sunday'])
weekend_visitors = df[df['Weekend'] == True]['Visitors'].sum()
weekday_visitors = df[df['Weekend'] == False]['Visitors'].sum()

plt.figure(figsize=(6, 4))
plt.bar(['Weekdays', 'Weekends'], [weekday_visitors, weekend_visitors], color=['blue', 'orange'])
plt.title('Number of Visitors: Weekdays vs Weekends')
plt.ylabel('Number of Visitors')
plt.show()

# Pie chart showing the percentage of traffic from different sources
source_counts = df['Source'].value_counts()
plt.figure(figsize=(8, 8))
plt.pie(source_counts, labels=source_counts.index, autopct='%1.1f%%', startangle=140, colors=['#ff9999','#66b3ff','#99ff99','#ffcc99'])
plt.title('Traffic Sources')
plt.axis('equal')  # Equal aspect ratio ensures that pie is drawn as a circle.
plt.show()
