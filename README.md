# k8s-java-rest-api
Java REST API example application running on IBM Cloud Kubernetes service.

The application in this repository provides a very basic REST API using JAX-RS 2.1 as provided by the application 
server, in this case, WebSphere Application Server Liberty 20.0.0.7. 

# How to build and run locally
1. Fork and clone this repo. 
2. Import the repo as a Gradle project in your favorite IDE or simply call the Gradle wrapper:
    
    2.1. On Windows, `gradlew.bat war`
    
    2.2. On Linux/MacOS, `./gradlew war`
    
3. Build the Docker image by running: 

    `docker build -t k8s-java-rest-api:latest . `

4. Run the container:

    ` docker run -it -p 9080:9080 --rm k8s-java-rest-api:latest`
    
5. Using the browser, Postman or curl, navigate to `http://localhost:9080/k8s-java-rest-api/api/customers`

# Deploying & running on IBM Cloud
To deploy and run the sample application on the IBM Cloud, follow these steps:

1. Create an IBM Cloud account
2. Create a free Kubernetes cluster. Wait until it is provisioned.
3. Instantiate a Toolchain service. Select 'Build your own'
4. Add the following services:
    * GitHub: configure it to point to your forked repo
    * Delivery Pipeline
5. Configure the Delivery Pipeline with the following stages:
    * Build: set the input as the repository. Add a build job that executes a shell script: `./gradlew war`
    * Build docker image: set the input as _Build Artifacts_ and set the builder type as _Container Registry_
    * Deploy: set the input as _Build Artifacts_ and Stage as _Build docker image_. Add a Job with a deployer type as Kubernete
 
# References
* https://cloud.ibm.com/kubernetes/registry/main/start
* https://www.ibm.com/cloud/blog/monitoring-your-kubernetes-environment-on-ibm-cloud-with-sysdig