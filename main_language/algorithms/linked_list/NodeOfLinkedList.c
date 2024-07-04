// recall, node representation.
// [data] [link]
// #include <stdio.h>
// #include <stdlib.h>

struct node {
    int data;
    struct node *link;
};

int main() {
    struct node *head = NULL;
    // [data] [link]
    //  1000
    //    ^
    //    |
    //    |
    // [1000]
    head = (struct node *) malloc(sizeof(struct node));
    
    head->data = 45;
    head->link = NULL;
    //  [45]  [null]
    //  1000
    //    ^
    //    |
    //    |
    // [1000]
    print("%d", head->data);
    return 0;
};