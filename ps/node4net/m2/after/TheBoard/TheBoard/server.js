'use strict';

var http = require("http");

// Crud web server without express
//var server = http.createServer(function (req, res) {
//    console.log(req.url);
//    res.write("<html><body><h1>" + req.url + "</h1></body></html>");
//    res.end();
//});

// With Express
var express = require("express");
var app = express();

app.get("/", function (req, res) {
    res.send("<html><body><h1>Express Root</h1></body></html>");
});

app.get("/api/users", function (req, res) {
    res.set("Content-Type", "application/json");
    res.send({ name: "sujk2k", isValid: true, group: "Admin" })
});

var server = http.createServer(app);

server.listen(4000);