pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat'mvn clean compile'
      }
    }
    stage('Test') {
        steps {
            bat'mvn clean test'
        }
         post {
          always {
            cucumber '**/cucumber.json'
            script {
              allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
              ])
            }
          }
        }
  }

    }
}
