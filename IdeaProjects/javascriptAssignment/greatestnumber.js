function maxvalue(numbers)
{
    maxvalue=numbers[0]
    for(var index = 1;index < numbers.length; index++){
        if(numbers[index] > maxvalue)
            maxvalue = numbers[index]
    }
    return maxvalue
}

function input()
{
    var numbers = [1,23,67,89,100]
    console.log("The list of numbers is :" + numbers)
    console.log("The max value from the list is:")
    console.log(maxvalue(numbers))
}
input()