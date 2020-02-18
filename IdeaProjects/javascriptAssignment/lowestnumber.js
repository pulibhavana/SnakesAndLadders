function minvalue(numbers)
{
    minvalue=numbers[0]
    for(var index = 1;index < numbers.length; index++){
        if(numbers[index] < minvalue)
            minvalue = numbers[index]
    }
    return minvalue
}

function input()
{
    var numbers = [1,23,67,89,100]
    console.log("The list of numbers is :" + numbers)
    console.log("The in value from the list is:")
    console.log(minvalue(numbers))
}
input()