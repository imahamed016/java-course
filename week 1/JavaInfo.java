// This program prints information about the Java runtime.
public class JavaInfo {
public static void main(String[] args) {
// System.getProperty() retrieves system properties.
// "java.version" returns the Java version.
String version = System.getProperty("java.version");


// "java.home" returns the installation directory of Java.
String javaHome = System.getProperty("java.home");

// "os.name" returns the operating system name.
String osName = System.getProperty("os.name");

// Print the collected information.
System.out.println("Java Version: " + version);
System.out.println("Java Home: " + javaHome);
System.out.println("Operating System: " + osName);
}
}