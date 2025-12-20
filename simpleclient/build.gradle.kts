plugins {
    application
    java
}

application {
    mainClass = "simpleclient.SimpleIJ"
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
dependencies {
    implementation(project(":simpledb"))
}
