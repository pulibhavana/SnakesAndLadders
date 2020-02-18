var numbers = [10,35,54,27,1,8];

function selectEvenNumbers(numbers) {
    var listOfEvenNumbers = []
    for(var index = 0; index < numbers.length; index++)
    {
        number = numbers[index];
        if(isEven(number))
            listOfEvenNumbers.push(number)
    }
    return listOfEvenNumbers
}

function isEven(num)
{
    return (num%2 == 0);
}

console.log("The even numbers from the list are")
console.log(selectEvenNumbers(numbers));