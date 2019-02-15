pipeline {

    agent any
    tools {
        maven 'Maven3' 
    }
    stages {
        stage('Compile stage') {
            steps {
                cmd "mvn clean compile" 
        }
    }

         stage('testing stage') {
             steps {
                cmd "mvn test"
        }
    }

          stage('deployment stage') {
              steps {
                cmd "mvn deploy"
        }
    }

  }

}