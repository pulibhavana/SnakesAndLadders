var numbers = [10,35,54,27,1,8];

function selectOddNumbers(numbers) {
    var listOfOddNumbers = []
    for(var index = 0; index < numbers.length; index++)
    {
        number = numbers[index];
        if(isodd(number))
          listOfOddNumbers.push(number)
    }
    return listOfOddNumbers
}

function isodd(num)
{
    return (num%2 != 0);
}

console.log("The odd numbers from the list are")
console.log(selectOddNumbers(numbers));