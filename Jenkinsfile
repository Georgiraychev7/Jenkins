pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Your build steps here
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy artifacts using Maven
                sh 'mvn deploy'
            }
        }
    }
}



