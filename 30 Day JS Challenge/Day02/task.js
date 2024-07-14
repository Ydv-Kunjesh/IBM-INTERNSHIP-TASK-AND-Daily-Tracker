let num1 = 420;
let num2 = 69;

console.log("---- Activity 1 ----")
console.table([
    { Operation: 'Addition', Result: num1 + num2 },
    { Operation: 'Subtraction', Result: num1 - num2 },
    { Operation: 'Multiplication', Result: num1 * num2 },
    { Operation: 'Division', Result: num1 / num2 }
]);

// Activity2
num1 += 20
num2 -= 20
console.log("---- Activity 2 ----")
console.table([
    { Operation: '+= operator', Result: num1 },
    { Operation: '-= operator', Result: num2 }
])

// Activity 3
console.log("---- Activity 3 ----")
console.table([
    { Condition: 'is 69 < 420?', Result: 69 < 420 },
    { Condition: 'is 69 > 420?', Result: 69 > 420 },
    { Condition: 'is 69 == 69?', Result: 69 == 69 },
    { Condition: 'is 69 === 69?', Result: 69 === 69 }
]);

// Activity 4
console.log("---- Activity 4 ----")
let a = 10
let b = 20
if (a % 10 == 0 && b % 10 == 0) {
    console.log("a:", a, "b:", b, "are both multiples of 10")
}

let c = 5
if (a % 10 == 0 || c % 10 == 0) {
    console.log("a:", a, "c:", c, "atleast one of them is multiple of 10")
}

if (!c % 10 == 0) {
    console.log("c:", c, "is not a multiple of 10")
}

// Activity 5
console.log("---- Activity 5 ----")
function print(num) {
    return num >= 0 ? "Positive" : "Negative"
}
console.table([
    { Number: "positive", Result: print(69) },
    { Number: "Negatie", Result: print(-69) }
])

// feature request 1 
let m1;
let m2;
let m3;
function fun(num1, num2, operator) {
    console.log("---- Feature Request 1 ----");
    m1 = num1
    m2 = num2
    m3= operator

    switch (operator) {
        case "+":
            return num1 + num2;
        case "-":
            return num1 - num2;
        case "*":
            return num1 * num2;
        case "/":
            return num1 / num2;
        case "%":
            return num1 % num2;
        default:
            return "Invalid operator";
    }
}

console.table([
    { Result: fun(69, 420, "-") , Input: `${m1} ${m3} ${m2}`},
]);


// Feature Request 2 

// write script which comapres two numbers using diffrent comparison operators and combine with logical operators after that log the result  

let x1 ; 
let x2 ; 
function fun1(num1, num2) {
    console.log("---- Feature Request 2 ----");
    x1 = num1
    x2 = num2
    if (num1 == num2 || num1 === num2) {
        return true
    } else if(num1 != num2 || num1 !== num2) {
        return false  
    }
    else if( num1 < num2 || num1 <= num2) {
        return true

    }
    else if( num1 > num2 || num1 >= num2) {
        return false
    }
    else {
        return "Invalid operator"
    }
}
console.table([
    {  Result: fun1(69, 69) , Input: `${x1}  ${x2}`},
]);



//Feature Request 3

// write script which use the ternary operator to check if a number is positive or negative and log the result

let chkk; 
function ternchk(chk){
    console.log("---- Feature Request 3 ----");
    chkk = chk
    return chk >= 0 ? "Positive" : "Negative"
}

console.table([
    {Result: ternchk(69) , InputValue : chkk}  
])

