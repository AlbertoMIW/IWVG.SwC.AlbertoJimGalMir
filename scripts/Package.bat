@echo off
:: Con :: se establecen comentarios
::set se definen variables
set workspace=C:\AlbertoNitro\Workspace\IWVG.SwColaborativoAlbertoJim
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_51
set M2_HOME=C:\AlbertoNitro\Programas\apache-maven-3.3.9
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean -Denvironment.type=develop
call mvn test -Denvironment.type=develop
call mvn package -Denvironment.type=preproduction
pause

