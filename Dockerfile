FROM registry.access.redhat.com/fuse7/fuse-java-openshift:1.4
ENV JAVA_APP_DIR=/deployments
EXPOSE 8080 8778 9779
COPY target /deployments/
