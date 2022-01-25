function add(value1, value2) {
    return value1 + value2;
}

function multiply(value1, value2) {
    return value1 * value2;
}

function factorialR(value) {
    if (value == 0) {
        return 1;
    }
    return value * factorialR(value - 1);
}

function factorialI(value) {
    let sum = 1;
    while (value > 0) {
        sum *= value;
        value--;
    }
    return sum;
}

alert(add(2, 3));
alert(multiply(2, 3));
alert(factorialR(4));
alert(factorialI(4));