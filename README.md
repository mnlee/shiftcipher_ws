# HOW TO RUN THIS SUBMISSION

### Prerequisite
- JDK 8 must be install on your machine see https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
	>java -version
- request (input): Json format
	{
	  "Shift": <<number>>,
	  "Message": "<<string>>"
	}
- Note that the input request must be of a valid Json format.  If the format is not valid, the system will return a 4XX code. 
	
### Testing environment/Outcome
 - openjdk version "1.8.0_242"
 - testing environment: Linux (Ubuntu 16.04)
 - the name of output file should be located at shiftcipher_ws-master/EncodedMessage.txt

### Run Application
Download location https://github.com/mnlee/shiftcipher_ws
		- select download -> download zip
		- change to your download location and unzip shiftcipher_ws-master.zip
		
>cd shiftcipher_ws-master

>java -jar shiftcipher-0.0.1-SNAPSHOT.jar

### Test Application
open up a terminal

>curl -d '{"Shift":5, "Message":"value2"}' -H "Content-Type: application/json" -X POST http://localhost:23456/api/encode -s -w "\n HTTP return code: %{http_code}\n"

>curl -d '{"Shift":-5, "Message":""}' -H "Content-Type: application/json" -X POST http://localhost:23456/api/encode -s -w "\n HTTP return code: %{http_code}\n"