plugins {
    id ("org.jetbrains.kotlin.android")
}

val builderTaskGroup = "my sample project"
tasks.named<TaskReportTask>("tasks")
{
    displayGroup = builderTaskGroup
}

tasks.getByName("build"){
    group = builderTaskGroup
}

tasks.getByName("check"){
    group = builderTaskGroup
}


// If we want to create a task which will depends on other task to complete
tasks.register("anc")
{
    description = "custom tasks which depends on other tasks to complete"
    group = builderTaskGroup
    dependsOn(tasks.getByName("check"),tasks.getByName("build"))
}