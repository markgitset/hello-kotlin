buildscript {
//    ext.kotlin_version = "1.1.1"

    // define a repoConfig that we can reuse
//    repoConfig = {
//        jcenter()
//        mavenCentral()
//    }

    // use the repoConfig we defined above
//    repositories repoConfig
    repositories {
//        jcenter()
//        mavenCentral()
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
        //classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
//        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.13")
    }
}

//apply plugin: "kotlin"
//apply plugin: "application"
//apply plugin: "org.jetbrains.dokka"
plugins {
    application
}
apply {
    plugin("kotlin")
//    plugin("application")
}

// use the repoConfig we defined above
//repositories repoConfig
repositories {
//    mavenCentral()
    gradleScriptKotlin()
    jcenter()
}

dependencies {
    // This dependency is found on compile classpath of this component and consumers.
    compile("com.google.guava:guava:20.0")

    // Use JUnit test framework
    testCompile("junit:junit:4.12")
//    compile "org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlin_version"
    compile(kotlinModule("stdlib"))
}

// Define the main class for the application
application {
    mainClassName = "hello.HelloKt"
}

//task dokkaJavadoc(type: org.jetbrains.dokka.gradle.DokkaTask) {
//    outputFormat = "javadoc"
//    outputDirectory = "$buildDir/dokkaJavadoc"
//}
