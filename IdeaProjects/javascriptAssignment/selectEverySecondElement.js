
function selectEverySecondElement(numbers)
{
    newListOfNumbers = []
    for(var index = 0;index < numbers.length; index++){
        if(index%2 == 1)
            newListOfNumbers.push(numbers[index])
    }
    return newListOfNumbers

}

function input()
{
    var numbers = [10,-23,34,56,12,89]
    console.log("The list of numbers is "+ numbers)
    console.log("The new list is " + selectEverySecondElement(numbers))
}

input()