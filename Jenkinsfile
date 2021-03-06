pipeline {
    environment {
        registry = "vinayak96/scientific_calculator"
        registryCredential = 'docker-hub-credentials'
        dockerImage = ''
        dockerImageLatest = ''
  }
    agent any
    stages {
        stage ('SCM Checkout') {
            steps {
                git credentialsId: 'github-credentials', url: 'https://github.com/vinayakchaturvedi/Scientific-Calculator.git'
            }
        }

        stage('Build Executable Jar'){
                steps {
                     sh 'mvn clean test package'
                }
        }

        stage('Building image') {
          steps{
            script {
              dockerImage = docker.build registry + ":${env.BUILD_NUMBER}"
              dockerImageLatest = docker.build registry + ":latest"
            }
          }
        }

        stage('Deploy Image') {
              steps{
                script {
                  docker.withRegistry( '', registryCredential ) {
                    dockerImage.push()
                    dockerImageLatest.push()
                  }
                }
              }
        }

        stage('Remove Unused docker image') {
          steps{
            sh "docker rmi $registry:${env.BUILD_NUMBER}"
            sh "docker rmi $registry:latest"
          }
        }

        stage ('Deploy Code to Production Host') {
            steps {
                ansiblePlaybook installation: 'Ansible', playbook: './ansible/scientific-calculator-playbook.yml'
            }
        }
    }
}