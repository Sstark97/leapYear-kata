plugins {
    id("java")
    id("info.solidsoft.pitest") version "1.9.0"
}

pitest {
    setProperty("junit5PluginVersion", "1.0.0")
    setProperty("testPlugin", "junit5")
    setProperty("targetClasses", listOf("org.example.*"))
    setProperty("outputFormats", listOf("HTML"))
    setProperty("threads", 4)
    setProperty("withHistory", true)
    setProperty("pitestVersion", "1.9.0")
    setProperty("timestampedReports", false)
    setProperty("targetTests", listOf("org.example.*"))
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")}

tasks.test {
    useJUnitPlatform()
}