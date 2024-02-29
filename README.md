## Code interview Content

- [x] [Basic Java concepts](https://www.w3schools.com/java/java_getstarted.asp)
- [ ] [Course for non-readers](https://youtu.be/eIrMbAQSU34?si=xHUChOvy77mDuMwV)
- [ ] [Data Structure](https://www.geeksforgeeks.org/what-is-data-structure-types-classifications-and-applications/)
  - [ ] [Don't Feel confidence enough?](https://youtu.be/0SARbwvhupQ?si=LxAG4L_LmVGl2dcj)
  - [ ] [To pass 3 hours coding without stop](https://youtu.be/_ITiwPMUzho?si=lvyr4S1eK7-t9ouY)
- [ ] [How to pass in a big tech](https://www.youtube.com/watch?v=YJZCUhxNCv8&ab_channel=SJTech)
- [ ] [important know C about how program works ](http://cslabcms.nju.edu.cn/problem_solving/images/c/cc/The_C_Programming_Language_%282nd_Edition_Ritchie_Kernighan%29.pdf)


## Books List to learn and Videos

- [ ] [(Book)  | Learn C is a Prerequisite](http://cslabcms.nju.edu.cn/problem_solving/images/c/cc/The_C_Programming_Language_%282nd_Edition_Ritchie_Kernighan%29.pdf)
  - C is everywhere. Books, lectures and videos.
  - Understanding C helps you understand how programs and memory work
- [ ] [(Book)  | Algorithms - Sedgewick and Wayne](https://github.com/Mcdonoughd/CS2223/blob/master/Books/Algorithhms%204th%20Edition%20by%20Robert%20Sedgewick%2C%20Kevin%20Wayne.pdf)
- [ ] [(Book)  | Data Structures and Algorithms in Java](https://bedford-computing.co.uk/learning/wp-content/uploads/2016/08/Data-Structures-and-Algorithms-in-Java-6th-Edition.pdf)
- [ ] [(video) | How does CPU execute program ](https://www.youtube.com/watch?v=vqs_0W-MSB0&ab_channel=Fireship)
- [ ] [(video) | Machine Code Instructions](https://www.youtube.com/watch?v=Mv2XQgpbTNE&ab_channel=JohnPhilipJones)


### 1. You Won't Remember it All

I watched hours of videos and took copious notes, and months later there was much I didn't remember. I spent 3 days going through my notes and making flashcards so I could review. Read please so you won't make my mistakes:

[Retaining Computer Science Knowledge](https://startupnextdoor.com/retaining-computer-science-knowledge/)

### 2. Use Flashcards

To solve the problem, I made a little flashcards site where I could add flashcards of 2 types: general and code. Each card has different formatting. use this app for pc or mobile to write your notes: [Anki](https://ankiweb.net/) or [Notion](https://www.notion.so). Note on flashcards: The first time you recognize you know the answer, don't mark it as known. You have to see the same card and answer it several times correctly before you really know it. Repetition will put that knowledge deeper in your brain.

## Algorithmic complexity / Big-O / Asymptotic analysis

- [ ] [(video) | BigO notation simple Javascript code](https://www.youtube.com/watch?v=itn09C2ZB9Y&ab_channel=WebDevSimplified)
- [ ] [(video) | Big O Notation - Code Examples](https://www.youtube.com/watch?v=CB8JPjg_3cM&ab_channel=KeepOnCoding)
- [ ] [(Book)  | A Gentle Introduction to Algorithm Complexity Analysis](https://discrete.gr/complexity/)
- [ ] [(video) | Order of growth](https://www.youtube.com/watch?v=l1nKM7by1LY&ab_channel=JohnDeNero)
- [ ] [(video) | Asymptotics](https://www.youtube.com/watch?v=0oDAlMwTrLo&ab_channel=BackToBackSWE)
- [ ] [(video) | Amortized analysis](https://www.youtube.com/results?search_query=Amortized+Analysis+-+Potential+functions)
- [ ] [(video) | ilustration "Big O"](https://www.youtube.com/watch?v=BgLTDT03QtU&ab_channel=NeetCode)
- [ ] TopCoder (includes recurrence relations and master theorem):
  - [] [Computational Complexity: Section 1](https://www.topcoder.com/thrive/articles/Computational%20Complexity%20part%20one)
  - [] [Computational Complexity: Section 2](https://www.topcoder.com/thrive/articles/Computational%20Complexity%20part%20two)
- [ ] [(Book)  | cheat sheet](https://www.bigocheatsheet.com/)


## Data Structure

Understanding data structures is fundamental for designing efficient algorithms and optimizing software performance.

<img width="1567" src="https://github.com/Guilhermefonseca2021/Ecoleta-web/assets/92196697/68918339-73d5-4f41-9eb3-0272d0851cc4">

- ### Arrays
  - [ ] Description
    - [array explanation](https://www.coursera.org/lecture/data-structures/arrays-OsBSF)
    - [Single and multi-dimensional array](https://www.youtube.com/watch?v=1FZD8W6rzNQ&ab_channel=ScholarHat)
    - [Multi dimensional](https://youtu.be/36z4qgN3GWw?si=eRPjgeVbyuoULqge)
    - [Dinamic Array](https://youtu.be/Ij7NQ-0mIVA?si=vTPsaGFp4AMc2ErM)
    - [Jagged array](https://youtu.be/m-QmN3CjhRk?si=ur24sGHhHImM3GT5)
    - [Resizing array](https://youtu.be/I1kAg6cwNNQ?si=M7xZRgJOnCAIKQST)
    - [ ] Implement a vector (mutable array with automatic resizing):
        - [ ] Practice coding using arrays and pointers, and pointer math to jump to an index instead of using indexing.
        - [ ] new raw data array with allocated memory
            - can allocate int array under the hood, just not use its features
            - start with 16, or if starting number is greater, use power of 2 - 16, 32, 64, 128
        - [ ] size() - number of items
        - [ ] capacity() - number of items it can hold
        - [ ] is_empty()
        - [ ] at(index) - returns item at given index, blows up if index out of bounds
        - [ ] push(item)
        - [ ] insert(index, item) - inserts item at index, shifts that index's value and trailing elements to the right
        - [ ] prepend(item) - can use insert above at index 0
        - [ ] pop() - remove from end, return value
        - [ ] delete(index) - delete item at index, shifting all trailing elements left
        - [ ] remove(item) - looks for value and removes index holding it (even if in multiple places)
        - [ ] find(item) - looks for value and returns first index with that value, -1 if not found
        - [ ] resize(new_capacity) // private function
            - when you reach capacity, resize to double the size
            - when popping an item, if size is 1/4 of capacity, resize to half
    - [ ] Time
        - O(1) to add/remove at end (amortized for allocations for more space), index, or update
        - O(n) to insert/remove elsewhere
    - [ ] Space
        - contiguous in memory, so proximity helps performance
        - space needed = (array capacity, which is >= n) * size of item, but even if 2n, still O(n)

- ### Linked Lists
    - [ ] Description:
        - [ ] [(video)  | Singly Linked Lists](https://www.coursera.org/learn/data-structures/lecture/kHhgK/singly-linked-lists)
        - [ ] [(video)  | Linked Lists 1 ](https://www.youtube.com/watch?v=F8AbOfQwl1c&ab_channel=MichaelSambol)
    - [ ] [(video | C Code )](https://youtu.be/udfbq4M2Kfc?si=RveDhVcalUXNWWZm)
    - [ ] Linked List vs Arrays:
        - [Core Linked Lists Vs Arrays (video)](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/rjBs9/core-linked-lists-vs-arrays)
        - [In The Real World Linked Lists Vs Arrays (video)](https://www.youtube.com/watch?v=34ky600VTN0&ab_channel=SimonDev)




















    - [ ] [why you should avoid linked lists (video)](https://www.youtube.com/watch?v=YQs6IC-vgmo)
    - [ ] Gotcha: you need pointer to pointer knowledge:
        (for when you pass a pointer to a function that may change the address where that pointer points)
        This page is just to get a grasp on ptr to ptr. I don't recommend this list traversal style. Readability and maintainability suffer due to cleverness.
        - [Pointers to Pointers](https://www.eskimo.com/~scs/cclass/int/sx8.html)
    - [ ] implement (I did with tail pointer & without):
        - [ ] size() - returns number of data elements in list
        - [ ] empty() - bool returns true if empty
        - [ ] value_at(index) - returns the value of the nth item (starting at 0 for first)
        - [ ] push_front(value) - adds an item to the front of the list
        - [ ] pop_front() - remove front item and return its value
        - [ ] push_back(value) - adds an item at the end
        - [ ] pop_back() - removes end item and returns its value
        - [ ] front() - get value of front item
        - [ ] back() - get value of end item
        - [ ] insert(index, value) - insert value at index, so current item at that index is pointed to by new item at index
        - [ ] erase(index) - removes node at given index
        - [ ] value_n_from_end(n) - returns the value of the node at nth position from the end of the list
        - [ ] reverse() - reverses the list
        - [ ] remove_value(value) - removes the first item in the list with this value
    - [ ] Doubly-linked List
        - [Description (video)](https://www.coursera.org/learn/data-structures/lecture/jpGKD/doubly-linked-lists)
        - No need to implement

- ### Stack
    - [ ] [Stacks (video)](https://www.coursera.org/learn/data-structures/lecture/UdKzQ/stacks)
    - [ ] [Using Stacks Last-In First-Out (video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Using-stacks-last-first-out/149042/177120-4.html)
    - [ ] Will not implement. Implementing with array is trivial.

- ### Queue
    - [ ] [Using Queues First-In First-Out(video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Using-queues-first-first-out/149042/177122-4.html)
    - [ ] [Queue (video)](https://www.coursera.org/learn/data-structures/lecture/EShpq/queue)
    - [ ] [Circular buffer/FIFO](https://en.wikipedia.org/wiki/Circular_buffer)
    - [ ] [Priority Queues (video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Priority-queues-deques/149042/177123-4.html)
    - [ ] Implement using linked-list, with tail pointer:
        - enqueue(value) - adds value at position at tail
        - dequeue() - returns value and removes least recently added element (front)
        - empty()
    - [ ] Implement using fixed-sized array:
        - enqueue(value) - adds item at end of available storage
        - dequeue() - returns value and removes least recently added element
        - empty()
        - full()
    - [ ] Cost:
        - a bad implementation using linked list where you enqueue at head and dequeue at tail would be O(n)
            because you'd need the next to last element, causing a full traversal each dequeue
        - enqueue: O(1) (amortized, linked list and array [probing])
        - dequeue: O(1) (linked list and array)
        - empty: O(1) (linked list and array)

- ### Hash table
    - [ ] Videos:
        - [ ] [Hashing with Chaining (video)](https://www.youtube.com/watch?v=0M_kIqhwbFo&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=8)
        - [ ] [Table Doubling, Karp-Rabin (video)](https://www.youtube.com/watch?v=BRO7mVIFt08&index=9&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
        - [ ] [Open Addressing, Cryptographic Hashing (video)](https://www.youtube.com/watch?v=rvdJDijO2Ro&index=10&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
        - [ ] [PyCon 2010: The Mighty Dictionary (video)](https://www.youtube.com/watch?v=C4Kc8xzcA68)
        - [ ] [(Advanced) Randomization: Universal & Perfect Hashing (video)](https://www.youtube.com/watch?v=z0lJ2k0sl1g&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp&index=11)
        - [ ] [(Advanced) Perfect hashing (video)](https://www.youtube.com/watch?v=N0COwN14gt0&list=PL2B4EEwhKD-NbwZ4ezj7gyc_3yNrojKM9&index=4)

    - [ ] Online Courses:
        - [ ] [Understanding Hash Functions (video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Understanding-hash-functions/149042/177126-4.html)
        - [ ] [Using Hash Tables (video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Using-hash-tables/149042/177127-4.html)
        - [ ] [Supporting Hashing (video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Supporting-hashing/149042/177128-4.html)
        - [ ] [Language Support Hash Tables (video)](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Language-support-hash-tables/149042/177129-4.html)
        - [ ] [Core Hash Tables (video)](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/m7UuP/core-hash-tables)
        - [ ] [Data Structures (video)](https://www.coursera.org/learn/data-structures/home/week/3)
        - [ ] [Phone Book Problem (video)](https://www.coursera.org/learn/data-structures/lecture/NYZZP/phone-book-problem)
        - [ ] distributed hash tables:
            - [Instant Uploads And Storage Optimization In Dropbox (video)](https://www.coursera.org/learn/data-structures/lecture/DvaIb/instant-uploads-and-storage-optimization-in-dropbox)
            - [Distributed Hash Tables (video)](https://www.coursera.org/learn/data-structures/lecture/tvH8H/distributed-hash-tables)

    - [ ] implement with array using linear probing
        - hash(k, m) - m is size of hash table
        - add(key, value) - if key already exists, update value
        - exists(key)
        - get(key)
        - remove(key)


made with 💜 by GUILHERME FONSECA 👋 [See my linked-in](https://www.linkedin.com/in/guilherme-fonseca-dos-santos-a49594207/)

##Contributors

welcome to send more information will be always good receive your proposals to implement to the repository.
