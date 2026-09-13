#include <stdio.h>

// Option A: Function Prototype Declaration
void printFibonacci(int n);

int main() {
    int n;
    printf("Enter the number : ");
    scanf("%d", &n);
    printFibonacci(n);
    return 0;
}

void printFibonacci(int n) {
    int first = 0, second = 1, next;
    printf("Fibonacci series (%d terms) : ", n);

    for (int i = 0; i < n; i++) {
        if (i <= 1) {
            next = i;
        } else {
            next = first + second;
            first = second;
            second = next;
        }
        // Print inside the loop so every term shows up
        printf("%d ", next);
    }
    printf("\n");
}