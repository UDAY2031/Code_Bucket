def display_lines(filename, num_lines):
    with open(filename, 'r') as file:
        lines = file.readlines()
        for i in range(min(num_lines, len(lines))):
            print(lines[i].strip())

def word_frequency(filename, word):
    with open(filename, 'r') as file:
        text = file.read()
        words = text.split()
        return words.count(word)

def main():
    filename = input("Enter the name of the text file: ")
    num_lines = int(input("Enter the number of lines to display: "))
    word = input("Enter the word to find its frequency: ")

    print(f"\nDisplaying the first {num_lines} lines from {filename}:\n")
    display_lines(filename, num_lines)
    
    frequency = word_frequency(filename, word)
    print(f"\nThe word '{word}' appears {frequency} times in the file '{filename}'.")

if __name__ == "__main__":
    main()
