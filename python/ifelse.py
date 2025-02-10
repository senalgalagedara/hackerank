n = int(input())  # Convert input to an integer

if n % 2 == 1:
    print("Weird")
elif n % 2 == 0:
    if 2 <= n <= 5:
        print("Not Weird")
    elif 6 <= n <= 20:  # Fixed condition
        print("Weird")
    else:  # Covers n > 20
        print("Not Weird")
