void call(){
    //println "sonarqube: static_code_analysis()"
    echo"This is job branch ${pipelineConfig.jobBranch}"
    echo"This is short commit ${pipelineConfig.shortCommit}"
    
    config.docker_branch = pipelineConfig.jobBranch
    echo"Printing new docker branch ${config.docker_branch}"

    //make()
}

