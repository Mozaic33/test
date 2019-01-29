import jenkins.model.GlobalConfiguration

node {
        label 'proiect'
        ws("/var/lib/jenkins/jobs/nexus/MyWorkspace"){
	
	    stage( 'clone repo') {
		  
			    git url: "https://github.com/Mozaic33/test.git"
		    
	    }
		stage('Clean') {
		
			    sh "mvn clean"
			
		}
		// mvn integration-test
		stage('Package') {
		       sh "mvn deploy"
		}
		stage('Test')
		{
		      sh "mvn integration-test"
		}
	}
}
