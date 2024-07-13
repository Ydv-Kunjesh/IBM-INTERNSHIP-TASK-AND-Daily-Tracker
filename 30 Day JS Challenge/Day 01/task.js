// 1. Activity variable Decleration  
var num = 10;
let activity = "Sleeping";
console.log(num, activity);

// 2. Activity const variable Assignment
const bool = true;
console.log(bool);

// 3. creating mutliple variables of diff types and checking their  data types
// number string boolean array object
let num1 = 10;
let string = "string";
let bool1 = true;
let array = [10, 20, 30];
let object = {
    name: "Kunjesh Yadav"
}
console.log(
    typeof num1,
    typeof string,
    typeof bool1,
    typeof array,  // array is an object in js so it will print object data type
    typeof object
);

// 4. Reassigning variable value
let challenge = "Js Mastery Challenge";
console.log("Initial Value of the variable challenge is " +challenge);
challenge =  "30 Days Of JavaScript Challenge by Hitesh Chaudary";
console.log("Updated Value of the variable challenge is " +challenge);

// 5. understanding error while reassigning const variable value
const challenge1 = "Js Mastery Challenge";
console.log("Initial Value of the variable challenge1 is " +challenge1);
try{
challenge1 =  "30 Days Of JavaScript Challenge by Hitesh Chaudary";
console.log("Updated Value of the variable challenge1 is " +challenge1);
}catch(error){
   console.log(error.message);
}





function varntype(...arguments) {
    const arr = []
    if (Array.isArray(arguments[0])) {
        arguments[0].forEach((arg) => {
            arr.push({ "variable value": arg, "type of variable is": typeof arg })
        })
    } else {
        arguments.forEach((arg) => {
            arr.push({ "variable value": arg, "type of variable is": typeof arg })
        })
    }
    console.table(arr)
}
let num2 = 42;
let str = "Hello";
let obj = { name: "John", age: 30 };
let arr = [1, 2, 3];
let bool2 = true;
diffVars = [num2, str, obj, arr, bool2]
varntype(diffVars)


// feature 2 

function letvar() {
    let vari = "assignment with let"
    console.log(vari)
    try {
        vari = "reassignment with let"
        console.warn(vari)
    } catch (error) {
        console.error(error)
    }

    // task 6
    const newVari = "assignment with const"
    console.log(newVari)
    try {
        newVari = "reassignment again with const"
    } catch (err) {
        console.error("TypeError: Assignment to constant variable.")
    }
}
letvar()

