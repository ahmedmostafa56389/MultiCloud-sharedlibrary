#!usr/bin/env groovy
def call(String imageName) {
      echo "build"
    sh "docker build -t ${imageName} ."
    }
    
