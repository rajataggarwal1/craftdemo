#!groovy
// Change the number 10 below to reset your build number with + or -
//

// Build Params
Map buildParams = [ LogLevel                     : "ALL",
                    DevRoot                     : "D:/gitroot",
                    MailTo                      : "rajataggarwal2@gmail.com",
                    MailMsg                     : "craft demo",                    
                    MainRepoURL                 : "https://github.com/rajataggarwal1/craftdemo.git",
                    MainRepoBranch              : "master",
                    defaultConfigFilePath       : "Jenkinsfile.yaml",]

//Preparation
currentBuild.displayName = "craft"

@Library('CI_workflowLibs@declarative')


pipeline {

    agent any
	triggers{

	pollSCM '*****'
	
	}
    tools {
        jdk 'JDK8u40'
    }
   

    stages {
   
		stage('Clean Build APIs') {
            steps {
                echo "*******************Clean Build APIs:  ${env.NODE_NAME}"
                zGradleBuild (m_zDevOpsHelper, "Clean Build APIs")
                //bat "exit 1"
            }
        }
		
		stage('Publish War') {
            steps {
                echo "*******************PPublish War:"
                zGradleBuild (m_zDevOpsHelper, "Publish War")
                //bat "exit 1"
            }
        }
		
		
		
		
		
		stage('Run Integration Tests') {
            steps {
                echo "*******************Run Integration Tests"
                zGradleBuild (m_zDevOpsHelper, "Run Integration Tests")
                //bat "exit 1"
            }
        }
		
		
    post {
        always {
            echo "I HAVE FINISHED"
        }
        success {
            echo "MOST DEFINITELY FINISHED"
        }
        failure {
            echo "I FAILED"

            echo "Sending mail to: ${buildParams.MailTo}"

        }
    }
}