#!/usr/bin/env groovy
def call() {
  echo "test"
  sh 'chmod 777 ./gradlew'
  sh './gradlew clean test'
}
