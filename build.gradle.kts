plugins {
    java
    id("com.github.johnrengelman.shadow") version "8.0.0"
}

repositories {
    mavenCentral()
    // maven {
    //    url = uri("https://maven.repository.redhat.com/ga/")
    // }
}

dependencies {
    implementation("org.ow2.asm:asm-all:5.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
