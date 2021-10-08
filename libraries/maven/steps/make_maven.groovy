void call(){
    pipelineConfig.scmVars = checkout scm
    pipelineConfig.jobBranch = sh(script:"echo ${pipelineConfig.scmVars.GIT_BRANCH} | sed -e 's|origin/||g'",returnStdout:true).trim()
    pipelineConfig.shortCommit = sh(script:"git log -n 1 --pretty=format:'%h'",returnStdout:true).trim()
    //config.docker_branch = pipelineConfig.jobBranch

    echo"Printing Job branch ${pipelineConfig.jobBranch}"
    echo"Printing short commit ${pipelineConfig.shortCommit}"
    echo"Printing docker branch ${config.docker_branch}"


    //println "maven: build()"
}
