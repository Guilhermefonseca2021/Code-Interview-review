## Code interview Content

- [x] [Basic Java concepts](https://www.w3schools.com/java/java_getstarted.asp)
- [ ] [Course for non-readers](https://youtu.be/eIrMbAQSU34?si=xHUChOvy77mDuMwV)
- [x] [Data Structure](https://www.geeksforgeeks.org/what-is-data-structure-types-classifications-and-applications/)
  - [ ] [Don't Feel confidence enough?](https://youtu.be/0SARbwvhupQ?si=LxAG4L_LmVGl2dcj)
  - [ ] [CS50 lecture by marking suckerberg](https://www.youtube.com/watch?v=xFFs9UgOAlE&ab_channel=CS50)
  - [x] [10 years of coding in 13 minutes](https://www.youtube.com/watch?v=1fPWr0d5zBE&ab_channel=JomaTech)
  - [x] [To pass 3 hours coding without stop](https://youtu.be/YF1eYbfbH5k?si=ESNsc21eeYHRm-d9)
- [x] [How to pass in a big tech](https://www.youtube.com/watch?v=YJZCUhxNCv8&ab_channel=SJTech)
- [x] [what's really data-science?](https://www.youtube.com/watch?v=xC-c7E5PK0Y&ab_channel=JomaTech)

## Books List to learn and Videos

- [ ] [(Book) | Learn C is a Prerequisite](http://cslabcms.nju.edu.cn/problem_solving/images/c/cc/The_C_Programming_Language_%282nd_Edition_Ritchie_Kernighan%29.pdf)
  - C is everywhere. Books, lectures and videos.
  - Understanding C helps you understand how programs and memory work
- [ ] [(Book) | Algorithms - Sedgewick and Wayne](https://github.com/Mcdonoughd/CS2223/blob/master/Books/Algorithhms%204th%20Edition%20by%20Robert%20Sedgewick%2C%20Kevin%20Wayne.pdf)
- [ ] [(Book) | Data Structures and Algorithms in Java](https://github.com/shshankar1/ebooks/blob/master/Data%20Structures%20and%20Algorithms%20in%20Java%2C%206th%20Edition.pdf)
- [x] [(video) | How does CPU execute program ](https://www.youtube.com/watch?v=vqs_0W-MSB0&ab_channel=Fireship)
- [x] [(video) | Machine Code Instructions](https://www.youtube.com/watch?v=HWpi9n2H3kE&t=569s&ab_channel=The8-BitGuy)
- [x] [(video) | Fetch-Execute Code instruction](https://www.youtube.com/watch?v=Z5JC9Ve1sfI&t=470s&ab_channel=TomScott)

### 1. You Won't Remember it All

I watched hours of videos and took copious notes, and months later there was much I didn't remember. I spent 3 days going through my notes and making flashcards so I could review. Read please so you won't make my mistakes:

[Retaining Computer Science Knowledge](https://startupnextdoor.com/retaining-computer-science-knowledge/)

### 2. Use Flashcards

To solve the problem, I made a little flashcards site where I could add flashcards of 2 types: general and code. Each card has different formatting. use this app for pc or mobile to write your notes: [Anki](https://ankiweb.net/) or [Notion](https://www.notion.so). Note on flashcards: The first time you recognize you know the answer, don't mark it as known. You have to see the same card and answer it several times correctly before you really know it. Repetition will put that knowledge deeper in your brain.

## Algorithmic complexity / Big-O / Asymptotic analysis

- [x] [(video) | BigO notation & time complexity](https://youtu.be/D6xkbGLQesk?si=J7ua6EFclOsRKtpy)
- [x] [(video) | Big O Notation - Code Examples](https://www.youtube.com/watch?v=CB8JPjg_3cM&ab_channel=KeepOnCoding)
- [ ] [(read) | A Gentle Introduction to Algorithm Complexity Analysis](https://discrete.gr/complexity/)
- [x] [(video) | Order of growth](https://www.youtube.com/watch?v=l1nKM7by1LY&ab_channel=JohnDeNero)
- [x] [(video) | Asymptotics](https://www.youtube.com/watch?v=0oDAlMwTrLo&ab_channel=BackToBackSWE)
- [x] [(video) | Amortized analysis](https://www.youtube.com/watch?v=3MpzavN3Mco&t=2255s&ab_channel=MITOpenCourseWare)
- [x] [(video) | ilustration "Big O"](https://www.youtube.com/watch?v=BgLTDT03QtU&ab_channel=NeetCode)
- [ ] TopCoder (includes recurrence relations and master theorem):
  - [] [Computational Complexity: Section 1](https://www.topcoder.com/thrive/articles/Computational%20Complexity%20part%20one)
  - [] [Computational Complexity: Section 2](https://www.topcoder.com/thrive/articles/Computational%20Complexity%20part%20two)
- [ ] [(read) | cheat sheet algorithms](https://www.bigocheatsheet.com/)

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/91395136-ad04-476d-9766-a9e1cea1c956">

## Data Structure

Understanding data structures is fundamental for designing efficient algorithms and optimizing software performance.

<img width="1567" src="https://github.com/Guilhermefonseca2021/Ecoleta-web/assets/92196697/68918339-73d5-4f41-9eb3-0272d0851cc4">

- ### Arrays

  - [x] Description
    - [x] [array explanation](https://www.coursera.org/lecture/data-structures/arrays-OsBSF)
    - [x] [Single and multi-dimensional array](https://www.youtube.com/watch?v=1FZD8W6rzNQ&ab_channel=ScholarHat)
    - [x] [Dinamic Array](https://youtu.be/Ij7NQ-0mIVA?si=vTPsaGFp4AMc2ErM)
    - [x] [Jagged array](https://youtu.be/m-QmN3CjhRk?si=ur24sGHhHImM3GT5)
    - [x] [Resizing array](https://www.youtube.com/watch?v=CCLPUWyVg2A&t=12s&ab_channel=DineshVaryani)
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
  - [ ] resize(new_capacity) // private function-
    - when you reach capacity, resize to double the size
    - when popping an item, if size is 1/4 of capacity, resize to half
  - [ ] Time
    - O(1) to add/remove at end (amortized for allocations for more space), index, or update
    - O(n) to insert/remove elsewhere
  - [ ] Space
    - contiguous in memory, so proximity helps performance
    - space needed = (array capacity, which is >= n) \* size of item, but even if 2n, still O(n)

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/b505528b-7e6b-4f97-a711-8d3f466e7c54">

- ### Linked Lists

  - [x] Description:
    - [x] [(video) | Linked Lists 1 ](https://youtu.be/N6dOwBde7-M?si=WcPglR-DpCGpbBUj)
    - [x] [(video) | Singly Linked Lists](https://www.youtube.com/watch?v=HB7TcYklBHY&t=4s&ab_channel=TechWithTim)
  - [ ] [(video) | C Node Structes](https://www.youtube.com/watch?v=DneLxrPmmsw&ab_channel=NesoAcademy)
  - [ ] [(video  | C code memory allocation)](https://www.youtube.com/watch?v=udfbq4M2Kfc&ab_channel=NesoAcademy)
  - [ ] Linked List vs Arrays:

    - [(read) | Core Linked Lists Vs Arrays](https://www.geeksforgeeks.org/linked-list-vs-array/)
    - [(video)| In The Real World Linked Lists Vs Arrays](https://www.youtube.com/watch?v=DyG9S9nAlUM&ab_channel=Computerphile)

  - [ ] [(video) | why you should avoid linked lists (video)](https://youtu.be/cvZArAipOjo?si=iiEOWFyLXeVo8OXx)
  - [ ] Gotcha: you need pointer to pointer knowledge:
        (for when you pass a pointer to a function that may change the address where that pointer points)
        This page is just to get a grasp on ptr to ptr. I don't recommend this list traversal style. Readability and maintainability suffer due to cleverness.
    - [(read) | Pointers to Pointers](https://www.eskimo.com/~scs/cclass/int/sx8.html)
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
    - [(video) | Description](https://www.youtube.com/watch?v=3RzC2NrCO24&ab_channel=TechWithTim)
    - No need to implement

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/52982d4b-7e2e-46bf-9a14-d9d910be146b">

- ### Stack

  - [ ] [(video) | Stacks ](https://youtu.be/KInG04mAjO0?si=cQ-jsoWCSXoB6D1a)
  - [ ] [(video) | Using Stacks Last-In First-Out](https://www.lynda.com/Developer-Programming-Foundations-tutorials/Using-stacks-last-first-out/149042/177120-4.html)
  - [ ] [(video | Implementation with array.](https://youtu.be/rS-ZKTqwi90?si=BGukDByV2qMZit20)

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/0302f364-4c8b-4228-989a-8aa1cc1fd4df">

- ### Queue

  - [ ] [(video) | Using Queues First-In First-Out](https://youtu.be/nqXaPZi99JI?si=hZGTCDYHl3VYGy47)
  - [ ] [(video) | Queue](https://www.coursera.org/learn/data-structures/lecture/EShpq/queue)
  - [ ] [(video) | Circular buffer/FIFO](https://youtu.be/lPdSHEh8LiU?si=M0CCHziyqPXMHnOE)
  - [ ] [(video) | Priority Queues](https://youtu.be/_U1AJZQxYTU?si=uHF0HQAIHGgr3Zqd)
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

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/723c47aa-e444-49b6-863d-60a316a28d05">

- ### Hash table

  - [ ] Videos:

    - [ ] [(video) | Hashing with Chaining](https://youtu.be/kF74yQLxulQ?si=NCFzVvlJoVsx--nW)
    - [ ] [(video) | Table Doubling, Karp-Rabin](https://youtu.be/H5e9V5x92vI?si=vkPQYAJdHFWLprBu)
    - [ ] [(video) | Open Addressing, Cryptographic Hashing](https://youtu.be/xIejolxzZS8?si=wIy1zNVuMJFiXaC6)
    - [ ] [(video) | PyCon 2010: The Mighty Dictionary](https://www.youtube.com/watch?v=C4Kc8xzcA68)
    - [ ] [(video - Advanced) | Randomization: Universal & Perfect Hashing](https://youtu.be/z0lJ2k0sl1g?si=XG0g3UdLZRnzVGuu)
    - [ ] [(video - Advanced) | Perfect hashing](https://youtu.be/clejnmwXH18?si=WCN8yuqhVBKfoxqY)

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

## More Knowledge

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/59f315b5-765d-418b-bd76-ff3fc26f3db2">

- ### Binary search
  - [ ] [(video) | Binary Search ](https://youtu.be/MFhxShGxHWc?si=B6CtcGAzh5IxqCoS)
  - [ ] [(course) | Binary Search](https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search)
  - [ ] [detail](https://www.topcoder.com/community/data-science/data-science-tutorials/binary-search/)
  - [ ] Implement:
    - binary search (on sorted array of integers)
    - binary search using recursion

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/ac799285-31a3-4593-ad47-9fbfb9b9b20f">

- ### Bitwise operations
  - [ ] [Bits cheat sheet](https://github.com/jwasham/google-interview-university/blob/master/extras/cheat%20sheets/bits-cheat-cheet.pdf) - you should know many of the powers of 2 from (2^1 to 2^16 and 2^32)
  - [ ] Get a really good understanding of manipulating bits with: &, |, ^, ~, >>, <<
    - [ ] [words](<https://en.wikipedia.org/wiki/Word_(computer_architecture)>)
    - [ ] Good intro:
          [Bit Manipulation (video)](https://www.youtube.com/watch?v=7jkIUgLC29I)
    - [ ] [C Programming Tutorial 2-10: Bitwise Operators (video)](https://www.youtube.com/watch?v=d0AwjSpNXR0)
    - [ ] [Bit Manipulation](https://en.wikipedia.org/wiki/Bit_manipulation)
    - [ ] [Bitwise Operation](https://en.wikipedia.org/wiki/Bitwise_operation)
    - [ ] [Bithacks](https://graphics.stanford.edu/~seander/bithacks.html)
    - [ ] [The Bit Twiddler](http://bits.stephan-brumme.com/)
    - [ ] [The Bit Twiddler Interactive](http://bits.stephan-brumme.com/interactive.html)
  - [ ] 2s and 1s complement
    - [Binary: Plusses & Minuses (Why We Use Two's Complement) (video)](https://www.youtube.com/watch?v=lKTsv6iVxV4)
    - [1s Complement](https://en.wikipedia.org/wiki/Ones%27_complement)
    - [2s Complement](https://en.wikipedia.org/wiki/Two%27s_complement)
  - [ ] count set bits
    - [4 ways to count bits in a byte (video)](https://youtu.be/Hzuzo9NJrlc)
    - [Count Bits](https://graphics.stanford.edu/~seander/bithacks.html#CountBitsSetKernighan)
    - [How To Count The Number Of Set Bits In a 32 Bit Integer](http://stackoverflow.com/questions/109023/how-to-count-the-number-of-set-bits-in-a-32-bit-integer)
  - [ ] round to next power of 2:
    - [Round Up To Next Power Of Two](http://bits.stephan-brumme.com/roundUpToNextPowerOfTwo.html)
  - [ ] swap values:
    - [Swap](http://bits.stephan-brumme.com/swap.html)
  - [ ] absolute value:
    - [Absolute Integer](http://bits.stephan-brumme.com/absInteger.html)

## Trees

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/ba6e3f13-dec1-4469-95a0-c42e9becfcb5">

- ### Trees - Notes & Background
  - [ ] [Series: Core Trees (video)](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/ovovP/core-trees)
  - [ ] [Series: Trees (video)](https://www.coursera.org/learn/data-structures/lecture/95qda/trees)
  - basic tree construction
  - traversal
  - manipulation algorithms
  - BFS (breadth-first search)
    - [MIT (video)](https://www.youtube.com/watch?v=s-CYnVz-uh4&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=13)
    - level order (BFS, using queue)
      time complexity: O(n)
      space complexity: best: O(1), worst: O(n/2)=O(n)
  - DFS (depth-first search)
    - [MIT (video)](https://www.youtube.com/watch?v=AfSk24UTFS8&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=14)
    - notes:
      time complexity: O(n)
      space complexity:
      best: O(log n) - avg. height of tree
      worst: O(n)
    - inorder (DFS: left, self, right)
    - postorder (DFS: left, right, self)
    - preorder (DFS: self, left, right)

<img width="1567" src="https://github.com/Guilhermefonseca2021/Code-Interview-review/assets/92196697/efa0b163-631f-4c0d-bd81-1463ed9bf64d">

- ### Binary search trees: BSTs

  - [ ] [(video) | Binary Search Tree Review](https://youtu.be/Gt2yBZAhsGM?si=P2IVTyB5dALOeXIz)
  - [ ] [(course) | Series ](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/p82sw/core-introduction-to-binary-search-trees)
    - starts with symbol table and goes through BST applications
  - [ ] [(video) | Introduction](https://www.coursera.org/learn/data-structures/lecture/E7cXP/introduction)
  - [ ] [MIT (video)](https://www.youtube.com/watch?v=9Jry5-82I68)
  - C/C++:
    - [ ] [Binary search tree - Implementation in C/C++ (video)](https://www.youtube.com/watch?v=COZK7NATh4k&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=28)
    - [ ] [BST implementation - memory allocation in stack and heap (video)](https://www.youtube.com/watch?v=hWokyBoo0aI&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=29)
    - [ ] [Find min and max element in a binary search tree (video)](https://www.youtube.com/watch?v=Ut90klNN264&index=30&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Find height of a binary tree (video)](https://www.youtube.com/watch?v=_pnqMz5nrRs&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=31)
    - [ ] [Binary tree traversal - breadth-first and depth-first strategies (video)](https://www.youtube.com/watch?v=9RHO6jU--GU&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=32)
    - [ ] [Binary tree: Level Order Traversal (video)](https://www.youtube.com/watch?v=86g8jAQug04&index=33&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Binary tree traversal: Preorder, Inorder, Postorder (video)](https://www.youtube.com/watch?v=gm8DUJJhmY4&index=34&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Check if a binary tree is binary search tree or not (video)](https://www.youtube.com/watch?v=yEwSGhSsT0U&index=35&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Delete a node from Binary Search Tree (video)](https://www.youtube.com/watch?v=gcULXE7ViZw&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=36)
    - [ ] [Inorder Successor in a binary search tree (video)](https://www.youtube.com/watch?v=5cPbNCrdotA&index=37&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
  - [ ] Implement:
    - [ ] insert // insert value into tree
    - [ ] get_node_count // get count of values stored
    - [ ] print_values // prints the values in the tree, from min to max
    - [ ] delete_tree
    - [ ] is_in_tree // returns true if given value exists in the tree
    - [ ] get_height // returns the height in nodes (single node's height is 1)
    - [ ] get_min // returns the minimum value stored in the tree
    - [ ] get_max // returns the maximum value stored in the tree
    - [ ] is_binary_search_tree
    - [ ] delete_value
    - [ ] get_successor // returns next-highest value in tree after given value, -1 if none

- ### Heap / Priority Queue / Binary Heap
  - visualized as a tree, but is usually linear in storage (array, linked list)
  - [ ] [Heap](<https://en.wikipedia.org/wiki/Heap_(data_structure)>)
  - [ ] [Introduction (video)](https://www.coursera.org/learn/data-structures/lecture/2OpTs/introduction)
  - [ ] [Naive Implementations (video)](https://www.coursera.org/learn/data-structures/lecture/z3l9N/naive-implementations)
  - [ ] [Binary Trees (video)](https://www.coursera.org/learn/data-structures/lecture/GRV2q/binary-trees)
  - [ ] [Tree Height Remark (video)](https://www.coursera.org/learn/data-structures/supplement/S5xxz/tree-height-remark)
  - [ ] [Basic Operations (video)](https://www.coursera.org/learn/data-structures/lecture/0g1dl/basic-operations)
  - [ ] [Complete Binary Trees (video)](https://www.coursera.org/learn/data-structures/lecture/gl5Ni/complete-binary-trees)
  - [ ] [Pseudocode (video)](https://www.coursera.org/learn/data-structures/lecture/HxQo9/pseudocode)
  - [ ] [Heap Sort - jumps to start (video)](https://youtu.be/odNJmw5TOEE?list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&t=3291)
  - [ ] [Heap Sort (video)](https://www.coursera.org/learn/data-structures/lecture/hSzMO/heap-sort)
  - [ ] [Building a heap (video)](https://www.coursera.org/learn/data-structures/lecture/dwrOS/building-a-heap)
  - [ ] [MIT: Heaps and Heap Sort (video)](https://www.youtube.com/watch?v=B7hVxCmfPtM&index=4&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
  - [ ] [CS 61B Lecture 24: Priority Queues (video)](https://www.youtube.com/watch?v=yIUFT6AKBGE&index=24&list=PL4BBB74C7D2A1049C)
  - [ ] [Linear Time BuildHeap (max-heap)](https://www.youtube.com/watch?v=MiyLo8adrWw)
  - [ ] Implement a max-heap:
    - [ ] insert
    - [ ] sift_up - needed for insert
    - [ ] get_max - returns the max item, without removing it
    - [ ] get_size() - return number of elements stored
    - [ ] is_empty() - returns true if heap contains no elements
    - [ ] extract_max - returns the max item, removing it
    - [ ] sift_down - needed for extract_max
    - [ ] remove(i) - removes item at index x
    - [ ] heapify - create a heap from an array of elements, needed for heap_sort
    - [ ] heap_sort() - take an unsorted array and turn it into a sorted array in-place using a max heap
      - note: using a min heap instead would save operations, but double the space needed (cannot do in-place).

## Sorting

- [ ] Notes:

  - Implement sorts & know best case/worst case, average complexity of each:
    - no bubble sort - it's terrible - O(n^2), except when n <= 16
  - [ ] stability in sorting algorithms ("Is Quicksort stable?")
    - [Sorting Algorithm Stability](https://en.wikipedia.org/wiki/Sorting_algorithm#Stability)
    - [Stability In Sorting Algorithms](http://stackoverflow.com/questions/1517793/stability-in-sorting-algorithms)
    - [Stability In Sorting Algorithms](http://www.geeksforgeeks.org/stability-in-sorting-algorithms/)
    - [Sorting Algorithms - Stability](http://homepages.math.uic.edu/~leon/cs-mcs401-s08/handouts/stability.pdf)
  - [ ] Which algorithms can be used on linked lists? Which on arrays? Which on both?
    - I wouldn't recommend sorting a linked list, but merge sort is doable.
    - [Merge Sort For Linked List](http://www.geeksforgeeks.org/merge-sort-for-linked-list/)

- For heapsort, see Heap data structure above. Heap sort is great, but not stable.

- [ ] [Sedgewick - Mergesort (5 videos)](https://www.youtube.com/watch?v=4nKwesx_c8E&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9)

  - [ ] [1. Mergesort](https://www.youtube.com/watch?v=4nKwesx_c8E&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9&index=1)
  - [ ] [2. Bottom up Mergesort](https://www.youtube.com/watch?v=HGOIGUYjeyk&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9&index=2)
  - [ ] [3. Sorting Complexity](https://www.youtube.com/watch?v=WvU_mIWo0Ac&index=3&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9)
  - [ ] [4. Comparators](https://www.youtube.com/watch?v=7MvC1kmBza0&index=4&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9)
  - [ ] [5. Stability](https://www.youtube.com/watch?v=XD_5iINB5GI&index=5&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9)

- [ ] [Sedgewick - Quicksort (4 videos)](https://www.youtube.com/playlist?list=PLe-ggMe31CTeE3x2-nF1-toca1QpuXwE1)

  - [ ] [1. Quicksort](https://www.youtube.com/watch?v=5M5A7qPWk84&index=1&list=PLe-ggMe31CTeE3x2-nF1-toca1QpuXwE1)
  - [ ] [2. Selection](https://www.youtube.com/watch?v=CgVYfSyct_M&index=2&list=PLe-ggMe31CTeE3x2-nF1-toca1QpuXwE1)
  - [ ] [3. Duplicate Keys](https://www.youtube.com/watch?v=WBFzOYJ5ybM&index=3&list=PLe-ggMe31CTeE3x2-nF1-toca1QpuXwE1)
  - [ ] [4. System Sorts](https://www.youtube.com/watch?v=rejpZ2htBjE&index=4&list=PLe-ggMe31CTeE3x2-nF1-toca1QpuXwE1)

- [ ] UC Berkeley:

  - [ ] [CS 61B Lecture 29: Sorting I (video)](https://www.youtube.com/watch?v=EiUvYS2DT6I&list=PL4BBB74C7D2A1049C&index=29)
  - [ ] [CS 61B Lecture 30: Sorting II (video)](https://www.youtube.com/watch?v=2hTY3t80Qsk&list=PL4BBB74C7D2A1049C&index=30)
  - [ ] [CS 61B Lecture 32: Sorting III (video)](https://www.youtube.com/watch?v=Y6LOLpxg6Dc&index=32&list=PL4BBB74C7D2A1049C)
  - [ ] [CS 61B Lecture 33: Sorting V (video)](https://www.youtube.com/watch?v=qNMQ4ly43p4&index=33&list=PL4BBB74C7D2A1049C)

- [ ] [Bubble Sort (video)](https://www.youtube.com/watch?v=P00xJgWzz2c&index=1&list=PL89B61F78B552C1AB)
- [ ] [Analyzing Bubble Sort (video)](https://www.youtube.com/watch?v=ni_zk257Nqo&index=7&list=PL89B61F78B552C1AB)
- [ ] [Insertion Sort, Merge Sort (video)](https://www.youtube.com/watch?v=Kg4bqzAqRBM&index=3&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
- [ ] [Insertion Sort (video)](https://www.youtube.com/watch?v=c4BRHC7kTaQ&index=2&list=PL89B61F78B552C1AB)
- [ ] [Merge Sort (video)](https://www.youtube.com/watch?v=GCae1WNvnZM&index=3&list=PL89B61F78B552C1AB)
- [ ] [Quicksort (video)](https://www.youtube.com/watch?v=y_G9BkAm6B8&index=4&list=PL89B61F78B552C1AB)
- [ ] [Selection Sort (video)](https://www.youtube.com/watch?v=6nDMgr0-Yyo&index=8&list=PL89B61F78B552C1AB)

- [ ] Merge sort code:
  - [ ] [Using output array (C)](http://www.cs.yale.edu/homes/aspnes/classes/223/examples/sorting/mergesort.c)
  - [ ] [Using output array (Python)](https://github.com/jwasham/practice-python/blob/master/merge_sort/merge_sort.py)
  - [ ] [In-place (C++)](https://github.com/jwasham/practice-cpp/blob/master/merge_sort/merge_sort.cc)
- [ ] Quick sort code:

  - [ ] [Implementation (C)](http://www.cs.yale.edu/homes/aspnes/classes/223/examples/randomization/quick.c)
  - [ ] [Implementation (C)](https://github.com/jwasham/practice-c/blob/master/quick_sort/quick_sort.c)
  - [ ] [Implementation (Python)](https://github.com/jwasham/practice-python/blob/master/quick_sort/quick_sort.py)

- [ ] Implement:

  - [ ] Mergesort: O(n log n) average and worst case
  - [ ] Quicksort O(n log n) average case
  - Selection sort and insertion sort are both O(n^2) average and worst case
  - For heapsort, see Heap data structure above.

- [ ] Not required, but I recommended them:
  - [ ] [Sedgewick - Radix Sorts (6 videos)](https://www.youtube.com/playlist?list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53)
    - [ ] [1. Strings in Java](https://www.youtube.com/watch?v=zRzU-FWsjNU&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53&index=6)
    - [ ] [2. Key Indexed Counting](https://www.youtube.com/watch?v=CtgKYmXs62w&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53&index=5)
    - [ ] [3. Least Significant Digit First String Radix Sort](https://www.youtube.com/watch?v=2pGVq_BwPKs&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53&index=4)
    - [ ] [4. Most Significant Digit First String Radix Sort](https://www.youtube.com/watch?v=M3cYNY90R6c&index=3&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53)
    - [ ] [5. 3 Way Radix Quicksort](https://www.youtube.com/watch?v=YVl58kfE6i8&index=2&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53)
    - [ ] [6. Suffix Arrays](https://www.youtube.com/watch?v=HKPrVm5FWvg&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53&index=1)
  - [ ] [Radix Sort](http://www.cs.yale.edu/homes/aspnes/classes/223/notes.html#radixSort)
  - [ ] [Radix Sort (video)](https://www.youtube.com/watch?v=xhr26ia4k38)
  - [ ] [Radix Sort, Counting Sort (linear time given constraints) (video)](https://www.youtube.com/watch?v=Nz1KZXbghj8&index=7&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
  - [ ] [Randomization: Matrix Multiply, Quicksort, Freivalds' algorithm (video)](https://www.youtube.com/watch?v=cNB2lADK3_s&index=8&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp)
  - [ ] [Sorting in Linear Time (video)](https://www.youtube.com/watch?v=pOKy3RZbSws&list=PLUl4u3cNGP61hsJNdULdudlRL493b-XZf&index=14)

If you need more detail on this subject, see "Sorting" section in [Additional Detail on Some Subjects](#additional-detail-on-some-subjects)

## Graphs

Graphs can be used to represent many problems in computer science, so this section is long, like trees and sorting were.

- Notes from Yegge:

  - There are three basic ways to represent a graph in memory:
    - objects and pointers
    - matrix
    - adjacency list
  - Familiarize yourself with each representation and its pros & cons
  - BFS and DFS - know their computational complexity, their tradeoffs, and how to implement them in real code
  - When asked a question, look for a graph-based solution first, then move on if none.

- [ ] Skiena Lectures - great intro:

  - [ ] [CSE373 2012 - Lecture 11 - Graph Data Structures (video)](https://www.youtube.com/watch?v=OiXxhDrFruw&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b&index=11)
  - [ ] [CSE373 2012 - Lecture 12 - Breadth-First Search (video)](https://www.youtube.com/watch?v=g5vF8jscteo&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b&index=12)
  - [ ] [CSE373 2012 - Lecture 13 - Graph Algorithms (video)](https://www.youtube.com/watch?v=S23W6eTcqdY&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b&index=13)
  - [ ] [CSE373 2012 - Lecture 14 - Graph Algorithms (con't) (video)](https://www.youtube.com/watch?v=WitPBKGV0HY&index=14&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b)
  - [ ] [CSE373 2012 - Lecture 15 - Graph Algorithms (con't 2) (video)](https://www.youtube.com/watch?v=ia1L30l7OIg&index=15&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b)
  - [ ] [CSE373 2012 - Lecture 16 - Graph Algorithms (con't 3) (video)](https://www.youtube.com/watch?v=jgDOQq6iWy8&index=16&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b)

- [ ] Graphs (review and more):

  - [ ] [6.006 Single-Source Shortest Paths Problem (video)](https://www.youtube.com/watch?v=Aa2sqUhIn-E&index=15&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
  - [ ] [6.006 Dijkstra (video)](https://www.youtube.com/watch?v=2E7MmKv0Y24&index=16&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
  - [ ] [6.006 Bellman-Ford (video)](https://www.youtube.com/watch?v=ozsuci5pIso&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=17)
  - [ ] [6.006 Speeding Up Dijkstra (video)](https://www.youtube.com/watch?v=CHvQ3q_gJ7E&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=18)
  - [ ] [Aduni: Graph Algorithms I - Topological Sorting, Minimum Spanning Trees, Prim's Algorithm - Lecture 6 (video)](https://www.youtube.com/watch?v=i_AQT_XfvD8&index=6&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm)
  - [ ] [Aduni: Graph Algorithms II - DFS, BFS, Kruskal's Algorithm, Union Find Data Structure - Lecture 7 (video)](https://www.youtube.com/watch?v=ufj5_bppBsA&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=7)
  - [ ] [Aduni: Graph Algorithms III: Shortest Path - Lecture 8 (video)](https://www.youtube.com/watch?v=DiedsPsMKXc&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=8)
  - [ ] [Aduni: Graph Alg. IV: Intro to geometric algorithms - Lecture 9 (video)](https://www.youtube.com/watch?v=XIAQRlNkJAw&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=9)
  - [ ] [CS 61B 2014 (starting at 58:09) (video)](https://youtu.be/dgjX4HdMI-Q?list=PL-XXv-cvA_iAlnI-BQr9hjqADPBtujFJd&t=3489)
  - [ ] [CS 61B 2014: Weighted graphs (video)](https://www.youtube.com/watch?v=aJjlQCFwylA&list=PL-XXv-cvA_iAlnI-BQr9hjqADPBtujFJd&index=19)
  - [ ] [Greedy Algorithms: Minimum Spanning Tree (video)](https://www.youtube.com/watch?v=tKwnms5iRBU&index=16&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp)
  - [ ] [Strongly Connected Components Kosaraju's Algorithm Graph Algorithm (video)](https://www.youtube.com/watch?v=RpgcYiky7uw)

- Full Coursera Course:

  - [ ] [Algorithms on Graphs (video)](https://www.coursera.org/learn/algorithms-on-graphs/home/welcome)

- Yegge: If you get a chance, try to study up on fancier algorithms:

  - [ ] Dijkstra's algorithm - see above - 6.006
  - [ ] A\*
    - [ ] [A Search Algorithm](https://en.wikipedia.org/wiki/A*_search_algorithm)
    - [ ] [A\* Pathfinding Tutorial (video)](https://www.youtube.com/watch?v=KNXfSOx4eEE)
    - [ ] [A\* Pathfinding (E01: algorithm explanation) (video)](https://www.youtube.com/watch?v=-L-WgKMFuhE)

- I'll implement:
  - [ ] DFS with adjacency list (recursive)
  - [ ] DFS with adjacency list (iterative with stack)
  - [ ] DFS with adjacency matrix (recursive)
  - [ ] DFS with adjacency matrix (iterative with stack)
  - [ ] BFS with adjacency list
  - [ ] BFS with adjacency matrix
  - [ ] single-source shortest path (Dijkstra)
  - [ ] minimum spanning tree
  - DFS-based algorithms (see Aduni videos above):
    - [ ] check for cycle (needed for topological sort, since we'll check for cycle before starting)
    - [ ] topological sort
    - [ ] count connected components in a graph
    - [ ] list strongly connected components
    - [ ] check for bipartite graph

You'll get more graph practice in Skiena's book (see Books section below) and the interview books

## Even More Knowledge

- ### Recursion

  - [ ] Stanford lectures on recursion & backtracking:
    - [ ] [Lecture 8 | Programming Abstractions (video)](https://www.youtube.com/watch?v=gl3emqCuueQ&list=PLFE6E58F856038C69&index=8)
    - [ ] [Lecture 9 | Programming Abstractions (video)](https://www.youtube.com/watch?v=uFJhEPrbycQ&list=PLFE6E58F856038C69&index=9)
    - [ ] [Lecture 10 | Programming Abstractions (video)](https://www.youtube.com/watch?v=NdF1QDTRkck&index=10&list=PLFE6E58F856038C69)
    - [ ] [Lecture 11 | Programming Abstractions (video)](https://www.youtube.com/watch?v=p-gpaIGRCQI&list=PLFE6E58F856038C69&index=11)
  - when it is appropriate to use it
  - how is tail recursion better than not?
    - [ ] [What Is Tail Recursion Why Is It So Bad?](https://www.quora.com/What-is-tail-recursion-Why-is-it-so-bad)
    - [ ] [Tail Recursion (video)](https://www.youtube.com/watch?v=L1jjXGfxozc)

- ### Object-Oriented Programming

  - [ ] [Optional: UML 2.0 Series (video)](https://www.youtube.com/watch?v=OkC7HKtiZC0&list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc)
  - [ ] Object-Oriented Software Engineering: Software Dev Using UML and Java (21 videos):
    - Can skip this if you have a great grasp of OO and OO design practices.
    - [OOSE: Software Dev Using UML and Java](https://www.youtube.com/playlist?list=PLJ9pm_Rc9HesnkwKlal_buSIHA-jTZMpO)
  - [ ] SOLID OOP Principles:
    - [ ] [Bob Martin SOLID Principles of Object Oriented and Agile Design (video)](https://www.youtube.com/watch?v=TMuno5RZNeE)
    - [ ] [SOLID Design Patterns in C# (video)](https://www.youtube.com/playlist?list=PL8m4NUhTQU48oiGCSgCP1FiJEcg_xJzyQ)
    - [ ] [SOLID Principles (video)](https://www.youtube.com/playlist?list=PL4CE9F710017EA77A)
    - [ ] S - [Single Responsibility Principle](http://www.oodesign.com/single-responsibility-principle.html) | [Single responsibility to each Object](http://www.javacodegeeks.com/2011/11/solid-single-responsibility-principle.html)
      - [more flavor](https://docs.google.com/open?id=0ByOwmqah_nuGNHEtcU5OekdDMkk)
    - [ ] O - [Open/Closed Principal](http://www.oodesign.com/open-close-principle.html) | [On production level Objects are ready for extension for not for modification](https://en.wikipedia.org/wiki/Open/closed_principle)
      - [more flavor](http://docs.google.com/a/cleancoder.com/viewer?a=v&pid=explorer&chrome=true&srcid=0BwhCYaYDn8EgN2M5MTkwM2EtNWFkZC00ZTI3LWFjZTUtNTFhZGZiYmUzODc1&hl=en)
    - [ ] L - [Liskov Substitution Principal](http://www.oodesign.com/liskov-s-substitution-principle.html) | [Base Class and Derived class follow ‘IS A’ principal](http://stackoverflow.com/questions/56860/what-is-the-liskov-substitution-principle)
      - [more flavor](http://docs.google.com/a/cleancoder.com/viewer?a=v&pid=explorer&chrome=true&srcid=0BwhCYaYDn8EgNzAzZjA5ZmItNjU3NS00MzQ5LTkwYjMtMDJhNDU5ZTM0MTlh&hl=en)
    - [ ] I - [Interface segregation principle](http://www.oodesign.com/interface-segregation-principle.html) | clients should not be forced to implement interfaces they don't use
      - [Interface Segregation Principle in 5 minutes (video)](https://www.youtube.com/watch?v=3CtAfl7aXAQ)
      - [more flavor](http://docs.google.com/a/cleancoder.com/viewer?a=v&pid=explorer&chrome=true&srcid=0BwhCYaYDn8EgOTViYjJhYzMtMzYxMC00MzFjLWJjMzYtOGJiMDc5N2JkYmJi&hl=en)
    - [ ] D -[Dependency Inversion principle](http://www.oodesign.com/dependency-inversion-principle.html) | Reduce the dependency In composition of objects.
      - [Why Is The Dependency Inversion Principle And Why Is It Important](http://stackoverflow.com/questions/62539/what-is-the-dependency-inversion-principle-and-why-is-it-important)
      - [more flavor](http://docs.google.com/a/cleancoder.com/viewer?a=v&pid=explorer&chrome=true&srcid=0BwhCYaYDn8EgMjdlMWIzNGUtZTQ0NC00ZjQ5LTkwYzQtZjRhMDRlNTQ3ZGMz&hl=en)

- ### Design patterns

  - [ ] [Quick UML review (video)](https://www.youtube.com/watch?v=3cmzqZzwNDM&list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc&index=3)
  - [ ] Learn these patterns:
    - [ ] strategy
    - [ ] singleton
    - [ ] adapter
    - [ ] prototype
    - [ ] decorator
    - [ ] visitor
    - [ ] factory, abstract factory
    - [ ] facade
    - [ ] observer
    - [ ] proxy
    - [ ] delegate
    - [ ] command
    - [ ] state
    - [ ] memento
    - [ ] iterator
    - [ ] composite
    - [ ] flyweight
  - [ ] [Chapter 6 (Part 1) - Patterns (video)](https://youtu.be/LAP2A80Ajrg?list=PLJ9pm_Rc9HesnkwKlal_buSIHA-jTZMpO&t=3344)
  - [ ] [Chapter 6 (Part 2) - Abstraction-Occurrence, General Hierarchy, Player-Role, Singleton, Observer, Delegation (video)](https://www.youtube.com/watch?v=U8-PGsjvZc4&index=12&list=PLJ9pm_Rc9HesnkwKlal_buSIHA-jTZMpO)
  - [ ] [Chapter 6 (Part 3) - Adapter, Facade, Immutable, Read-Only Interface, Proxy (video)](https://www.youtube.com/watch?v=7sduBHuex4c&index=13&list=PLJ9pm_Rc9HesnkwKlal_buSIHA-jTZMpO)
  - [ ] [Series of videos (27 videos)](https://www.youtube.com/playlist?list=PLF206E906175C7E07)
  - [ ] [Head First Design Patterns](https://www.amazon.com/Head-First-Design-Patterns-Freeman/dp/0596007124)
    - I know the canonical book is "Design Patterns: Elements of Reusable Object-Oriented Software", but Head First is great for beginners to OO.
  - [ ] [Handy reference: 101 Design Patterns & Tips for Developers](https://sourcemaking.com/design-patterns-and-tips)

- ### Combinatorics (n choose k) & Probability

  - [ ] [Math Skills: How to find Factorial, Permutation and Combination (Choose) (video)](https://www.youtube.com/watch?v=8RRo6Ti9d0U)
  - [ ] [Make School: Probability (video)](https://www.youtube.com/watch?v=sZkAAk9Wwa4)
  - [ ] [Make School: More Probability and Markov Chains (video)](https://www.youtube.com/watch?v=dNaJg-mLobQ)
  - [ ] Khan Academy:
    - Course layout:
      - [ ] [Basic Theoretical Probability](https://www.khanacademy.org/math/probability/probability-and-combinatorics-topic)
    - Just the videos - 41 (each are simple and each are short):
      - [ ] [Probability Explained (video)](https://www.youtube.com/watch?v=uzkc-qNVoOk&list=PLC58778F28211FA19)

- ### NP, NP-Complete and Approximation Algorithms

  - Know about the most famous classes of NP-complete problems, such as traveling salesman and the knapsack problem,
    and be able to recognize them when an interviewer asks you them in disguise.
  - Know what NP-complete means.
  - [ ] [Computational Complexity (video)](https://www.youtube.com/watch?v=moPtwq_cVH8&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=23)
  - [ ] Simonson:
    - [ ] [Greedy Algs. II & Intro to NP Completeness (video)](https://youtu.be/qcGnJ47Smlo?list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&t=2939)
    - [ ] [NP Completeness II & Reductions (video)](https://www.youtube.com/watch?v=e0tGC6ZQdQE&index=16&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm)
    - [ ] [NP Completeness III (Video)](https://www.youtube.com/watch?v=fCX1BGT3wjE&index=17&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm)
    - [ ] [NP Completeness IV (video)](https://www.youtube.com/watch?v=NKLDp3Rch3M&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=18)
  - [ ] Skiena:
    - [ ] [CSE373 2012 - Lecture 23 - Introduction to NP-Completeness (video)](https://youtu.be/KiK5TVgXbFg?list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b&t=1508)
    - [ ] [CSE373 2012 - Lecture 24 - NP-Completeness Proofs (video)](https://www.youtube.com/watch?v=27Al52X3hd4&index=24&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b)
    - [ ] [CSE373 2012 - Lecture 25 - NP-Completeness Challenge (video)](https://www.youtube.com/watch?v=xCPH4gwIIXM&index=25&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b)
  - [ ] [Complexity: P, NP, NP-completeness, Reductions (video)](https://www.youtube.com/watch?v=eHZifpgyH_4&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp&index=22)
  - [ ] [Complexity: Approximation Algorithms (video)](https://www.youtube.com/watch?v=MEz1J9wY2iM&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp&index=24)
  - [ ] [Complexity: Fixed-Parameter Algorithms (video)](https://www.youtube.com/watch?v=4q-jmGrmxKs&index=25&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp)
  - Peter Norvig discusses near-optimal solutions to traveling salesman problem:
    - [Jupyter Notebook](http://nbviewer.jupyter.org/url/norvig.com/ipython/TSP.ipynb)
  - Pages 1048 - 1140 in CLRS if you have it.

- ### Caches

  - [ ] LRU cache:
    - [ ] [The Magic of LRU Cache (100 Days of Google Dev) (video)](https://www.youtube.com/watch?v=R5ON3iwx78M)
    - [ ] [Implementing LRU (video)](https://www.youtube.com/watch?v=bq6N7Ym81iI)
    - [ ] [LeetCode - 146 LRU Cache (C++) (video)](https://www.youtube.com/watch?v=8-FZRAjR7qU)
  - [ ] CPU cache:
    - [ ] [MIT 6.004 L15: The Memory Hierarchy (video)](https://www.youtube.com/watch?v=vjYF_fAZI5E&list=PLrRW1w6CGAcXbMtDFj205vALOGmiRc82-&index=24)
    - [ ] [MIT 6.004 L16: Cache Issues (video)](https://www.youtube.com/watch?v=ajgC3-pyGlk&index=25&list=PLrRW1w6CGAcXbMtDFj205vALOGmiRc82-)

- ### Processes and Threads

  - [ ] Computer Science 162 - Operating Systems (25 videos):
    - for processes and threads see videos 1-11
    - [Operating Systems and System Programming (video)](https://www.youtube.com/playlist?list=PL-XXv-cvA_iBDyz-ba4yDskqMDY6A1w_c)
  - [What Is The Difference Between A Process And A Thread?](https://www.quora.com/What-is-the-difference-between-a-process-and-a-thread)
  - Covers:
    - Processes, Threads, Concurrency issues
      - difference between processes and threads
      - processes
      - threads
      - locks
      - mutexes
      - semaphores
      - monitors
      - how they work
      - deadlock
      - livelock
    - CPU activity, interrupts, context switching
    - Modern concurrency constructs with multicore processors
    - Process resource needs (memory: code, static storage, stack, heap, and also file descriptors, i/o)
    - Thread resource needs (shares above (minus stack) with other threads in the same process but each has its own pc, stack counter, registers, and stack)
    - Forking is really copy on write (read-only) until the new process writes to memory, then it does a full copy.
    - Context switching
      - How context switching is initiated by the operating system and underlying hardware
  - [ ] [threads in C++ (series - 10 videos)](https://www.youtube.com/playlist?list=PL5jc9xFGsL8E12so1wlMS0r0hTQoJL74M)
  - [ ] concurrency in Python (videos):
    - [ ] [Short series on threads](https://www.youtube.com/playlist?list=PL1H1sBF1VAKVMONJWJkmUh6_p8g4F2oy1)
    - [ ] [Python Threads](https://www.youtube.com/watch?v=Bs7vPNbB9JM)
    - [ ] [Understanding the Python GIL (2010)](https://www.youtube.com/watch?v=Obt-vMVdM8s)
      - [reference](http://www.dabeaz.com/GIL)
    - [ ] [David Beazley - Python Concurrency From the Ground Up: LIVE! - PyCon 2015](https://www.youtube.com/watch?v=MCs5OvhV9S4)
    - [ ] [Keynote David Beazley - Topics of Interest (Python Asyncio)](https://www.youtube.com/watch?v=ZzfHjytDceU)
    - [ ] [Mutex in Python](https://www.youtube.com/watch?v=0zaPs8OtyKY)

- ### Papers

  - These are Google papers and well-known papers.
  - Reading all from end to end with full comprehension will likely take more time than you have. I recommend being selective on papers and their sections.
  - [ ] [1978: Communicating Sequential Processes](http://spinroot.com/courses/summer/Papers/hoare_1978.pdf)
    - [implemented in Go](https://godoc.org/github.com/thomas11/csp)
    - [Love classic papers?](https://www.cs.cmu.edu/~crary/819-f09/)
  - [ ] [2003: The Google File System](http://static.googleusercontent.com/media/research.google.com/en//archive/gfs-sosp2003.pdf)
    - replaced by Colossus in 2012
  - [ ] [2004: MapReduce: Simplified Data Processing on Large Clusters](http://static.googleusercontent.com/media/research.google.com/en//archive/mapreduce-osdi04.pdf)
    - mostly replaced by Cloud Dataflow?
  - [ ] [2007: What Every Programmer Should Know About Memory (very long, and the author encourages skipping of some sections)](https://www.akkadia.org/drepper/cpumemory.pdf)
  - [ ] [2012: Google's Colossus](https://www.wired.com/2012/07/google-colossus/)
    - paper not available
  - [ ] 2012: AddressSanitizer: A Fast Address Sanity Checker:
    - [paper](http://static.googleusercontent.com/media/research.google.com/en//pubs/archive/37752.pdf)
    - [video](https://www.usenix.org/conference/atc12/technical-sessions/presentation/serebryany)
  - [ ] 2013: Spanner: Google’s Globally-Distributed Database:
    - [paper](http://static.googleusercontent.com/media/research.google.com/en//archive/spanner-osdi2012.pdf)
    - [video](https://www.usenix.org/node/170855)
  - [ ] [2014: Machine Learning: The High-Interest Credit Card of Technical Debt](http://static.googleusercontent.com/media/research.google.com/en//pubs/archive/43146.pdf)
  - [ ] [2015: Continuous Pipelines at Google](http://static.googleusercontent.com/media/research.google.com/en//pubs/archive/43790.pdf)
  - [ ] [2015: High-Availability at Massive Scale: Building Google’s Data Infrastructure for Ads](https://static.googleusercontent.com/media/research.google.com/en//pubs/archive/44686.pdf)
  - [ ] [2015: TensorFlow: Large-Scale Machine Learning on Heterogeneous Distributed Systems](http://download.tensorflow.org/paper/whitepaper2015.pdf)
  - [ ] [2015: How Developers Search for Code: A Case Study](http://static.googleusercontent.com/media/research.google.com/en//pubs/archive/43835.pdf)
  - [ ] [2016: Borg, Omega, and Kubernetes](http://static.googleusercontent.com/media/research.google.com/en//pubs/archive/44843.pdf)

- ### Testing

  - To cover:
    - how unit testing works
    - what are mock objects
    - what is integration testing
    - what is dependency injection
  - [ ] [Agile Software Testing with James Bach (video)](https://www.youtube.com/watch?v=SAhJf36_u5U)
  - [ ] [Open Lecture by James Bach on Software Testing (video)](https://www.youtube.com/watch?v=ILkT_HV9DVU)
  - [ ] [Steve Freeman - Test-Driven Development (that’s not what we meant) (video)](https://vimeo.com/83960706)
    - [slides](http://gotocon.com/dl/goto-berlin-2013/slides/SteveFreeman_TestDrivenDevelopmentThatsNotWhatWeMeant.pdf)
  - [ ] [TDD is dead. Long live testing.](http://david.heinemeierhansson.com/2014/tdd-is-dead-long-live-testing.html)
  - [ ] [Is TDD dead? (video)](https://www.youtube.com/watch?v=z9quxZsLcfo)
  - [ ] [Video series (152 videos) - not all are needed (video)](https://www.youtube.com/watch?v=nzJapzxH_rE&list=PLAwxTw4SYaPkWVHeC_8aSIbSxE_NXI76g)
  - [ ] [Test-Driven Web Development with Python](http://www.obeythetestinggoat.com/pages/book.html#toc)
  - [ ] Dependency injection:
    - [ ] [video](https://www.youtube.com/watch?v=IKD2-MAkXyQ)
    - [ ] [Tao Of Testing](http://jasonpolites.github.io/tao-of-testing/ch3-1.1.html)
  - [ ] [How to write tests](http://jasonpolites.github.io/tao-of-testing/ch4-1.1.html)

- ### Scheduling

  - in an OS, how it works
  - can be gleaned from Operating System videos

- ### Implement system routines

  - understand what lies beneath the programming APIs you use
  - can you implement them?

- ### String searching & manipulations
  - [ ] [Sedgewick - Suffix Arrays (video)](https://www.youtube.com/watch?v=HKPrVm5FWvg)
  - [ ] [Sedgewick - Substring Search (videos)](https://www.youtube.com/watch?v=2LvvVFCEIv8&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66&index=5)
    - [ ] [1. Introduction to Substring Search](https://www.youtube.com/watch?v=2LvvVFCEIv8&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66&index=5)
    - [ ] [2. Brute-Force Substring Search](https://www.youtube.com/watch?v=CcDXwIGEXYU&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66&index=4)
    - [ ] [3. Knuth-Morris Pratt](https://www.youtube.com/watch?v=n-7n-FDEWzc&index=3&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66)
    - [ ] [4. Boyer-Moore](https://www.youtube.com/watch?v=fI7Ch6pZXfM&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66&index=2)
    - [ ] [5. Rabin-Karp](https://www.youtube.com/watch?v=QzI0p6zDjK4&index=1&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66)
  - [ ] [Search pattern in text (video)](https://www.coursera.org/learn/data-structures/lecture/tAfHI/search-pattern-in-text)
  If you need more detail on this subject, see "String Matching" section in [Additional Detail on Some Subjects](#additional-detail-on-some-subjects)

---

## System Design, Scalability, Data Handling

- **You can expect system design questions if you have 4+ years of experience.**
- Scalability and System Design are very large topics with many topics and resources, since
  there is a lot to consider when designing a software/hardware system that can scale.
  Expect to spend quite a bit of time on this.
- Considerations from Yegge:
  - scalability
    - Distill large data sets to single values
    - Transform one data set to another
    - Handling obscenely large amounts of data
  - system design
    - features sets
    - interfaces
    - class hierarchies
    - designing a system under certain constraints
    - simplicity and robustness
    - tradeoffs
    - performance analysis and optimization
- [ ] **START HERE**: [System Design from HiredInTech](http://www.hiredintech.com/system-design/)
- [ ] [How Do I Prepare To Answer Design Questions In A Technical Inverview?](https://www.quora.com/How-do-I-prepare-to-answer-design-questions-in-a-technical-interview?redirected_qid=1500023)
- [ ] [8 Things You Need to Know Before a System Design Interview](http://blog.gainlo.co/index.php/2015/10/22/8-things-you-need-to-know-before-system-design-interviews/)
- [ ] [Algorithm design](http://www.hiredintech.com/algorithm-design/)
- [ ] [Database Normalization - 1NF, 2NF, 3NF and 4NF (video)](https://www.youtube.com/watch?v=UrYLYV7WSHM)
- [ ] [System Design Interview](https://github.com/checkcheckzz/system-design-interview) - There are a lot of resources in this one. Look through the articles and examples. I put some of them below.
- [ ] [How to ace a systems design interview](http://www.palantir.com/2011/10/how-to-rock-a-systems-design-interview/)
- [ ] [Numbers Everyone Should Know](http://everythingisdata.wordpress.com/2009/10/17/numbers-everyone-should-know/)
- [ ] [How long does it take to make a context switch?](http://blog.tsunanet.net/2010/11/how-long-does-it-take-to-make-context.html)
- [ ] [Transactions Across Datacenters (video)](https://www.youtube.com/watch?v=srOgpXECblk)
- [ ] [A plain English introduction to CAP Theorem](http://ksat.me/a-plain-english-introduction-to-cap-theorem/)
- [ ] Paxos Consensus algorithm:
  - [short video](https://www.youtube.com/watch?v=s8JqcZtvnsM)
  - [extended video with use case and multi-paxos](https://www.youtube.com/watch?v=JEpsBg0AO6o)
  - [paper](http://research.microsoft.com/en-us/um/people/lamport/pubs/paxos-simple.pdf)
- [ ] [Consistent Hashing](http://www.tom-e-white.com/2007/11/consistent-hashing.html)
- [ ] [NoSQL Patterns](http://horicky.blogspot.com/2009/11/nosql-patterns.html)
- [ ] Scalability:
  - [ ] [Great overview (video)](https://www.youtube.com/watch?v=-W9F__D3oY4)
  - [ ] Short series:
    - [Clones](http://www.lecloud.net/post/7295452622/scalability-for-dummies-part-1-clones)
    - [Database](http://www.lecloud.net/post/7994751381/scalability-for-dummies-part-2-database)
    - [Cache](http://www.lecloud.net/post/9246290032/scalability-for-dummies-part-3-cache)
    - [Asynchronism](http://www.lecloud.net/post/9699762917/scalability-for-dummies-part-4-asynchronism)
  - [ ] [Scalable Web Architecture and Distributed Systems](http://www.aosabook.org/en/distsys.html)
  - [ ] [Fallacies of Distributed Computing Explained](https://pages.cs.wisc.edu/~zuyu/files/fallacies.pdf)
  - [ ] [Pragmatic Programming Techniques](http://horicky.blogspot.com/2010/10/scalable-system-design-patterns.html)
    - [extra: Google Pregel Graph Processing](http://horicky.blogspot.com/2010/07/google-pregel-graph-processing.html)
  - [ ] [Jeff Dean - Building Software Systems At Google and Lessons Learned (video)](https://www.youtube.com/watch?v=modXC5IWTJI)
  - [ ] [Introduction to Architecting Systems for Scale](http://lethain.com/introduction-to-architecting-systems-for-scale/)
  - [ ] [Scaling mobile games to a global audience using App Engine and Cloud Datastore (video)](https://www.youtube.com/watch?v=9nWyWwY2Onc)
  - [ ] [How Google Does Planet-Scale Engineering for Planet-Scale Infra (video)](https://www.youtube.com/watch?v=H4vMcD7zKM0)
  - [ ] [The Importance of Algorithms](https://www.topcoder.com/community/data-science/data-science-tutorials/the-importance-of-algorithms/)
  - [ ] [Sharding](http://highscalability.com/blog/2009/8/6/an-unorthodox-approach-to-database-design-the-coming-of-the.html)
  - [ ] [Scale at Facebook (2009)](https://www.infoq.com/presentations/Scale-at-Facebook)
  - [ ] [Scale at Facebook (2012), "Building for a Billion Users" (video)](https://www.youtube.com/watch?v=oodS71YtkGU)
  - [ ] [Engineering for the Long Game - Astrid Atkinson Keynote(video)](https://www.youtube.com/watch?v=p0jGmgIrf_M&list=PLRXxvay_m8gqVlExPC5DG3TGWJTaBgqSA&index=4)
  - [ ] [7 Years Of YouTube Scalability Lessons In 30 Minutes](http://highscalability.com/blog/2012/3/26/7-years-of-youtube-scalability-lessons-in-30-minutes.html)
    - [video](https://www.youtube.com/watch?v=G-lGCC4KKok)
  - [ ] [How PayPal Scaled To Billions Of Transactions Daily Using Just 8VMs](http://highscalability.com/blog/2016/8/15/how-paypal-scaled-to-billions-of-transactions-daily-using-ju.html)
  - [ ] [How to Remove Duplicates in Large Datasets](https://blog.clevertap.com/how-to-remove-duplicates-in-large-datasets/)
  - [ ] [A look inside Etsy's scale and engineering culture with Jon Cowie (video)](https://www.youtube.com/watch?v=3vV4YiqKm1o)
  - [ ] [What Led Amazon to its Own Microservices Architecture](http://thenewstack.io/led-amazon-microservices-architecture/)
  - [ ] [To Compress Or Not To Compress, That Was Uber's Question](https://eng.uber.com/trip-data-squeeze/)
  - [ ] [Asyncio Tarantool Queue, Get In The Queue](http://highscalability.com/blog/2016/3/3/asyncio-tarantool-queue-get-in-the-queue.html)
  - [ ] [When Should Approximate Query Processing Be Used?](http://highscalability.com/blog/2016/2/25/when-should-approximate-query-processing-be-used.html)
  - [ ] [Google's Transition From Single Datacenter, To Failover, To A Native Multihomed Architecture](http://highscalability.com/blog/2016/2/23/googles-transition-from-single-datacenter-to-failover-to-a-n.html)
  - [ ] [Spanner](http://highscalability.com/blog/2012/9/24/google-spanners-most-surprising-revelation-nosql-is-out-and.html)
  - [ ] [Egnyte Architecture: Lessons Learned In Building And Scaling A Multi Petabyte Distributed System](http://highscalability.com/blog/2016/2/15/egnyte-architecture-lessons-learned-in-building-and-scaling.html)
  - [ ] [Machine Learning Driven Programming: A New Programming For A New World](http://highscalability.com/blog/2016/7/6/machine-learning-driven-programming-a-new-programming-for-a.html)
  - [ ] [The Image Optimization Technology That Serves Millions Of Requests Per Day](http://highscalability.com/blog/2016/6/15/the-image-optimization-technology-that-serves-millions-of-re.html)
  - [ ] [A Patreon Architecture Short](http://highscalability.com/blog/2016/2/1/a-patreon-architecture-short.html)
  - [ ] [Tinder: How Does One Of The Largest Recommendation Engines Decide Who You'll See Next?](http://highscalability.com/blog/2016/1/27/tinder-how-does-one-of-the-largest-recommendation-engines-de.html)
  - [ ] [Design Of A Modern Cache](http://highscalability.com/blog/2016/1/25/design-of-a-modern-cache.html)
  - [ ] [Live Video Streaming At Facebook Scale](http://highscalability.com/blog/2016/1/13/live-video-streaming-at-facebook-scale.html)
  - [ ] [A Beginner's Guide To Scaling To 11 Million+ Users On Amazon's AWS](http://highscalability.com/blog/2016/1/11/a-beginners-guide-to-scaling-to-11-million-users-on-amazons.html)
  - [ ] [How Does The Use Of Docker Effect Latency?](http://highscalability.com/blog/2015/12/16/how-does-the-use-of-docker-effect-latency.html)
  - [ ] [Does AMP Counter An Existential Threat To Google?](http://highscalability.com/blog/2015/12/14/does-amp-counter-an-existential-threat-to-google.html)
  - [ ] [A 360 Degree View Of The Entire Netflix Stack](http://highscalability.com/blog/2015/11/9/a-360-degree-view-of-the-entire-netflix-stack.html)
  - [ ] [Latency Is Everywhere And It Costs You Sales - How To Crush It](http://highscalability.com/latency-everywhere-and-it-costs-you-sales-how-crush-it)
  - [ ] [Serverless (very long, just need the gist)](http://martinfowler.com/articles/serverless.html)
  - [ ] [What Powers Instagram: Hundreds of Instances, Dozens of Technologies](http://instagram-engineering.tumblr.com/post/13649370142/what-powers-instagram-hundreds-of-instances)
  - [ ] [Cinchcast Architecture - Producing 1,500 Hours Of Audio Every Day](http://highscalability.com/blog/2012/7/16/cinchcast-architecture-producing-1500-hours-of-audio-every-d.html)
  - [ ] [Justin.Tv's Live Video Broadcasting Architecture](http://highscalability.com/blog/2010/3/16/justintvs-live-video-broadcasting-architecture.html)
  - [ ] [Playfish's Social Gaming Architecture - 50 Million Monthly Users And Growing](http://highscalability.com/blog/2010/9/21/playfishs-social-gaming-architecture-50-million-monthly-user.html)
  - [ ] [TripAdvisor Architecture - 40M Visitors, 200M Dynamic Page Views, 30TB Data](http://highscalability.com/blog/2011/6/27/tripadvisor-architecture-40m-visitors-200m-dynamic-page-view.html)
  - [ ] [PlentyOfFish Architecture](http://highscalability.com/plentyoffish-architecture)
  - [ ] [Salesforce Architecture - How They Handle 1.3 Billion Transactions A Day](http://highscalability.com/blog/2013/9/23/salesforce-architecture-how-they-handle-13-billion-transacti.html)
  - [ ] [ESPN's Architecture At Scale - Operating At 100,000 Duh Nuh Nuhs Per Second](http://highscalability.com/blog/2013/11/4/espns-architecture-at-scale-operating-at-100000-duh-nuh-nuhs.html)
  - [ ] See "Messaging, Serialization, and Queueing Systems" way below for info on some of the technologies that can glue services together
  - [ ] Twitter:
    - [O'Reilly MySQL CE 2011: Jeremy Cole, "Big and Small Data at @Twitter" (video)](https://www.youtube.com/watch?v=5cKTP36HVgI)
    - [Timelines at Scale](https://www.infoq.com/presentations/Twitter-Timeline-Scalability)
  - For even more, see "Mining Massive Datasets" video series in the Video Series section.
- [ ] Practicing the system design process: Here are some ideas to try working through on paper, each with some documentation on how it was handled in the real world:
  - review: [System Design from HiredInTech](http://www.hiredintech.com/system-design/)
  - [cheat sheet](https://github.com/jwasham/google-interview-university/blob/master/extras/cheat%20sheets/system-design.pdf)
  - flow:
    1. Understand the problem and scope:
       - define the use cases, with interviewer's help
       - suggest additional features
       - remove items that interviewer deems out of scope
       - assume high availability is required, add as a use case
    2. Think about constraints:
       - ask how many requests per month
       - ask how many requests per second (they may volunteer it or make you do the math)
       - estimate reads vs. writes percentage
       - keep 80/20 rule in mind when estimating
       - how much data written per second
       - total storage required over 5 years
       - how much data read per second
    3. Abstract design:
       - layers (service, data, caching)
       - infrastructure: load balancing, messaging
       - rough overview of any key algorithm that drives the service
       - consider bottlenecks and determine solutions
  - Exercises:
    - [Design a CDN network: old article](http://repository.cmu.edu/cgi/viewcontent.cgi?article=2112&context=compsci)
    - [Design a random unique ID generation system](https://blog.twitter.com/2010/announcing-snowflake)
    - [Design an online multiplayer card game](http://www.indieflashblog.com/how-to-create-an-asynchronous-multiplayer-game.html)
    - [Design a key-value database](http://www.slideshare.net/dvirsky/introduction-to-redis)
    - [Design a function to return the top k requests during past time interval](https://icmi.cs.ucsb.edu/research/tech_reports/reports/2005-23.pdf)
    - [Design a picture sharing system](http://highscalability.com/blog/2011/12/6/instagram-architecture-14-million-users-terabytes-of-photos.html)
    - [Design a recommendation system](http://ijcai13.org/files/tutorial_slides/td3.pdf)
    - [Design a URL-shortener system: copied from above](http://www.hiredintech.com/system-design/the-system-design-process/)
    - [Design a cache system](https://www.adayinthelifeof.nl/2011/02/06/memcache-internals/)

---

## Final Review

    This section will have shorter videos that can you watch pretty quickly to review most of the important concepts.
    It's nice if you want a refresher often.

- [ ] Series of 2-3 minutes short subject videos (23 videos)
  - [Videos](https://www.youtube.com/watch?v=r4r1DZcx1cM&list=PLmVb1OknmNJuC5POdcDv5oCS7_OUkDgpj&index=22)
- [ ] Series of 2-5 minutes short subject videos - Michael Sambol (18 videos):
  - [Videos](https://www.youtube.com/channel/UCzDJwLWoYCUQowF_nG3m5OQ)
- [ ] [Sedgewick Videos - Algorithms I](https://www.youtube.com/user/algorithmscourses/playlists?shelf_id=2&view=50&sort=dd)
  - [ ] [01. Union-Find](https://www.youtube.com/watch?v=8mYfZeHtdNc&list=PLe-ggMe31CTexoNYnMhbHaWhQ0dvcy43t)
  - [ ] [02. Analysis of Algorithms](https://www.youtube.com/watch?v=ZN-nFW0mEpg&list=PLe-ggMe31CTf0_bkOhh7sa5uqeppp3Sr0)
  - [ ] [03. Stacks and Queues](https://www.youtube.com/watch?v=TIC1gappbP8&list=PLe-ggMe31CTe-9jhnj3P_3mmrCh0A7iHh)
  - [ ] [04. Elementary Sorts](https://www.youtube.com/watch?v=CD2AL6VO0ak&list=PLe-ggMe31CTe_5WhGV0F--7CK8MoRUqBd)
  - [ ] [05. Mergesort](https://www.youtube.com/watch?v=4nKwesx_c8E&list=PLe-ggMe31CTeunC6GZHFBmQx7EKtjbGf9)
  - [ ] [06. Quicksort](https://www.youtube.com/watch?v=5M5A7qPWk84&list=PLe-ggMe31CTeE3x2-nF1-toca1QpuXwE1)
  - [ ] [07. Priority Queues](https://www.youtube.com/watch?v=G9TMe0KC0w0&list=PLe-ggMe31CTducy9LDiGVkdSv0NfiRwn5)
  - [ ] [08. Elementary Symbol Tables](https://www.youtube.com/watch?v=up_nlilw3ac&list=PLe-ggMe31CTc3a8nKRDxFZZrWrBvkc9SG)
  - [ ] [09. Balanced Search Trees](https://www.youtube.com/watch?v=qC1BLLPK_5w&list=PLe-ggMe31CTf7jHH_mFT50kayjCEA6Rhu)
  - [ ] [10. Geometric Applications of BST](https://www.youtube.com/watch?v=Wl30aGAp6TY&list=PLe-ggMe31CTdBsRIw0hXln0hilRs-DqAx)
  - [ ] [11. Hash Tables](https://www.youtube.com/watch?v=QA8fJGO-i9o&list=PLe-ggMe31CTcKxIRGqqThMts2eHtSrf11)
- [ ] [Sedgewick Videos - Algorithms II](https://www.youtube.com/user/algorithmscourses/playlists?flow=list&shelf_id=3&view=50)
  - [ ] [01. Undirected Graphs](https://www.youtube.com/watch?v=GmVhD-mmMBg&list=PLe-ggMe31CTc0zDzANxl4I2MhMoRVlbRM)
  - [ ] [02. Directed Graphs](https://www.youtube.com/watch?v=_z-JsVaUS40&list=PLe-ggMe31CTcEwaU8a1P1Gd95A77HV85K)
  - [ ] [03. Minimum Spanning Trees](https://www.youtube.com/watch?v=t8fNk9tfVYY&list=PLe-ggMe31CTceUZxDesGfHGLE7kcSafqj)
  - [ ] [04. Shortest Paths](https://www.youtube.com/watch?v=HoGSiB7tSeI&list=PLe-ggMe31CTePpG3jbeOTsnGUGZDKxgZD)
  - [ ] [05. Maximum Flow](https://www.youtube.com/watch?v=rYIKlFstBqE&list=PLe-ggMe31CTduQ68XQ-sVj32wYJIspTma)
  - [ ] [06. Radix Sorts](https://www.youtube.com/watch?v=HKPrVm5FWvg&list=PLe-ggMe31CTcNvUX9E3tQeM6ntrdR8e53)
  - [ ] [07. Tries](https://www.youtube.com/watch?v=00YaFPcC65g&list=PLe-ggMe31CTe9IyG9MB8vt5xUJeYgOYRQ)
  - [ ] [08. Substring Search](https://www.youtube.com/watch?v=QzI0p6zDjK4&list=PLe-ggMe31CTdAdjXB3lIuf2maubzo9t66)
  - [ ] [09. Regular Expressions](https://www.youtube.com/watch?v=TQWNQsJSPnk&list=PLe-ggMe31CTetTlJWouM42fyttyKPgSDh)
  - [ ] [10. Data Compression](https://www.youtube.com/watch?v=at9tjpxcBh8&list=PLe-ggMe31CTciifRRo6yY0Yt0mzgIXXVZ)
  - [ ] [11. Reductions](https://www.youtube.com/watch?v=Ow5x-ooMGv8&list=PLe-ggMe31CTe_yliW5vc3yO-dj1LSSDyF)
  - [ ] [12. Linear Programming](https://www.youtube.com/watch?v=rWhcLyiLZLA&list=PLe-ggMe31CTdy6dKzMgkWFuTTN1H8B-E1)
  - [ ] [13. Intractability](https://www.youtube.com/watch?v=6qcaaDp4cdQ&list=PLe-ggMe31CTcZCjluBHw53e_ek2k9Kn-S)

---

made with 💜 by GUILHERME FONSECA 👋 [See my linked-in](https://www.linkedin.com/in/guilherme-fonseca-dos-santos-a49594207/)

##Contributors

welcome to send more information will be always good receive your proposals to implement to the repository.
