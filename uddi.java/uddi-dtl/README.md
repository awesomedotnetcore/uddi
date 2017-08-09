# Add this section to the m2 settings.xml file
	<server>
      <id>stelinno-mvn-repo</id>
      <username>stelinno</username>
      <password>St3llarCl0ud!</password>
    </server>	
    
# Add this to the pom of the dtl project pom.xml file under the root project section
	<build>
    <extensions>
      <extension>
        <groupId>org.apache.maven.wagon</groupId>
        <artifactId>wagon-ftp</artifactId>
        <version>1.0-alpha-6</version>
      </extension>
    </extensions>
  </build>

  <distributionManagement>
    <repository>
      <id>stelinno-mvn-repo</id>
      <!-- <url>ftp://sundgaard.ddns.net/stelinno-mvn-repo</url>  -->
      <url>ftp://sundgaard.ddns.net:61/stelinno-mvn-repo</url>
    </repository>
  </distributionManagement>
  
# To use the artifact in another project add this to the dependencies section
	<!-- Stelinno Maven Repository -->
	<dependency>
	    <groupId>com.stelinno.uddi</groupId>
	    <artifactId>uddi-dtl</artifactId>
	    <version>0.0.1-SNAPSHOT</version>
	</dependency>   
	
# And add this to the repositories section or create one
	<repositories>   
		<repository>       
      		<id>stelinno-mvn-repo</id>
      		<name>Stelinno Maven Repository</name>
      		<url>ftp://sundgaard.ddns.net:61/stelinno-mvn-repo</url> 
 		</repository> 
  </repositories>
  
# Finally add a build extension to wagon ftp in the build section of your pom.xml and in the dependent pom.xml
    <extensions>
      <extension>
        <groupId>org.apache.maven.wagon</groupId>
        <artifactId>wagon-ftp</artifactId>
        <version>1.0-alpha-6</version>
      </extension>
    </extensions>