pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins maven'
	}

	tools {
		jdk 'jdk-11'
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}


	}
}