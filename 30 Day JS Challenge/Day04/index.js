// // task 1: program to print numbers from 1 to 10 using for loop
// oneToten = ()=>{
//     for(i=1; i<=10; i++){
//         console.log(i);
//     }
// }

// oneToten();

// // task 2: program to print the multiplication table of 5 using a for loop

// vTable = (num)=>{
//      for(i=1; i<=10; i++){
//         console.log(num + "x" + i + " = " + num*i);
//      }
// };

// vTable(5);


// // task 3: program to calculate the sum of numbers from 1 to 10 using a while loop

//     calSum = () =>{
//         letsum = 0;
//         init = 1;
//         while (init<=10) {
//             letsum += init;
//             init++;
            
//         }
//         return letsum;
//     }

//     console.log(calSum());

// // task 4: program to print numbers from 10 to 1 using a while loop

//     revSum  = () =>{
//         init = 10 ;
//         while(init>=1){
//             console.log(init);
//             init--;
//         }
//     }


//     revSum();


// // task 5: program to print numbers from 1 to 5 using do...while loop
// lop = 1
// do {
//     console.log(lop + " Kunjesh");
//     lop ++ ;
//  } while (lop<=5);



// task 6: program to calculate factorial of number using do...while loop...

const factorial = (num) => {
    if (num === 0 || num === 1) {
      return 1;
    } else {
      let fact = 1;
      do {
        fact *= num;
        num--;
      } while (num > 1);
      return fact;
    }
  }
  
  console.log(factorial(5)); // Output: 120
  

