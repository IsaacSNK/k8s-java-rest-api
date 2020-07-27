# k8s-java-rest-api
Java REST API example application running on IBM Cloud Kubernetes service.

The application in this repository provides a very basic REST API using JAX-RS 2.1 as provided by the application 
server, in this case, WebSphere Application Server Liberty 20.0.0.7. 

# How to build and run locally
1. Clone this repo
2. Import the repo as a Gradle project in your favorite IDE or simply call the Gradle wrapper:
    
    2.1. On Windows, `gradlew.bat war`
    
    2.2. On Linux/MacOS, `./gradlew war`
    
3. Build the Docker image by running: 

    `docker build -t k8s-java-rest-api:latest . `

4. Run the container:

    ` docker run -it -p 9080:9080 --rm k8s-java-rest-api:latest`
    
5. Using the browser, Postman or curl, navigate to `http://localhost:9080/k8s-java-rest-api/api/customers`

# Deploying & running on IBM Cloud [DRAFT]
1. Create an image registry namespace
    ibmcloud login
    ibmcloud cr region-set
    ibmcloud cr namespace-add k8s-rest-api
    
2. Use the namespace in the delivery pipeline

3. Create a new Deploy Stage. Select Kubernetes    
  
 Sysdig for monitoring
 
 e8e6c622-a724-48ec-b3f9-023af056ec74 
    
# References
* https://cloud.ibm.com/kubernetes/registry/main/start
* https://www.ibm.com/cloud/blog/monitoring-your-kubernetes-environment-on-ibm-cloud-with-sysdig