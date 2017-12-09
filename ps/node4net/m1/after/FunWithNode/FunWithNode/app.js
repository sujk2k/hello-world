'use strict';

console.log('Hello world');

var x = 10;
var y = 25;

console.log(x * y);

var msgs = require("./msgs.js");

// console.log(msgs.first);
// console.log(msgs.second);
// console.log(msgs.third);

//console.log(msgs());

var msg = new msgs();
console.log(msg.retFunc);

var logger = require("./logger");
logger.log("This is from logger");