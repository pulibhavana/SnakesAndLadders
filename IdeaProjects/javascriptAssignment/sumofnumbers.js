var numbers = [7,9,14,28,36,41,45,48,51,71]

function summation(numbers){
    var sum = 0;
    for(var index = 0; index < numbers.length; index++){
        sum = sum + numbers[index]
    }
    return sum
}

console.log("The list of numbers are")
console.log(numbers)
console.log("The sum of numbers is: ")
console.log(summation(numbers))