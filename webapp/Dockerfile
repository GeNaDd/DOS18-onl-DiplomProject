FROM tecadmin/ubuntu-ssh:16.04

RUN apt-get update \
   && apt-get install -y apache2

COPY index.html /var/www/html/
WORKDIR /var/www/html
CMD ["apachectl", "-D", "FOREGROUND"]
EXPOSE 80

# Build an image from a Dockerfile:
# $ docker build -t gendevbydocker/apacheserverubuntu:latest .
# -------------------------------
# Create and run a new container from an image:
# $ docker run -d --name apacheserverubuntu -p 80:80 gendevbydocker/apacheserverubuntu:latest 
# -------------------------------
# Stop running container:
# $ docker stop apacheserverubuntu
# -------------------------------
# Start stopped container:
# $ docker start apacheserverubuntu
# -------------------------------
# Remove container:
# $ docker rm apacheserverubuntu
# -------------------------------
# Remove image:
# $ docker rmi apacheserverubuntu
# -------------------------------
# Execute a command in a running container:
# $ docker exec -it apacheserverubuntu bash
