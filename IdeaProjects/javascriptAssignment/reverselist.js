
function reverse(numbers) {
    var reverseList = []
    for(var index = numbers.length-1 ;index >= 0; index--) {
        var number = numbers[index]
        reverseList.push(number);
    }
    return reverseList
}

function input()
{
    var numbers = [10,23,45,67,89,21,6]
    console.log("The list of numbers is: " + numbers)
    console.log("The list of numbers in reverse order is :")
    console.log(reverse(numbers))
}
input()