pipeline {
	agent any

		stages{
			stages('Build'){
				steps{
					sh 'mvn clean package'
				}
				post{
					success{
						echo 'Now Archiving...'
						archiveArtifacts artifacts: '**/target/*.war'
					}
				}
			}
		}
	}
