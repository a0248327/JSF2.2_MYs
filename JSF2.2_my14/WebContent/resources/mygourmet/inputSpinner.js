function changeNumber(clientId, increment) {
    var inc = Number(increment);
    if (isNaN(inc) || inc == 0 ) { // isNaN() 函数用于检查其参数是否是非数字值。
        inc = 1; // 默认为1
    }
    var input = document.getElementById(clientId); // 获得输入数值
    var val = Number(input.value);
    if (isNaN(val)) { // 如果不是数字就为0
        val = 0;
    }
    input.value = val + inc; // 输入的数字+增加的数字
    return false;
}
