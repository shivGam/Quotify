def calculate_factorial(num):
    """Calculates the factorial of a given positive integer."""
    factorial = 1
    for i in range(1, num + 1):
        factorial *= i
    print(f"The factorial of {num} is {factorial}")

