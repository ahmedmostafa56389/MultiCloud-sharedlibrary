#!/usr/bin/env groovy

def call() {
  echo "sonar"
  withSonarQubeEnv(credentialsId: 'sonar') {
        echo "Running SonarQube Analysis..."
        sh ''' 
        $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=ahmed \
        -Dsonar.java.binaries=. \
        -Dsonar.projectKey=ahmed 
        '''
  }
}
