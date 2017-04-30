#!groovy

node{
	
	currentBuild.result = "SUCCESS"

	stage('checkout'){
	    checkout scm
	}

	stage('build'){
        sh 'mvn clean install'
	}

	stage('test'){
	   sh 'mvn clean test'
	}
}