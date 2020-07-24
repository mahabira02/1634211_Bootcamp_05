node {
        stage('git checkout') {
            git credentialsId: 'GithubID', url: 'https://github.com/mahabira02/1634211_Bootcamp_05.git'  
    }
    
    stage('code build & test') {
        // sh 'mvn clean package'
        
        // using maven from runtime
        
        def mavenHome = tool name: 'maven-runtime' , type: 'maven'
        
        // using a variable and mentioning in double-quotes -- interpolation 
        def mavenCMD = "${mavenHome}/bin/mvn" 
        
        sh "${mavenCMD} clean package"
    }
    
    stage('docker build'){
        
        // use docker from runtime
        
        def dockerHome = tool name: 'docker-runtime' , type: 'dockerTool'
        
        // using a variable and mentioning in double-quotes -- interpolation 
        def dockerCMD = "${dockerHome}/bin/docker" 
        
        // use docker available on machine 
        
        sh "sudo ${dockerCMD} build -t mmk4mmk/sbt_runtime_doc:1.0 ."
    }
    
    stage('docker run'){
        
        // use docker from runtime
        
        def dockerHome = tool name: 'docker-runtime' , type: 'dockerTool'
        
        // using a variable and mentioning in double-quotes -- interpolation 
        def dockerCMD = "${dockerHome}/bin/docker"
        
        sh "sudo ${dockerCMD} run -p 8888:8081 -d mmk4mmk/sbt_runtime_doc:1.0"
    }
    
    stage('docker push'){
        
        // use docker from runtime
        
        def dockerHome = tool name: 'docker-runtime' , type: 'dockerTool'
        
        // using a variable and mentioning in double-quotes -- interpolation 
        def dockerCMD = "${dockerHome}/bin/docker"
        
        //docker push 
        withCredentials([string(credentialsId: 'dockerhub_pwd', variable: 'dockerHubpassword')]) {
                // some block
                sh "sudo ${dockerCMD} login -u mahabira02 -p ${dockerHubpassword}"
            }
        sh "sudo ${dockerCMD} push mahabira02/sbt_runtime_doc:1.0"
    }