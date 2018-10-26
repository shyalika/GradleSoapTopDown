# Example EJB3, WSDL, XSD and gradle project.

This project is a simple example to build and deploy a web service with soap and EJB3 technologies built using Gradle. This is intended to be deployed in Jboss 7.1. This example uses both WSDL and XSD schema definitions. There is an even simpler example done using only WSDL at https://github.com/shyalika/GradleSoapTopDown.git


1. Checkout the project and navigate to the project folder

6. Run the command ```gradle init```

7. Build the projcet using ```gradle clean assemble``` command

8. Copy the GradleSoapXSDTopDown.jar file to the JBOSS_HOME/standalone/deployments directory

9. Start Jboss

19. Access the web service using http://localhost:8080/shyali/GradleSoapTopDownXSD/HelloService link
