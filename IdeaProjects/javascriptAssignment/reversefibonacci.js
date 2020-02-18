function generateFibonacciSeries(len)
{
    var fibonacciSeries = [0,1]
    for(var index = 2;index < len;index++){
        var number = fibonacciSeries[index - 1] + fibonacciSeries[index - 2]
        fibonacciSeries.push(number)
    }
    return fibonacciSeries
}

function input()
{
    var len = 10
    var result = generateFibonacciSeries(len)
    console.log(fibreverse(result))
}

function fibreverse(fibseries) {
    var fibreverse = []
    for(var index = fibseries.length-1 ;index >= 0; index--) {
        var number = fibseries[index]
        fibreverse.push(number);
    }
    return fibreverse
}
input()