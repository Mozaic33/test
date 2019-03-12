import jenkins.model.GlobalConfiguration

node {
        label 'proiect'
        ws("/var/lib/jenkins/jobs/nexus/MyWorkspace"){
	
	    stage( 'clone repo') {
		  
			    git url: "https://github.com/Mozaic33/test.git"
		    
	    }
		stage('Clean') {
			a = 5
			if ( a == 6)
			{
			    sh "mvn clean"
			}
			else { echo "test"
			     }
		}
		// mvn integration-test
		
	}
        System.exit(0)
}
