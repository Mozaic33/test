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
		       sh "mvn install"
		}
		stage('Start Tomcat')
		{
		      sh "sudo cp /var/lib/jenkins/jobs/nexus/MyWorkspace/target/AMGrads.war /usr/share/tomcat/webapps && sudo service tomcat restart"
		}
		stage('Test')
		{
		      sh "mvn integration-test"
		}
	}
}
