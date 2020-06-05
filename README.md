# kubernetes
Simple Front and backend appliction to get hands on experiance with kubernetes

### How to build and run the applications
- clone the project
#### build the backend application
- ```cd backend```
- ``` docker build  . ```
- ``` docker run docker run -d -p 80:80 <Image> ```
#### build frontend application
- ``` cd ui ```
- ``` docker build . ```
- ``` docker run docker run -d -p 8080:8080 <Image> ```

### To run the build images on custom network
- [Create custom network](https://docs.docker.com/network/network-tutorial-standalone/)
- run the image using ``` docker run -d -p <p>:<p> --network <customNetwork>  <Image>```

