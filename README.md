# Docker overview
  A platform for developing, shipping, and running applications with Fast, Consistent delivery of applications.
 
# Responsive Deployment and Scaling
  Docker’s portability and lightweight nature also make it easy to dynamically manage workloads. 
  Scaling up or tearing down applications and services as business in near real time.
  
# Running more workloads on the same hardware
  Docker is lightweight and fast. It provides a viable, cost-effective alternative to hypervisor-based virtual machines, so you can use more of your compute capacity
  to achieve your business goals.
  Docker is perfect for high density environments and for small and medium deployments where you need to do more with fewer resources.
  
# Docker commands
  # To get the version of Docker
        docker -v
        
  # To list the Docker Images
        docker image ls
        
  # To pull the image from Docker Hub
        docker pull <image-name>:<tag>
        
  # To run the image as foreground process
        docker run <image>:<version>
        
  # To run the image as background/detached mode process
        docker run -d <image>:<version>   
        
  # To see running containers
        docker ps
        
  # To see running and exited containers
        docker ps -a
        
  # To inspect the running container
        docker inspect <container id>
        
  # To stop the contianer
        docker stop <container ID> or <Name>	
        
  # To start the contianer
        docker stop <container ID> or <Name>
        
  # To re-start the contianer
        docker restart <container ID> or <Name>
        
  # To kill the contianer
        docker kill <container ID> or <Name>
        
  # To remove the container only work if the container is in stop mode
        docker rm <container ID> or <Name>
        
  # To remove the container when the container can't stop
        docker rm --force <container ID> or <Name>
        
  # To see the container log
        docker logs <container ID> or <Name>
        
  # To see the container disk size
        docker ps -s  
       
  # To see the container CPU and RAM utilization
        docker stats
        
  # To publish the container port number to access by browser: -P assign the port dynamically
        docker run -d -P <Image>:<version>
        
  # To publish the contianer port number to access by browser with own port
        docker run -d -p <custom port>:<port where container running> <Image>:<version>
        
  # To login to the container for debuging  it - Intractive Terminal
        docker exec -it <container ID> /bin/bash
        
  # To inspect the Image
        docker image inspect <image-name>:<version>
        
  # To build the own image using Dockerfile
        docker build --file Dockerfile --tag dockerid86/docker-sample-app:1.0 .
        
  # To Push the image to Docker Hub
        docker push dockerid86/docker-sample-app:1.0
