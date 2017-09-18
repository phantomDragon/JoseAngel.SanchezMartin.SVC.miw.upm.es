@echo off
set workspace=C:\Users\bo0477\Desktop\miw\workspace\JoseAngel.SanchezMartin.SVC.miw.upm.es
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_51
set M2_HOME=C:\Users\bo0477\Desktop\miw\archivos-de-programa\apache-maven-3.5.0
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
echo -----------------------------------------
echo . (C) MIW - UPM
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%
echo ============ mvn clean test -Denviroment.type=develop --settings settings.xml  (profile: develop) =====================================
echo .
call mvn clean test -Denviroment.type=develop --settings settings.xml
echo ============ mvn package -Denviroment.type=preproduction --settings settings.xml  (profile: preproduction) =====================================
echo .
call mvn package -Denviroment.type=preproduction --settings settings.xml
pause