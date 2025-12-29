pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME' // Must match name in Global Tool Configuration
        jdk 'JAVA_HOME'        // Java is required for Playwright Java
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
