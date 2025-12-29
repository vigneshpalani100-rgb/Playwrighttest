pipeline {
    agent any
    tools {
        maven 'apache-maven-3.9.12' // Must match name in Global Tool Configuration
        jdk 'jdk-21'        // Java is required for Playwright Java
    }
    stages {
        stage('Install & Test') {
            steps {
                // 'mvn test' will automatically download Playwright browsers 
                // and run your Java tests
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
