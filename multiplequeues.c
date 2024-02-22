#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* link;
} node;

node* front = NULL;
node* rear = NULL;

void push(int data) {
    node* newNode = (node*)malloc(sizeof(node));
    newNode->data = data;
    newNode->link = NULL;

    if (front == NULL)
        front = newNode;
    else
        rear->link = newNode;

    rear = newNode;
}

void pop() {
    if (front != NULL) {
        node* temp = front;
        printf("Popped: %d\n", front->data);
        front = front->link;
        free(temp);
    } else {
        printf("Queue is EMPTY\n");
    }
}

void display() {
    printf("Queue:\n");
    if (front != NULL) {
        node* temp = front;
        while (temp != NULL) {
            printf("%5d", temp->data);
            temp = temp->link;
        }
    } else {
        printf("Queue is empty");
    }
    printf("\n");
}

int main() {
    int choice, data;
    printf("MENU\n1. Push\n2. Pop\n3. Display\n4. Exit\n\n");

    do {
        printf("Choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Element: ");
                scanf("%d", &data);
                push(data);
                break;

            case 2:
                pop();
                break;

            case 3:
                display();
                break;

            case 4:
                printf("Exit\n");
                break;

            default:
                printf("Invalid choice\n");
        }
        printf("\n");

    } while (choice != 4);

    return 0;
}