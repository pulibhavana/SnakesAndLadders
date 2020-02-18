function count(numberslist)
{
    var count = 0;
    for(var index = 0;index < numberslist.length;index++){
        number = numberslist[index]
        if(isodd(number))
            count = count + 1
    }
    return count
}

function isodd(num)
{
    return (num%2 != 0);
}

function input() {
    var numbers = [10, 35, 54, 27, 1, 8];
    console.log("The given list is " + numbers)
    console.log("The count of odd numbers in the list is")
    console.log(count(numbers))
}
input()