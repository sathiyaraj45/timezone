TimeZone 

This plugin is getting current device timezone value will return

Example:

	TimeZoneObject.currentTimeZone(successHandler, errorHandler, {});

	function successHandler (result) {
      	console.log(result)
	}

	function errorHandler (error) {
      console.log("error->" + JSON.stringify(error));
	}

