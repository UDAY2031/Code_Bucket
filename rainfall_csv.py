import pandas as pd

# Load the CSV file
df = pd.read_csv('rainfall.csv')

# Remove rows with missing values
df.dropna(inplace=True)

# District with the highest annual rainfall
highest_rainfall_district = df.loc[df['ANNUAL'].idxmax()]
print("District with the highest annual rainfall:")
print(highest_rainfall_district)

# Top 5 states with the highest annual rainfall
top_states = df.groupby('STATE_UT_NAME')['ANNUAL'].sum().nlargest(5)
print("Top 5 states with the highest annual rainfall:")
print(top_states)

# Remove specific columns
columns_to_remove = ['Jan-Feb', 'Mar-May', 'Jun-Sep', 'Oct-Dec']
df.drop(columns=columns_to_remove, inplace=True)

# State-wise average monthly rainfall
months = ['JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC']
state_monthly_avg = df.groupby('STATE_UT_NAME')[months].mean()
print("State-wise average monthly rainfall:")
print(state_monthly_avg)

# Count of districts in each state
district_count = df['STATE_UT_NAME'].value_counts()
print("Number of districts in each state:")
print(district_count)

# District with the highest rainfall in May for each state
highest_may_rainfall = df.loc[df.groupby('STATE_UT_NAME')['MAY'].idxmax()][['STATE_UT_NAME', 'DISTRICT', 'MAY']]
print("District with the highest rainfall in May for each state:")
print(highest_may_rainfall)
