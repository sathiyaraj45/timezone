var exec = require('cordova/exec');

function TimeZoneObject() {
 console.log("TimeZoneObject.js: is created");
}

TimeZoneObject.prototype.currentTimeZone = function(successCallback, errorCallback, options){
/*
success
*/
cordova.exec(successCallback, errorCallback, "TimeZoneObject", "all", [options])
}

var timezone = new TimeZoneObject();
module.exports = timezone;
