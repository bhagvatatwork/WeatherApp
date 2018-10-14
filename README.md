# WeatherAppAutomation
Basic Selenium automation framework using JAVA to automate web application

The Framework uses POM(Page Object Model) to identify web objects(WebElements) and methods associated with web page.


Support:
1) Project dependencies are maintained using Maven (so no need to remember and install pre-requisite software at each machine)
2) support Chrome and geckodriver(Firefox) browser (can be setup using config.properties file)
3) support Failed TC re-run (3 attempts are allowed)

Future Improvement:
1) More Browser support
2) Adding Data model to dynamically retrieve data at run time
3) current framework uses default TestNG reporting (not that great) but will add Extent reporting in future version


Note:
You may have to install different browser driver file at Project home directory (currently support Firefox and chrome browser)

