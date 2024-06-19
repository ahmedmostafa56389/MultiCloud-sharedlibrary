#!/usr/bin/env groovy

def call(String imageName, String dockerHubCredentialsID) {
    withCredentials([usernamePassword(credentialsId: dockerHubCredentialsID, usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh "docker login -u ${USERNAME} -p ${PASSWORD}"
    }
    
    echo "build"
    sh "docker build -t ${imageName} ."
    echo "push to docker hub"
    sh "docker push ${imageName}"
}