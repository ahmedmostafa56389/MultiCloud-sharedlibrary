#!usr/bin/env groovy
def call(String IMAGE_NAME) {
      echo "build"
    sh "docker build -t ${IMAGE_NAME} ."
    }
    
