function countNumbersAboveThreshold(numbersList, thresholdValue)
{
    var count = 0;
    for(var index = 0;index < numbersList.length;index++){
        number = numbersList[index]
        if(number > thresholdValue)
            count = count+1
    }
    return count
}

function input()
{
    numbersList = [2,3,5,1,6]
    value = 3
    console.log("The numbers in the list are :"+numbersList)
    console.log('The threshold value is :'+value)
    console.log("The count of the numbers above threshold value is: ")
    console.log(countNumbersAboveThreshold(numbersList,value))
}

input()