FROM httpd:alpine3.20

COPY webb/index.html /usr/local/apache2/htdocs/
COPY webb/images/devopsimg.png /usr/local/apache2/htdocs/images/devopsimg.png
COPY webb/css/style.css /usr/local/apache2/htdocs/css/style.css
WORKDIR /var/www/html

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
