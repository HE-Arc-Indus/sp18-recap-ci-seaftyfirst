pipeline {
    agent any
    tools { 
        maven 'Maven' 
        jdk 'myJdk' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
                echo "Tests unitaires lancés avec succès"
            }         
        }
    }
    post {
            always {
                    junit "target/surefire-reports/*.xml"
            }
        }
}
