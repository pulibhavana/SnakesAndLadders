function findIndex(numbersList, number)
{
    for(var index = 0;index <numbersList.length;index++){
        if(numbersList[index] == number)
            return index
    }
    return false
}

function input() {
    numbersList = [10,20,30,10,10,20,40,40,-10]
    number = 40
    result = findIndex(numbersList, number)
    if(result != false)
        console.log("The index of number is " +result)
    else
        console.log("The number doesnt exist")
}

input()