#!groovy

node{
	
	currentBuild.result = "SUCCESS"

	stage('checkout'){
	    checkout scm
	}

	stage('build'){
	    bat 'mvn clean install'
	}

	stage('test'){
	   bat 'mvn clean test'
	}
}
