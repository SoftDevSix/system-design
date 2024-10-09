plugins {
    id("java")
    id("org.sonarqube") version "4.4.1.3373"
    jacoco
}

sonar {
    properties {
        property("sonar.projectKey", "luis-espinoza-jalafund_TestSonarJava")
        property("sonar.organization", "sonar-cloud-test-dev6")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

jacoco {
    toolVersion = "0.8.12"
    reportsDirectory = layout.buildDirectory.dir("customJacocoReportDir")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jacoco:org.jacoco.agent:0.8.12")
    implementation("org.jacoco:org.jacoco.core:0.8.12")
    implementation("org.ow2.asm:asm:9.5")
    implementation("org.ow2.asm:asm-commons:9.5")
    implementation("org.apache.bcel:bcel:6.6.0") // Agregamos BCEL
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required = false
        csv.required = false
        html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
    }
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "org.example.Main"
        )
    }
}

// Agregamos una tarea para analizar el JAR usando BCEL
tasks.register<JavaExec>("analyzeJar") {
    group = "verification"
    description = "Analyze JAR file using BCEL"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.BCELJarAnalyzer")
    args = listOf("src/main/resources/TestSonarJava-1.0-SNAPSHOT.jar")
}
