# HOW TO RUN THIS SUBMISSION

### Prerequisite
	- install Maven (if not already installed) -- see https://maven.apache.org/install.html
	- install JDK 8 or higher (if not already installed) -- see https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
	- request (input): Json format
	{
	  "Shift": <<number>>,
	  "Message": "<<string>>"
	}
	- Note that the input request must be of a valid Json format.  If the format is not valid, the system will return a 400 code. 

	
### Testing environment/Outcome
 - testing environment: Linux (Ubuntu 16.04)
 - the name of file should be located at shiftcipher/EncodedMessage.txt

### Run Application
cd shiftcipher

mvn spring-boot:run
or 
java -jar target/shiftcipher-0.0.1-SNAPSHOT.jar

### Test Application
	curl -d '{"Shift":5, "Message":"value2"}' -H "Content-Type: application/json" -X POST http://localhost:2345/api/encode