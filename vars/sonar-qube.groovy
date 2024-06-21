#!/usr/bin/env groovy

def call() {
    echo "Running SonarQube Analysis..."

    def sonarqubeCredentialsId = 'sonar-server'

    def projectName = 'ahmed'
    def projectKey = 'ahmed'

    withSonarQubeEnv(credentialsId: sonarqubeCredentialsId) {
        def scannerHome = tool name: 'sonar-scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
        
        sh """
        ${scannerHome}/bin/sonar-scanner \
          -Dsonar.projectName=${projectName} \
          -Dsonar.projectKey=${projectKey} \
          -Dsonar.java.binaries=.
        """
    }
}
