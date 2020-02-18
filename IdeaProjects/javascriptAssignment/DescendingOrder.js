function isDescendingOrder(array)
{

    for(var index = 0;index < array.length - 1;index++){
        if(array[index] < array[index+1])
            return false
    }
    return true
}

function input()
{
    array = [10,9,7,5,1]
    console.log("The numbers in the list are :"+array)
    if(isDescendingOrder(array))
        console.log("The given list is in descending order")
    else
        console.log("The given list is not in descending order")
}

input()
