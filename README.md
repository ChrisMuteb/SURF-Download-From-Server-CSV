
1. Create a repository out of the template
2. Clone your repository in local
3. set the project jdk 1.8
4. Test:
  1. "http://localhost:8080/simpleFlow" -> you will find this in the configuration file under the flowRegistry function.
5. create an ec2 instance of any type(Ubuntu --> user name: ubuntu)
6. download filezilla to connect to the instance
7. run 'mvn clean package'
8. open filezilla and drag and drop the .jar file into the /opt/ubuntu/ folder
9. Transfer the .jar file into the server(ec2)
  1. upload to home first: drag and drop the .jar into the '/home/ubuntu'
  2.  Create and open up the app folder: 'sudo mkdir /app'  then  'sudo chown -R ubuntu:ubuntu /app'
  3.  Move the file to its home: 'mv /home/ubuntu/*.jar /app/'
10. Install java8:
  1. 'sudo apt update' then 'sudo apt install openjdk-8-jre-headless -y'  then ''
11. Running the java8 jar
  1. cd /app
  2. java -jar your-webflow-app-name.jar
12. Take the public ip address and add the port followed by the id to see the app running from your ec2 instance: 54.247.216.28:8080/download-csv
13. Create a folder at the root level: 'sudo mkdir /STF' then 'sudo chown -R ubuntu:ubuntu /STF'
14. 
15. dkjfkd
