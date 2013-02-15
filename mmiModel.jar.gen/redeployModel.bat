@ECHO OFF
ECHO Deploying Interaction Model binaries

REM IF %1!==! (
REM	ECHO Please run: redeploy.bat ^<version^> ^<binary jar^> [source jar]
REM	GOTO end
REM )

SET /p version=<version.txt
SET binFile=org.mmi.model.jar
SET sourceFile=org.mmi.model-source.jar

SET groupId=org.mmi
SET artifactId=model
SET url=http://memo.qu.tu-berlin.de/nexus/content/repositories/mim
SET repositoryId=nexus

ECHO.
ECHO Redploying with:
ECHO version=%version%
ECHO groupId=%groupId%
ECHO artifactId=%artifactId%
ECHO.

REM redploy binary jar
ECHO Deploying binary JAR.
CALL mvn deploy:deploy-file -DgroupId=%groupId% -DartifactId=%artifactId% -Dversion=%version% -Dpackaging=jar -Dfile=%binFile% -Durl=%url% -DrepositoryId=%repositoryId%

REM redploy source, if file is set
ECHO Deploying source JAR.
IF NOT "%sourcefile%"=="/?" (
CALL mvn deploy:deploy-file -DgroupId=%groupId% -DartifactId=%artifactId% -Dversion=%version% -Dpackaging=java-source -Dfile=%sourceFile% -Durl=%url% -DrepositoryId=%repositoryId%
)

:end