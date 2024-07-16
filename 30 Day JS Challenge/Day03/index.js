// Day 3: Control Structures

// Tasks/Activities:

// Activity 1: If-Else Statements
// •	Task 1: Write a program to check if a number is positive, negative, or zero, and log the result to the console. 

let num = 0;
if (num > 0) {
    console.log("Positive");
} else if (num < 0) {
    console.log("Negative");
} else {
    console.log("Zero");
}
// •	Task 2: Write a program to check if a person is eligible to vote (age >= 18) and log the result to the console.

let age = 17;
if (age >= 18) {
    console.log("Eligible to vote");
} else {
    console.log("Not eligible to vote");
}

// Activity 2: Nested If-Else Statements
// •	Task 3: Write a program to find the largest of three numbers using nested if-else statements.

function findLargest(num1, num2, num3) {
    let largest = num1;
    if (num2 > largest) {
        largest = num2;

    } if (num3 > largest) {
        largest = num3;
    }
    return largest;
}
console.log(findLargest(10, 20, 30));

// Activity 3: Switch Case
// •	Task 4: Write a program that uses a switch case to determine the day of the week based on a number (1-7) and log the day name to the console.

function getDayName(dayNum) {
    let dayName;
    switch (dayNum) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid day number";
    }
    return dayName;
}

console.log(getDayName(3));



// •	Task 5: Write a program that uses a switch case to assign a grade ('A', 'B', 'C', 'D', 'F') based on a score and log the grade to the console.

function getGrade(score) {
    let grade;
    switch (true) {
        case score >= 90:
            grade = "A";
            break;
        case score >= 80:
            grade = "B";
            break;
        case score >= 70:
            grade = "C";
            break;
        case score >= 60:
            grade = "D";
            break;
        default:
            grade = "F";
    }
    return grade;
}
console.log(getGrade(85));

// Activity 4: Conditional (Ternary) Operator
// •	Task 6: Write a program that uses the ternary operator to check if a number is even or odd and log the result to the console.

function isEven(num) {
    return num % 2 === 0 ? "Even" : "Odd";
}
console.log(isEven(5));

// Activity 5: Combining Conditions
// •	Task 7: Write a program to check if a year is a leap year using multiple conditions (divisible by 4, but not 100 unless also divisible by 400) and log the result to the console.

function isLeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
}

console.log(isLeapYear(2900));


// Feature Request:
// 1. Number Check Script: Write a script that checks if a number is positive, negative, or zero using if-else statements and logs the result.
   function numchk(x){
            if(x>0){
                console.log("Positive");
            }
            else if(x<0){
                console.log("Negative");
            }
            else{
                console.log("Zero");
            }
    }

    numchk(0);


//  2. Voting Eligibility Script: Create a script to check if a person is eligible to vote based on their age and log the result.

function votingEligibility(age) {
    if (age >= 18) {    
        console.log("Eligible to vote");
    } else {
        console.log("Not eligible to vote");
    }
}

votingEligibility(19);

// 3. Day of the Week Script: Write a script that uses a switch case to determine the day of the week based on a number (1-7) and logs the day name.

function getDayName(dayNum) {
    let dayName;
    switch (dayNum) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid day number";
    }
    return dayName;
}

console.log(getDayName(3));
// 4. Grade Assignment Script: Create a script that uses a switch case to assign a grade based on a score and logs the grade.

function getGrade(score) {
    let grade;
    switch (true) {
        case score >= 90:
            grade = "A";
            break;
        case score >= 80:
            grade = "B";
            break;
        case score >= 70:
            grade = "C";
            break;
        case score >= 60:
            grade = "D";
            break;
        default:
            grade = "F";
    }
    return grade;
}


// 5. Leap Year Check Script: Write a script that checks if a year is a leap year using multiple conditions and logs the result.

function isLeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0;
}

console.log(isLeapYear(2900));

// Achievement:
// By the end of these activities, students will:
// • Implement and understand basic if-else control flow.
// • Use nested if-else statements to handle multiple conditions.
// • Utilize switch cases for control flow based on specific values.
// • Apply the ternary operator for concise condition checking.
// • Combine multiple conditions to solve more complex problems