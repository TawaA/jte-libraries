void call(){
    //println "sonarqube: static_code_analysis()"
    echo"This is job branch ${pipelineConfig.jobBranch}"
    echo"This is short commit ${pipelineConfig.shortCommit}"
    
    echo"Printing date config  ${config.newertDate}"

    //make()
}

