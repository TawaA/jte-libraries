void call(){
    println "sonarqube: static_code_analysis()"
    echo"This isnjob branch ${pipelineConfig.jobBranch}"
    echo"This is short commit ${pipelineConfig.shortCommit}"
    make()
}

