plugins {
    application
    java
}

application {
    mainClass.set("simpledb.server.StartServer")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

sourceSets {
    main {
        java {
            srcDirs("src/main/java", "src")
        }
    }
}

tasks.withType<Javadoc> {
    source = sourceSets["main"].allJava
    classpath = sourceSets["main"].compileClasspath
    destinationDir = file("$buildDir/docs/javadoc")

    options.encoding = "UTF-8"

    (options as StandardJavadocDocletOptions).apply {
        memberLevel = JavadocMemberLevel.PUBLIC
        addStringOption("Xdoclint:none", "-quiet")
        addStringOption("Xmaxerrs", "1000")
    }

}
