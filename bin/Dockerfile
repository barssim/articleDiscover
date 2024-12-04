FROM tomcat:9.0-jdk8-openjdk
	
ENV APP_DATA_FOLDER=/var/lib/articleDiscover
ENV ARTICLE_DISCOVER_CONFIG=${APP_DATA_FOLDER}/config/
	
#Move over the War file from previous build step
WORKDIR /usr/local/tomcat/webapps/
COPY ./target/articleDiscover*.war /usr/local/tomcat/webapps/articleDiscover.war

WORKDIR $APP_DATA_FOLDER

EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run"]