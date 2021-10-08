void call(){
    //println "sonarqube: static_code_analysis()"
    echo"This is job branch ${pipelineConfig.jobBranch}"
    echo"This is short commit ${pipelineConfig.shortCommit}"
    
    config.test = "testing test"
    echo"Printing test  ${config.test}"

    //make()
}

