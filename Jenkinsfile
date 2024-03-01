pipeline {
    agent any

    tools {
        maven "3.8.7"
    }
    
    stages {
        stage('Build') {
            steps {
                // Your build steps here
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy artifacts using Maven
                bat 'mvn deploy'
            }
        }
    }
    
    post {
        always {
            // Publish JUnit test results
            junit '**/target/surefire-reports/*.xml'
        }
    }
}



