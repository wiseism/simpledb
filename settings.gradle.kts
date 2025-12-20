rootProject.name = "SimpleDB"

include("derbyclient", "simpleclient", "simpledb")
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}