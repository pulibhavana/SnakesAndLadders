function map(nameslist)
{
    nameslength = []
    for(var index = 0;index < nameslist.length;index++){
        var name = nameslist[index]
        nameslength.push(name.length)
    }
    return nameslength
}

function input()
{
    var nameslist = ["bhavana", "lohithamallakuntla", "tejaswini", "mahathi", "prerana"]
    console.log("The list of names is "+ nameslist)
    console.log(map(nameslist))
}

input()