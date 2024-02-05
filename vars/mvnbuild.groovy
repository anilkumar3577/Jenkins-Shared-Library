def call () {
 pipeline {
    agent any
    tools {
        git 'Default'
        dockerTool 'docker'
        maven 'mvn'
    }
    stages{
        stage(code){
            steps {
               git 'https://github.com/anilkumar3577/JavaCalculator.git' 
            }
        }
        stage(package){
            steps {
               sh 'mvn package'
            }
        }
    }
 }
}
