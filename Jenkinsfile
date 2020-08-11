node{
    stage('git checkout') {
    git credentialsId: 'gitpassword', url: 'https://github.com/mahabira02/1634211_Bootcamp_05.git'
}
 stage('code build & test') {
        // sh 'mvn clean package'
        
        // using Maven3 from runtime
        
        def mavenHome = tool name: 'maven' , type: 'maven'
        
        // using a variable and mentioning in double-quotes -- interpolation 
        def mavenCMD = "${mavenHome}/bin/mvn" 
        
        sh "${mavenCMD} clean package"
    }
    
     stage('docker build'){
        
        // use docker from runtime
        
        def dockerHome = tool name: 'docker' , type: 'dockerTool'
        
        sh 'sudo docker build -t mahabira/cicd-pipeline:6.0 .'
    }
    
      stage('docker run'){
        
        sh 'sudo docker run -p 8096:8080 -d mahabira/cicd-pipeline:6.0'
    }
    
    stage('docker push'){
        
        //docker push 
        withDockerRegistry(credentialsId: 'dockercasestudies', toolName: 'docker') {
                // some block
                def customImage = docker.build('mahabira/cicd-pipeline:6.0')
               customImage.push()
            }
    }
    stage('create a new VM instance & Software') {
                ansiblePlaybook 'aws_ansible.yml'
            }
     stage('List docker image') {
         //docker list
        sh 'sudo docker ps'
      }
}