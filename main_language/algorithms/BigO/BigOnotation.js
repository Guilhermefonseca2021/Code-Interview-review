// array is equal to n
// this mean our algorithm scale in linear growth.
const data = ["a", "b", "c"];
const data2 = [1, 2, 3, 4, 5];

O(1) // cause the space its not changing, we are not creating a new array inside.
for (let i = 0; i < data.length; i++) {
  // how our algorithm grows as n grouws.
  console.log(data[1]);
}

// we run the scale the number of times, scale One to one the size of n.
O(n);

for (let j = 0; j < data2.length; j++) {
  console.log(data2[j]);
}

O(n + a);
// and we have loop inner each other(nested loops)
for (let j = 0; j < data2.length; j++) {
  for (let i = 0; i < data.length; i++) {
    console.log(data2[i] + data2[j]);
  }
}


// and can be 
O(4n^n);
for (let j = 0; j < data2.length; j++) {
  for (let i = 0; i < data.length; i++) {
    console.log(data2[i] + data2[j]);
    console.log(data2[i] + data2[j]);
    console.log(data2[i] + data2[j]);
    console.log(data2[i] + data2[j]);
  }
}

O(n^2)
// when we are not creating anything is like;
for (let i = 0; i < data2.length; i++) {
  data2[i] = []
  for (let j = 0; j < data.length; j++) {
    data2[i][j] = data[i]
  }
}