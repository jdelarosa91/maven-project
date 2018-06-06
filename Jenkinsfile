pipeline {
	agent any

		stages{
			stage('Build'){
				steps{
					sh '/Library/apache-maven-3.5.3/bin/mvn clean package'
				}
				post{
					success{
						echo 'Now Archiving...'
						archiveArtifacts artifacts: '**/target/*.war'
					}
				}
			}
			stage('Deploy to Staging'){
				steps{
					build job: 'deploy-to-staging'
				}
			}
			stage('Deploy to production') {
				steps{
					timeout(time:5, unit:'DAYS'){
						input message: 'Aprove PRODUCTION Deployment?'
					}
					build job: 'deploy-to-prod'
				}
				post{
					success{
						echo 'Code deployed to prod'
					}
					failure {
						echo 'Deployment failed'
					}
				}
			}
		}
	}
