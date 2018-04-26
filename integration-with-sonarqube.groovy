node{
  stage('Sonar'){
   sh 'mvn sonar:sonar -Dsonar.host.url=http://35.167.249.170:9000  -Dsonar.login=c5cc069866348754c7f455fcdccc7b0b563efe41'
  }
  
  stage('Sonar-QualityGate-Check){
  
  }

}
