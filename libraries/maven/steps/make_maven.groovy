void call(){
    pipelineConfig.scmVars = checkout scm
    pipelineConfig.jobBranch = sh(script:"echo ${pipelineConfig.scmVars.GIT_BRANCH}'|sed -e|origin/||g'",returnStdout:true).trim()
    pipelineConfig.shortCommit = sh(script:"git log -n 1 --pretty=format:'%h'",returnStdout:true).trim()

    echo"Printing Job branch ${pipelineConfig.jobBranch}"
    echo"Printing short commit ${pipelineConfig.shortCommit}"

    //println "maven: build()"
}
