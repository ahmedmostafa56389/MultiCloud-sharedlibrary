#!/usr/bin/env groovy
def call() {
  echo "test"
  sh './gradlew clean test'
}
