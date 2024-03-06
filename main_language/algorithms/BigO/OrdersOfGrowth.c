// all of the orders of growth describe how time scales with input size.

// order of growth of a function time its take the compute its a general category.
def overlap(a, b) {
    count = 0;
    for item in a:
        for other in b:
            if item == other:
                count +=1
    return count
}

// to compute this rsult overlap compares all pairs.
overlap([3, 5, 7, 6], [4, 5, 6, 7])


// on the higher we process the amount of camparisons is 4 times or 16.
// the amount of extra work, process a length 4 the whole array.
// fib function has to do 60% more work just to compute n. 

