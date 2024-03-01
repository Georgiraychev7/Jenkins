pipeline {
    agent any
    
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
}



