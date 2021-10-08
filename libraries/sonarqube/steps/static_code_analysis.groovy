void call(){
    println "sonarqube: static_code_analysis()"
    echo"${pipelineConfig.jobBranch}"
    echo"${pipelineConfig.shortCommit}"
    make()
}

