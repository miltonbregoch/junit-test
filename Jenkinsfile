pipeline { 
    agent any 

	triggers {
        pollSCM('* * * * *')
    }
	 
	parameters{
		string(name: 'JAVA_HOME', defaultValue: 'C:/Program Files/Java/jdk-14', description: 'JDK', )
	}
	
    stages { 
        stage('STAGE 00'){ 
            steps{
                withAnt(installation: 'C:/ant') {
				bat "ant C:/Program Files (x86)/Jenkins/workspace/junit-teste/Build.xml"
				}
            }
        }
    } 
} 