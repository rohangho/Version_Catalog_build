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