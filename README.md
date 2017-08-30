# QDSChallenge
> Run gradle build 

```
> gradle build
```
> The war file to be deployed can be found in <ProjectDir>/build/libs folder

## Instructions to build and deploy using IntelliJ
* Go to Run → Edit Configurations in the top menu. 

* You’ll see the default run configurations on the left. Add a new configuration from the green plus in the top left.

* From the templates choose GlassFish Server → Local.

* In this window, you need to define an application server for IntelliJ IDEA. Click on 'Configure' next to the application server field.In the configuration window, select the installation directory of GlassFish Server.

* The application server field is now filled with 'GlassFish <Version>'.

* Set the name of the run configuration.

* Select domain1 from the dropdown 'Server Domain'.

* Go to the 'Deployment' tab at the top, and add a new artifact (the green plus). Select the war(exploded) file the project. Click on "Use custom context root" then add "/" 

* Click the OK button to save configuration.

* Click on the dropdown beside the run button (green play icon) and choose the newly created configuration. 

* Click on the run button to deploy application to server.

* To test the solution open http://localhost:8080/request in a web browser.
